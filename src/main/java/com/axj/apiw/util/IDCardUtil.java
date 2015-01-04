package com.axj.apiw.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 身份证号验证
 * @author Administrator
 * @description 
 *    类描述：
 *    变更描述：
 *        2013年11月18日 上午10:35:34 Administrator TODO
 * @date 2013年11月18日 上午10:35:34
 * @type MobileUtil
 */
public class IDCardUtil{
	public static boolean isIDCardFormat(String idCard){
	    if(idCard == null) return false;
	    boolean b = idCard.matches("(\\d{17}[0-9a-zA-Z]|\\d{14}[0-9a-zA-Z])");
	    return b;
	}
	
	public static void main(String[] args) {
	    boolean f = isIDCardFormat("1306811987120920133");
	    System.out.println(f);
	}
	
	
	
}
