package com.axj.apiw.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * http 请求工具
 * @author taox
 * @description 
 *    类描述：
 *    变更描述：
 *        2013年11月22日 下午2:16:48 Administrator TODO
 * @date 2013年11月22日 下午2:16:48
 * @type HttpclientUtils
 */
public class HttpclientUtils {
	private static final Logger logger =LoggerFactory.getLogger(HttpclientUtils.class);
	
	public static final int HTTP_CONNECTION_TIMEOUT = 1000 * 20;
	public static final int HTTP_SO_TIMEOUT = 1000 * 60 * 30;
	public static final String GET = "GET";
	public static final String POST = "POST";
	
	public static final String CONTENT_TYPE = "Content-Type"; 
	public static final String CONTENT_TYPE_VALUE = "application/x-www-form-urlencoded;charset=UTF-8";
	public static final String CONTENT_TYPE_VALUE_GBK = "application/x-www-form-urlencoded;charset=gbk";
	public static final String CONTENT_TYPE_VALUE_GB2312 = "application/x-www-form-urlencoded;charset=gb2312";
	/**
	 * 用Post方式提交参数
	 * @author taox
	 * @description
	 * @param url
	 * @param name
	 * @param value
	 * @return null or resp content
	 */
	public static String sendHttpReq(String url,String name,String value){
		Map<String,String> params = new HashMap<String, String>();
		params.put(name, value);
		return sendHttpReq(url, params);
	}
	
	/**
	 * 用Post方式提交参数
	 * @author taox
	 * @description
	 * @param url
	 * @param params
	 * @return null or resp content
	 *
	 */
	public static String sendHttpReq(String url,Map<String,String> params){
		return sendHttpReq(url,POST,null,params);
	}
	
