package com.axj.apiw.model;

public class StockMetaData {
    private Long id;

    private String name;

    private String pinyinname;

    private String pyinitial;

    private String code;

    private Byte stype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPinyinname() {
        return pinyinname;
    }

    public void setPinyinname(String pinyinname) {
        this.pinyinname = pinyinname == null ? null : pinyinname.trim();
    }

    public String getPyinitial() {
        return pyinitial;
    }

    public void setPyinitial(String pyinitial) {
        this.pyinitial = pyinitial == null ? null : pyinitial.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Byte getStype() {
        return stype;
    }

    public void setStype(Byte stype) {
        this.stype = stype;
    }
}