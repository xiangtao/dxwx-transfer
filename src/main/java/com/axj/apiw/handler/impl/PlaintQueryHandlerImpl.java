package com.axj.apiw.handler.impl;

import java.util.Map;

import com.axj.apiw.handler.AbstractQueryHandler;
import com.axj.apiw.model.FunctionPoint;
import com.axj.apiw.model.TUser;
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
/**
 * nothing,empty impl
 * @author taox
 * @type PlaintQueryHandlerImpl
 */
public class PlaintQueryHandlerImpl extends AbstractQueryHandler {

    @Override
    public MsgOut handleNormalTextIn(TUser wechat, MsgInNormalText textIn) {
	return null;
    }

    @Override
    public MsgOut handleNormalImageIn(TUser wechat,
	    MsgInNormalImage textIn) {
	return null;
    }

    @Override
    public MsgOut handleNormalVoiceIn(TUser wechat, MsgInNormalVoice in) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MsgOut handleNormalVideoIn(TUser wechat, MsgInNormalVideo in) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MsgOut handleNormalLocationIn(TUser wechat,
	    MsgInNormalLocation in) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MsgOut handleNormalLinkIn(TUser wechat, MsgInNormalLink in) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MsgOut handleEventSubOrUnSubscribeIn(TUser wechat,
	    MsgInEventSubscribe in) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MsgOut handleEventScanIn(TUser wechat, MsgInEventScan in) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MsgOut handleEventLocationIn(TUser wechat,
	    MsgInEventLocation in) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MsgOut handleEventClickIn(TUser wechat, MsgInEventClick in) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MsgOut handleVerifyMsgIn(TUser wechat, MsgInVerify in) {
	// TODO Auto-generated method stub
	return null;
    }
    
}
