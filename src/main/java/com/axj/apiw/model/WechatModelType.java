package com.axj.apiw.model;
/**
 * 
 * 模块类型
 * 包括：微网站首页    微网站分类    微网站文章     各种活动   优惠券    
 * @author Administrator
 *
 */
public class WechatModelType {
	
	private long id;
	private String name;
	private String backcontroller;
	private String frontcontroller;
	private String remark;
	private Byte type;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBackcontroller() {
		return backcontroller;
	}
	public void setBackcontroller(String backcontroller) {
		this.backcontroller = backcontroller;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getFrontcontroller() {
		return frontcontroller;
	}
	public void setFrontcontroller(String frontcontroller) {
		this.frontcontroller = frontcontroller;
	}
	public Byte getType() {
	    return type;
	}
	public void setType(Byte type) {
	    this.type = type;
	}
}
