package com.axj.apiw.model;

import org.apache.commons.lang.StringUtils;

import com.axj.apiw.util.AdsendConfig;

public class TinySiteHomepage {
    private long id;

    private String title;

    private String coverphotopath;
    
    private String accesscoverphotopath;

    private String backgroundimg;
    
    private String accessbackgroundimg;

    private String musicurl;
    
    private String accessmusicurl;

    private Byte flashtype;

    private String shotdesc;

    private String copyright;

    private String statisticalcode;

    private String url;
    
    private long userid;
    
    private long wechatid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCoverphotopath() {
		return coverphotopath;
	}

	public void setCoverphotopath(String coverphotopath) {
		this.coverphotopath = coverphotopath;
	}

	public String getBackgroundimg() {
		return backgroundimg;
	}

	public void setBackgroundimg(String backgroundimg) {
		this.backgroundimg = backgroundimg;
	}

	public String getMusicurl() {
		return musicurl;
	}

	public void setMusicurl(String musicurl) {
		this.musicurl = musicurl;
	}

	public Byte getFlashtype() {
		return flashtype;
	}

	public void setFlashtype(Byte flashtype) {
		this.flashtype = flashtype;
	}

	public String getShotdesc() {
		return shotdesc;
	}

	public void setShotdesc(String shotdesc) {
		this.shotdesc = shotdesc;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getStatisticalcode() {
		return statisticalcode;
	}

	public void setStatisticalcode(String statisticalcode) {
		this.statisticalcode = statisticalcode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getWechatid() {
		return wechatid;
	}

	public void setWechatid(long wechatid) {
		this.wechatid = wechatid;
	}

	public String getAccesscoverphotopath() {
		if(!StringUtils.isEmpty(this.coverphotopath))
        {
        	return AdsendConfig.getInstance().getSite_access_path() + this.coverphotopath;
        }
		return accesscoverphotopath;
	}

	public void setAccesscoverphotopath(String accesscoverphotopath) {
		this.accesscoverphotopath = accesscoverphotopath;
	}

	public String getAccessbackgroundimg() {
		if(!StringUtils.isEmpty(this.backgroundimg))
        {
        	return AdsendConfig.getInstance().getSite_access_path() + this.backgroundimg;
        }
		return accessbackgroundimg;
	}

	public void setAccessbackgroundimg(String accessbackgroundimg) {
		this.accessbackgroundimg = accessbackgroundimg;
	}

	public String getAccessmusicurl() {
		if(!StringUtils.isEmpty(this.musicurl))
        {
        	return AdsendConfig.getInstance().getSite_access_path() + this.musicurl;
        }
		return accessmusicurl;
	}

	public void setAccessmusicurl(String accessmusicurl) {
		this.accessmusicurl = accessmusicurl;
	}
}