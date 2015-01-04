package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public WechatMenuExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("menuid is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Long value) {
            addCriterion("menuid =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Long value) {
            addCriterion("menuid <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Long value) {
            addCriterion("menuid >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Long value) {
            addCriterion("menuid >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Long value) {
            addCriterion("menuid <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Long value) {
            addCriterion("menuid <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Long> values) {
            addCriterion("menuid in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Long> values) {
            addCriterion("menuid not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Long value1, Long value2) {
            addCriterion("menuid between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Long value1, Long value2) {
            addCriterion("menuid not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andCalltypeIsNull() {
            addCriterion("calltype is null");
            return (Criteria) this;
        }

        public Criteria andCalltypeIsNotNull() {
            addCriterion("calltype is not null");
            return (Criteria) this;
        }

        public Criteria andCalltypeEqualTo(String value) {
            addCriterion("calltype =", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotEqualTo(String value) {
            addCriterion("calltype <>", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeGreaterThan(String value) {
            addCriterion("calltype >", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeGreaterThanOrEqualTo(String value) {
            addCriterion("calltype >=", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLessThan(String value) {
            addCriterion("calltype <", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLessThanOrEqualTo(String value) {
            addCriterion("calltype <=", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLike(String value) {
            addCriterion("calltype like", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotLike(String value) {
            addCriterion("calltype not like", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeIn(List<String> values) {
            addCriterion("calltype in", values, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotIn(List<String> values) {
            addCriterion("calltype not in", values, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeBetween(String value1, String value2) {
            addCriterion("calltype between", value1, value2, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotBetween(String value1, String value2) {
            addCriterion("calltype not between", value1, value2, "calltype");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCallbackIsNull() {
            addCriterion("callback is null");
            return (Criteria) this;
        }

        public Criteria andCallbackIsNotNull() {
            addCriterion("callback is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackEqualTo(String value) {
            addCriterion("callback =", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotEqualTo(String value) {
            addCriterion("callback <>", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackGreaterThan(String value) {
            addCriterion("callback >", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackGreaterThanOrEqualTo(String value) {
            addCriterion("callback >=", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLessThan(String value) {
            addCriterion("callback <", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLessThanOrEqualTo(String value) {
            addCriterion("callback <=", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLike(String value) {
            addCriterion("callback like", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotLike(String value) {
            addCriterion("callback not like", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackIn(List<String> values) {
            addCriterion("callback in", values, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotIn(List<String> values) {
            addCriterion("callback not in", values, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackBetween(String value1, String value2) {
            addCriterion("callback between", value1, value2, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotBetween(String value1, String value2) {
            addCriterion("callback not between", value1, value2, "callback");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andMenutypeidIsNull() {
            addCriterion("menuTypeId is null");
            return (Criteria) this;
        }

        public Criteria andMenutypeidIsNotNull() {
            addCriterion("menuTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andMenutypeidEqualTo(Long value) {
            addCriterion("menuTypeId =", value, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidNotEqualTo(Long value) {
            addCriterion("menuTypeId <>", value, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidGreaterThan(Long value) {
            addCriterion("menuTypeId >", value, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("menuTypeId >=", value, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidLessThan(Long value) {
            addCriterion("menuTypeId <", value, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidLessThanOrEqualTo(Long value) {
            addCriterion("menuTypeId <=", value, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidIn(List<Long> values) {
            addCriterion("menuTypeId in", values, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidNotIn(List<Long> values) {
            addCriterion("menuTypeId not in", values, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidBetween(Long value1, Long value2) {
            addCriterion("menuTypeId between", value1, value2, "menutypeid");
            return (Criteria) this;
        }

        public Criteria andMenutypeidNotBetween(Long value1, Long value2) {
            addCriterion("menuTypeId not between", value1, value2, "menutypeid");
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

        public Criteria andSnEqualTo(Long value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(Long value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(Long value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(Long value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(Long value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(Long value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<Long> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<Long> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(Long value1, Long value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(Long value1, Long value2) {
            addCriterion("sn not between", value1, value2, "sn");
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