package com.axj.apiw.handler.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.axj.apiw.constant.OutLinkConstant;
import com.axj.apiw.constant.QueryHandlerConstant;
import com.axj.apiw.handler.annotation.QueryHandlerComponent;
import com.axj.apiw.model.SingleGraphic;
import com.axj.apiw.model.TUser;
import com.axj.apiw.model.TWxuserExample;
import com.axj.apiw.service.impl.ClickServiceImpl;
import com.axj.apiw.util.WeChatUtil;
import com.axj.apiw.vo.request.MsgInEventClick;
import com.axj.apiw.vo.response.Item;
import com.axj.apiw.vo.response.MsgOut;
import com.axj.apiw.vo.response.MsgOutNormalNews;

/**
 * 事件处理实现
 * @description 
 *    类描述：
 *    变更描述：
 * @date 2014年2月27日 下午4:24:46
 * @type ClickQueryHandlerImpl
 */
@Component
@QueryHandlerComponent(uniqueIdentification = QueryHandlerConstant.UNIQUE_IDENTITY_NOTHING, category = QueryHandlerConstant.CATEGORY_DEF)
public class ClickQueryHandlerImpl extends PlaintQueryHandlerImpl {
	Logger logger = LoggerFactory.getLogger(ClickServiceImpl.class);
	public static final String FODDER_URL = "http://wechatt.weium.com/fodderManage/fodderPreview?fodderid=";

    @Override
    public MsgOut handleEventClickIn(TUser wechat, MsgInEventClick in) {
    	logger.debug("--------进入回调方法-------");
		MsgInEventClick msgin = (MsgInEventClick)in;
		String fromUserName = msgin.getFromUserName();
		String toUserName = msgin.getToUserName();
		logger.debug("--------------查询回调微信号--------------");
		if(null != wechat){
			
			String uid = wechat.getId();
			
			TWxuserExample example = new TWxuserExample();
			example.createCriteria().andUseridEqualTo(uid)
									.andWxidEqualTo(fromUserName);
			/*List<TWxuser> list = tWxuserMapper.selectByExample(example);
			if(list==null || list.size()<=0){
				return null;
			}*/
			int wx_uid = 0;//list.get(0).getId();
			
		    SingleGraphic graphic = new SingleGraphic();
		    String eventKey = msgin.getEventKey();
		    if("k_zldc".equalsIgnoreCase(eventKey)){
		    	graphic.setFodderdigest("按用餐人数智能推送餐品，真方便！");
		    	graphic.setFodderimage( OutLinkConstant.OUT_LINK_URL +"/axj/images/zldc.jpg?r=1");
		    	graphic.setFoddername("享受阿兴家智能点餐服务带来的便捷吧！");
		    	graphic.setOuterlink(OutLinkConstant.OUT_LINK_URL 
		    			+ "/customer/axj_goIndex?storeID=402896aa45ca0da40145ca0db4590000&wxID=" + fromUserName +"&wx_uid="+wx_uid);
		    	
		    }else if("k_qbcp".equalsIgnoreCase(eventKey)){
		    	graphic.setFodderdigest("查看阿兴家全部餐品，开始点餐吧");
		    	graphic.setFodderimage( OutLinkConstant.OUT_LINK_URL +"/axj/images/qbcp.jpg");
		    	graphic.setFoddername("用餐时间到开始点餐吧！");
		    	graphic.setOuterlink(OutLinkConstant.OUT_LINK_URL 
		    			+ "/customer/axj_getAllProduct?storeID=402896aa45ca0da40145ca0db4590000&wxID=" + fromUserName +"&wx_uid="+wx_uid);
		    	
		    }else if("k_wdcd".equalsIgnoreCase(eventKey)){
		    	graphic.setFodderdigest("查看已点餐品");
		    	graphic.setFodderimage( OutLinkConstant.OUT_LINK_URL +"/axj/images/wdcd.jpg?r=1");
		    	graphic.setFoddername("查看已点餐品，享受超值美食吧！");
		    	graphic.setOuterlink(OutLinkConstant.OUT_LINK_URL 
		    			+ "/customer/axj_getMyMenu?storeID=402896aa45ca0da40145ca0db4590000&wxID=" + fromUserName +"&wx_uid="+wx_uid);
		    	
		    }else if("k_yd".equalsIgnoreCase(eventKey)){
		    	//http://42.121.118.57:8080/WX_PLANTFORM/customer/axj_getAllStore?storeID=402896aa45ca0da40145ca0db4590000
		    	
		    	graphic.setFodderdigest("查看阿兴家全部门店信息，进行预订");
		    	graphic.setFodderimage( OutLinkConstant.OUT_LINK_URL +"/axj/images/yd.jpg?r=1");
		    	graphic.setFoddername("开始预订啦！可以查看到阿兴家所有门店信息哦！");
		    	graphic.setOuterlink(OutLinkConstant.OUT_LINK_URL 
		    			+ "/customer/axj_getAllStore?storeID=402896aa45ca0da40145ca0db4590000&wxID=" + fromUserName+"&wx_uid="+wx_uid);
		    	
		    }else if("k_hyk".equalsIgnoreCase(eventKey)){
		    	graphic.setFodderdigest("会员卡、订餐信息、优惠信息、收货地址设置");
		    	graphic.setFodderimage( OutLinkConstant.OUT_LINK_URL +"/axj/images/card.png");
		    	graphic.setFoddername("尊享阿兴家微订购会员卡，省钱、实惠、惊喜多多！");
		    	graphic.setOuterlink(OutLinkConstant.OUT_LINK_URL 
		    			+ "/customer/axj_getUserInfo?storeID=402896aa45ca0da40145ca0db4590000&wxID=" + fromUserName+"&wx_uid="+wx_uid);
		    }
		    
		    MsgOutNormalNews result = settingPic(fromUserName, toUserName,graphic);
		   return result;
		}
		logger.debug("处理失败，返回内容为空");
		return null;
    }

