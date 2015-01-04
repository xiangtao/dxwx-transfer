package com.axj.apiw.handler;

import com.axj.apiw.model.TUser;
import com.axj.apiw.vo.request.MsgIn;
import com.axj.apiw.vo.response.MsgOut;
/**
 * 查询处理器
 * @author taox
 * @description 
 *    类描述：
 *    变更描述：
 *        2014年2月19日 下午6:39:31 Administrator TODO
 * @date 2014年2月19日 下午6:39:31
 * @type QueryHandler
 */
public abstract class QueryHandler implements Registrable{
    
    protected QueryHandler successor = null;
    
    /**
     * 处理输入，如果返回值为null,则继续往下进行处理
     * @description
     * @param wechat
     * @param msgIn
     */
    public abstract MsgOut handle(TUser wechat,MsgIn msgIn);

    public QueryHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(QueryHandler successor) {
        this.successor = successor;
    }
}
