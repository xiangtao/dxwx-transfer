package com.axj.apiw.model;

import java.util.Date;


public class Album 
{
    private Long albumid;

    private Long userid;

    private Long wechatid;

    private String albumname;

    private String albumdesc;

    private String music;

    private String defaultpicture;

    private Integer albumnums;

    private String effect;

    private Integer sn;

    private String bgmusicpath;

    private Integer photostep;

    private Date createtime;

    private Date modifytime;

    private Byte delflag;
    
    private String list1SortOrder;
    //关键字
    private String keyword;
    

    public String getKeyword()
	{
		return keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public String getList1SortOrder()
	{
		return list1SortOrder;
	}

	public void setList1SortOrder(String list1SortOrder)
	{
		this.list1SortOrder = list1SortOrder;
	}

    public Long getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Long albumid) {
        this.albumid = albumid;
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

    public String getAlbumname() {
        return albumname;
    }

    public void setAlbumname(String albumname) {
        this.albumname = albumname == null ? null : albumname.trim();
    }

    public String getAlbumdesc() {
        return albumdesc;
    }

    public void setAlbumdesc(String albumdesc) {
        this.albumdesc = albumdesc == null ? null : albumdesc.trim();
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music == null ? null : music.trim();
    }

    public String getDefaultpicture() {
        return defaultpicture;
    }

    public void setDefaultpicture(String defaultpicture) {
        this.defaultpicture = defaultpicture == null ? null : defaultpicture.trim();
    }

    public Integer getAlbumnums() {
        return albumnums;
    }

    public void setAlbumnums(Integer albumnums) {
        this.albumnums = albumnums;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public String getBgmusicpath() {
        return bgmusicpath;
    }

    public void setBgmusicpath(String bgmusicpath) {
        this.bgmusicpath = bgmusicpath == null ? null : bgmusicpath.trim();
    }

    public Integer getPhotostep() {
        return photostep;
    }

    public void setPhotostep(Integer photostep) {
        this.photostep = photostep;
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