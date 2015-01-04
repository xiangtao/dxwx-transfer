package com.axj.apiw.model;

import java.util.Date;

public class FunctionKeywordReply {
    private Long id;

    private String keyword;

    private Byte keywordtype;

    private Byte matchtype;

    private Long callbackid;

    private Long userid;

    private Long wechatid;

    private Date createtime;

    private Date modifytime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Byte getKeywordtype() {
        return keywordtype;
    }

    public void setKeywordtype(Byte keywordtype) {
        this.keywordtype = keywordtype;
    }

    public Byte getMatchtype() {
        return matchtype;
    }

    public void setMatchtype(Byte matchtype) {
        this.matchtype = matchtype;
    }

    public Long getCallbackid() {
        return callbackid;
    }

    public void setCallbackid(Long callbackid) {
        this.callbackid = callbackid;
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

    @Override
    public String toString() {
	return "FunctionKeywordReply [id=" + id + ", keyword=" + keyword
		+ ", keywordtype=" + keywordtype + ", matchtype=" + matchtype
		+ ", callbackid=" + callbackid + ", userid=" + userid
		+ ", wechatid=" + wechatid + ", createtime=" + createtime
		+ ", modifytime=" + modifytime + "]";
    }
}