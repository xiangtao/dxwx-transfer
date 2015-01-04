package com.axj.apiw.model;

import java.util.Map;
/**
 * http 地址
 * @author taox
 * @description 
 *    类描述：
 *    变更描述：
 *        2013年11月28日 下午2:43:01 Administrator TODO
 * @date 2013年11月28日 下午2:43:01
 * @type SmsHttpAddress
 */
public class DefHttpAddress {

    public static final String GET = "GET";
    public static final String POST = "POST";
    
    private String url;//请求url
    private Map<String,String> paramsMap;//请求参数
    private Map<String,String> reqHeaderMap; //请求头
    private String body; //请求体
    private String reqMethod;//请求方法
    
    private String codec = "UTF-8";//编码
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Map<String, String> getParamsMap() {
        return paramsMap;
    }
    public void setParamsMap(Map<String, String> paramsMap) {
        this.paramsMap = paramsMap;
    }
    public Map<String, String> getReqHeaderMap() {
        return reqHeaderMap;
    }
    public void setReqHeaderMap(Map<String, String> reqHeaderMap) {
        this.reqHeaderMap = reqHeaderMap;
    }
    public String getReqMethod() {
        return reqMethod;
    }
    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }
    @Override
    public String toString() {
	return "SmsHttpAddress [url=" + url + ", paramsMap=" + paramsMap
		+ ", reqHeaderMap=" + reqHeaderMap + ", body=" + body
		+ ", reqMethod=" + reqMethod + "]";
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getCodec() {
        return codec;
    }
    public void setCodec(String codec) {
        this.codec = codec;
    }
    
}
