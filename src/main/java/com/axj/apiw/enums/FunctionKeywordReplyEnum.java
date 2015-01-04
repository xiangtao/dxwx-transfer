package com.axj.apiw.enums;

/**
 * @author Wei Li
 * @description 
 *    类描述：关键字回复类型
 *    变更描述：
 *        2014-2-24 上午10:57:34 Wei Li TODO
 * @date 2014-2-24 上午10:57:34
 * @type KeywordType
 */
public enum FunctionKeywordReplyEnum
{
	//1 活动		2微网站首页  3微网站文章 4会员卡 5 360全景
	ACTIVITY((byte)1), TINY_SITE_HOME_PAGE((byte)2), TINY_SITE_ARTICLE((byte)3), MEMBER_CARD((byte) 4) , PANORAMA((byte) 5);
	
	private byte value;
	
	FunctionKeywordReplyEnum(byte value)
	{
		this.value = value;
	}
	
	public byte getValue()
	{
		return value;
	}
}
