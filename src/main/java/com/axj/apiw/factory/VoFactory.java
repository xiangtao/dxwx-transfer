package com.axj.apiw.factory;

import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.jboss.netty.handler.codec.http.QueryStringDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.axj.apiw.constant.WeixinConstants;
import com.axj.apiw.util.UriUtil;
import com.axj.apiw.vo.request.MsgIn;
import com.axj.apiw.vo.request.MsgInEventClick;
import com.axj.apiw.vo.request.MsgInEventLocation;
import com.axj.apiw.vo.request.MsgInEventScan;
import com.axj.apiw.vo.request.MsgInEventSubscribe;
import com.axj.apiw.vo.request.MsgInNormalImage;
import com.axj.apiw.vo.request.MsgInNormalLink;
import com.axj.apiw.vo.request.MsgInNormalLocation;
import com.axj.apiw.vo.request.MsgInNormalText;
import com.axj.apiw.vo.request.MsgInNormalVideo;
import com.axj.apiw.vo.request.MsgInNormalVoice;
import com.axj.apiw.vo.request.MsgInVerify;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

@Component
@Scope("prototype")
public class VoFactory {
	static Logger logger = LoggerFactory.getLogger(VoFactory.class);
	
	private SAXReader reader = new SAXReader();
	
//	@Autowired
//	private WechatRequestService wechatRequestService;
	
