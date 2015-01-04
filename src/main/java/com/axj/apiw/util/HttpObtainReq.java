package com.axj.apiw.util;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.axj.apiw.model.DefHttpAddress;

public class HttpObtainReq implements IObtainReq {
    private static final Logger logger =LoggerFactory.getLogger(HttpObtainReq.class);
    private DefHttpAddress httpAddress;
    
    public HttpObtainReq(DefHttpAddress httpAddress) {
	super();
	this.httpAddress = httpAddress;
    }

    @Override
    public String obtainReq() {
	logger.info("----------->>>http req Address is:\n"+ httpAddress);
	String reqMethod = httpAddress.getReqMethod();
	String url = httpAddress.getUrl();
	String codec = httpAddress.getCodec();
	Map<String,String> paramMap = httpAddress.getParamsMap();
	Map<String,String> headerMap = httpAddress.getReqHeaderMap();
	String body = httpAddress.getBody();
	String content = "";
	if(StringUtils.equalsIgnoreCase(reqMethod, DefHttpAddress.GET)){
	    if(StringUtils.isNotBlank(body)){
		throw new RuntimeException("参数体body不为空，不能进行GET请求,body:[" + body + "]");
	    }
	    HttpclientUtils.encodeUrlParams(codec, paramMap);
	    content = HttpclientUtils.sendHttpReqUseGet(url, headerMap,paramMap);
	}else{
	    if(StringUtils.isNotBlank(body)){
		content = HttpclientUtils.sendHttpPostParamsAndStr(url, headerMap, paramMap,body);
	    }else{
		content = HttpclientUtils.sendHttpReqUsePost(url, headerMap, paramMap);
	    }
	}
	logger.info("----------->>>http response content:\n"+ content);
	return content;
    }
    

}
