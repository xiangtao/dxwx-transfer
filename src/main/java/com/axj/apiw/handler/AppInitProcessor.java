package com.axj.apiw.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * spring application context init completed innvocation
 * @author taox
 * @date 2014年3月3日 下午4:39:06
 * @type ApplicationInitCompletedProcessor
 */
@Component
public class AppInitProcessor implements
	ApplicationListener<ContextRefreshedEvent> {
    private static final Logger logger =LoggerFactory.getLogger(AppInitProcessor.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
	logger.info("----------->>>Pre-sort queryHandler");
	//启动时做一下排序
	AppQueryHandlerChain.getInstance().resortChain();
    }

}
