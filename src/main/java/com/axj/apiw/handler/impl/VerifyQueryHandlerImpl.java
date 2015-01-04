package com.axj.apiw.handler.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.axj.apiw.constant.QueryHandlerConstant;
import com.axj.apiw.handler.annotation.QueryHandlerComponent;
import com.axj.apiw.model.TUser;
import com.axj.apiw.vo.request.MsgInVerify;
import com.axj.apiw.vo.response.MsgOut;
import com.axj.apiw.vo.response.MsgOutVerify;


/**
 * 消息确认处理
 * @description 
 *    类描述：
 *    变更描述：
 * @date 2014年2月27日 下午4:15:38
 * @type VerifyQueryHandlerImpl
 */
@Component
@QueryHandlerComponent(uniqueIdentification = QueryHandlerConstant.UNIQUE_IDENTITY_NOTHING, 
	category = QueryHandlerConstant.CATEGORY_BASE,priority=20)
public class VerifyQueryHandlerImpl extends PlaintQueryHandlerImpl {
    private static Logger logger = LoggerFactory.getLogger(VerifyQueryHandlerImpl.class);

    @Override
    public MsgOut handleVerifyMsgIn(TUser wechat, MsgInVerify in) {
	MsgInVerify msgInVerify = in;
	
	//验证微信验证信息的有效性
	MsgOutVerify out = new MsgOutVerify();
	String echostr = msgInVerify.getEchostr();
	String nonce = msgInVerify.getNonce();
	String signature = msgInVerify.getSignature();
	String timestamp = msgInVerify.getTimestamp();
	if(wechat!=null){
		String result = checkAuthentication(wechat.getToken(), signature, timestamp, nonce, echostr);
		out.setEchostr(result);
		if(!"".equals(result)){
			logger.info("update "+wechat.getUseruniquecode()+" weiumWechartStatus = 1");
//			wechat.setWeiumWechartStatus(1);
//			weiumWechatMapper.updateByPrimaryKey(wechat);
		}
	}else{
		logger.warn("wechat is null");
	}
	
	return out;
	
    }
    
    /**
     *  Function:微信验证方法
     *  @author JLC
     *  @param signature 微信加密签名
     *  @param timestamp 时间戳
     *  @param nonce     随机数
     *  @param echostr   随机字符串
     *  @return
     */
    private String  checkAuthentication(String token,String signature,String timestamp,String nonce,String echostr) {
        String result ="";
        // 将获取到的参数放入数组
        String[] ArrTmp = { token, timestamp, nonce };
        // 按微信提供的方法，对数据内容进行排序
        Arrays.sort(ArrTmp);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ArrTmp.length; i++) {
            sb.append(ArrTmp[i]);
        }
        // 对排序后的字符串进行SHA-1加密
        String pwd = Encrypt(sb.toString());
        logger.debug("generate pwd is =" + pwd);
        if (pwd.equals(signature)) { 
            try {
                logger.debug("微信平台签名消息验证成功！"); 
                result = echostr;
            } catch (Exception e) {
            	logger.debug("Exception--"+e.getMessage());
            } 
        } else {
        	logger.debug("微信平台签名消息验证失败！");
        }
        logger.info("result-----------"+result);
        return result;
    }

    /**
     * 用SHA-1算法加密字符串并返回16进制串
     * 
     * @param strSrc
     * @return
     */
    private String Encrypt(String strSrc) {
        MessageDigest md = null;
        String strDes = null;
        byte[] bt = strSrc.getBytes();
        try {
            md = MessageDigest.getInstance("SHA-1");
            md.update(bt);
            strDes = bytes2Hex(md.digest());
        } catch (NoSuchAlgorithmException e) {
        	logger.debug("NoSuchAlgorithmException--"+e.getMessage());
            return null;
        }
        return strDes;
    }

    private String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }
    
    public static void main(String[] args) {
	
    }
}
