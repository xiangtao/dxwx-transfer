package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.List;

public class WeiumWechatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public WeiumWechatExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNull() {
            addCriterion("wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNotNull() {
            addCriterion("wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNameEqualTo(String value) {
            addCriterion("wechat_name =", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotEqualTo(String value) {
            addCriterion("wechat_name <>", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThan(String value) {
            addCriterion("wechat_name >", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_name >=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThan(String value) {
            addCriterion("wechat_name <", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThanOrEqualTo(String value) {
            addCriterion("wechat_name <=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLike(String value) {
            addCriterion("wechat_name like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotLike(String value) {
            addCriterion("wechat_name not like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameIn(List<String> values) {
            addCriterion("wechat_name in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotIn(List<String> values) {
            addCriterion("wechat_name not in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameBetween(String value1, String value2) {
            addCriterion("wechat_name between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotBetween(String value1, String value2) {
            addCriterion("wechat_name not between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdIsNull() {
            addCriterion("wechat_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdIsNotNull() {
            addCriterion("wechat_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdEqualTo(String value) {
            addCriterion("wechat_open_id =", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdNotEqualTo(String value) {
            addCriterion("wechat_open_id <>", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdGreaterThan(String value) {
            addCriterion("wechat_open_id >", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_open_id >=", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdLessThan(String value) {
            addCriterion("wechat_open_id <", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_open_id <=", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdLike(String value) {
            addCriterion("wechat_open_id like", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdNotLike(String value) {
            addCriterion("wechat_open_id not like", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdIn(List<String> values) {
            addCriterion("wechat_open_id in", values, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdNotIn(List<String> values) {
            addCriterion("wechat_open_id not in", values, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdBetween(String value1, String value2) {
            addCriterion("wechat_open_id between", value1, value2, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdNotBetween(String value1, String value2) {
            addCriterion("wechat_open_id not between", value1, value2, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusIsNull() {
            addCriterion("weium_wechart_status is null");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusIsNotNull() {
            addCriterion("weium_wechart_status is not null");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusEqualTo(Byte value) {
            addCriterion("weium_wechart_status =", value, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusNotEqualTo(Byte value) {
            addCriterion("weium_wechart_status <>", value, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusGreaterThan(Byte value) {
            addCriterion("weium_wechart_status >", value, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("weium_wechart_status >=", value, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusLessThan(Byte value) {
            addCriterion("weium_wechart_status <", value, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusLessThanOrEqualTo(Byte value) {
            addCriterion("weium_wechart_status <=", value, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusIn(List<Byte> values) {
            addCriterion("weium_wechart_status in", values, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusNotIn(List<Byte> values) {
            addCriterion("weium_wechart_status not in", values, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusBetween(Byte value1, Byte value2) {
            addCriterion("weium_wechart_status between", value1, value2, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumWechartStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("weium_wechart_status not between", value1, value2, "weiumWechartStatus");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenIsNull() {
            addCriterion("weium_token is null");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenIsNotNull() {
            addCriterion("weium_token is not null");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenEqualTo(String value) {
            addCriterion("weium_token =", value, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenNotEqualTo(String value) {
            addCriterion("weium_token <>", value, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenGreaterThan(String value) {
            addCriterion("weium_token >", value, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenGreaterThanOrEqualTo(String value) {
            addCriterion("weium_token >=", value, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenLessThan(String value) {
            addCriterion("weium_token <", value, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenLessThanOrEqualTo(String value) {
            addCriterion("weium_token <=", value, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenLike(String value) {
            addCriterion("weium_token like", value, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenNotLike(String value) {
            addCriterion("weium_token not like", value, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenIn(List<String> values) {
            addCriterion("weium_token in", values, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenNotIn(List<String> values) {
            addCriterion("weium_token not in", values, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenBetween(String value1, String value2) {
            addCriterion("weium_token between", value1, value2, "weiumToken");
            return (Criteria) this;
        }

        public Criteria andWeiumTokenNotBetween(String value1, String value2) {
            addCriterion("weium_token not between", value1, value2, "weiumToken");
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