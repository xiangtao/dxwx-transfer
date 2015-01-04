package com.axj.apiw.vo.response;

public class MsgOutNormalVideo extends MsgOut {

    //接收方帐号（收到的OpenID）
	private String ToUserName; 
	//开发者微信号
	private String FromUserName;
	//消息创建时间 （整型）
	private long CreateTime;
	//消息类型 image
	private String MsgType;
	//通过上传多媒体文件，得到的id。 
	private String MediaId;
	//视频消息的标题 
	private String Title;
	//视频消息的描述 
	private String Description;
	
}
