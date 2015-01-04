package com.axj.apiw.model;

public class TUser {
    private String id;

    private String username;

    private String password;

    private Integer type;

	private String paymentdate;

    private Integer industryid;

    private Boolean ispayment;

    private String token;

    private String appid;

    private String secret;

    private String useruniquecode;

    private String ghid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate == null ? null : paymentdate.trim();
    }

    public Integer getIndustryid() {
        return industryid;
    }

    public void setIndustryid(Integer industryid) {
        this.industryid = industryid;
    }

    public Boolean getIspayment() {
        return ispayment;
    }

    public void setIspayment(Boolean ispayment) {
        this.ispayment = ispayment;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    public String getUseruniquecode() {
        return useruniquecode;
    }

    public void setUseruniquecode(String useruniquecode) {
        this.useruniquecode = useruniquecode == null ? null : useruniquecode.trim();
    }

    public String getGhid() {
        return ghid;
    }

    public void setGhid(String ghid) {
        this.ghid = ghid == null ? null : ghid.trim();
    }
    
    @Override
	public String toString() {
		return "TUser [id=" + id + ", username=" + username + ", password="
				+ password + ", type=" + type + ", paymentdate=" + paymentdate
				+ ", industryid=" + industryid + ", ispayment=" + ispayment
				+ ", token=" + token + ", appid=" + appid + ", secret="
				+ secret + ", useruniquecode=" + useruniquecode + ", ghid="
				+ ghid + "]";
	}
}