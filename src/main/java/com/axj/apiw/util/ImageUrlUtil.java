package com.axj.apiw.util;

import java.io.IOException;
import java.util.Properties;

public class ImageUrlUtil {
	public static Properties pro;
	public static String imageDomain;
	static{
		try {
			pro = PropertiesFilesUtils.getInstance().getProperties("/url.properties");
			imageDomain = pro.getProperty("imageDomain");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getImageUrl(String path){
		if(null!=path && !path.trim().equals("")){
			return imageDomain + path;
		}else{
			return "";
		}
		
	}
	
	public static String getProperty(String key)
	{
		return pro.getProperty(key);
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		String url = getImageUrl("/site/default/navigator/aboutus.png");
		System.out.println(url);
	}
}
