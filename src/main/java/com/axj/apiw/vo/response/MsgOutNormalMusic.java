package com.axj.apiw.vo.response;

public class MsgOutNormalMusic extends MsgOut {

    //接收方帐号（收到的OpenID）
	private String ToUserName; 
	//开发者微信号
	private String FromUserName;
	//消息创建时间 （整型）
	private long CreateTime;
	//消息类型 music
	private String MsgType;
	//音乐标题
	private String Title;
	//音乐描述
	private String Description;
	//音乐链接
	private String MusicURL;
	//高质量音乐链接，WIFI环境优先使用该链接播放音乐
	private String HQMusicUrl;
	//缩略图的媒体id，通过上传多媒体文件，得到的id 
	private String ThumbMediaId;
	
}
