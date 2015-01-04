package com.axj.apiw.model;

public class TWelcome {
    private Integer id;

    private String msg1;

    private String msg2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg1() {
        return msg1;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1 == null ? null : msg1.trim();
    }

    public String getMsg2() {
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2 == null ? null : msg2.trim();
    }
}