	/**
	 * http 请求 提交参数
	 * @author taox
	 * @description
	 * @param url
	 * @param ReqMethod 请求方法
	 * @param hearders 请求头
	 * @param params 请求key-value参数
	 * @return null or resp content
	 *
	 */
	public static String sendHttpReq(String url,String ReqMethod,Map<String,String> hearders,Map<String,String> params){
		if(GET.equalsIgnoreCase(ReqMethod)){
			return  sendHttpReqUseGet(url, hearders,params);
		}else if(POST.equalsIgnoreCase(ReqMethod)){
			return sendHttpReqUsePost(url, hearders, params);
		}
		return null;
	}
	
	
	/**
	 * http get方式提交参数
	 * @author taox
	 * @description
	 * @param url
	 * @param hearders
	 * @return null or resp content
	 *
	 */
	public static String sendHttpReqUseGet(String url,Map<String,String> hearders){
	    return sendHttpReqUseGet(url, hearders, null);
	}
	
	
	public static String sendHttpReqUseGet(String url,Map<String,String> hearders,Map<String,String> params){
	    HttpClient client = new HttpClient();
		HttpConnectionManager connectManager = client.getHttpConnectionManager();
		HttpConnectionManagerParams connectParams = connectManager.getParams();
		connectParams.setConnectionTimeout(HTTP_CONNECTION_TIMEOUT);
		connectParams.setSoTimeout(HTTP_SO_TIMEOUT);
		
		//设置默认的字符编码
		client.getParams().setContentCharset("UTF-8");
		
		
		GetMethod method = null;
		try {
		    
		    StringBuilder sb = new StringBuilder();
    		    if(params!=null){
    			Set<String> keySet = params.keySet();
    			int i=1;
    			for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
    				String key = (String) iterator.next();
    				String val = params.get(key);
    				sb.append(key+"="+val);
    				if(keySet.size()!=i){
    				    sb.append("&");
    				}
    				i++;
    			}
    		    }
    		    
    		    if(url.indexOf("?") == -1){
    			url = url + "?" + sb.toString();
    		    }else{
    			url = url+ "&" + sb.toString();
    		    }
			method = new GetMethod(url);
			if(hearders!=null){
				Set<String> hearderKeySet = hearders.keySet();
				for (Iterator<String> iterator = hearderKeySet.iterator(); iterator.hasNext();) {
					String key = (String) iterator.next();
					String val = hearders.get(key);
					method.addRequestHeader(key, val);
				}
			}
			String respCharset = method.getResponseCharSet();
			logger.info("------------------>>>>>response charset is :" + respCharset);
			int status = client.executeMethod(method);
			logger.info("------>>>Response status code is:" + status);
			if (status == HttpStatus.SC_OK) {
				return method.getResponseBodyAsString();
			}else{
				return null;
			}
		} catch (Exception e1) {
			logger.warn("Failed to send msg " + e1.getMessage());
			return null;
		} finally {
			method.releaseConnection();
		}
	}
	
	/**
	 * http post方式提交参数
	 * @author taox
	 * @description
	 * @param url
	 * @param hearders
	 * @param params
	 * @return null or resp content
	 *
	 */
	public static String sendHttpReqUsePost(String url,Map<String,String> hearders,Map<String,String> params){
		HttpClient client = new HttpClient();
		HttpConnectionManager connectManager = client.getHttpConnectionManager();
		HttpConnectionManagerParams connectParams = connectManager.getParams();
		connectParams.setConnectionTimeout(HTTP_CONNECTION_TIMEOUT);
		connectParams.setSoTimeout(HTTP_SO_TIMEOUT);
		
		//设置默认的字符编码
		client.getParams().setContentCharset("UTF-8");
				
		PostMethod method = null;
		try {
			method = new PostMethod(url);
			if(hearders!=null){
				Set<String> hearderKeySet = hearders.keySet();
				for (Iterator<String> iterator = hearderKeySet.iterator(); iterator.hasNext();) {
					String key = (String) iterator.next();
					String val = hearders.get(key);
					method.addRequestHeader(key, val);
				}
			}
			if(params!=null){
				Set<String> keySet = params.keySet();
				for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
					String key = (String) iterator.next();
					String val = params.get(key);
					method.addParameter(key, val);
				}
			}
			int status = client.executeMethod(method);
			logger.info("------>>>Response status code is:" + status);
			if (status == HttpStatus.SC_OK) {
				return method.getResponseBodyAsString();
			}else{
				return null;
			}
		} catch (Exception e) {
			logger.warn("Failed to send msg ",e);
			return null;
		} finally {
			method.releaseConnection();
		}
	}
	
	
	/**
	 * post提交 参数 和 str
	 * @author taox
	 * @description
	 * @param url
	 * @param hearders
	 * @param params
	 * @param str
	 * @return 
	 *
	 */
	public static String sendHttpPostParamsAndStr(String url,Map<String,String> hearders,
		Map<String,String> params,String str){
	    	PostMethod post = new PostMethod(url);
	        HttpClient client = new HttpClient();
	        HttpConnectionManager connectManager = client.getHttpConnectionManager();
		HttpConnectionManagerParams connectParams = connectManager.getParams();
		connectParams.setConnectionTimeout(HTTP_CONNECTION_TIMEOUT);
		connectParams.setSoTimeout(HTTP_SO_TIMEOUT);
	      //设置默认的字符编码
		client.getParams().setContentCharset("UTF-8");
	      		
	      		
	        try {
	        	if(hearders!=null){
					Set<String> hearderKeySet = hearders.keySet();
					for (Iterator<String> iterator = hearderKeySet.iterator(); iterator.hasNext();) {
						String key = (String) iterator.next();
						String val = hearders.get(key);
						post.addRequestHeader(key, val);
					}
			}
	        	Header h =post.getRequestHeader(CONTENT_TYPE);
	        	String contentType = "text/xml;charset=UTF-8";
	        	if(h!=null){
	        	     String v = h.getValue();
	        	     if(v!=null) contentType = v;
	        	}
	        	
	        	if(params!=null){
				Set<String> keySet = params.keySet();
				for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
					String key = (String) iterator.next();
					String val = params.get(key);
					post.addParameter(key, val);
				}
			}
	        	// Request content will be retrieved directly
	        	if(str!=null){
	        	    RequestEntity entity = new StringRequestEntity(str, contentType, null);
	        	    post.setRequestEntity(entity);
	        	}
	           
	                 int status = client.executeMethod(post);
	                 String resp = post.getResponseBodyAsString();
				logger.info("------>>>Response status code is:" + status);
				logger.info("------>>>Response content is:" + resp); 
				if (status == HttpStatus.SC_OK) {
					return resp;
				}else{
					return null;
				}
	        } catch (Exception e) {
				logger.warn("Failed to send msg ",e);
				return null;
	        } finally {
		        // Release current connection to the connection pool once you are done
		        post.releaseConnection();
		}
	}
	
	
	/**
	 * 提交xml格式的内容
	 * @author Administrator
	 * @description
	 * @param url
	 * @param hearders
	 * @param xml
	 * @return null or resp content
	 */
	public static String sendHttpPostXml(String url,Map<String,String> hearders,String xml){
        PostMethod post = new PostMethod(url);
        HttpClient client = new HttpClient();
        HttpConnectionManager connectManager = client.getHttpConnectionManager();
	HttpConnectionManagerParams connectParams = connectManager.getParams();
	connectParams.setConnectionTimeout(HTTP_CONNECTION_TIMEOUT);
	connectParams.setSoTimeout(HTTP_SO_TIMEOUT);
      //设置默认的字符编码
	client.getParams().setContentCharset("UTF-8");
	
	
        try {
        	if(hearders!=null){
				Set<String> hearderKeySet = hearders.keySet();
				for (Iterator<String> iterator = hearderKeySet.iterator(); iterator.hasNext();) {
					String key = (String) iterator.next();
					String val = hearders.get(key);
					post.addRequestHeader(key, val);
				}
			}
        	
        	// Request content will be retrieved directly
            RequestEntity entity = new StringRequestEntity(xml, "text/xml", "UTF-8");
        	post.setRequestEntity(entity);
            int status = client.executeMethod(post);
			logger.info("------>>>Response status code is:" + status);
			if (status == HttpStatus.SC_OK) {
				return post.getResponseBodyAsString();
			}else{
				return null;
			}
        } catch (Exception e) {
			logger.warn("Failed to send msg ",e);
			return null;
        } finally {
	        // Release current connection to the connection pool once you are done
	        post.releaseConnection();
		}
	}
	
	/**
	 * url encode parmsMap's value, if codec is null,return
	 * @author taox
	 * @description
	 * @param codec
	 * @param paramMap 
	 *
	 */
	public static void encodeUrlParams(String codec, Map<String, String> paramMap) {
		if(paramMap!=null){
		    	if(codec == null) return;
		    	Set<String> keySet = paramMap.keySet();
			for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
				String key = (String) iterator.next();
				String val = paramMap.get(key);
				try {
				    paramMap.put(key, URLEncoder.encode(val, codec));
				}catch (UnsupportedEncodingException e) {
				    logger.warn("encode url parms failure",e);
				    paramMap.put(key,val);
				}
			}
		}
	}
	
	/**
	 * 取出 contentType 里的字符编码 if has
	 * @author Administrator
	 * @description
	 * 
	 * @param contentType
	 * @return 
	 *
	 */
	public static String getContentTypeCharset(String contentType) {
		//application/x-www-form-urlencoded;charset=UTF-8
		if(StringUtils.isBlank(contentType)){
		    return null;
		}else{
		    contentType = contentType.trim();
		    String[] contentTypeS = contentType.split("\\;");
		    for(String str:contentTypeS){
			int idx = str.toLowerCase().indexOf("charset=");
			if(idx!=-1){
			    return str.substring(idx+8);
			}
		    }
		    return null;
		}
	}
	/**
	 * @author taox
	 * @description
	 * @param params
	 * @return 
	 */
	public static Map<String,String> getParamsMapByParamsStr(String params){
	    Map<String,String> paramMap = new HashMap<String,String>();
		if(params!=null){
		    String[] paramArray = StringUtils.split(params, "&");
		    if(paramArray!=null){
			    for (int i = 0; i < paramArray.length; i++) {
				String keyValue = paramArray[i];
				String[] keyValueArray =  StringUtils.split(keyValue, "=");
				if(keyValueArray==null){
					continue;
				}
				if(keyValueArray.length==1){
				    paramMap.put(keyValueArray[0],"");
				}else if(keyValueArray.length>=2){
				    String tVal = "";
				    for(int j=1;j<keyValueArray.length;j++){
					tVal += keyValueArray[j];
					if(j!=(keyValueArray.length-1)){
					    tVal += "=";
					}
				    }
				    paramMap.put(keyValueArray[0],tVal);
				}
			    }
		    }
		}
		return paramMap;
	}
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
	    System.out.println(URLEncoder.encode("ddd", "UTF-8"));
	    test();
