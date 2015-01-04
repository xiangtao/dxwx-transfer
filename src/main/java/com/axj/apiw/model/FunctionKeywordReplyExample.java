package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FunctionKeywordReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public FunctionKeywordReplyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeIsNull() {
            addCriterion("keywordType is null");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeIsNotNull() {
            addCriterion("keywordType is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeEqualTo(Byte value) {
            addCriterion("keywordType =", value, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeNotEqualTo(Byte value) {
            addCriterion("keywordType <>", value, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeGreaterThan(Byte value) {
            addCriterion("keywordType >", value, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("keywordType >=", value, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeLessThan(Byte value) {
            addCriterion("keywordType <", value, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeLessThanOrEqualTo(Byte value) {
            addCriterion("keywordType <=", value, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeIn(List<Byte> values) {
            addCriterion("keywordType in", values, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeNotIn(List<Byte> values) {
            addCriterion("keywordType not in", values, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeBetween(Byte value1, Byte value2) {
            addCriterion("keywordType between", value1, value2, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andKeywordtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("keywordType not between", value1, value2, "keywordtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeIsNull() {
            addCriterion("matchType is null");
            return (Criteria) this;
        }

        public Criteria andMatchtypeIsNotNull() {
            addCriterion("matchType is not null");
            return (Criteria) this;
        }

        public Criteria andMatchtypeEqualTo(Byte value) {
            addCriterion("matchType =", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeNotEqualTo(Byte value) {
            addCriterion("matchType <>", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeGreaterThan(Byte value) {
            addCriterion("matchType >", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("matchType >=", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeLessThan(Byte value) {
            addCriterion("matchType <", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeLessThanOrEqualTo(Byte value) {
            addCriterion("matchType <=", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeIn(List<Byte> values) {
            addCriterion("matchType in", values, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeNotIn(List<Byte> values) {
            addCriterion("matchType not in", values, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeBetween(Byte value1, Byte value2) {
            addCriterion("matchType between", value1, value2, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("matchType not between", value1, value2, "matchtype");
            return (Criteria) this;
        }

        public Criteria andCallbackidIsNull() {
            addCriterion("callBackId is null");
            return (Criteria) this;
        }

        public Criteria andCallbackidIsNotNull() {
            addCriterion("callBackId is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackidEqualTo(Long value) {
            addCriterion("callBackId =", value, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidNotEqualTo(Long value) {
            addCriterion("callBackId <>", value, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidGreaterThan(Long value) {
            addCriterion("callBackId >", value, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidGreaterThanOrEqualTo(Long value) {
            addCriterion("callBackId >=", value, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidLessThan(Long value) {
            addCriterion("callBackId <", value, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidLessThanOrEqualTo(Long value) {
            addCriterion("callBackId <=", value, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidIn(List<Long> values) {
            addCriterion("callBackId in", values, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidNotIn(List<Long> values) {
            addCriterion("callBackId not in", values, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidBetween(Long value1, Long value2) {
            addCriterion("callBackId between", value1, value2, "callbackid");
            return (Criteria) this;
        }

        public Criteria andCallbackidNotBetween(Long value1, Long value2) {
            addCriterion("callBackId not between", value1, value2, "callbackid");
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
            addCriterion("wechatId is null");
            return (Criteria) this;
        }

        public Criteria andWechatidIsNotNull() {
            addCriterion("wechatId is not null");
            return (Criteria) this;
        }

        public Criteria andWechatidEqualTo(Long value) {
            addCriterion("wechatId =", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotEqualTo(Long value) {
            addCriterion("wechatId <>", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThan(Long value) {
            addCriterion("wechatId >", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThanOrEqualTo(Long value) {
            addCriterion("wechatId >=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThan(Long value) {
            addCriterion("wechatId <", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThanOrEqualTo(Long value) {
            addCriterion("wechatId <=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidIn(List<Long> values) {
            addCriterion("wechatId in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotIn(List<Long> values) {
            addCriterion("wechatId not in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidBetween(Long value1, Long value2) {
            addCriterion("wechatId between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotBetween(Long value1, Long value2) {
            addCriterion("wechatId not between", value1, value2, "wechatid");
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