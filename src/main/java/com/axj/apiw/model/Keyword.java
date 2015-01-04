package com.axj.apiw.model;

import java.util.Date;

public class Keyword
{
    private Long id;

    private Long wechatId;
    
    private Long userid;

    private Date createtime;

    private Date updatetime;

    private Byte delflag;

    private String keyword;
    //
    private Byte matchtype;
    
    private String queryfield;
    
    private String likeStr;

    
    public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Byte getMatchtype()
	{
		return matchtype;
	}

	public void setMatchtype(Byte matchtype)
	{
		this.matchtype = matchtype;
	}

	public String getQueryfield()
	{
		return queryfield;
	}

	public void setQueryfield(String queryfield)
	{
		this.queryfield = queryfield;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWechatId() {
        return wechatId;
    }

    public void setWechatId(Long wechatId) {
        this.wechatId = wechatId;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

	public String getLikeStr() {
		return likeStr;
	}

	public void setLikeStr(String likeStr) {
		this.likeStr = likeStr;
	}
}