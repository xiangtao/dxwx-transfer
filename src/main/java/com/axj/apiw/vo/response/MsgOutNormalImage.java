package com.axj.apiw.vo.response;

public class MsgOutNormalImage extends MsgOut {

    //接收方帐号（收到的OpenID）
	private String ToUserName; 
	//开发者微信号
	private String FromUserName;
	//消息创建时间 （整型）
	private long CreateTime;
	//消息类型 text
	private String MsgType;
	//文本消息内容  文本消息专用
	private String Content;
	public String getToUserName() {
	    return ToUserName;
	}
	public void setToUserName(String toUserName) {
	    ToUserName = toUserName;
	}
	public String getFromUserName() {
	    return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
	    FromUserName = fromUserName;
	}
	public long getCreateTime() {
	    return CreateTime;
	}
	public void setCreateTime(long createTime) {
	    CreateTime = createTime;
	}
	public String getMsgType() {
	    return MsgType;
	}
	public void setMsgType(String msgType) {
	    MsgType = msgType;
	}
	public String getContent() {
	    return Content;
	}
	public void setContent(String content) {
	    Content = content;
	}
	
}
