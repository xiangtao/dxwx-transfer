package com.axj.apiw.handler;

import com.axj.apiw.model.TUser;
import com.axj.apiw.vo.request.MsgInNormalImage;
import com.axj.apiw.vo.request.MsgInNormalLink;
import com.axj.apiw.vo.request.MsgInNormalLocation;
import com.axj.apiw.vo.request.MsgInNormalText;
import com.axj.apiw.vo.request.MsgInNormalVideo;
import com.axj.apiw.vo.request.MsgInNormalVoice;
import com.axj.apiw.vo.response.MsgOut;

/**
 * 接收普通消息 处理接口
 * @author taox
 * @description 
 *    类描述：
 *    变更描述：
 * @type HandlerNormal
 */
public interface HandlerNormal {
    /**
     * 处理 MsgInNormalText 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleNormalTextIn(TUser wechat,MsgInNormalText in);
    
    /**
     * 处理 MsgInNormalImage 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleNormalImageIn(TUser wechat,MsgInNormalImage in);
    
    /**
     * 处理 MsgInNormalVoice 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleNormalVoiceIn(TUser wechat,MsgInNormalVoice in);
    
    /**
     * 处理 MsgInNormalVideo 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleNormalVideoIn(TUser wechat,MsgInNormalVideo in);
    
    /**
     * 处理 MsgInNormalLocation 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleNormalLocationIn(TUser wechat,MsgInNormalLocation in);
    
    
    /**
     * 处理 MsgInNormalLink 输入，如果返回值为null,则继续往下进行处理
     * @param wechat
     * @param textIn
     */
    public abstract MsgOut handleNormalLinkIn(TUser wechat,MsgInNormalLink in);
}
