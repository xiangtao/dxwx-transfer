package com.axj.apiw.model;

import java.util.Date;

public class WechatStatisticsInfo {
    private Long id;

    private Long wechat;

    private String openid;

    private Byte type;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWechat() {
        return wechat;
    }

    public void setWechat(Long wechat) {
        this.wechat = wechat;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}