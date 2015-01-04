package com.axj.apiw.model;

import java.util.Date;

public class SingleGraphic{
    private Long fodderid;

    private Long userid;

    private Long foddertype;

    private String foddername;

    private String fodderimage;

    private String fodderdigest;

    private String innerlink;

    private String outerlink;

    private Date createtime;

    private Date modifytime;

    private Byte delflag;

    private String foddercontent;
    
    private long rid;
    
    private String wechatid;
    

    public long getRid() {
		return rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}

	public String getWechatid() {
		return wechatid;
	}

	public void setWechatid(String wechatid) {
		this.wechatid = wechatid;
	}

	public Long getFodderid() {
        return fodderid;
    }

    public void setFodderid(Long fodderid) {
        this.fodderid = fodderid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getFoddertype() {
        return foddertype;
    }

    public void setFoddertype(Long foddertype) {
        this.foddertype = foddertype;
    }

    public String getFoddername() {
        return foddername;
    }

    public void setFoddername(String foddername) {
        this.foddername = foddername == null ? null : foddername.trim();
    }

    public String getFodderimage() {
        return fodderimage;
    }

    public void setFodderimage(String fodderimage) {
        this.fodderimage = fodderimage == null ? null : fodderimage.trim();
    }

    public String getFodderdigest() {
        return fodderdigest;
    }

    public void setFodderdigest(String fodderdigest) {
        this.fodderdigest = fodderdigest == null ? null : fodderdigest.trim();
    }

    public String getInnerlink() {
        return innerlink;
    }

    public void setInnerlink(String innerlink) {
        this.innerlink = innerlink == null ? null : innerlink.trim();
    }

    public String getOuterlink() {
        return outerlink;
    }

    public void setOuterlink(String outerlink) {
        this.outerlink = outerlink == null ? null : outerlink.trim();
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

    public String getFoddercontent() {
        return foddercontent;
    }

    public void setFoddercontent(String foddercontent) {
        this.foddercontent = foddercontent == null ? null : foddercontent.trim();
    }
}