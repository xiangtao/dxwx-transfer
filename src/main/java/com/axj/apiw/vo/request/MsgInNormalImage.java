package com.axj.apiw.vo.request;

public class MsgInNormalImage extends MsgIn{
    //开发者微信号 
	private String ToUserName; 
	//发送方帐号（一个OpenID） 
	private String FromUserName;
	//消息创建时间 （整型）
	private long CreateTime;
	//消息类型
	private String MsgType;
	//消息id，64位整型 
	private String MsgId;

	//图片链接  图片消息专用
	private String PicUrl;     
	
	//消息媒体id，可以调用多媒体文件下载接口拉取数据   图片、语音、视频消息专用
	private String MediaId;

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

	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}    

	
}
