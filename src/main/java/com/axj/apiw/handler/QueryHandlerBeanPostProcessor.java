package com.axj.apiw.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.axj.apiw.handler.annotation.QueryHandlerComponent;

@Component
public class QueryHandlerBeanPostProcessor implements BeanPostProcessor {
    private static final Logger logger =LoggerFactory.getLogger(QueryHandlerBeanPostProcessor.class);
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
	    throws BeansException {
	return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
	    throws BeansException {
	QueryHandlerComponent queryCompAnnotation = bean.getClass().getAnnotation(QueryHandlerComponent.class);
	if(queryCompAnnotation!=null){
	    //find query handler,put into chain
	    logger.info("----------->>>init register bean " + bean.getClass().getSimpleName() +" annotation: "+ queryCompAnnotation);
	    if(bean instanceof QueryHandler){
		AppQueryHandlerChain.getInstance().register((QueryHandler)bean);
	    }
	}
	return bean;
    }

}
