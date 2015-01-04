package com.axj.apiw.handler;

import com.axj.apiw.model.TUser;
import com.axj.apiw.vo.request.MsgInVerify;
import com.axj.apiw.vo.response.MsgOut;

/**
 * 验证消息真实性  handler
 * @author taox
 * @description 
 *    类描述：
 *    变更描述：
 * @type HandlerVerify
 */
public interface HandlerVerify {
    /**
     * 处理 MsgInVerify 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param in
     */
    public abstract MsgOut handleVerifyMsgIn(TUser wechat,MsgInVerify in);
}
