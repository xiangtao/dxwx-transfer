package com.axj.apiw.model;

public class WechatMenuType {
    private Long menutypeid;

    private String menutypename;

    public Long getMenutypeid() {
        return menutypeid;
    }

    public void setMenutypeid(Long menutypeid) {
        this.menutypeid = menutypeid;
    }

    public String getMenutypename() {
        return menutypename;
    }

    public void setMenutypename(String menutypename) {
        this.menutypename = menutypename == null ? null : menutypename.trim();
    }
}