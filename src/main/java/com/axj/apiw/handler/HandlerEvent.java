package com.axj.apiw.handler;

import com.axj.apiw.model.TUser;
import com.axj.apiw.vo.request.MsgInEventClick;
import com.axj.apiw.vo.request.MsgInEventLocation;
import com.axj.apiw.vo.request.MsgInEventScan;
import com.axj.apiw.vo.request.MsgInEventSubscribe;
import com.axj.apiw.vo.response.MsgOut;

/**
 * 接受事件推送消息 处理接口
 * @author taox
 * @description 
 *    类描述：
 *    变更描述：
 * @type HandlerEvent
 */
public interface HandlerEvent {
    /**
     * 处理 MsgInEventSubscribe 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleEventSubOrUnSubscribeIn(TUser wechat,MsgInEventSubscribe in);	
    
    
    /**
     * 处理 MsgInEventScan 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleEventScanIn(TUser wechat,MsgInEventScan in);	
    
    /**
     * 处理 MsgInEventLocation 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleEventLocationIn(TUser wechat,MsgInEventLocation in);	
    
    /**
     * 处理 MsgInEventClick 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleEventClickIn(TUser wechat,MsgInEventClick in);	
    
    
}
