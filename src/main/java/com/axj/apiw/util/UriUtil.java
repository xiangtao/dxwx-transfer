package com.axj.apiw.util;

public class UriUtil {

	public static String getUserStr(String uri){
		if(uri == null || uri.length() <= 0){
			return null;
		}
        String[] uriArray = uri.split("/");
        String userStringtemp = uriArray[uriArray.length - 1];
        System.out.println("userStringtemp:" + userStringtemp);
        String[] userArray = userStringtemp.split("[?]");
        String userStr = userArray[0];
        System.out.println("userStr:" + userStr);
        return userStr;
	}
	
	public static void main(String[] args) {
		System.out.println(getUserStr("http://www.baidu.com/yes"));
	}
}
