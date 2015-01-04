package com.axj.apiw.netty;

import static org.jboss.netty.handler.codec.http.HttpResponseStatus.BAD_REQUEST;
import static org.jboss.netty.handler.codec.http.HttpResponseStatus.INTERNAL_SERVER_ERROR;
import static org.jboss.netty.handler.codec.http.HttpResponseStatus.OK;
import static org.jboss.netty.handler.codec.http.HttpVersion.HTTP_1_1;

import org.dom4j.DocumentException;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.buffer.DynamicChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;
import org.jboss.netty.handler.codec.frame.TooLongFrameException;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.axj.apiw.factory.ServiceFactory;
import com.axj.apiw.factory.VoFactory;
import com.axj.apiw.service.WeixinService;
import com.axj.apiw.util.UriUtil;
import com.axj.apiw.vo.request.MsgIn;
import com.axj.apiw.vo.response.Item;
import com.axj.apiw.vo.response.MsgOut;
import com.axj.apiw.vo.response.MsgOutNormalNews;
import com.axj.apiw.vo.response.MsgOutVerify;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * common handler
 * 
 * @author yhb
 */
@Component("weixinHandler")
public class WeixinHandler extends SimpleChannelUpstreamHandler {
	Logger logger = LoggerFactory.getLogger(WeixinHandler.class);
	
	@Autowired
	private ServiceFactory serviceFactory;
	
	@Autowired
	private VoFactory voFactory;
	
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		long tbegin = System.currentTimeMillis();
		logger.info("request come in");
		
		HttpRequest request = (HttpRequest) e.getMessage();
		String uri = request.getUri();
		String method = request.getMethod().getName();
        ChannelBuffer bufferIn = request.getContent();
        String content = new String(bufferIn.array());
		logger.info("-----------uri:" + uri +"-----------method:" + method +"-----------content:" + content);
        
		//get the userStr from uri
		String userStr = UriUtil.getUserStr(uri);
		
		WeixinService service = null;
		MsgIn msgIn = null;
		try {
			//get service to handle from factory
	        service = serviceFactory.createService(uri, method, content);
	        if(service == null) {
	    		HttpResponse response = new DefaultHttpResponse(HTTP_1_1, OK);
	            ChannelBuffer buffer = new DynamicChannelBuffer(2048);
                buffer.writeBytes("".getBytes("UTF-8"));
	    		response.setContent(buffer);
	    		Channel ch = null;
	    		try {
	    			ch = e.getChannel();
	    			// Write the initial line and the header
	    			ch.write(response);
	    		} catch (Exception ex) {
	    			logger.error("write to response in channel failed", ex);
	    			throw ex;
	    		} finally {
	    			ch.disconnect();
	    			ch.close();
	    		}
	    		return;
	        }
	        	
	        logger.info("-------------get service:" + service.getClass().getName());
	        
	        //get msgin vo from factory
	        msgIn = voFactory.createMsgIn(uri, method, content);
	        logger.info("-------------get vo:" + msgIn.getClass().getName());
		} catch (DocumentException de) {
			logger.error("the input message is not valid xml doc",e);
			throw de;
		}

        //handle the request
        MsgOut msgOut = service.handle(userStr, msgIn);
        
        //parse object msgout to output string
        String output = null;
        String contentType = "text/xml; charset=UTF-8";
        if(msgOut instanceof MsgOutVerify) {
        	MsgOutVerify verify = (MsgOutVerify)msgOut;
        	output = verify.getEchostr();
        	contentType = "text/plain; charset=UTF-8";
        } else {
            XStream xstream = new XStream(new StaxDriver());
            xstream.alias("xml", msgOut.getClass());
            if(msgOut instanceof MsgOutNormalNews) {
            	xstream.alias("item", Item.class);
            }
            output = xstream.toXML(msgOut);
        }
        logger.info("--------output:" + output + "---------");
        
		HttpResponse response = new DefaultHttpResponse(HTTP_1_1, OK);
        ChannelBuffer buffer = new DynamicChannelBuffer(2048);
        if(output != null && output.length() > 0)
		    buffer.writeBytes(output.getBytes("UTF-8"));
		response.setContent(buffer);
		response.headers().set("Content-Type", contentType);
		Channel ch = null;
		try {
			ch = e.getChannel();
			// Write the initial line and the header
			ch.write(response);
		} catch (Exception ex) {
			logger.error("write to response in channel failed", ex);
			throw ex;
		} finally {
			ch.disconnect();
			ch.close();
		}
		
		long tend = System.currentTimeMillis();
		logger.info("----------the total time cost is(ms):" + (tend - tbegin) + "------------aa");
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
			throws Exception {
		Channel ch = e.getChannel();
		Throwable cause = e.getCause();
		if (cause instanceof TooLongFrameException) {
			sendError(ctx, BAD_REQUEST);
			return;
		}

		cause.printStackTrace();
		if (ch.isConnected()) {
			sendError(ctx, INTERNAL_SERVER_ERROR);
		}
	}
    
	private void sendError(ChannelHandlerContext ctx, HttpResponseStatus status) {
		HttpResponse response = new DefaultHttpResponse(HTTP_1_1, status);
		//response.setHeader(CONTENT_TYPE, "text/plain; charset=UTF-8");
		response.setContent(ChannelBuffers.copiedBuffer("Failure: " + status.toString() + "\r\n", CharsetUtil.UTF_8));

		// Close the connection as soon as the error message is sent.
		ctx.getChannel().write(response).addListener(ChannelFutureListener.CLOSE);
	}
}