    private MsgOutNormalNews settingPic(String fromUserName, String toUserName,SingleGraphic graphic) {
	//图文
	List<SingleGraphic> graphics = new ArrayList<SingleGraphic>();
	graphics.add(graphic);
	
	MsgOutNormalNews result = new MsgOutNormalNews();
	result.setFromUserName(toUserName);
	result.setToUserName(fromUserName);
	
	List<Item> itemList = new ArrayList<Item>();
	for(SingleGraphic singleGraphic:graphics){
		Item item = new Item();
		item.setDescription(singleGraphic.getFodderdigest());
		item.setPicUrl(singleGraphic.getFodderimage());
		item.setTitle(singleGraphic.getFoddername());
		String outLinkUrl = singleGraphic.getOuterlink();
		if(null != outLinkUrl && !outLinkUrl.trim().equals("")){
			item.setUrl(outLinkUrl);
		}else{
			item.setUrl(FODDER_URL+singleGraphic.getFodderid());
		}
		itemList.add(item);
	}
	int length = itemList.size();
	long time = System.currentTimeMillis();
	result.setArticleCount(length);
	result.setArticles(itemList);
	result.setCreateTime(time);
	result.setMsgType(WeChatUtil.RESP_MESSAGE_TYPE_NEWS);
	
	logger.debug(">> 图文");
	return result;
    }
    
    public static void main(String[] args){
		//init context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ClickQueryHandlerImpl service = (ClickQueryHandlerImpl) context.getBean("clickQueryHandlerImpl");
		MsgInEventClick msg = new MsgInEventClick();
		msg.setEvent("CLICK");
		msg.setEventKey("WECHAT_4_WEIUM");
		msg.setFromUserName("A");
		msg.setToUserName("B");
		
		TUser wechat = new TUser();
		service.handleEventClickIn(wechat, msg);
	}
}
