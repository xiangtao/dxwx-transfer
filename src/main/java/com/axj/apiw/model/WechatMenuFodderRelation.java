package com.axj.apiw.model;

import java.util.Date;

public class WechatMenuFodderRelation {
    private Long id;

    private Long foddertype;

    private Long menuid;

    private Long fodderid;

    private Date createtime;

    private Date modifytime;

    private Long wechatid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFoddertype() {
        return foddertype;
    }

    public void setFoddertype(Long foddertype) {
        this.foddertype = foddertype;
    }

    public Long getMenuid() {
        return menuid;
    }

    public void setMenuid(Long menuid) {
        this.menuid = menuid;
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

    public Long getWechatid() {
        return wechatid;
    }

    public void setWechatid(Long wechatid) {
        this.wechatid = wechatid;
    }
}