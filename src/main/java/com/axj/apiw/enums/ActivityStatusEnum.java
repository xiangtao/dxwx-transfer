package com.axj.apiw.enums;

/**
 * @author Wei Li
 * @description 
 *    类描述：活动状态
 *    变更描述：
 *        2014-2-24 下午4:35:28 Wei Li TODO
 * @date 2014-2-24 下午4:35:28
 * @type ActivityStatusEnum
 */
public enum ActivityStatusEnum
{
	//0未开始 1活动进行中2活动结束 
	NOTSTART((byte)0), START((byte)1), END((byte)2); 
	
	private byte value;
	
	ActivityStatusEnum(byte value)
	{
		this.value = value;
	}
	
	public byte getValue()
	{
		return value;
	}
}
