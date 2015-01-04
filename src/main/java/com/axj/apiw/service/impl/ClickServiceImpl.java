package com.axj.apiw.service.impl;

//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
//
//import cn.adsend.site.apiw.model.SingleGraphic;
//import cn.adsend.site.apiw.model.WeiumWechat;
//import cn.adsend.site.apiw.querymapper.QuerySingleGraphicMapper;
//import cn.adsend.site.apiw.querymapper.QueryWeiumWechatMapper;

import com.axj.apiw.service.ClickService;
import com.axj.apiw.vo.request.MsgIn;
import com.axj.apiw.vo.response.MsgOut;

//import cn.adsend.site.apiw.service.TextService;
//import cn.adsend.site.apiw.util.WeChatUtil;
//import cn.adsend.site.apiw.vo.request.MsgInEventClick;
//import cn.adsend.site.apiw.vo.request.MsgInNormalText;
//import cn.adsend.site.apiw.vo.response.Item;


@Service("clickService")
public class ClickServiceImpl implements ClickService
{
//	static Logger logger = LoggerFactory.getLogger(ClickServiceImpl.class);
//	@Autowired
//	private TextService textService;
//	@Autowired
//	private QueryWeiumWechatMapper queryWeiumWechatMapper;
//	@Autowired
//	private QuerySingleGraphicMapper querySingleGraphicMapper;

	@Override
	public MsgOut handle(String userStr, MsgIn msgIn)
	{
//		logger.debug("--------进入回调方法-------");
//		MsgInEventClick msgin = (MsgInEventClick)msgIn;
//		String fromUserName = msgin.getFromUserName();
//		String toUserName = msgin.getToUserName();
//		
//		//获取微信公众账号
//		WeiumWechat wechat = queryWeiumWechatMapper.selectByUserStr(userStr);
//		logger.debug("--------------查询回调微信号--------------");
//		if(null != wechat)
//		{
//			Long wechatid = wechat.getId();
//			//Long wechatid = Long.valueOf(12L);
//			Long userid = wechat.getWeiumUserid();
//			MenuExample example = new MenuExample();
//			example.createCriteria().andWechatidEqualTo(wechatid)
//				.andUseridEqualTo(userid).andCallbackEqualTo(msgin.getEventKey())
//				.andDelflagEqualTo(Byte.valueOf((byte)0)).andCalltypeEqualTo(msgin.getEvent().toLowerCase());
//			List<Menu> menu = queryMenuMapper.selectByExample(example);
//			if(menu.size() == 1)
//			{
//				Menu m = menu.get(0);
//				byte menutypeid = m.getMenutypeid().byteValue();
//				if(menutypeid == WeChatUtil.TEXT)
//				{
//					MsgOutNormalText result = new MsgOutNormalText();
//					result.setFromUserName(toUserName);
//					result.setToUserName(fromUserName);
//					
//					result.setCreateTime(new Date().getTime());
//					result.setMsgType(WeChatUtil.RESP_MESSAGE_TYPE_TEXT);
//					
//					MenuContentRelationExample  mcre = new MenuContentRelationExample();
//					mcre.createCriteria().andDelflagEqualTo((byte) 0)
//					.andWechatidEqualTo(wechatid).andMenuidEqualTo(m.getId());
//					List<MenuContentRelation> rels = queryMenuContentRelationMapper.selectByExample(mcre);
//					if(rels.size() == 0 || rels.size() > 1){
//						return null;
//					}
//					
//					String content = rels.get(0).getContent();
//					result.setContent(content);
//					logger.debug(">> 文本");
//					return result;
//				}
//				else if(menutypeid == WeChatUtil.NEWS)
//				{
//					//图文
//					List<SingleGraphic> graphics = new ArrayList<SingleGraphic>();
//					List<MenuFodderRelation> relations = queryMenuFodderRelationMapper.selectFoderRelationByMenuId(m.getId());
//					if(relations.size()!=0){
//						MenuFodderRelation relation = relations.get(0);
//						if(relation.getFoddertype()==1){//单图文
//							SingleGraphic graphic = querySingleGraphicMapper.selectByPrimaryKey(relation.getFodderid());
//							graphics.add(graphic);
//						}else{//多图文
//							graphics = querySingleGraphicMapper.selectMoreGraphics(relation.getFodderid());//`more_single_relation`.`more_id`
//						}
//						
//					}
//					
//					MsgOutNormalNews result = new MsgOutNormalNews();
//					result.setFromUserName(toUserName);
//					result.setToUserName(fromUserName);
//					
//					List<Item> itemList = new ArrayList<Item>();
//					for(SingleGraphic singleGraphic:graphics){
//						Item item = new Item();
//						item.setDescription(singleGraphic.getFodderdigest());
//						item.setPicUrl(singleGraphic.getFodderimage());
//						item.setTitle(singleGraphic.getFoddername());
//						
//						String outLinkUrl = singleGraphic.getOuterlink();
//						if(null != outLinkUrl && !outLinkUrl.trim().equals("")){
//							item.setUrl(outLinkUrl);
//						}else{
//							item.setUrl(SubscribeServiceImpl.OUT_LINK_URL+singleGraphic.getFodderid());
//						}
//						itemList.add(item);
//					}
//					int length = itemList.size();
//					long time = System.currentTimeMillis();
//					result.setArticleCount(length);
//					result.setArticles(itemList);
//					result.setCreateTime(time);
//					result.setMsgType(WeChatUtil.RESP_MESSAGE_TYPE_NEWS);
//					
//					logger.debug(">> 图文");
//					return result;
//					
//				}
//				else if(menutypeid == WeChatUtil.KEYWORD)
//				{
//					MenuContentRelationExample  mcre = new MenuContentRelationExample();
//					mcre.createCriteria().andDelflagEqualTo((byte) 0)
//					.andWechatidEqualTo(wechatid).andMenuidEqualTo(m.getId());
//					List<MenuContentRelation> rels = queryMenuContentRelationMapper.selectByExample(mcre);
//					if(rels.size() == 0 || rels.size() > 1){
//						return null;
//					}
//					
//					String content = rels.get(0).getContent();
//					
//					MsgInNormalText msgInNormalText = new MsgInNormalText();
//					msgInNormalText.setContent(content);
//					msgInNormalText.setCreateTime(msgin.getCreateTime());
//					msgInNormalText.setFromUserName(fromUserName);
//					//msgInNormalText.setMsgId();
//					msgInNormalText.setMsgType(WeChatUtil.RESP_MESSAGE_TYPE_TEXT);
//					msgInNormalText.setToUserName(toUserName);
//					
//					logger.debug(">> 关键字");
//					return textService.handle(userStr, msgInNormalText);
//				}
//			}
//		}
//		logger.debug("处理失败，返回内容为空");
		return null;
	}
	
//	public static void main(String[] args){
//		//init context
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		ClickService service = (ClickService) context.getBean("clickService");
//		MsgInEventClick msg = new MsgInEventClick();
//		msg.setEvent("CLICK");
//		msg.setEventKey("WECHAT_17_WEIUM");
//		msg.setFromUserName("A");
//		msg.setToUserName("B");
//		service.handle("QRQR1PXGW", msg);
//	}

}
