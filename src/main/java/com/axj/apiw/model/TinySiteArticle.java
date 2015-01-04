package com.axj.apiw.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TinySiteArticle {
    private Long id;

    private String title;

    private String description;

    private Long typeid;

    private String coverimgpath;
    
    private String accesscoverimg;

    private Byte isshowcover;

    private String content;

    private String outlink;
    
    private Integer order;
    
    private Integer viewnumber;
    
    private String typename;
    
    private Long userid;
    
    private Long wechatid;
    
    private Date createtime;
    
    private Date modifytime;
    
    private String lastopratetime;
    
    private String keyword;
    
    private Byte matchtype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getTypeid()
	{
		return typeid;
	}

	public void setTypeid(Long typeid)
	{
		this.typeid = typeid;
	}

	public String getCoverimgpath() {
        return coverimgpath;
    }

    public void setCoverimgpath(String coverimgpath) {
        this.coverimgpath = coverimgpath == null ? null : coverimgpath.trim();
    }
    
    public String getAccesscoverimg()
	{
		return accesscoverimg;
	}

	public void setAccesscoverimg(String accesscoverimg)
	{
		this.accesscoverimg = accesscoverimg;
	}

	public Byte getIsshowcover() {
        return isshowcover;
    }

    public void setIsshowcover(Byte isshowcover) {
        this.isshowcover = isshowcover;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOutlink() {
        return outlink;
    }

    public void setOutlink(String outlink) {
        this.outlink = outlink == null ? null : outlink.trim();
    }

	public Integer getOrder()
	{
		return order;
	}

	public void setOrder(Integer order)
	{
		this.order = order;
	}

	public Integer getViewnumber()
	{
		return viewnumber;
	}

	public void setViewnumber(Integer viewnumber)
	{
		this.viewnumber = viewnumber;
	}

	public String getTypename()
	{
		return typename;
	}

	public void setTypename(String typename)
	{
		this.typename = typename;
	}
	
	public Long getUserid()
	{
		return userid;
	}

	public void setUserid(Long userid)
	{
		this.userid = userid;
	}

	public Long getWechatid()
	{
		return wechatid;
	}

	public void setWechatid(Long wechatid)
	{
		this.wechatid = wechatid;
	}

	public Date getCreatetime()
	{
		return createtime;
	}

	public void setCreatetime(Date createtime)
	{
		this.createtime = createtime;
	}

	public Date getModifytime()
	{
		return modifytime;
	}

	public void setModifytime(Date modifytime)
	{
		this.modifytime = modifytime;
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String lastdate = sf.format(modifytime);
		this.lastopratetime = lastdate;
	}

	public String getLastopratetime()
	{
		return lastopratetime;
	}

	public void setLastopratetime(String lastopratetime)
	{
		this.lastopratetime = lastopratetime;
	}

	public String getKeyword()
	{
		return keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public Byte getMatchtype()
	{
		return matchtype;
	}

	public void setMatchtype(Byte matchtype)
	{
		this.matchtype = matchtype;
	}

	
}