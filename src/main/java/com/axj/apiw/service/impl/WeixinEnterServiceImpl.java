package com.axj.apiw.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axj.apiw.handler.AppQueryHandlerChain;
import com.axj.apiw.model.FunctionPoint;
import com.axj.apiw.model.TUser;
import com.axj.apiw.model.TUserExample;
import com.axj.apiw.service.WeixinService;
import com.axj.apiw.vo.request.MsgIn;
import com.axj.apiw.vo.response.MsgOut;

/**
 * 微信消息处理统一入口
 * @author taox
 * @description 
 * @type WeixinServiceImpl
 */
@Service("weixinEnterServiceImpl")
public class WeixinEnterServiceImpl implements WeixinService {
    private static final Logger logger =LoggerFactory.getLogger(WeixinEnterServiceImpl.class);
    
//    @Autowired
//    private QueryWeiumWechatMapper queryWeiumWechatMapper;
    
//    @Autowired
//    private QueryFunctionPointMapper queryFunctionPointMapper;
    
//    @Autowired
//    private TUserMapper tUserMapper;
    
    @Override
    public MsgOut handle(String userStr, MsgIn msgIn) {
	try {
	    logger.info("------------>>>userStr:" + userStr);
	    
//	    WeiumWechat wechat = queryWeiumWechatMapper
//		    .selectByUserStr(userStr);
	    /*TUserExample example = new TUserExample();
	    example.createCriteria().andUseruniquecodeEqualTo(userStr);
	    List<TUser> list = tUserMapper.selectByExample(example);
	    if(list == null || list.size()<=0){
		throw new Exception("get wechat obj is null");
	    }*/
	    TUser wechat = new TUser();//list.get(0);
	    
	    logger.info("------------>>>get wechat is :" + wechat.toString());
	    
	    AppQueryHandlerChain appQueryHandlerChain = AppQueryHandlerChain
		    .getInstance();
	    
	    //查询出该公众号用户 打开的功能
	    List<FunctionPoint> currentWechatOpenFunctions = null;
	    
	    logger.info("----------->>>wechatid= "+ wechat.getId());
	    //装配 启动执行
	    MsgOut out = appQueryHandlerChain.start(wechat, msgIn,currentWechatOpenFunctions);
	    if (out == null) {
		out = new MsgOut();
	    }
	    return out;
	} catch (Exception e) {
	    logger.error("-------------->>>WeixinServiceImpl error:" ,e);
	    return new MsgOut();
	}
    }

}
