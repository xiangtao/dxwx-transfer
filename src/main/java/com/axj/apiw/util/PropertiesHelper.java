package com.axj.apiw.util;

import java.util.Properties;

/**
 * 
* <p>Title: PropertiesHelper</p>
* <p>Description: 读取xml配置文件</p>
 * @author zhangfei
 * @date 2013-8-1 下午2:29:21
 */
public class PropertiesHelper 
{
	private Properties properties;

	public PropertiesHelper( Properties properties )
	{
		this.properties = properties;
	}

	public String get( String key )
	{
		return properties.getProperty( key );
	}

	public String get( String key, String defaultVal )
	{
		String val = get( key );
		return val == null ? defaultVal : val;
	}

	public String findValue( String... keys )
	{
		for ( String key : keys )
		{
			String value = get( key );
			if ( value != null )
			{
				return value;
			}
		}
		return null;
	}

	public boolean getBoolean( String key, boolean defaultVal )
	{
		String val = get( key );
		return val == null ? defaultVal : Boolean.parseBoolean( val );
	}

	public long getLong( String key, long defaultVal )
	{
		String val = get( key );
		return val == null ? defaultVal : Long.parseLong( val );
	}

	public int getInt( String key, int defaultVal )
	{
		return ( int ) getLong( key, defaultVal );
	}

	public short getShort( String key, short defaultVal )
	{
		return ( short ) getLong( key, defaultVal );
	}

	public double getDouble( String key, double defaultVal )
	{
		String val = get( key );
		return val == null ? defaultVal : Double.parseDouble( val );
	}

	public <T extends Enum<T>> T getEnum( String key, Class<T> type, T defaultValue )
	{
		String val = get( key );
		return val == null ? defaultValue : Enum.valueOf( type, val );
	}
}
