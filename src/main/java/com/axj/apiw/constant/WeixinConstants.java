package com.axj.apiw.constant;

public class WeixinConstants {
	
	public static final String MSG_TYPE_TEXT = "text";
	public static final String MSG_TYPE_IMAGE = "image";
	public static final String MSG_TYPE_VOICE = "voice";
	public static final String MSG_TYPE_VIDEO = "video";
	public static final String MSG_TYPE_LOCATION = "location";
	public static final String MSG_TYPE_LINK = "link";
	public static final String MSG_TYPE_EVENT = "event";
	
	
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";
	public static final String EVENT_TYPE_SCAN = "scan";
	public static final String EVENT_TYPE_LOCATION = "location";
	public static final String EVENT_TYPE_CLICK = "click";
	
	public static final String WEIXIN_MSGTYPE = "/xml/MsgType";
	public static final String WEIXIN_EVENT = "/xml/Event";
	public static final String WEIXIN_TICKET = "/xml/Ticket";
	
	public static final String METHOD_POST = "POST";
	public static final String METHOD_GET = "GET";
	
	public static final String VERIFY_PARA_SIGNATURE = "signature";
	public static final String VERIFY_PARA_TIMESTAMP = "timestamp";
	public static final String VERIFY_PARA_NONCE = "nonce";
	public static final String VERIFY_PARA_ECHOSTR = "echostr";
	
}