//	    test1();
//	    test2();
	}
	
	public static void test() throws UnsupportedEncodingException{
	    System.out.println("ok".equalsIgnoreCase(null));
		String rsp = "";//HttpclientUtils.sendHttpReq("http://115.182.51.81:40080/schedule?act=list", "params", "");
		String url = "http://api.weium.com/receipt/send/saveSms";//"http://222.223.239.164:88/sendsms.asp";
		Map<String,String> paramMap = new HashMap<String,String>();
		
//		System.out.println(URLEncoder.encode("proc1234多大的", "UTF-8"));
//		System.out.println(URLEncoder.encode(URLEncoder.encode("proc1234多大的", "UTF-8"),"UTF-8"));
		paramMap.put("userName", "bingning1223@126.com");
		paramMap.put("code", "adsend");
		paramMap.put("phoneNum", "13011222195");
		paramMap.put("text", "验证码:1516,%ww%1348%test中文 如需屏蔽回复0000");
		
		Map<String,String> headerMap = new HashMap<String,String>();
		
		headerMap.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
		
		rsp = HttpclientUtils.sendHttpReqUsePost(url, headerMap, paramMap);
		
		System.out.println(" rsp ----->>>" + rsp);
	}
	
	public static void test1() throws UnsupportedEncodingException{
	    String rsp = "";
	    String url = "http://222.223.239.164:88/sendsms.asp";
		Map<String,String> paramMap = new HashMap<String,String>();
		paramMap.put("name", "yunzhil");
		paramMap.put("password", "ac20022532");
		paramMap.put("mobile", "13011222195");
		String str = "13168839085恭喜您获得由电影网提供的《命运派对》test2，活动详情见：http://d.m1905.com/apps/gyt?url=http://d.m1905.com/app/gyt/index/detail/307 请在1小时内进行回复 307   表示可去，不回复视为自动放弃。超时无效。如需屏蔽回复0000";
		paramMap.put("message", Matcher.quoteReplacement(str));
		
		
//		System.out.println(URLEncoder.encode("proc1234多大的", "UTF-8"));
//		System.out.println(URLEncoder.encode(URLEncoder.encode("proc1234多大的", "UTF-8"),"UTF-8"));
		
		Map<String,String> headerMap = new HashMap<String,String>();
		headerMap.put(HttpclientUtils.CONTENT_TYPE,HttpclientUtils.CONTENT_TYPE_VALUE);
		
		HttpclientUtils.encodeUrlParams("GBK", paramMap);
		
		rsp = HttpclientUtils.sendHttpReqUseGet(url, headerMap, paramMap);
		
		System.out.println(" rsp ----->>>" + rsp);
	}
	
	
	public static void test2(){
	    String rsp = "";
	    String url = "http://api.weium.com/receipt/send/saveSms";
		Map<String,String> paramMap = new HashMap<String,String>();
		paramMap.put("userName", "bingning1223@126.com");
		paramMap.put("code", "adsend");
		paramMap.put("phoneNum", "13011222195");
		String str = "13168839085恭喜您获得由电影网提供的《命运派对》明星见面点映观影活动名额1个test3，活动详情见：http://d.m1905.com/apps/gyt?url=http://d.m1905.com/app/gyt/index/detail/307 请在1小时内进行回复 307   表示可去，不回复视为自动放弃。超时无效。如需屏蔽回复0000";
		paramMap.put("text", str);
		
//		System.out.println(URLEncoder.encode("proc1234多大的", "UTF-8"));
//		System.out.println(URLEncoder.encode(URLEncoder.encode("proc1234多大的", "UTF-8"),"UTF-8"));
		
		Map<String,String> headerMap = new HashMap<String,String>();
		headerMap.put(HttpclientUtils.CONTENT_TYPE, "application/x-www-form-urlencoded;charset=UTF-8");
		
		rsp = HttpclientUtils.sendHttpReqUsePost(url, headerMap, paramMap);
		
		System.out.println(" rsp ----->>>" + rsp);
		
		//
	}
}
