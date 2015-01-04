package com.axj.apiw.handler;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.axj.apiw.constant.QueryHandlerConstant;
import com.axj.apiw.handler.annotation.QueryHandlerComponent;
import com.axj.apiw.model.FunctionPoint;
import com.axj.apiw.model.TUser;
import com.axj.apiw.model.WeiumWechat;
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
import com.axj.apiw.vo.response.MsgOut;

public abstract class AbstractQueryHandler extends QueryHandler implements HandlerNormal,HandlerEvent,HandlerVerify{
    private static final Logger logger =LoggerFactory.getLogger(AbstractQueryHandler.class);
    
    
    @Override
    public MsgOut handle(TUser wechat, MsgIn msgIn) {
	long _startTime = System.currentTimeMillis();
	logger.info("--------------->>>start to exec:" + this.getClass().getSimpleName() );
	MsgOut out = null;
	
	//消息为：验证消息真实性
	if(msgIn instanceof MsgInVerify){
	    MsgInVerify in = (MsgInVerify)msgIn;
	    out = handleVerifyMsgIn(wechat, in);
	    
	  //普通类型消息
	    
	}else if(msgIn instanceof MsgInNormalText){
	    MsgInNormalText in = (MsgInNormalText)msgIn;
	    out = handleNormalTextIn(wechat, in);
	}else if(msgIn instanceof MsgInNormalImage){
	    MsgInNormalImage in = (MsgInNormalImage)msgIn;
	    out = handleNormalImageIn(wechat, in);
	}else if(msgIn instanceof MsgInNormalVoice){
	    MsgInNormalVoice in = (MsgInNormalVoice)msgIn;
	    out = handleNormalVoiceIn(wechat, in);
	}else if(msgIn instanceof MsgInNormalVideo){
	    MsgInNormalVideo in = (MsgInNormalVideo)msgIn;
	    out = handleNormalVideoIn(wechat, in);
	}else if(msgIn instanceof MsgInNormalLocation){
	    MsgInNormalLocation in = (MsgInNormalLocation)msgIn;
	    out = handleNormalLocationIn(wechat, in);
	}else if(msgIn instanceof MsgInNormalLink){
	    MsgInNormalLink in = (MsgInNormalLink)msgIn;
	    out = handleNormalLinkIn(wechat, in);
	    
	  //事件类型消息
	    
	}else if(msgIn instanceof MsgInEventSubscribe){
	    MsgInEventSubscribe in = (MsgInEventSubscribe)msgIn;
	    out = handleEventSubOrUnSubscribeIn(wechat, in);
	}else if(msgIn instanceof MsgInEventScan){
	    MsgInEventScan in = (MsgInEventScan)msgIn;
	    out = handleEventScanIn(wechat, in);
	}else if(msgIn instanceof MsgInEventLocation){
	    MsgInEventLocation in = (MsgInEventLocation)msgIn;
	    out = handleEventLocationIn(wechat, in);
	}else if(msgIn instanceof MsgInEventClick){
	    MsgInEventClick in = (MsgInEventClick)msgIn;
	    out = handleEventClickIn(wechat, in);
	}
	
	
	printProcessTime(_startTime);
	
	if(out == null){
	    //如果没有下一个处理者并且out为null,直接返回Empty MsgOut
	    //通常为最后一个Handler也处理不了的情况
	    
	    logger.info("--------------->>>MsgOut is null,Pass to successor to control");
	    
	    if(super.getSuccessor() == null){
		return new MsgOut();
	    }
	    return super.getSuccessor().handle(wechat, msgIn);
	}
	
	logger.info("--------------->>> completed control,"+this.getClass().getSimpleName());
	
	return out;
    }
    
    @Override
    public boolean isNeedRegister(TUser wechat,MsgIn msgIn,Map<String,FunctionPoint> currentWechatOpenFunctionsMap){
	QueryHandlerComponent queryComp = this.getClass().getAnnotation(QueryHandlerComponent.class);
	if(queryComp != null){
	    String uniqueIdentification = queryComp.uniqueIdentification();
	    
	    //如果不需要唯一标识，直接返回true
	    if(uniqueIdentification.equalsIgnoreCase(QueryHandlerConstant.UNIQUE_IDENTITY_NOTHING)){
		logger.info("-------------->>> class [" +this.getClass().getSimpleName()+ "] uniqueIdentification is :[" + uniqueIdentification + "] registed");
		return true;
	    }
	    
	    if(currentWechatOpenFunctionsMap == null){
		logger.info("-------------->>> class [" +this.getClass().getSimpleName()+ "] uniqueIdentification is :[" + uniqueIdentification + "] not registed");
		return false;
	    }
	    
	    FunctionPoint func = currentWechatOpenFunctionsMap.get(uniqueIdentification);
	    if(func == null){
		logger.info("-------------->>> class [" +this.getClass().getSimpleName()+ "] uniqueIdentification is :[" + uniqueIdentification + "] not registed");
		return false;
	    }
	    logger.info("-------------->>> class [" +this.getClass().getSimpleName()+ "] uniqueIdentification is :[" + uniqueIdentification + "] registed");
	    return true;
	}
	return false;
    }
    
    	/**
	 * 打印请求处理时间
	 */
	protected void printProcessTime(long _startTime){
	    long _endTime = System.currentTimeMillis();
	    logger.info("----------->>>"+this.getClass().getSimpleName()+" Request Process Time:" + (_endTime-_startTime) + "ms");
	}
    
    
}
