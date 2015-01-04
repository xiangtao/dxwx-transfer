package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.List;

public class TWxuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWxuserExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWxidIsNull() {
            addCriterion("WXID is null");
            return (Criteria) this;
        }

        public Criteria andWxidIsNotNull() {
            addCriterion("WXID is not null");
            return (Criteria) this;
        }

        public Criteria andWxidEqualTo(String value) {
            addCriterion("WXID =", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotEqualTo(String value) {
            addCriterion("WXID <>", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidGreaterThan(String value) {
            addCriterion("WXID >", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidGreaterThanOrEqualTo(String value) {
            addCriterion("WXID >=", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidLessThan(String value) {
            addCriterion("WXID <", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidLessThanOrEqualTo(String value) {
            addCriterion("WXID <=", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidLike(String value) {
            addCriterion("WXID like", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotLike(String value) {
            addCriterion("WXID not like", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidIn(List<String> values) {
            addCriterion("WXID in", values, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotIn(List<String> values) {
            addCriterion("WXID not in", values, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidBetween(String value1, String value2) {
            addCriterion("WXID between", value1, value2, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotBetween(String value1, String value2) {
            addCriterion("WXID not between", value1, value2, "wxid");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNull() {
            addCriterion("JOINDATE is null");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNotNull() {
            addCriterion("JOINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andJoindateEqualTo(String value) {
            addCriterion("JOINDATE =", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotEqualTo(String value) {
            addCriterion("JOINDATE <>", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThan(String value) {
            addCriterion("JOINDATE >", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThanOrEqualTo(String value) {
            addCriterion("JOINDATE >=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThan(String value) {
            addCriterion("JOINDATE <", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThanOrEqualTo(String value) {
            addCriterion("JOINDATE <=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLike(String value) {
            addCriterion("JOINDATE like", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotLike(String value) {
            addCriterion("JOINDATE not like", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateIn(List<String> values) {
            addCriterion("JOINDATE in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotIn(List<String> values) {
            addCriterion("JOINDATE not in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateBetween(String value1, String value2) {
            addCriterion("JOINDATE between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotBetween(String value1, String value2) {
            addCriterion("JOINDATE not between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNull() {
            addCriterion("TELNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNotNull() {
            addCriterion("TELNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumberEqualTo(String value) {
            addCriterion("TELNUMBER =", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotEqualTo(String value) {
            addCriterion("TELNUMBER <>", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThan(String value) {
            addCriterion("TELNUMBER >", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("TELNUMBER >=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThan(String value) {
            addCriterion("TELNUMBER <", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThanOrEqualTo(String value) {
            addCriterion("TELNUMBER <=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLike(String value) {
            addCriterion("TELNUMBER like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotLike(String value) {
            addCriterion("TELNUMBER not like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberIn(List<String> values) {
            addCriterion("TELNUMBER in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotIn(List<String> values) {
            addCriterion("TELNUMBER not in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberBetween(String value1, String value2) {
            addCriterion("TELNUMBER between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotBetween(String value1, String value2) {
            addCriterion("TELNUMBER not between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andBillnameIsNull() {
            addCriterion("BILLNAME is null");
            return (Criteria) this;
        }

        public Criteria andBillnameIsNotNull() {
            addCriterion("BILLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBillnameEqualTo(String value) {
            addCriterion("BILLNAME =", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotEqualTo(String value) {
            addCriterion("BILLNAME <>", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameGreaterThan(String value) {
            addCriterion("BILLNAME >", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameGreaterThanOrEqualTo(String value) {
            addCriterion("BILLNAME >=", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLessThan(String value) {
            addCriterion("BILLNAME <", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLessThanOrEqualTo(String value) {
            addCriterion("BILLNAME <=", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLike(String value) {
            addCriterion("BILLNAME like", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotLike(String value) {
            addCriterion("BILLNAME not like", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameIn(List<String> values) {
            addCriterion("BILLNAME in", values, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotIn(List<String> values) {
            addCriterion("BILLNAME not in", values, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameBetween(String value1, String value2) {
            addCriterion("BILLNAME between", value1, value2, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotBetween(String value1, String value2) {
            addCriterion("BILLNAME not between", value1, value2, "billname");
            return (Criteria) this;
        }

        public Criteria andMembercodeIsNull() {
            addCriterion("MEMBERCODE is null");
            return (Criteria) this;
        }

        public Criteria andMembercodeIsNotNull() {
            addCriterion("MEMBERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMembercodeEqualTo(String value) {
            addCriterion("MEMBERCODE =", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotEqualTo(String value) {
            addCriterion("MEMBERCODE <>", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeGreaterThan(String value) {
            addCriterion("MEMBERCODE >", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBERCODE >=", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLessThan(String value) {
            addCriterion("MEMBERCODE <", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLessThanOrEqualTo(String value) {
            addCriterion("MEMBERCODE <=", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLike(String value) {
            addCriterion("MEMBERCODE like", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotLike(String value) {
            addCriterion("MEMBERCODE not like", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeIn(List<String> values) {
            addCriterion("MEMBERCODE in", values, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotIn(List<String> values) {
            addCriterion("MEMBERCODE not in", values, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeBetween(String value1, String value2) {
            addCriterion("MEMBERCODE between", value1, value2, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotBetween(String value1, String value2) {
            addCriterion("MEMBERCODE not between", value1, value2, "membercode");
            return (Criteria) this;
        }

        public Criteria andIsuseexIsNull() {
            addCriterion("ISUSEEX is null");
            return (Criteria) this;
        }

        public Criteria andIsuseexIsNotNull() {
            addCriterion("ISUSEEX is not null");
            return (Criteria) this;
        }

        public Criteria andIsuseexEqualTo(Boolean value) {
            addCriterion("ISUSEEX =", value, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexNotEqualTo(Boolean value) {
            addCriterion("ISUSEEX <>", value, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexGreaterThan(Boolean value) {
            addCriterion("ISUSEEX >", value, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ISUSEEX >=", value, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexLessThan(Boolean value) {
            addCriterion("ISUSEEX <", value, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexLessThanOrEqualTo(Boolean value) {
            addCriterion("ISUSEEX <=", value, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexIn(List<Boolean> values) {
            addCriterion("ISUSEEX in", values, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexNotIn(List<Boolean> values) {
            addCriterion("ISUSEEX not in", values, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexBetween(Boolean value1, Boolean value2) {
            addCriterion("ISUSEEX between", value1, value2, "isuseex");
            return (Criteria) this;
        }

        public Criteria andIsuseexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ISUSEEX not between", value1, value2, "isuseex");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
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