package com.axj.apiw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.axj.apiw.netty.NettyServer;

/**
 * server bootstrap
 */
public class Start {
	static Logger logger = LoggerFactory.getLogger(Start.class);
	
	public static void main(String[] args){
		//default 8080
		int port = 8080;
		if(args != null && args.length > 0) {
			String portString = args[0];
			port = Integer.parseInt(portString);
		}
		
		//init spring context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		logger.info("spring context initilize finished");
		
		//start netty server
		NettyServer server = (NettyServer)context.getBean("nettyServer");
		server.start(port);
		logger.info("server start finished at" + port);

	}
}
