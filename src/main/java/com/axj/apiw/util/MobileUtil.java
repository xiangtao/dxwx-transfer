package com.axj.apiw.util;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 电话号码格式验证
 * @author Administrator
 * @description 
 *    类描述：
 *    变更描述：
 *        2013年11月18日 上午10:35:34 Administrator TODO
 * @date 2013年11月18日 上午10:35:34
 * @type MobileUtil
 */
public class MobileUtil{
   /**
	 * 判断号码是联通，移动，电信中的哪个, 
	 * 在使用本方法前，请先验证号码的合法性 规则： 
	 * 中国移动拥有号码段为:139,138,137,136,135,134,147,159,158,157(3G),151,152,150,182(3G),183,184,187(3G),188(3G);18个号段 
	 * 中国联通拥有号码段为:130,131,132,145,155,156(3G),186(3G),185(3G);8个号段 
	 * 中国电信拥有号码段为:133,1349,153,189(3G),180(3G),181;6个号码段 
	 * @param mobile要判断的号码 
	 * @return 返回相应类型：1代表联通；2代表移动；3代表电信 
	 */  
	public static int getMobileType(String mobile) {  
	  
	    if (mobile.startsWith("0") || mobile.startsWith("+860")){
	        mobile = mobile.substring(mobile.indexOf("0") + 1, mobile.length());  
	    }else if(mobile.startsWith("+86")){
	    	mobile = mobile.substring(3, mobile.length());  
	    }
	    
	    List<String> chinaUnicom = Arrays.asList(new String[] {"130", "131", "132",  
	            "145","155", "156", "186", "185" });  
	    List<String> chinaMobile1 = Arrays.asList(new String[] { "135", "136", "137",  
	            "138", "139", "147","150", "151", "152", "157", "158", "159", "182","183","184","187",  
	            "188" });
	    List<String> chinaMobile2 = Arrays.asList(new String[] {"1340", "1341",  
	            "1342", "1343", "1344", "1345", "1346", "1347", "1348" }); 
	  
	    boolean bolChinaUnicom = (chinaUnicom.contains(mobile.substring(0, 3)));  
	    boolean bolChinaMobile1 = (chinaMobile1  
	            .contains(mobile.substring(0, 3)));  
	    boolean bolChinaMobile2 = (chinaMobile2  
	            .contains(mobile.substring(0, 4)));  
	    if (bolChinaUnicom)  
	        return 1;//联通    
	    if (bolChinaMobile1 || bolChinaMobile2)  
	        return 2; //移动    
	    return 3; //其他为电信
	}  
	
	
	public static boolean isMobileFormat(String mobile){
	    if(mobile == null){
		return false;
	    }
	    if (mobile.startsWith("0") || mobile.startsWith("+860")){
	        mobile = mobile.substring(mobile.indexOf("0") + 1, mobile.length());  
	    }else if(mobile.startsWith("+86")){
	    	mobile = mobile.substring(3, mobile.length());  
	    }
	    //^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$
	    Pattern p = Pattern.compile("^1\\d{10}$");              
	    Matcher m = p.matcher(mobile);              
	    return m.matches();  
	}
	
	public static void main(String[] args) {
	    boolean f = isMobileFormat("14411222195");
	    System.out.println(f);
	}
	
	
	
}
