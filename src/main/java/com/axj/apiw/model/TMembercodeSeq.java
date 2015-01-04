package com.axj.apiw.model;

public class TMembercodeSeq {
    private Integer id;

    private Integer memberCode;

    private String channel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(Integer memberCode) {
        this.memberCode = memberCode;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }
}