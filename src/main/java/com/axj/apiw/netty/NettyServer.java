package com.axj.apiw.netty;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.codec.http.HttpRequestDecoder;
import org.jboss.netty.handler.codec.http.HttpResponseEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * netty server
 * 
 * @author yhb
 * 
 */
@Component
public class NettyServer {
	Logger logger = LoggerFactory.getLogger(NettyServer.class);
	
	@Autowired
	private WeixinHandler weixinHandler;

	public void start(int port) {
		//server config
		ServerBootstrap bootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool()));
		
		//pipeline factory
		bootstrap.setPipelineFactory(new ServerPipelineFactory());
		
		//port bind
		bootstrap.bind(new InetSocketAddress(port));
		
		logger.debug("admin start on "+port);
	}

	private class ServerPipelineFactory implements
			ChannelPipelineFactory {
		public ChannelPipeline getPipeline() throws Exception {
			//Create a default pipeline implementation
			ChannelPipeline pipeline = Channels.pipeline();
			pipeline.addLast("decoder", new HttpRequestDecoder());
			pipeline.addLast("encoder", new HttpResponseEncoder());
			
			//httphandler
			pipeline.addLast("handler", weixinHandler);
			return pipeline;
		}
	}
	
	public static void main(String[] args) {
		new NettyServer().start(8080);
	}
	
}
