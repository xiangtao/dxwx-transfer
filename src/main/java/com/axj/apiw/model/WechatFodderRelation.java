package com.axj.apiw.model;

import java.util.Date;

public class WechatFodderRelation{
    private Long id;

    private Long userid;

    private String wechatid;

    private Long fodderid;

    private Date createtime;

    private Date modifytime;

    private Byte delflag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getWechatid() {
        return wechatid;
    }

    public void setWechatid(String wechatid) {
        this.wechatid = wechatid == null ? null : wechatid.trim();
    }

    public Long getFodderid() {
        return fodderid;
    }

    public void setFodderid(Long fodderid) {
        this.fodderid = fodderid;
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

    public Byte getDelflag() {
        return delflag;
    }

    public void setDelflag(Byte delflag) {
        this.delflag = delflag;
    }
}