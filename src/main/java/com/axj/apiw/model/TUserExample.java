package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNull() {
            addCriterion("PAYMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNotNull() {
            addCriterion("PAYMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateEqualTo(String value) {
            addCriterion("PAYMENTDATE =", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotEqualTo(String value) {
            addCriterion("PAYMENTDATE <>", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThan(String value) {
            addCriterion("PAYMENTDATE >", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTDATE >=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThan(String value) {
            addCriterion("PAYMENTDATE <", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTDATE <=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLike(String value) {
            addCriterion("PAYMENTDATE like", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotLike(String value) {
            addCriterion("PAYMENTDATE not like", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIn(List<String> values) {
            addCriterion("PAYMENTDATE in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotIn(List<String> values) {
            addCriterion("PAYMENTDATE not in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateBetween(String value1, String value2) {
            addCriterion("PAYMENTDATE between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotBetween(String value1, String value2) {
            addCriterion("PAYMENTDATE not between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNull() {
            addCriterion("INDUSTRYID is null");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNotNull() {
            addCriterion("INDUSTRYID is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryidEqualTo(Integer value) {
            addCriterion("INDUSTRYID =", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotEqualTo(Integer value) {
            addCriterion("INDUSTRYID <>", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThan(Integer value) {
            addCriterion("INDUSTRYID >", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDUSTRYID >=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThan(Integer value) {
            addCriterion("INDUSTRYID <", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThanOrEqualTo(Integer value) {
            addCriterion("INDUSTRYID <=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidIn(List<Integer> values) {
            addCriterion("INDUSTRYID in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotIn(List<Integer> values) {
            addCriterion("INDUSTRYID not in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidBetween(Integer value1, Integer value2) {
            addCriterion("INDUSTRYID between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotBetween(Integer value1, Integer value2) {
            addCriterion("INDUSTRYID not between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andIspaymentIsNull() {
            addCriterion("ISPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andIspaymentIsNotNull() {
            addCriterion("ISPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIspaymentEqualTo(Boolean value) {
            addCriterion("ISPAYMENT =", value, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentNotEqualTo(Boolean value) {
            addCriterion("ISPAYMENT <>", value, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentGreaterThan(Boolean value) {
            addCriterion("ISPAYMENT >", value, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ISPAYMENT >=", value, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentLessThan(Boolean value) {
            addCriterion("ISPAYMENT <", value, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentLessThanOrEqualTo(Boolean value) {
            addCriterion("ISPAYMENT <=", value, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentIn(List<Boolean> values) {
            addCriterion("ISPAYMENT in", values, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentNotIn(List<Boolean> values) {
            addCriterion("ISPAYMENT not in", values, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentBetween(Boolean value1, Boolean value2) {
            addCriterion("ISPAYMENT between", value1, value2, "ispayment");
            return (Criteria) this;
        }

        public Criteria andIspaymentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ISPAYMENT not between", value1, value2, "ispayment");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andSecretIsNull() {
            addCriterion("SECRET is null");
            return (Criteria) this;
        }

        public Criteria andSecretIsNotNull() {
            addCriterion("SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andSecretEqualTo(String value) {
            addCriterion("SECRET =", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotEqualTo(String value) {
            addCriterion("SECRET <>", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThan(String value) {
            addCriterion("SECRET >", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThanOrEqualTo(String value) {
            addCriterion("SECRET >=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThan(String value) {
            addCriterion("SECRET <", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThanOrEqualTo(String value) {
            addCriterion("SECRET <=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLike(String value) {
            addCriterion("SECRET like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotLike(String value) {
            addCriterion("SECRET not like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretIn(List<String> values) {
            addCriterion("SECRET in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotIn(List<String> values) {
            addCriterion("SECRET not in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretBetween(String value1, String value2) {
            addCriterion("SECRET between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotBetween(String value1, String value2) {
            addCriterion("SECRET not between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeIsNull() {
            addCriterion("USERUNIQUECODE is null");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeIsNotNull() {
            addCriterion("USERUNIQUECODE is not null");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeEqualTo(String value) {
            addCriterion("USERUNIQUECODE =", value, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeNotEqualTo(String value) {
            addCriterion("USERUNIQUECODE <>", value, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeGreaterThan(String value) {
            addCriterion("USERUNIQUECODE >", value, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeGreaterThanOrEqualTo(String value) {
            addCriterion("USERUNIQUECODE >=", value, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeLessThan(String value) {
            addCriterion("USERUNIQUECODE <", value, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeLessThanOrEqualTo(String value) {
            addCriterion("USERUNIQUECODE <=", value, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeLike(String value) {
            addCriterion("USERUNIQUECODE like", value, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeNotLike(String value) {
            addCriterion("USERUNIQUECODE not like", value, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeIn(List<String> values) {
            addCriterion("USERUNIQUECODE in", values, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeNotIn(List<String> values) {
            addCriterion("USERUNIQUECODE not in", values, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeBetween(String value1, String value2) {
            addCriterion("USERUNIQUECODE between", value1, value2, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andUseruniquecodeNotBetween(String value1, String value2) {
            addCriterion("USERUNIQUECODE not between", value1, value2, "useruniquecode");
            return (Criteria) this;
        }

        public Criteria andGhidIsNull() {
            addCriterion("GHID is null");
            return (Criteria) this;
        }

        public Criteria andGhidIsNotNull() {
            addCriterion("GHID is not null");
            return (Criteria) this;
        }

        public Criteria andGhidEqualTo(String value) {
            addCriterion("GHID =", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidNotEqualTo(String value) {
            addCriterion("GHID <>", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidGreaterThan(String value) {
            addCriterion("GHID >", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidGreaterThanOrEqualTo(String value) {
            addCriterion("GHID >=", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidLessThan(String value) {
            addCriterion("GHID <", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidLessThanOrEqualTo(String value) {
            addCriterion("GHID <=", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidLike(String value) {
            addCriterion("GHID like", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidNotLike(String value) {
            addCriterion("GHID not like", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidIn(List<String> values) {
            addCriterion("GHID in", values, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidNotIn(List<String> values) {
            addCriterion("GHID not in", values, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidBetween(String value1, String value2) {
            addCriterion("GHID between", value1, value2, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidNotBetween(String value1, String value2) {
            addCriterion("GHID not between", value1, value2, "ghid");
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