	public MsgIn createMsgIn(String uri, String method, String content) throws DocumentException{
 		if(WeixinConstants.METHOD_GET.equals(method)) {
 			MsgInVerify verify = new MsgInVerify();
 			
 			QueryStringDecoder queryStringDecoder = new QueryStringDecoder(uri);
 			Map<String, List<String>> params = queryStringDecoder.getParameters();
 			if (!params.isEmpty()) {
 				for (Entry<String, List<String>> p : params.entrySet()) {
 					String key = p.getKey();
 					List<String> vals = p.getValue();
 					for (String val : vals) {
 						if(WeixinConstants.VERIFY_PARA_SIGNATURE.equals(key))
 							verify.setSignature(val);
 						if(WeixinConstants.VERIFY_PARA_TIMESTAMP.equals(key))
 							verify.setTimestamp(val);
 						if(WeixinConstants.VERIFY_PARA_NONCE.equals(key))
 							verify.setNonce(val);
 						if(WeixinConstants.VERIFY_PARA_ECHOSTR.equals(key))
 							verify.setEchostr(val);
 						logger.info("PARAM: " + key + " = " + val + "\r\n");
 					}
 				}
 			}
 			return verify;
 		} else {
  	 		StringReader sr = new StringReader(content);
  	 		logger.info(content);
 			Document doc = reader.read(sr);
 			Node node = doc.selectSingleNode(WeixinConstants.WEIXIN_MSGTYPE);
 	 		String msgType = node.getText();
 	 		String userStr = UriUtil.getUserStr(uri);
 	 		
 	 		logger.info("msgType:" + msgType);
 	 		
 	 		if (WeixinConstants.MSG_TYPE_TEXT.equals(msgType)) {
 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	        xstream.alias("xml", MsgInNormalText.class);
 	 	        MsgInNormalText normal = (MsgInNormalText)xstream.fromXML(content);
 	 	        logger.info("--------text object-----ToUserName:" + normal.getFromUserName() + "-----toUserName:" + normal.getToUserName());
 	 	        return normal;
 	 		} else if (WeixinConstants.MSG_TYPE_IMAGE.equals(msgType)) {
 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	        xstream.alias("xml", MsgInNormalImage.class);
 	 	        MsgInNormalImage normal = (MsgInNormalImage)xstream.fromXML(content);
 	 	        logger.info("--------image object-----ToUserName:" + normal.getFromUserName() + "-----toUserName:" + normal.getToUserName());
 	 	        return normal;
 	 		} else if (WeixinConstants.MSG_TYPE_VOICE.equals(msgType)) {
 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	        xstream.alias("xml", MsgInNormalVoice.class);
 	 	        MsgInNormalVoice normal = (MsgInNormalVoice)xstream.fromXML(content);
 	 	        logger.info("--------voice object-----ToUserName:" + normal.getFromUserName() + "-----toUserName:" + normal.getToUserName());
 	 	        return normal;
 	 		} else if (WeixinConstants.MSG_TYPE_VIDEO.equals(msgType)) {
 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	        xstream.alias("xml", MsgInNormalVideo.class);
 	 	        MsgInNormalVideo normal = (MsgInNormalVideo)xstream.fromXML(content);
 	 	        logger.info("--------video object-----ToUserName:" + normal.getFromUserName() + "-----toUserName:" + normal.getToUserName());
 	 	        return normal;
 	 		} else if (WeixinConstants.MSG_TYPE_LOCATION.equals(msgType)) {
 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	        xstream.alias("xml", MsgInNormalLocation.class);
 	 	        MsgInNormalText normal = (MsgInNormalText)xstream.fromXML(content);
 	 	        logger.info("--------location object-----ToUserName:" + normal.getFromUserName() + "-----toUserName:" + normal.getToUserName());
 	 	        return normal;
 	 		} else if (WeixinConstants.MSG_TYPE_LINK.equals(msgType)) {
 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	        xstream.alias("xml", MsgInNormalLink.class);
 	 	        MsgInNormalLink normal = (MsgInNormalLink)xstream.fromXML(content);
 	 	        logger.info("--------text object-----ToUserName:" + normal.getFromUserName() + "-----toUserName:" + normal.getToUserName());
 	 	        return normal;
 	 		} else if (WeixinConstants.MSG_TYPE_EVENT.equals(msgType)) {
 	 			Node nodeEvent = doc.selectSingleNode(WeixinConstants.WEIXIN_EVENT);
 	 	 		String eventType = nodeEvent.getText();
 	 	 		logger.info("eventType:" + eventType);
 	 	 		
 	 	 		if(WeixinConstants.EVENT_TYPE_SUBSCRIBE.equalsIgnoreCase(eventType)){
 	 	 			Node nodeTicket = doc.selectSingleNode(WeixinConstants.WEIXIN_TICKET);
 	 	 			if(nodeTicket == null){
 	  	 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	 	 	        xstream.alias("xml", MsgInEventSubscribe.class);
 	 	 	 	        MsgInEventSubscribe subscribe = (MsgInEventSubscribe)xstream.fromXML(content);
 	 	 	 	        logger.info("--------subscribe object-----ToUserName:" + subscribe.getFromUserName() + "-----toUserName:" + subscribe.getToUserName());
 	 	 	 	        return subscribe;
 	 	 			} else{
 	  	 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	 	 	        xstream.alias("xml", MsgInEventScan.class);
 	 	 	 	        MsgInEventScan scan = (MsgInEventScan)xstream.fromXML(content);
 	 	 	 	        logger.info("--------scan object-----ToUserName:" + scan.getFromUserName() + "-----toUserName:" + scan.getToUserName());
 	 	 	 	        return scan;
 	 	 			}
 	 	 		} else if(WeixinConstants.EVENT_TYPE_UNSUBSCRIBE.equalsIgnoreCase(eventType)){
  	 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	 	        xstream.alias("xml", MsgInEventSubscribe.class);
 	 	 	        MsgInEventSubscribe subscribe = (MsgInEventSubscribe)xstream.fromXML(content);
 	 	 	        logger.info("--------unsubscribe object-----ToUserName:" + subscribe.getFromUserName() + "-----toUserName:" + subscribe.getToUserName());
 	 	 	        return subscribe;
 	 	 		} else if(WeixinConstants.EVENT_TYPE_SCAN.equalsIgnoreCase(eventType)){
  	 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	 	        xstream.alias("xml", MsgInEventScan.class);
 	 	 	        MsgInEventScan scan = (MsgInEventScan)xstream.fromXML(content);
 	 	 	        logger.info("--------scan object-----ToUserName:" + scan.getFromUserName() + "-----toUserName:" + scan.getToUserName());
 	 	 	        return scan;
 	 	 		} else if(WeixinConstants.EVENT_TYPE_LOCATION.equalsIgnoreCase(eventType)){
  	 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	 	        xstream.alias("xml", MsgInEventLocation.class);
 	 	 	        MsgInEventLocation location = (MsgInEventLocation)xstream.fromXML(content);
 	 	 	        logger.info("--------scan object-----ToUserName:" + location.getFromUserName() + "-----toUserName:" + location.getToUserName());
 	 	 	        return location;
 	 	 		} else if(WeixinConstants.EVENT_TYPE_CLICK.equalsIgnoreCase(eventType)){
  	 	 	        XStream xstream = new XStream(new StaxDriver());   
 	 	 	        xstream.alias("xml", MsgInEventClick.class);
 	 	 	        MsgInEventClick click = (MsgInEventClick)xstream.fromXML(content);
 	 	 	        logger.info("--------scan object-----ToUserName:" + click.getFromUserName() + "-----toUserName:" + click.getToUserName());
 	 	 	        return click;
 	 	 		}
 	 		}
 	 		
 	 		//temp to response for any request
 	 		MsgInEventSubscribe subscribeTemp = new MsgInEventSubscribe();
 	 		Node toUserNode = doc.selectSingleNode("/xml/ToUserName");
 	 		String toUserName = toUserNode.getText();
 	 		subscribeTemp.setToUserName(toUserName);
 	 		Node fromUserNode = doc.selectSingleNode("/xml/FromUserName");
 	 		String fromUserName = fromUserNode.getText();
 	 		subscribeTemp.setFromUserName(fromUserName);
 	 		return subscribeTemp;
 	 		
 		}

	}
	
}
