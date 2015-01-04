package com.axj.apiw.service;

import com.axj.apiw.vo.request.MsgIn;
import com.axj.apiw.vo.response.MsgOut;

public interface ClickService extends WeixinService{

	MsgOut handle(String userStr, MsgIn msgIn);
	
}
