package com.axj.apiw.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity{
    private Long id;
    //活动状态
    private Byte status;
    //广告主ID，创建活动用户ID
    private Long userid;
    //创建活动用户所用的微信号对应ID
    private Long wechatid;
    //活动类型1优惠券2刮刮卡3大转盘
    private Byte type;
    //活动名称
    private String name;
    
    private String cashinfo; //预留字段 
    //中奖提示信息
    private String winprize;
    //简介
    private String briefintroduction;
    //活动开始时间
    private Date starttime;
    
    private String starttimestr;
    //活动结束时间
    private Date endtime;
    
    private String endtimestr;
    //活动说明
    private String des1;
    
    private String des2; //预留字段
    
    private String des3; //预留字段

    private String des4; //预留字段
    //重复抽奖回复
    private String repeatextract;
    //活动结束公告主题
    private String finishedtitle;
    //活动结束说明
    private String finisheddesc;
    //预计活动人数
    private Long personnums;
    //每人最多允许抽取次数
    private Byte allowmax;
    //每天最多抽取次数
    private Byte allowperday;
    //兑奖密码
    private String duijiangpass;
    //SN码名称
    private String sncoderename;
    //手机号
    private String mobilerename;
    //是否显示奖品数量
    private Byte isdisplayawardnums;
    //默认奖项
    private String defaultprize;

    private Date createtime;

    private Date modifytime;
    //过期领奖时间
    private Date fireprize; ////预留字段
    //sn码生成 0自动 1手动
    private Byte sncodegenerate;
    //活动开始图片
    private String activitystartimg;
    //活动结束图片
    private String activityendimg;
    
    private String activitywinimg;

    private String activitywinlinkimg;
    
    private String activitybgimg;
    
    //处理所需额外添加对象
    private FunctionKeywordReply functionKeywordReply;
    
    private String keyword;
    
    private Long numberOfParticipants;
    
    private Long numberOfBrowse;

    public Long getId() {
        return id;
    }

    public String getStarttimestr()
	{
		return starttimestr;
	}

	public void setStarttimestr(String starttimestr)
	{
		this.starttimestr = starttimestr;
	}

	public String getEndtimestr()
	{
		return endtimestr;
	}

	public void setEndtimestr(String endtimestr)
	{
		this.endtimestr = endtimestr;
	}

	public void setId(Long id) {
        this.id = id;
    }

    public Byte getStatus()
	{
		return status;
	}

	public void setStatus(Byte status)
	{
		this.status = status;
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCashinfo() {
        return cashinfo;
    }

    public void setCashinfo(String cashinfo) {
        this.cashinfo = cashinfo == null ? null : cashinfo.trim();
    }

    public String getWinprize() {
        return winprize;
    }

    public void setWinprize(String winprize) {
        this.winprize = winprize == null ? null : winprize.trim();
    }

    public String getBriefintroduction() {
        return briefintroduction;
    }

    public void setBriefintroduction(String briefintroduction) {
        this.briefintroduction = briefintroduction == null ? null : briefintroduction.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
        
        if(this.starttime != null){
        	SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        	this.starttimestr = format.format(this.starttime);
        }
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
        if(this.endtime != null){
        	SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        	this.endtimestr = format.format(this.endtime);
        }
    }

    public String getDes1() {
        return des1;
    }

    public void setDes1(String des1) {
        this.des1 = des1 == null ? null : des1.trim();
    }

    public String getDes2() {
        return des2;
    }

    public void setDes2(String des2) {
        this.des2 = des2 == null ? null : des2.trim();
    }

    public String getDes3() {
        return des3;
    }

    public void setDes3(String des3) {
        this.des3 = des3 == null ? null : des3.trim();
    }

    public String getDes4() {
        return des4;
    }

    public void setDes4(String des4) {
        this.des4 = des4 == null ? null : des4.trim();
    }

    public String getRepeatextract() {
        return repeatextract;
    }

    public void setRepeatextract(String repeatextract) {
        this.repeatextract = repeatextract == null ? null : repeatextract.trim();
    }

    public String getFinishedtitle() {
        return finishedtitle;
    }

    public void setFinishedtitle(String finishedtitle) {
        this.finishedtitle = finishedtitle == null ? null : finishedtitle.trim();
    }

    public String getFinisheddesc() {
        return finisheddesc;
    }

    public void setFinisheddesc(String finisheddesc) {
        this.finisheddesc = finisheddesc == null ? null : finisheddesc.trim();
    }

    public Long getPersonnums() {
        return personnums;
    }

    public void setPersonnums(Long personnums) {
        this.personnums = personnums;
    }

    public Byte getAllowmax() {
        return allowmax;
    }

    public void setAllowmax(Byte allowmax) {
        this.allowmax = allowmax;
    }

    public Byte getAllowperday() {
        return allowperday;
    }

    public void setAllowperday(Byte allowperday) {
        this.allowperday = allowperday;
    }

    public String getDuijiangpass() {
        return duijiangpass;
    }

    public void setDuijiangpass(String duijiangpass) {
        this.duijiangpass = duijiangpass == null ? null : duijiangpass.trim();
    }

    public String getSncoderename() {
        return sncoderename;
    }

    public void setSncoderename(String sncoderename) {
        this.sncoderename = sncoderename == null ? null : sncoderename.trim();
    }

    public String getMobilerename() {
        return mobilerename;
    }

    public void setMobilerename(String mobilerename) {
        this.mobilerename = mobilerename == null ? null : mobilerename.trim();
    }

    public Byte getIsdisplayawardnums() {
        return isdisplayawardnums;
    }

    public void setIsdisplayawardnums(Byte isdisplayawardnums) {
        this.isdisplayawardnums = isdisplayawardnums;
    }

    public String getDefaultprize() {
        return defaultprize;
    }

    public void setDefaultprize(String defaultprize) {
        this.defaultprize = defaultprize == null ? null : defaultprize.trim();
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

    public Date getFireprize() {
        return fireprize;
    }

    public void setFireprize(Date fireprize) {
        this.fireprize = fireprize;
    }

    public Byte getSncodegenerate() {
        return sncodegenerate;
    }

    public void setSncodegenerate(Byte sncodegenerate) {
        this.sncodegenerate = sncodegenerate;
    }

    public String getActivitystartimg() {
        return activitystartimg;
    }

    public void setActivitystartimg(String activitystartimg) {
        this.activitystartimg = activitystartimg == null ? null : activitystartimg.trim();
    }

    public String getActivityendimg() {
        return activityendimg;
    }

    public void setActivityendimg(String activityendimg) {
        this.activityendimg = activityendimg == null ? null : activityendimg.trim();
    }

    public String getActivitywinimg() {
        return activitywinimg;
    }

    public void setActivitywinimg(String activitywinimg) {
        this.activitywinimg = activitywinimg == null ? null : activitywinimg.trim();
    }

    public String getActivitywinlinkimg() {
        return activitywinlinkimg;
    }

    public void setActivitywinlinkimg(String activitywinlinkimg) {
        this.activitywinlinkimg = activitywinlinkimg == null ? null : activitywinlinkimg.trim();
    }

    public String getActivitybgimg() {
        return activitybgimg;
    }

    public void setActivitybgimg(String activitybgimg) {
        this.activitybgimg = activitybgimg == null ? null : activitybgimg.trim();
    }

	public FunctionKeywordReply getFunctionKeywordReply()
	{
		return functionKeywordReply;
	}

	public void setFunctionKeywordReply(FunctionKeywordReply functionKeywordReply)
	{
		this.functionKeywordReply = functionKeywordReply;
	}

	public String getKeyword()
	{
		return keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public Long getNumberOfParticipants()
	{
		return numberOfParticipants;
	}

	public void setNumberOfParticipants(Long numberOfParticipants)
	{
		this.numberOfParticipants = numberOfParticipants;
	}

	public Long getNumberOfBrowse()
	{
		return numberOfBrowse;
	}

	public void setNumberOfBrowse(Long numberOfBrowse)
	{
		this.numberOfBrowse = numberOfBrowse;
	}
    
}