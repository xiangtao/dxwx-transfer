package com.axj.apiw.model;

import java.util.Date;

public class ReplyWord
{
    private Long id;

    private Long fodderid;
    
    private Long wechatId;
    
    private Long userid;

    private Byte replyType;

    private Long keywordId;

    private Date createtime;

    private Date updatetime;

    private Byte delflag;

    private String valueword;

    public Long getWechatId() {
		return wechatId;
	}

	public void setWechatId(Long wechatId) {
		this.wechatId = wechatId;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFodderid() {
        return fodderid;
    }

    public void setFodderid(Long fodderid) {
        this.fodderid = fodderid;
    }

    public Byte getReplyType() {
        return replyType;
    }

    public void setReplyType(Byte replyType) {
        this.replyType = replyType;
    }

    public Long getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getDelflag() {
        return delflag;
    }

    public void setDelflag(Byte delflag) {
        this.delflag = delflag;
    }

    public String getValueword() {
        return valueword;
    }

    public void setValueword(String valueword) {
        this.valueword = valueword == null ? null : valueword.trim();
    }
}