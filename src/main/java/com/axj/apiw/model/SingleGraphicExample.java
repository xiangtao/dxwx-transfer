package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SingleGraphicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public SingleGraphicExample() {
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

        public Criteria andFodderidIsNull() {
            addCriterion("fodderID is null");
            return (Criteria) this;
        }

        public Criteria andFodderidIsNotNull() {
            addCriterion("fodderID is not null");
            return (Criteria) this;
        }

        public Criteria andFodderidEqualTo(Long value) {
            addCriterion("fodderID =", value, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidNotEqualTo(Long value) {
            addCriterion("fodderID <>", value, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidGreaterThan(Long value) {
            addCriterion("fodderID >", value, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidGreaterThanOrEqualTo(Long value) {
            addCriterion("fodderID >=", value, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidLessThan(Long value) {
            addCriterion("fodderID <", value, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidLessThanOrEqualTo(Long value) {
            addCriterion("fodderID <=", value, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidIn(List<Long> values) {
            addCriterion("fodderID in", values, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidNotIn(List<Long> values) {
            addCriterion("fodderID not in", values, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidBetween(Long value1, Long value2) {
            addCriterion("fodderID between", value1, value2, "fodderid");
            return (Criteria) this;
        }

        public Criteria andFodderidNotBetween(Long value1, Long value2) {
            addCriterion("fodderID not between", value1, value2, "fodderid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFoddertypeIsNull() {
            addCriterion("fodderType is null");
            return (Criteria) this;
        }

        public Criteria andFoddertypeIsNotNull() {
            addCriterion("fodderType is not null");
            return (Criteria) this;
        }

        public Criteria andFoddertypeEqualTo(Long value) {
            addCriterion("fodderType =", value, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeNotEqualTo(Long value) {
            addCriterion("fodderType <>", value, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeGreaterThan(Long value) {
            addCriterion("fodderType >", value, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeGreaterThanOrEqualTo(Long value) {
            addCriterion("fodderType >=", value, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeLessThan(Long value) {
            addCriterion("fodderType <", value, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeLessThanOrEqualTo(Long value) {
            addCriterion("fodderType <=", value, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeIn(List<Long> values) {
            addCriterion("fodderType in", values, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeNotIn(List<Long> values) {
            addCriterion("fodderType not in", values, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeBetween(Long value1, Long value2) {
            addCriterion("fodderType between", value1, value2, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddertypeNotBetween(Long value1, Long value2) {
            addCriterion("fodderType not between", value1, value2, "foddertype");
            return (Criteria) this;
        }

        public Criteria andFoddernameIsNull() {
            addCriterion("fodderName is null");
            return (Criteria) this;
        }

        public Criteria andFoddernameIsNotNull() {
            addCriterion("fodderName is not null");
            return (Criteria) this;
        }

        public Criteria andFoddernameEqualTo(String value) {
            addCriterion("fodderName =", value, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameNotEqualTo(String value) {
            addCriterion("fodderName <>", value, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameGreaterThan(String value) {
            addCriterion("fodderName >", value, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameGreaterThanOrEqualTo(String value) {
            addCriterion("fodderName >=", value, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameLessThan(String value) {
            addCriterion("fodderName <", value, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameLessThanOrEqualTo(String value) {
            addCriterion("fodderName <=", value, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameLike(String value) {
            addCriterion("fodderName like", value, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameNotLike(String value) {
            addCriterion("fodderName not like", value, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameIn(List<String> values) {
            addCriterion("fodderName in", values, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameNotIn(List<String> values) {
            addCriterion("fodderName not in", values, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameBetween(String value1, String value2) {
            addCriterion("fodderName between", value1, value2, "foddername");
            return (Criteria) this;
        }

        public Criteria andFoddernameNotBetween(String value1, String value2) {
            addCriterion("fodderName not between", value1, value2, "foddername");
            return (Criteria) this;
        }

        public Criteria andFodderimageIsNull() {
            addCriterion("fodderImage is null");
            return (Criteria) this;
        }

        public Criteria andFodderimageIsNotNull() {
            addCriterion("fodderImage is not null");
            return (Criteria) this;
        }

        public Criteria andFodderimageEqualTo(String value) {
            addCriterion("fodderImage =", value, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageNotEqualTo(String value) {
            addCriterion("fodderImage <>", value, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageGreaterThan(String value) {
            addCriterion("fodderImage >", value, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageGreaterThanOrEqualTo(String value) {
            addCriterion("fodderImage >=", value, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageLessThan(String value) {
            addCriterion("fodderImage <", value, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageLessThanOrEqualTo(String value) {
            addCriterion("fodderImage <=", value, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageLike(String value) {
            addCriterion("fodderImage like", value, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageNotLike(String value) {
            addCriterion("fodderImage not like", value, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageIn(List<String> values) {
            addCriterion("fodderImage in", values, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageNotIn(List<String> values) {
            addCriterion("fodderImage not in", values, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageBetween(String value1, String value2) {
            addCriterion("fodderImage between", value1, value2, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderimageNotBetween(String value1, String value2) {
            addCriterion("fodderImage not between", value1, value2, "fodderimage");
            return (Criteria) this;
        }

        public Criteria andFodderdigestIsNull() {
            addCriterion("fodderDigest is null");
            return (Criteria) this;
        }

        public Criteria andFodderdigestIsNotNull() {
            addCriterion("fodderDigest is not null");
            return (Criteria) this;
        }

        public Criteria andFodderdigestEqualTo(String value) {
            addCriterion("fodderDigest =", value, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestNotEqualTo(String value) {
            addCriterion("fodderDigest <>", value, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestGreaterThan(String value) {
            addCriterion("fodderDigest >", value, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestGreaterThanOrEqualTo(String value) {
            addCriterion("fodderDigest >=", value, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestLessThan(String value) {
            addCriterion("fodderDigest <", value, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestLessThanOrEqualTo(String value) {
            addCriterion("fodderDigest <=", value, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestLike(String value) {
            addCriterion("fodderDigest like", value, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestNotLike(String value) {
            addCriterion("fodderDigest not like", value, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestIn(List<String> values) {
            addCriterion("fodderDigest in", values, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestNotIn(List<String> values) {
            addCriterion("fodderDigest not in", values, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestBetween(String value1, String value2) {
            addCriterion("fodderDigest between", value1, value2, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andFodderdigestNotBetween(String value1, String value2) {
            addCriterion("fodderDigest not between", value1, value2, "fodderdigest");
            return (Criteria) this;
        }

        public Criteria andInnerlinkIsNull() {
            addCriterion("innerLink is null");
            return (Criteria) this;
        }

        public Criteria andInnerlinkIsNotNull() {
            addCriterion("innerLink is not null");
            return (Criteria) this;
        }

        public Criteria andInnerlinkEqualTo(String value) {
            addCriterion("innerLink =", value, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkNotEqualTo(String value) {
            addCriterion("innerLink <>", value, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkGreaterThan(String value) {
            addCriterion("innerLink >", value, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkGreaterThanOrEqualTo(String value) {
            addCriterion("innerLink >=", value, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkLessThan(String value) {
            addCriterion("innerLink <", value, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkLessThanOrEqualTo(String value) {
            addCriterion("innerLink <=", value, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkLike(String value) {
            addCriterion("innerLink like", value, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkNotLike(String value) {
            addCriterion("innerLink not like", value, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkIn(List<String> values) {
            addCriterion("innerLink in", values, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkNotIn(List<String> values) {
            addCriterion("innerLink not in", values, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkBetween(String value1, String value2) {
            addCriterion("innerLink between", value1, value2, "innerlink");
            return (Criteria) this;
        }

        public Criteria andInnerlinkNotBetween(String value1, String value2) {
            addCriterion("innerLink not between", value1, value2, "innerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkIsNull() {
            addCriterion("outerLink is null");
            return (Criteria) this;
        }

        public Criteria andOuterlinkIsNotNull() {
            addCriterion("outerLink is not null");
            return (Criteria) this;
        }

        public Criteria andOuterlinkEqualTo(String value) {
            addCriterion("outerLink =", value, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkNotEqualTo(String value) {
            addCriterion("outerLink <>", value, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkGreaterThan(String value) {
            addCriterion("outerLink >", value, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkGreaterThanOrEqualTo(String value) {
            addCriterion("outerLink >=", value, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkLessThan(String value) {
            addCriterion("outerLink <", value, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkLessThanOrEqualTo(String value) {
            addCriterion("outerLink <=", value, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkLike(String value) {
            addCriterion("outerLink like", value, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkNotLike(String value) {
            addCriterion("outerLink not like", value, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkIn(List<String> values) {
            addCriterion("outerLink in", values, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkNotIn(List<String> values) {
            addCriterion("outerLink not in", values, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkBetween(String value1, String value2) {
            addCriterion("outerLink between", value1, value2, "outerlink");
            return (Criteria) this;
        }

        public Criteria andOuterlinkNotBetween(String value1, String value2) {
            addCriterion("outerLink not between", value1, value2, "outerlink");
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