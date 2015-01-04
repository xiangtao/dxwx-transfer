package com.axj.apiw.vo.response;

import java.util.List;

public class MsgOutNormalNews extends MsgOut {

    //接收方帐号（收到的OpenID）
	private String ToUserName; 
	//开发者微信号
	private String FromUserName;
	//消息创建时间 （整型）
	private long CreateTime;
	//消息类型 news
	private String MsgType;
	//图文消息个数，限制为10条以内 
	private int ArticleCount;
	//多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应 
	private List<Item> Articles;
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
	public int getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}
	public List<Item> getArticles() {
		return Articles;
	}
	public void setArticles(List<Item> articles) {
		Articles = articles;
	}
	
}
