package com.axj.apiw.model;

public class WeiumWechat {
    private Long id;

    private Long weiumUserid;
    
    private String wechatName;

    private String wechatCode;
    
    private String wechatOpenId;
    
    private String wechatopenidmatching;

    private int weiumWechartStatus;

    private String weiumToken;

    private int delflag;
    
    private int firstattentionreplytype;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName == null ? null : wechatName.trim();
    }

    public String getWechatOpenId() {
        return wechatOpenId;
    }

    public void setWechatOpenId(String wechatOpenId) {
        this.wechatOpenId = wechatOpenId == null ? null : wechatOpenId.trim();
    }

    public String getWeiumToken() {
        return weiumToken;
    }

    public void setWeiumToken(String weiumToken) {
        this.weiumToken = weiumToken == null ? null : weiumToken.trim();
    }

    public int getWeiumWechartStatus() {
		return weiumWechartStatus;
	}

	public void setWeiumWechartStatus(int weiumWechartStatus) {
		this.weiumWechartStatus = weiumWechartStatus;
	}

	public int getDelflag() {
		return delflag;
	}

	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}

	public Long getWeiumUserid() {
		return weiumUserid;
	}

	public void setWeiumUserid(Long weiumUserid) {
		this.weiumUserid = weiumUserid;
	}

	public String getWechatCode() {
		return wechatCode;
	}

	public void setWechatCode(String wechatCode) {
		this.wechatCode = wechatCode;
	}

	public String getWechatopenidmatching() {
		return wechatopenidmatching;
	}

	public void setWechatopenidmatching(String wechatopenidmatching) {
		this.wechatopenidmatching = wechatopenidmatching;
	}

	public int getFirstattentionreplytype() {
		return firstattentionreplytype;
	}

	public void setFirstattentionreplytype(int firstattentionreplytype) {
		this.firstattentionreplytype = firstattentionreplytype;
	}

	@Override
	public String toString() {
	    return "WeiumWechat [id=" + id + ", weiumUserid=" + weiumUserid
		    + ", wechatName=" + wechatName + ", wechatCode="
		    + wechatCode + ", wechatOpenId=" + wechatOpenId
		    + ", wechatopenidmatching=" + wechatopenidmatching
		    + ", weiumWechartStatus=" + weiumWechartStatus
		    + ", weiumToken=" + weiumToken + ", delflag=" + delflag
		    + ", firstattentionreplytype=" + firstattentionreplytype
		    + "]";
	}
}