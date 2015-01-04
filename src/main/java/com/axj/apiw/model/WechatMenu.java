package com.axj.apiw.model;

import java.util.Date;

public class WechatMenu {
    private Long menuid;

    private String calltype;

    private String name;

    private String callback;

    private String content;

    private Long parentid;

    private Date createtime;

    private Date modifytime;

    private Long userid;

    private Long wechatid;

    private Long menutypeid;

    private Long sn;

    public Long getMenuid() {
        return menuid;
    }

    public void setMenuid(Long menuid) {
        this.menuid = menuid;
    }

    public String getCalltype() {
        return calltype;
    }

    public void setCalltype(String calltype) {
        this.calltype = calltype == null ? null : calltype.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback == null ? null : callback.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getWechatid() {
        return wechatid;
    }

    public void setWechatid(Long wechatid) {
        this.wechatid = wechatid;
    }

    public Long getMenutypeid() {
        return menutypeid;
    }

    public void setMenutypeid(Long menutypeid) {
        this.menutypeid = menutypeid;
    }

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }
}