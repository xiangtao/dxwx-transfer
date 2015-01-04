package com.axj.apiw.enums;

/**
 * @author Wei Li
 * @description 
 *    类描述：活动类型
 *    变更描述：
 *        2014-2-24 下午4:35:01 Wei Li TODO
 * @date 2014-2-24 下午4:35:01
 * @type ActivityEnum
 */
public enum ActivityEnum
{
	//1优惠券 2刮刮卡 3大转盘 4幸运机
	COUPON((byte)1), TICKET((byte)2), ROLL((byte)3), LUCK_MACHINE((byte)4); 
	
	private byte value;
	
	ActivityEnum(byte value)
	{
		this.value = value;
	}
	
	public byte getValue()
	{
		return value;
	}
}
