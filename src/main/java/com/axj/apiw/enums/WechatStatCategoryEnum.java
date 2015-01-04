package com.axj.apiw.enums;

public enum WechatStatCategoryEnum
{
	Website((byte)0), Text((byte)1), Image((byte)2), Voice((byte)3), Subscribe((byte)4), Unsubscribe((byte)5);
	
	private byte value;

	WechatStatCategoryEnum( byte n )
	{
		value = n;
	}

	public byte getValue()
	{
		return value;
	}
}
