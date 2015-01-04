package com.axj.apiw.vo.response;

public class MsgOutVerify extends MsgOut {

	public String getEchostr() {
		return echostr;
	}
	public void setEchostr(String echostr) {
		this.echostr = echostr;
	}
	//随机字符串 
	private String echostr;
}
