package com.axj.apiw.model;

public class FunctionPoint {
    private Long id;

    private String name;

    private Integer tab;

    private Integer level;

    private String note;

    private Double sn;

    private String uniquecode;
    
    //仅供前台使用，与数据库无关，表明此功能开启状态，true为开启
    private boolean status;
    

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

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

    public Integer getTab() {
        return tab;
    }

    public void setTab(Integer tab) {
        this.tab = tab;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	public Double getSn() {
		return sn;
	}

	public void setSn(Double sn) {
		this.sn = sn;
	}

	public String getUniquecode() {
		return uniquecode;
	}

	public void setUniquecode(String uniquecode) {
		this.uniquecode = uniquecode;
	}

	@Override
	public String toString() {
	    return "FunctionPoint [id=" + id + ", name=" + name + ", tab="
		    + tab + ", level=" + level + ", note=" + note + ", sn="
		    + sn + ", uniquecode=" + uniquecode + ", status=" + status
		    + "]";
	}

   
}