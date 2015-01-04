package com.axj.apiw.handler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.axj.apiw.constant.QueryHandlerConstant;
import com.axj.apiw.handler.annotation.QueryHandlerComponent;
import com.axj.apiw.model.FunctionPoint;
import com.axj.apiw.model.TUser;
import com.axj.apiw.vo.request.MsgIn;
import com.axj.apiw.vo.response.MsgOut;

public class AppQueryHandlerChain implements QueryHandlerChain{
    private static final Logger logger =LoggerFactory.getLogger(AppQueryHandlerChain.class);
    
    private static AppQueryHandlerChain _chain = new AppQueryHandlerChain();
    
    private boolean isSort = false;//是否已经排序了
    
    private List<QueryHandler> handlers = new ArrayList<QueryHandler>();
    
    
    private List<QueryHandler> executeHandlers = new ArrayList<QueryHandler>();
    
    
    private Map<String, Integer> _mapCate = null;
    private AppQueryHandlerChain(){
	_mapCate = new HashMap<String, Integer>();
	_mapCate.put(QueryHandlerConstant.CATEGORY_BASE, 1);
	_mapCate.put(QueryHandlerConstant.CATEGORY_FUNC, 5);
	_mapCate.put(QueryHandlerConstant.CATEGORY_DEF, 10);
    }
    
    
    
    public static AppQueryHandlerChain getInstance(){
	return _chain;
    }
    
    
    public int getCategroyWeight(String cate){
	Integer i = _mapCate.get(cate);
	return i==null?0:i;
    }
    
    
    @Override
    public synchronized void register(QueryHandler queryHandler) {
	handlers.add(queryHandler);
    }
    
    @Override
    public synchronized void resortChain() {
	//清空chain 关系
	for (QueryHandler queryHandler : handlers) {
	      queryHandler.setSuccessor(null);
	} 
	
	//先根据 category 排序，在根据 priority(数字越大越排到后面)排序
	    Collections.sort(handlers, new Comparator<QueryHandler>() {
		    @Override
		    public int compare(QueryHandler o1, QueryHandler o2) {
			QueryHandlerComponent queryCompAnnotation1 =  o1.getClass().getAnnotation(QueryHandlerComponent.class);
			String category1 = queryCompAnnotation1.category();
			int priority1 = queryCompAnnotation1.priority();
			    
			QueryHandlerComponent queryCompAnnotation2 =  o2.getClass().getAnnotation(QueryHandlerComponent.class);
			String category2 = queryCompAnnotation2.category();
			int priority2 = queryCompAnnotation2.priority();
			
			if(getCategroyWeight(category1) > getCategroyWeight(category2)){
			    return 1;
			}else if(getCategroyWeight(category1) == getCategroyWeight(category2)){
			    return (priority1-priority2);
			}else{
			    return -1;
			}
		    }
	    });
	    
	    logger.info("----------->>>handlers size[" + handlers.size() +"]");
	    for (int i = 0; i < handlers.size(); i++) {
		QueryHandlerComponent queryCompAnnotation =  handlers.get(i).getClass().getAnnotation(QueryHandlerComponent.class);
		logger.info("----------->>>[" + i +"]"+ handlers.get(i).getClass().getSimpleName() + ",annotation["+ queryCompAnnotation +"]"+ "\n");
	    }
	    
	    isSort = true;
	    
    }
    
    @Override
    public synchronized void assembleChain(TUser wechat,MsgIn msgIn,List<FunctionPoint> currentWechatOpenFunctions){
	logger.info("----------->>>start to assemble queryhandler "); 
	
	Map<String,FunctionPoint> currentWechatOpenFunctionsMap = new HashMap<String, FunctionPoint>();
	if(currentWechatOpenFunctions!=null){
	    for (FunctionPoint functionPoint : currentWechatOpenFunctions) {
		currentWechatOpenFunctionsMap.put(functionPoint.getUniquecode(), functionPoint);
	    }
	}
	
	//先进行重排序
	if(!isSort){
	    resortChain();
	}
	//先清空待执行的 handler 集合
	executeHandlers.clear();
	
	//过滤到不需要执行的QueryHandler
	Iterator<QueryHandler> ite = handlers.iterator();
	while(ite.hasNext()){
	    QueryHandler queryHandler = ite.next();
	    queryHandler.setSuccessor(null); //清空关系
	    if(queryHandler.isNeedRegister(wechat,msgIn,currentWechatOpenFunctionsMap)){
		//添加进需要执行的handlers集合中
		executeHandlers.add(queryHandler);
	    }
	}
	for (int i = 0; i < executeHandlers.size(); i++) {
	    QueryHandler queryHandler = executeHandlers.get(i);
	    if(i<executeHandlers.size()-1){
		queryHandler.setSuccessor(executeHandlers.get(i+1));
	    }
	}
	
	logger.info("----------->>>assemble completed,size="+executeHandlers.size() + 
		"\n executeHandlers is" + executeHandlers); 
    }
    
    @Override
    public synchronized MsgOut start(TUser wechat,MsgIn msgIn,List<FunctionPoint> currentWechatOpenFunctions) {
	//装配QueryHandler
	this.assembleChain(wechat, msgIn, currentWechatOpenFunctions);
	
	if(executeHandlers.size()>0){
	    return executeHandlers.get(0).handle(wechat, msgIn);
	}
	return null;
    }
    
    
    public static void main(String[] args) {
	
    }
    

}
