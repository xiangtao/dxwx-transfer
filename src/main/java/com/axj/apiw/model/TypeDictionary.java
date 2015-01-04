package com.axj.apiw.model;

import java.util.Date;

public class TypeDictionary {
    private Long typeid;

    private Byte typecategory;

    private String typename;

    private Date createtime;

    private Date modifytime;

    private Byte delflag;

    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    public Byte getTypecategory() {
        return typecategory;
    }

    public void setTypecategory(Byte typecategory) {
        this.typecategory = typecategory;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
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