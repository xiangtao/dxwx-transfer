package com.axj.apiw.vo.request;

public class MsgInEventLocation extends MsgIn{
    //开发者微信号 
	private String ToUserName; 
	//发送方帐号（一个OpenID） 
	private String FromUserName;
	//消息创建时间 （整型）
	private long CreateTime;
	//消息类型
	private String MsgType;
	//事件类型，LOCATION
	private String Event;
	//地理位置纬度
	private String Latitude; 
	//地理位置经度
	private String Longitude; 	
	//地理位置精度 
	private String Precision;
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
	public String getEvent() {
		return Event;
	}
	public void setEvent(String event) {
		Event = event;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getPrecision() {
		return Precision;
	}
	public void setPrecision(String precision) {
		Precision = precision;
	} 	

	
}
