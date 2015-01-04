package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.List;

public class WechatMenuTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public WechatMenuTypeExample() {
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

        public Criteria andMenutypenameIsNull() {
            addCriterion("menuTypeName is null");
            return (Criteria) this;
        }

        public Criteria andMenutypenameIsNotNull() {
            addCriterion("menuTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andMenutypenameEqualTo(String value) {
            addCriterion("menuTypeName =", value, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameNotEqualTo(String value) {
            addCriterion("menuTypeName <>", value, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameGreaterThan(String value) {
            addCriterion("menuTypeName >", value, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameGreaterThanOrEqualTo(String value) {
            addCriterion("menuTypeName >=", value, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameLessThan(String value) {
            addCriterion("menuTypeName <", value, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameLessThanOrEqualTo(String value) {
            addCriterion("menuTypeName <=", value, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameLike(String value) {
            addCriterion("menuTypeName like", value, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameNotLike(String value) {
            addCriterion("menuTypeName not like", value, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameIn(List<String> values) {
            addCriterion("menuTypeName in", values, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameNotIn(List<String> values) {
            addCriterion("menuTypeName not in", values, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameBetween(String value1, String value2) {
            addCriterion("menuTypeName between", value1, value2, "menutypename");
            return (Criteria) this;
        }

        public Criteria andMenutypenameNotBetween(String value1, String value2) {
            addCriterion("menuTypeName not between", value1, value2, "menutypename");
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