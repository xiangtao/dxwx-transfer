package com.axj.apiw.handler.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.axj.apiw.constant.MaterialType;
import com.axj.apiw.constant.QueryHandlerConstant;
import com.axj.apiw.handler.annotation.QueryHandlerComponent;
import com.axj.apiw.model.TUser;
import com.axj.apiw.model.TWelcome;
import com.axj.apiw.model.TWelcomeExample;
import com.axj.apiw.service.MemberCodeService;
import com.axj.apiw.vo.request.MsgInEventScan;
import com.axj.apiw.vo.request.MsgInEventSubscribe;
import com.axj.apiw.vo.response.MsgOut;
import com.axj.apiw.vo.response.MsgOutNormalText;

/**
 * 关注实现类
 * @description 
 *    类描述：
 *    变更描述：
 *        2014年2月19日 下午6:07:48 Administrator TODO
 * @date 2014年2月19日 下午6:07:48
 * @type SubscribeHandlerImpl
 */
@Component
@QueryHandlerComponent(uniqueIdentification = QueryHandlerConstant.UNIQUE_IDENTITY_NOTHING, category = QueryHandlerConstant.CATEGORY_DEF)
public class SubscribeHandlerImpl extends PlaintQueryHandlerImpl {
    private String key_ = "关注回复";
    static Logger logger = LoggerFactory.getLogger(SubscribeHandlerImpl.class);
	
    
    @Resource
    private MemberCodeService memberCodeService;
    
	
    @Override
    public MsgOut handleEventScanIn(TUser wechat, MsgInEventScan in) {
			String fromUserName = in.getFromUserName();
			String toUserName = in.getToUserName();
			
			MsgOut msgOut = new MsgOut();
			if(wechat!=null){
			    
				//首次关注回复类型 1:图文 2:文本
				int attentionReplyType = 2;
				String wechatId = wechat.getId();
				logger.info("SubscribeHandlerImpl handle wechatId={}",wechatId);
				logger.info("SubscribeHandlerImpl handle attentionReplyType={}",attentionReplyType);
				
				TWelcomeExample exampleWel = new TWelcomeExample();
				exampleWel.createCriteria();
				List<TWelcome> welList = null;//tWelcomeMapper.selectByExample(exampleWel);
				String welcome = "阿兴家快餐微订购会员卡平台正在开发测试中，给您带来的不便请谅解！预计正式启用在6月份";
				if(welList!=null && welList.size()>0){
					welcome = welList.get(0).getMsg1();
				}
				
				if(attentionReplyType == MaterialType.TXT){//文本
					logger.info("SubscribeHandlerImpl handle 回复文本");
					MsgOutNormalText result = new MsgOutNormalText();
					result.setFromUserName(toUserName);
					result.setToUserName(fromUserName);
					result.setCreateTime(System.currentTimeMillis());
					result.setMsgType("text");
					result.setContent(welcome);
					msgOut =  result;
				}
			}else {
				return null;
			}
			logger.info("SubscribeHandlerImpl handle end");
			return msgOut;
    }
    
    
    
    @Override
    public MsgOut handleEventSubOrUnSubscribeIn(TUser wechat, MsgInEventSubscribe textIn) {
			String fromUserName = textIn.getFromUserName();
			String toUserName = textIn.getToUserName();
			MsgOut msgOut = new MsgOut();
			if(wechat!=null){
				//首次关注回复类型 1:图文 2:文本
				int attentionReplyType = 2;
				String wechatId = wechat.getId();
				logger.info("SubscribeHandlerImpl handle wechatId={}",wechatId);
				logger.info("SubscribeHandlerImpl handle attentionReplyType={}",attentionReplyType);
				
				TWelcomeExample exampleWel = new TWelcomeExample();
				exampleWel.createCriteria();
				List<TWelcome> welList = null;//tWelcomeMapper.selectByExample(exampleWel);
				String welcome = "阿兴家快餐微订购会员卡平台正在开发测试中，给您带来的不便请谅解！预计正式启用在6月份";
				if(welList!=null && welList.size()>0){
					welcome = welList.get(0).getMsg1();
				}
				
				if(attentionReplyType == MaterialType.TXT){//文本
					logger.info("SubscribeHandlerImpl handle 回复文本");
					MsgOutNormalText result = new MsgOutNormalText();
					result.setFromUserName(toUserName);
					result.setToUserName(fromUserName);
					result.setCreateTime(System.currentTimeMillis());
					result.setMsgType("text");
					result.setContent(welcome);
					msgOut =  result;
				}
			}else {
				return null;
			}
			logger.info("SubscribeHandlerImpl handle end");
			return msgOut;
    }
    
    public static void main(String[] args) {
    	//init context
    			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    			
    			SubscribeHandlerImpl service = (SubscribeHandlerImpl) context.getBean("subscribeHandlerImpl");
    			
    			service.handleEventSubOrUnSubscribeIn(null, null);
	}
}
