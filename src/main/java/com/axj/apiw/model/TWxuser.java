package com.axj.apiw.model;

public class TWxuser {
    private Integer id;

    private String wxid;

    private String joindate;

    private String telnumber;

    private Integer money;

    private Integer score;

    private String billname;

    private String membercode;

    private Boolean isuseex;

    private String userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid == null ? null : wxid.trim();
    }

    public String getJoindate() {
        return joindate;
    }

    public void setJoindate(String joindate) {
        this.joindate = joindate == null ? null : joindate.trim();
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getBillname() {
        return billname;
    }

    public void setBillname(String billname) {
        this.billname = billname == null ? null : billname.trim();
    }

    public String getMembercode() {
        return membercode;
    }

    public void setMembercode(String membercode) {
        this.membercode = membercode == null ? null : membercode.trim();
    }

    public Boolean getIsuseex() {
        return isuseex;
    }

    public void setIsuseex(Boolean isuseex) {
        this.isuseex = isuseex;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}