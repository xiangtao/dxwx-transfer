package com.axj.apiw.factory;

import java.io.File;

import javax.annotation.Resource;

import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.axj.apiw.service.WeixinService;
import com.axj.apiw.vo.request.MsgInNormalText;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

@Component
@Scope("prototype")
public class ServiceFactory {
	static Logger logger = LoggerFactory.getLogger(ServiceFactory.class);
	
	@Resource(name="weixinEnterServiceImpl")
	private WeixinService weixinService;
	
 	public WeixinService createService(String uri, String method, String content) throws DocumentException{
 		logger.debug("begin to create service");
 		//由 WeixinService 服务统一去分发
 		return weixinService;
 	}
 	
	 public static void main(String[] args) throws DocumentException{
              XStream xstream = new XStream(new StaxDriver());   
              xstream.alias("xml", MsgInNormalText.class);
              Object o =   xstream.fromXML(new File("D:\\sample.xml"));
              XStream xstream2 = new XStream(new StaxDriver());
              xstream2.alias("xml", o.getClass());
              System.out.println(xstream2.toXML(o));
	 }
}
