package com.axj.apiw.handler;

import java.util.List;

import com.axj.apiw.model.FunctionPoint;
import com.axj.apiw.model.TUser;
import com.axj.apiw.vo.request.MsgIn;
import com.axj.apiw.vo.response.MsgOut;

public interface QueryHandlerChain {
    
    public void register(QueryHandler queryHandler);
    
    public void resortChain();
    
    public void assembleChain(TUser wechat,MsgIn msgIn,List<FunctionPoint> currentWechatOpenFunctions);
    
    public MsgOut start(TUser wechat,MsgIn msgIn,List<FunctionPoint> currentWechatOpenFunctions);
    

}
