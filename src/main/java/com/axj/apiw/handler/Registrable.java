package com.axj.apiw.handler;

import java.util.Map;

import com.axj.apiw.model.FunctionPoint;
import com.axj.apiw.model.TUser;
import com.axj.apiw.vo.request.MsgIn;

public interface Registrable {
    boolean isNeedRegister(TUser wechat,MsgIn msgIn,Map<String,FunctionPoint> currentWechatOpenFunctionsMap);
}
