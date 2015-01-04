package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public AlbumExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex=startIndex;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAlbumidIsNull() {
            addCriterion("albumId is null");
            return (Criteria) this;
        }

        public Criteria andAlbumidIsNotNull() {
            addCriterion("albumId is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumidEqualTo(Long value) {
            addCriterion("albumId =", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotEqualTo(Long value) {
            addCriterion("albumId <>", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidGreaterThan(Long value) {
            addCriterion("albumId >", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidGreaterThanOrEqualTo(Long value) {
            addCriterion("albumId >=", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidLessThan(Long value) {
            addCriterion("albumId <", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidLessThanOrEqualTo(Long value) {
            addCriterion("albumId <=", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidIn(List<Long> values) {
            addCriterion("albumId in", values, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotIn(List<Long> values) {
            addCriterion("albumId not in", values, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidBetween(Long value1, Long value2) {
            addCriterion("albumId between", value1, value2, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotBetween(Long value1, Long value2) {
            addCriterion("albumId not between", value1, value2, "albumid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andWechatidIsNull() {
            addCriterion("wechatid is null");
            return (Criteria) this;
        }

        public Criteria andWechatidIsNotNull() {
            addCriterion("wechatid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatidEqualTo(Long value) {
            addCriterion("wechatid =", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotEqualTo(Long value) {
            addCriterion("wechatid <>", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThan(Long value) {
            addCriterion("wechatid >", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThanOrEqualTo(Long value) {
            addCriterion("wechatid >=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThan(Long value) {
            addCriterion("wechatid <", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThanOrEqualTo(Long value) {
            addCriterion("wechatid <=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidIn(List<Long> values) {
            addCriterion("wechatid in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotIn(List<Long> values) {
            addCriterion("wechatid not in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidBetween(Long value1, Long value2) {
            addCriterion("wechatid between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotBetween(Long value1, Long value2) {
            addCriterion("wechatid not between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIsNull() {
            addCriterion("albumName is null");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIsNotNull() {
            addCriterion("albumName is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumnameEqualTo(String value) {
            addCriterion("albumName =", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotEqualTo(String value) {
            addCriterion("albumName <>", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameGreaterThan(String value) {
            addCriterion("albumName >", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameGreaterThanOrEqualTo(String value) {
            addCriterion("albumName >=", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLessThan(String value) {
            addCriterion("albumName <", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLessThanOrEqualTo(String value) {
            addCriterion("albumName <=", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLike(String value) {
            addCriterion("albumName like", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotLike(String value) {
            addCriterion("albumName not like", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIn(List<String> values) {
            addCriterion("albumName in", values, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotIn(List<String> values) {
            addCriterion("albumName not in", values, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameBetween(String value1, String value2) {
            addCriterion("albumName between", value1, value2, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotBetween(String value1, String value2) {
            addCriterion("albumName not between", value1, value2, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumdescIsNull() {
            addCriterion("albumDesc is null");
            return (Criteria) this;
        }

        public Criteria andAlbumdescIsNotNull() {
            addCriterion("albumDesc is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumdescEqualTo(String value) {
            addCriterion("albumDesc =", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescNotEqualTo(String value) {
            addCriterion("albumDesc <>", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescGreaterThan(String value) {
            addCriterion("albumDesc >", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescGreaterThanOrEqualTo(String value) {
            addCriterion("albumDesc >=", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescLessThan(String value) {
            addCriterion("albumDesc <", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescLessThanOrEqualTo(String value) {
            addCriterion("albumDesc <=", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescLike(String value) {
            addCriterion("albumDesc like", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescNotLike(String value) {
            addCriterion("albumDesc not like", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescIn(List<String> values) {
            addCriterion("albumDesc in", values, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescNotIn(List<String> values) {
            addCriterion("albumDesc not in", values, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescBetween(String value1, String value2) {
            addCriterion("albumDesc between", value1, value2, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescNotBetween(String value1, String value2) {
            addCriterion("albumDesc not between", value1, value2, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andMusicIsNull() {
            addCriterion("music is null");
            return (Criteria) this;
        }

        public Criteria andMusicIsNotNull() {
            addCriterion("music is not null");
            return (Criteria) this;
        }

        public Criteria andMusicEqualTo(String value) {
            addCriterion("music =", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicNotEqualTo(String value) {
            addCriterion("music <>", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicGreaterThan(String value) {
            addCriterion("music >", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicGreaterThanOrEqualTo(String value) {
            addCriterion("music >=", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicLessThan(String value) {
            addCriterion("music <", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicLessThanOrEqualTo(String value) {
            addCriterion("music <=", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicLike(String value) {
            addCriterion("music like", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicNotLike(String value) {
            addCriterion("music not like", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicIn(List<String> values) {
            addCriterion("music in", values, "music");
            return (Criteria) this;
        }

        public Criteria andMusicNotIn(List<String> values) {
            addCriterion("music not in", values, "music");
            return (Criteria) this;
        }

        public Criteria andMusicBetween(String value1, String value2) {
            addCriterion("music between", value1, value2, "music");
            return (Criteria) this;
        }

        public Criteria andMusicNotBetween(String value1, String value2) {
            addCriterion("music not between", value1, value2, "music");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureIsNull() {
            addCriterion("defaultPicture is null");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureIsNotNull() {
            addCriterion("defaultPicture is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureEqualTo(String value) {
            addCriterion("defaultPicture =", value, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureNotEqualTo(String value) {
            addCriterion("defaultPicture <>", value, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureGreaterThan(String value) {
            addCriterion("defaultPicture >", value, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureGreaterThanOrEqualTo(String value) {
            addCriterion("defaultPicture >=", value, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureLessThan(String value) {
            addCriterion("defaultPicture <", value, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureLessThanOrEqualTo(String value) {
            addCriterion("defaultPicture <=", value, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureLike(String value) {
            addCriterion("defaultPicture like", value, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureNotLike(String value) {
            addCriterion("defaultPicture not like", value, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureIn(List<String> values) {
            addCriterion("defaultPicture in", values, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureNotIn(List<String> values) {
            addCriterion("defaultPicture not in", values, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureBetween(String value1, String value2) {
            addCriterion("defaultPicture between", value1, value2, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andDefaultpictureNotBetween(String value1, String value2) {
            addCriterion("defaultPicture not between", value1, value2, "defaultpicture");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsIsNull() {
            addCriterion("albumNums is null");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsIsNotNull() {
            addCriterion("albumNums is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsEqualTo(Integer value) {
            addCriterion("albumNums =", value, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsNotEqualTo(Integer value) {
            addCriterion("albumNums <>", value, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsGreaterThan(Integer value) {
            addCriterion("albumNums >", value, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("albumNums >=", value, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsLessThan(Integer value) {
            addCriterion("albumNums <", value, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsLessThanOrEqualTo(Integer value) {
            addCriterion("albumNums <=", value, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsIn(List<Integer> values) {
            addCriterion("albumNums in", values, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsNotIn(List<Integer> values) {
            addCriterion("albumNums not in", values, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsBetween(Integer value1, Integer value2) {
            addCriterion("albumNums between", value1, value2, "albumnums");
            return (Criteria) this;
        }

        public Criteria andAlbumnumsNotBetween(Integer value1, Integer value2) {
            addCriterion("albumNums not between", value1, value2, "albumnums");
            return (Criteria) this;
        }

        public Criteria andEffectIsNull() {
            addCriterion("effect is null");
            return (Criteria) this;
        }

        public Criteria andEffectIsNotNull() {
            addCriterion("effect is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEqualTo(String value) {
            addCriterion("effect =", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotEqualTo(String value) {
            addCriterion("effect <>", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThan(String value) {
            addCriterion("effect >", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThanOrEqualTo(String value) {
            addCriterion("effect >=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThan(String value) {
            addCriterion("effect <", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThanOrEqualTo(String value) {
            addCriterion("effect <=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLike(String value) {
            addCriterion("effect like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotLike(String value) {
            addCriterion("effect not like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectIn(List<String> values) {
            addCriterion("effect in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotIn(List<String> values) {
            addCriterion("effect not in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectBetween(String value1, String value2) {
            addCriterion("effect between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotBetween(String value1, String value2) {
            addCriterion("effect not between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(Integer value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(Integer value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(Integer value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(Integer value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(Integer value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<Integer> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<Integer> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(Integer value1, Integer value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(Integer value1, Integer value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathIsNull() {
            addCriterion("bgmusicpath is null");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathIsNotNull() {
            addCriterion("bgmusicpath is not null");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathEqualTo(String value) {
            addCriterion("bgmusicpath =", value, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathNotEqualTo(String value) {
            addCriterion("bgmusicpath <>", value, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathGreaterThan(String value) {
            addCriterion("bgmusicpath >", value, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathGreaterThanOrEqualTo(String value) {
            addCriterion("bgmusicpath >=", value, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathLessThan(String value) {
            addCriterion("bgmusicpath <", value, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathLessThanOrEqualTo(String value) {
            addCriterion("bgmusicpath <=", value, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathLike(String value) {
            addCriterion("bgmusicpath like", value, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathNotLike(String value) {
            addCriterion("bgmusicpath not like", value, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathIn(List<String> values) {
            addCriterion("bgmusicpath in", values, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathNotIn(List<String> values) {
            addCriterion("bgmusicpath not in", values, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathBetween(String value1, String value2) {
            addCriterion("bgmusicpath between", value1, value2, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andBgmusicpathNotBetween(String value1, String value2) {
            addCriterion("bgmusicpath not between", value1, value2, "bgmusicpath");
            return (Criteria) this;
        }

        public Criteria andPhotostepIsNull() {
            addCriterion("photostep is null");
            return (Criteria) this;
        }

        public Criteria andPhotostepIsNotNull() {
            addCriterion("photostep is not null");
            return (Criteria) this;
        }

        public Criteria andPhotostepEqualTo(Integer value) {
            addCriterion("photostep =", value, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepNotEqualTo(Integer value) {
            addCriterion("photostep <>", value, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepGreaterThan(Integer value) {
            addCriterion("photostep >", value, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepGreaterThanOrEqualTo(Integer value) {
            addCriterion("photostep >=", value, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepLessThan(Integer value) {
            addCriterion("photostep <", value, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepLessThanOrEqualTo(Integer value) {
            addCriterion("photostep <=", value, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepIn(List<Integer> values) {
            addCriterion("photostep in", values, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepNotIn(List<Integer> values) {
            addCriterion("photostep not in", values, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepBetween(Integer value1, Integer value2) {
            addCriterion("photostep between", value1, value2, "photostep");
            return (Criteria) this;
        }

        public Criteria andPhotostepNotBetween(Integer value1, Integer value2) {
            addCriterion("photostep not between", value1, value2, "photostep");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("modifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("modifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("modifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("modifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("modifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("modifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("modifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("modifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("modifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("delFlag is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("delFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(Byte value) {
            addCriterion("delFlag =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(Byte value) {
            addCriterion("delFlag <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(Byte value) {
            addCriterion("delFlag >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("delFlag >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(Byte value) {
            addCriterion("delFlag <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(Byte value) {
            addCriterion("delFlag <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<Byte> values) {
            addCriterion("delFlag in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<Byte> values) {
            addCriterion("delFlag not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(Byte value1, Byte value2) {
            addCriterion("delFlag between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(Byte value1, Byte value2) {
            addCriterion("delFlag not between", value1, value2, "delflag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}