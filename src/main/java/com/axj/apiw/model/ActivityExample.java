package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public ActivityExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
        
        
        
        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCashinfoIsNull() {
            addCriterion("cashInfo is null");
            return (Criteria) this;
        }

        public Criteria andCashinfoIsNotNull() {
            addCriterion("cashInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCashinfoEqualTo(String value) {
            addCriterion("cashInfo =", value, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoNotEqualTo(String value) {
            addCriterion("cashInfo <>", value, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoGreaterThan(String value) {
            addCriterion("cashInfo >", value, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoGreaterThanOrEqualTo(String value) {
            addCriterion("cashInfo >=", value, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoLessThan(String value) {
            addCriterion("cashInfo <", value, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoLessThanOrEqualTo(String value) {
            addCriterion("cashInfo <=", value, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoLike(String value) {
            addCriterion("cashInfo like", value, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoNotLike(String value) {
            addCriterion("cashInfo not like", value, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoIn(List<String> values) {
            addCriterion("cashInfo in", values, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoNotIn(List<String> values) {
            addCriterion("cashInfo not in", values, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoBetween(String value1, String value2) {
            addCriterion("cashInfo between", value1, value2, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andCashinfoNotBetween(String value1, String value2) {
            addCriterion("cashInfo not between", value1, value2, "cashinfo");
            return (Criteria) this;
        }

        public Criteria andWinprizeIsNull() {
            addCriterion("winPrize is null");
            return (Criteria) this;
        }

        public Criteria andWinprizeIsNotNull() {
            addCriterion("winPrize is not null");
            return (Criteria) this;
        }

        public Criteria andWinprizeEqualTo(String value) {
            addCriterion("winPrize =", value, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeNotEqualTo(String value) {
            addCriterion("winPrize <>", value, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeGreaterThan(String value) {
            addCriterion("winPrize >", value, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeGreaterThanOrEqualTo(String value) {
            addCriterion("winPrize >=", value, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeLessThan(String value) {
            addCriterion("winPrize <", value, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeLessThanOrEqualTo(String value) {
            addCriterion("winPrize <=", value, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeLike(String value) {
            addCriterion("winPrize like", value, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeNotLike(String value) {
            addCriterion("winPrize not like", value, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeIn(List<String> values) {
            addCriterion("winPrize in", values, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeNotIn(List<String> values) {
            addCriterion("winPrize not in", values, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeBetween(String value1, String value2) {
            addCriterion("winPrize between", value1, value2, "winprize");
            return (Criteria) this;
        }

        public Criteria andWinprizeNotBetween(String value1, String value2) {
            addCriterion("winPrize not between", value1, value2, "winprize");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIsNull() {
            addCriterion("briefIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIsNotNull() {
            addCriterion("briefIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionEqualTo(String value) {
            addCriterion("briefIntroduction =", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotEqualTo(String value) {
            addCriterion("briefIntroduction <>", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionGreaterThan(String value) {
            addCriterion("briefIntroduction >", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("briefIntroduction >=", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLessThan(String value) {
            addCriterion("briefIntroduction <", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLessThanOrEqualTo(String value) {
            addCriterion("briefIntroduction <=", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLike(String value) {
            addCriterion("briefIntroduction like", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotLike(String value) {
            addCriterion("briefIntroduction not like", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIn(List<String> values) {
            addCriterion("briefIntroduction in", values, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotIn(List<String> values) {
            addCriterion("briefIntroduction not in", values, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionBetween(String value1, String value2) {
            addCriterion("briefIntroduction between", value1, value2, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotBetween(String value1, String value2) {
            addCriterion("briefIntroduction not between", value1, value2, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andDes1IsNull() {
            addCriterion("des1 is null");
            return (Criteria) this;
        }

        public Criteria andDes1IsNotNull() {
            addCriterion("des1 is not null");
            return (Criteria) this;
        }

        public Criteria andDes1EqualTo(String value) {
            addCriterion("des1 =", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1NotEqualTo(String value) {
            addCriterion("des1 <>", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1GreaterThan(String value) {
            addCriterion("des1 >", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1GreaterThanOrEqualTo(String value) {
            addCriterion("des1 >=", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1LessThan(String value) {
            addCriterion("des1 <", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1LessThanOrEqualTo(String value) {
            addCriterion("des1 <=", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1Like(String value) {
            addCriterion("des1 like", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1NotLike(String value) {
            addCriterion("des1 not like", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1In(List<String> values) {
            addCriterion("des1 in", values, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1NotIn(List<String> values) {
            addCriterion("des1 not in", values, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1Between(String value1, String value2) {
            addCriterion("des1 between", value1, value2, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1NotBetween(String value1, String value2) {
            addCriterion("des1 not between", value1, value2, "des1");
            return (Criteria) this;
        }

        public Criteria andDes2IsNull() {
            addCriterion("des2 is null");
            return (Criteria) this;
        }

        public Criteria andDes2IsNotNull() {
            addCriterion("des2 is not null");
            return (Criteria) this;
        }

        public Criteria andDes2EqualTo(String value) {
            addCriterion("des2 =", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2NotEqualTo(String value) {
            addCriterion("des2 <>", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2GreaterThan(String value) {
            addCriterion("des2 >", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2GreaterThanOrEqualTo(String value) {
            addCriterion("des2 >=", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2LessThan(String value) {
            addCriterion("des2 <", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2LessThanOrEqualTo(String value) {
            addCriterion("des2 <=", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2Like(String value) {
            addCriterion("des2 like", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2NotLike(String value) {
            addCriterion("des2 not like", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2In(List<String> values) {
            addCriterion("des2 in", values, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2NotIn(List<String> values) {
            addCriterion("des2 not in", values, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2Between(String value1, String value2) {
            addCriterion("des2 between", value1, value2, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2NotBetween(String value1, String value2) {
            addCriterion("des2 not between", value1, value2, "des2");
            return (Criteria) this;
        }

        public Criteria andDes3IsNull() {
            addCriterion("des3 is null");
            return (Criteria) this;
        }

        public Criteria andDes3IsNotNull() {
            addCriterion("des3 is not null");
            return (Criteria) this;
        }

        public Criteria andDes3EqualTo(String value) {
            addCriterion("des3 =", value, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3NotEqualTo(String value) {
            addCriterion("des3 <>", value, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3GreaterThan(String value) {
            addCriterion("des3 >", value, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3GreaterThanOrEqualTo(String value) {
            addCriterion("des3 >=", value, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3LessThan(String value) {
            addCriterion("des3 <", value, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3LessThanOrEqualTo(String value) {
            addCriterion("des3 <=", value, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3Like(String value) {
            addCriterion("des3 like", value, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3NotLike(String value) {
            addCriterion("des3 not like", value, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3In(List<String> values) {
            addCriterion("des3 in", values, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3NotIn(List<String> values) {
            addCriterion("des3 not in", values, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3Between(String value1, String value2) {
            addCriterion("des3 between", value1, value2, "des3");
            return (Criteria) this;
        }

        public Criteria andDes3NotBetween(String value1, String value2) {
            addCriterion("des3 not between", value1, value2, "des3");
            return (Criteria) this;
        }

        public Criteria andDes4IsNull() {
            addCriterion("des4 is null");
            return (Criteria) this;
        }

        public Criteria andDes4IsNotNull() {
            addCriterion("des4 is not null");
            return (Criteria) this;
        }

        public Criteria andDes4EqualTo(String value) {
            addCriterion("des4 =", value, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4NotEqualTo(String value) {
            addCriterion("des4 <>", value, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4GreaterThan(String value) {
            addCriterion("des4 >", value, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4GreaterThanOrEqualTo(String value) {
            addCriterion("des4 >=", value, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4LessThan(String value) {
            addCriterion("des4 <", value, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4LessThanOrEqualTo(String value) {
            addCriterion("des4 <=", value, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4Like(String value) {
            addCriterion("des4 like", value, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4NotLike(String value) {
            addCriterion("des4 not like", value, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4In(List<String> values) {
            addCriterion("des4 in", values, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4NotIn(List<String> values) {
            addCriterion("des4 not in", values, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4Between(String value1, String value2) {
            addCriterion("des4 between", value1, value2, "des4");
            return (Criteria) this;
        }

        public Criteria andDes4NotBetween(String value1, String value2) {
            addCriterion("des4 not between", value1, value2, "des4");
            return (Criteria) this;
        }

        public Criteria andRepeatextractIsNull() {
            addCriterion("repeatExtract is null");
            return (Criteria) this;
        }

        public Criteria andRepeatextractIsNotNull() {
            addCriterion("repeatExtract is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatextractEqualTo(String value) {
            addCriterion("repeatExtract =", value, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractNotEqualTo(String value) {
            addCriterion("repeatExtract <>", value, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractGreaterThan(String value) {
            addCriterion("repeatExtract >", value, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractGreaterThanOrEqualTo(String value) {
            addCriterion("repeatExtract >=", value, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractLessThan(String value) {
            addCriterion("repeatExtract <", value, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractLessThanOrEqualTo(String value) {
            addCriterion("repeatExtract <=", value, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractLike(String value) {
            addCriterion("repeatExtract like", value, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractNotLike(String value) {
            addCriterion("repeatExtract not like", value, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractIn(List<String> values) {
            addCriterion("repeatExtract in", values, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractNotIn(List<String> values) {
            addCriterion("repeatExtract not in", values, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractBetween(String value1, String value2) {
            addCriterion("repeatExtract between", value1, value2, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andRepeatextractNotBetween(String value1, String value2) {
            addCriterion("repeatExtract not between", value1, value2, "repeatextract");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleIsNull() {
            addCriterion("finishedTitle is null");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleIsNotNull() {
            addCriterion("finishedTitle is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleEqualTo(String value) {
            addCriterion("finishedTitle =", value, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleNotEqualTo(String value) {
            addCriterion("finishedTitle <>", value, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleGreaterThan(String value) {
            addCriterion("finishedTitle >", value, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleGreaterThanOrEqualTo(String value) {
            addCriterion("finishedTitle >=", value, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleLessThan(String value) {
            addCriterion("finishedTitle <", value, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleLessThanOrEqualTo(String value) {
            addCriterion("finishedTitle <=", value, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleLike(String value) {
            addCriterion("finishedTitle like", value, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleNotLike(String value) {
            addCriterion("finishedTitle not like", value, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleIn(List<String> values) {
            addCriterion("finishedTitle in", values, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleNotIn(List<String> values) {
            addCriterion("finishedTitle not in", values, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleBetween(String value1, String value2) {
            addCriterion("finishedTitle between", value1, value2, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinishedtitleNotBetween(String value1, String value2) {
            addCriterion("finishedTitle not between", value1, value2, "finishedtitle");
            return (Criteria) this;
        }

        public Criteria andFinisheddescIsNull() {
            addCriterion("finishedDesc is null");
            return (Criteria) this;
        }

        public Criteria andFinisheddescIsNotNull() {
            addCriterion("finishedDesc is not null");
            return (Criteria) this;
        }

        public Criteria andFinisheddescEqualTo(String value) {
            addCriterion("finishedDesc =", value, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescNotEqualTo(String value) {
            addCriterion("finishedDesc <>", value, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescGreaterThan(String value) {
            addCriterion("finishedDesc >", value, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescGreaterThanOrEqualTo(String value) {
            addCriterion("finishedDesc >=", value, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescLessThan(String value) {
            addCriterion("finishedDesc <", value, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescLessThanOrEqualTo(String value) {
            addCriterion("finishedDesc <=", value, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescLike(String value) {
            addCriterion("finishedDesc like", value, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescNotLike(String value) {
            addCriterion("finishedDesc not like", value, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescIn(List<String> values) {
            addCriterion("finishedDesc in", values, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescNotIn(List<String> values) {
            addCriterion("finishedDesc not in", values, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescBetween(String value1, String value2) {
            addCriterion("finishedDesc between", value1, value2, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andFinisheddescNotBetween(String value1, String value2) {
            addCriterion("finishedDesc not between", value1, value2, "finisheddesc");
            return (Criteria) this;
        }

        public Criteria andPersonnumsIsNull() {
            addCriterion("personNums is null");
            return (Criteria) this;
        }

        public Criteria andPersonnumsIsNotNull() {
            addCriterion("personNums is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnumsEqualTo(Long value) {
            addCriterion("personNums =", value, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsNotEqualTo(Long value) {
            addCriterion("personNums <>", value, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsGreaterThan(Long value) {
            addCriterion("personNums >", value, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsGreaterThanOrEqualTo(Long value) {
            addCriterion("personNums >=", value, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsLessThan(Long value) {
            addCriterion("personNums <", value, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsLessThanOrEqualTo(Long value) {
            addCriterion("personNums <=", value, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsIn(List<Long> values) {
            addCriterion("personNums in", values, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsNotIn(List<Long> values) {
            addCriterion("personNums not in", values, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsBetween(Long value1, Long value2) {
            addCriterion("personNums between", value1, value2, "personnums");
            return (Criteria) this;
        }

        public Criteria andPersonnumsNotBetween(Long value1, Long value2) {
            addCriterion("personNums not between", value1, value2, "personnums");
            return (Criteria) this;
        }

        public Criteria andAllowmaxIsNull() {
            addCriterion("allowMax is null");
            return (Criteria) this;
        }

        public Criteria andAllowmaxIsNotNull() {
            addCriterion("allowMax is not null");
            return (Criteria) this;
        }

        public Criteria andAllowmaxEqualTo(Byte value) {
            addCriterion("allowMax =", value, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxNotEqualTo(Byte value) {
            addCriterion("allowMax <>", value, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxGreaterThan(Byte value) {
            addCriterion("allowMax >", value, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxGreaterThanOrEqualTo(Byte value) {
            addCriterion("allowMax >=", value, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxLessThan(Byte value) {
            addCriterion("allowMax <", value, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxLessThanOrEqualTo(Byte value) {
            addCriterion("allowMax <=", value, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxIn(List<Byte> values) {
            addCriterion("allowMax in", values, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxNotIn(List<Byte> values) {
            addCriterion("allowMax not in", values, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxBetween(Byte value1, Byte value2) {
            addCriterion("allowMax between", value1, value2, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowmaxNotBetween(Byte value1, Byte value2) {
            addCriterion("allowMax not between", value1, value2, "allowmax");
            return (Criteria) this;
        }

        public Criteria andAllowperdayIsNull() {
            addCriterion("allowPerDay is null");
            return (Criteria) this;
        }

        public Criteria andAllowperdayIsNotNull() {
            addCriterion("allowPerDay is not null");
            return (Criteria) this;
        }

        public Criteria andAllowperdayEqualTo(Byte value) {
            addCriterion("allowPerDay =", value, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayNotEqualTo(Byte value) {
            addCriterion("allowPerDay <>", value, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayGreaterThan(Byte value) {
            addCriterion("allowPerDay >", value, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayGreaterThanOrEqualTo(Byte value) {
            addCriterion("allowPerDay >=", value, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayLessThan(Byte value) {
            addCriterion("allowPerDay <", value, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayLessThanOrEqualTo(Byte value) {
            addCriterion("allowPerDay <=", value, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayIn(List<Byte> values) {
            addCriterion("allowPerDay in", values, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayNotIn(List<Byte> values) {
            addCriterion("allowPerDay not in", values, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayBetween(Byte value1, Byte value2) {
            addCriterion("allowPerDay between", value1, value2, "allowperday");
            return (Criteria) this;
        }

        public Criteria andAllowperdayNotBetween(Byte value1, Byte value2) {
            addCriterion("allowPerDay not between", value1, value2, "allowperday");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassIsNull() {
            addCriterion("duiJiangPass is null");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassIsNotNull() {
            addCriterion("duiJiangPass is not null");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassEqualTo(String value) {
            addCriterion("duiJiangPass =", value, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassNotEqualTo(String value) {
            addCriterion("duiJiangPass <>", value, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassGreaterThan(String value) {
            addCriterion("duiJiangPass >", value, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassGreaterThanOrEqualTo(String value) {
            addCriterion("duiJiangPass >=", value, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassLessThan(String value) {
            addCriterion("duiJiangPass <", value, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassLessThanOrEqualTo(String value) {
            addCriterion("duiJiangPass <=", value, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassLike(String value) {
            addCriterion("duiJiangPass like", value, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassNotLike(String value) {
            addCriterion("duiJiangPass not like", value, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassIn(List<String> values) {
            addCriterion("duiJiangPass in", values, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassNotIn(List<String> values) {
            addCriterion("duiJiangPass not in", values, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassBetween(String value1, String value2) {
            addCriterion("duiJiangPass between", value1, value2, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andDuijiangpassNotBetween(String value1, String value2) {
            addCriterion("duiJiangPass not between", value1, value2, "duijiangpass");
            return (Criteria) this;
        }

        public Criteria andSncoderenameIsNull() {
            addCriterion("snCodeReName is null");
            return (Criteria) this;
        }

        public Criteria andSncoderenameIsNotNull() {
            addCriterion("snCodeReName is not null");
            return (Criteria) this;
        }

        public Criteria andSncoderenameEqualTo(String value) {
            addCriterion("snCodeReName =", value, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameNotEqualTo(String value) {
            addCriterion("snCodeReName <>", value, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameGreaterThan(String value) {
            addCriterion("snCodeReName >", value, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameGreaterThanOrEqualTo(String value) {
            addCriterion("snCodeReName >=", value, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameLessThan(String value) {
            addCriterion("snCodeReName <", value, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameLessThanOrEqualTo(String value) {
            addCriterion("snCodeReName <=", value, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameLike(String value) {
            addCriterion("snCodeReName like", value, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameNotLike(String value) {
            addCriterion("snCodeReName not like", value, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameIn(List<String> values) {
            addCriterion("snCodeReName in", values, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameNotIn(List<String> values) {
            addCriterion("snCodeReName not in", values, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameBetween(String value1, String value2) {
            addCriterion("snCodeReName between", value1, value2, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andSncoderenameNotBetween(String value1, String value2) {
            addCriterion("snCodeReName not between", value1, value2, "sncoderename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameIsNull() {
            addCriterion("mobileReName is null");
            return (Criteria) this;
        }

        public Criteria andMobilerenameIsNotNull() {
            addCriterion("mobileReName is not null");
            return (Criteria) this;
        }

        public Criteria andMobilerenameEqualTo(String value) {
            addCriterion("mobileReName =", value, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameNotEqualTo(String value) {
            addCriterion("mobileReName <>", value, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameGreaterThan(String value) {
            addCriterion("mobileReName >", value, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameGreaterThanOrEqualTo(String value) {
            addCriterion("mobileReName >=", value, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameLessThan(String value) {
            addCriterion("mobileReName <", value, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameLessThanOrEqualTo(String value) {
            addCriterion("mobileReName <=", value, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameLike(String value) {
            addCriterion("mobileReName like", value, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameNotLike(String value) {
            addCriterion("mobileReName not like", value, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameIn(List<String> values) {
            addCriterion("mobileReName in", values, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameNotIn(List<String> values) {
            addCriterion("mobileReName not in", values, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameBetween(String value1, String value2) {
            addCriterion("mobileReName between", value1, value2, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andMobilerenameNotBetween(String value1, String value2) {
            addCriterion("mobileReName not between", value1, value2, "mobilerename");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsIsNull() {
            addCriterion("isDisplayAwardNums is null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsIsNotNull() {
            addCriterion("isDisplayAwardNums is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsEqualTo(Byte value) {
            addCriterion("isDisplayAwardNums =", value, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsNotEqualTo(Byte value) {
            addCriterion("isDisplayAwardNums <>", value, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsGreaterThan(Byte value) {
            addCriterion("isDisplayAwardNums >", value, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDisplayAwardNums >=", value, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsLessThan(Byte value) {
            addCriterion("isDisplayAwardNums <", value, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsLessThanOrEqualTo(Byte value) {
            addCriterion("isDisplayAwardNums <=", value, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsIn(List<Byte> values) {
            addCriterion("isDisplayAwardNums in", values, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsNotIn(List<Byte> values) {
            addCriterion("isDisplayAwardNums not in", values, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsBetween(Byte value1, Byte value2) {
            addCriterion("isDisplayAwardNums between", value1, value2, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andIsdisplayawardnumsNotBetween(Byte value1, Byte value2) {
            addCriterion("isDisplayAwardNums not between", value1, value2, "isdisplayawardnums");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeIsNull() {
            addCriterion("defaultPrize is null");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeIsNotNull() {
            addCriterion("defaultPrize is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeEqualTo(String value) {
            addCriterion("defaultPrize =", value, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeNotEqualTo(String value) {
            addCriterion("defaultPrize <>", value, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeGreaterThan(String value) {
            addCriterion("defaultPrize >", value, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeGreaterThanOrEqualTo(String value) {
            addCriterion("defaultPrize >=", value, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeLessThan(String value) {
            addCriterion("defaultPrize <", value, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeLessThanOrEqualTo(String value) {
            addCriterion("defaultPrize <=", value, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeLike(String value) {
            addCriterion("defaultPrize like", value, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeNotLike(String value) {
            addCriterion("defaultPrize not like", value, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeIn(List<String> values) {
            addCriterion("defaultPrize in", values, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeNotIn(List<String> values) {
            addCriterion("defaultPrize not in", values, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeBetween(String value1, String value2) {
            addCriterion("defaultPrize between", value1, value2, "defaultprize");
            return (Criteria) this;
        }

        public Criteria andDefaultprizeNotBetween(String value1, String value2) {
            addCriterion("defaultPrize not between", value1, value2, "defaultprize");
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

        public Criteria andFireprizeIsNull() {
            addCriterion("firePrize is null");
            return (Criteria) this;
        }

        public Criteria andFireprizeIsNotNull() {
            addCriterion("firePrize is not null");
            return (Criteria) this;
        }

        public Criteria andFireprizeEqualTo(Date value) {
            addCriterion("firePrize =", value, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeNotEqualTo(Date value) {
            addCriterion("firePrize <>", value, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeGreaterThan(Date value) {
            addCriterion("firePrize >", value, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeGreaterThanOrEqualTo(Date value) {
            addCriterion("firePrize >=", value, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeLessThan(Date value) {
            addCriterion("firePrize <", value, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeLessThanOrEqualTo(Date value) {
            addCriterion("firePrize <=", value, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeIn(List<Date> values) {
            addCriterion("firePrize in", values, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeNotIn(List<Date> values) {
            addCriterion("firePrize not in", values, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeBetween(Date value1, Date value2) {
            addCriterion("firePrize between", value1, value2, "fireprize");
            return (Criteria) this;
        }

        public Criteria andFireprizeNotBetween(Date value1, Date value2) {
            addCriterion("firePrize not between", value1, value2, "fireprize");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateIsNull() {
            addCriterion("snCodeGenerate is null");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateIsNotNull() {
            addCriterion("snCodeGenerate is not null");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateEqualTo(Byte value) {
            addCriterion("snCodeGenerate =", value, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateNotEqualTo(Byte value) {
            addCriterion("snCodeGenerate <>", value, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateGreaterThan(Byte value) {
            addCriterion("snCodeGenerate >", value, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateGreaterThanOrEqualTo(Byte value) {
            addCriterion("snCodeGenerate >=", value, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateLessThan(Byte value) {
            addCriterion("snCodeGenerate <", value, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateLessThanOrEqualTo(Byte value) {
            addCriterion("snCodeGenerate <=", value, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateIn(List<Byte> values) {
            addCriterion("snCodeGenerate in", values, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateNotIn(List<Byte> values) {
            addCriterion("snCodeGenerate not in", values, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateBetween(Byte value1, Byte value2) {
            addCriterion("snCodeGenerate between", value1, value2, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andSncodegenerateNotBetween(Byte value1, Byte value2) {
            addCriterion("snCodeGenerate not between", value1, value2, "sncodegenerate");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgIsNull() {
            addCriterion("activityStartImg is null");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgIsNotNull() {
            addCriterion("activityStartImg is not null");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgEqualTo(String value) {
            addCriterion("activityStartImg =", value, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgNotEqualTo(String value) {
            addCriterion("activityStartImg <>", value, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgGreaterThan(String value) {
            addCriterion("activityStartImg >", value, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgGreaterThanOrEqualTo(String value) {
            addCriterion("activityStartImg >=", value, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgLessThan(String value) {
            addCriterion("activityStartImg <", value, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgLessThanOrEqualTo(String value) {
            addCriterion("activityStartImg <=", value, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgLike(String value) {
            addCriterion("activityStartImg like", value, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgNotLike(String value) {
            addCriterion("activityStartImg not like", value, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgIn(List<String> values) {
            addCriterion("activityStartImg in", values, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgNotIn(List<String> values) {
            addCriterion("activityStartImg not in", values, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgBetween(String value1, String value2) {
            addCriterion("activityStartImg between", value1, value2, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivitystartimgNotBetween(String value1, String value2) {
            addCriterion("activityStartImg not between", value1, value2, "activitystartimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgIsNull() {
            addCriterion("activityEndImg is null");
            return (Criteria) this;
        }

        public Criteria andActivityendimgIsNotNull() {
            addCriterion("activityEndImg is not null");
            return (Criteria) this;
        }

        public Criteria andActivityendimgEqualTo(String value) {
            addCriterion("activityEndImg =", value, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgNotEqualTo(String value) {
            addCriterion("activityEndImg <>", value, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgGreaterThan(String value) {
            addCriterion("activityEndImg >", value, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgGreaterThanOrEqualTo(String value) {
            addCriterion("activityEndImg >=", value, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgLessThan(String value) {
            addCriterion("activityEndImg <", value, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgLessThanOrEqualTo(String value) {
            addCriterion("activityEndImg <=", value, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgLike(String value) {
            addCriterion("activityEndImg like", value, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgNotLike(String value) {
            addCriterion("activityEndImg not like", value, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgIn(List<String> values) {
            addCriterion("activityEndImg in", values, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgNotIn(List<String> values) {
            addCriterion("activityEndImg not in", values, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgBetween(String value1, String value2) {
            addCriterion("activityEndImg between", value1, value2, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivityendimgNotBetween(String value1, String value2) {
            addCriterion("activityEndImg not between", value1, value2, "activityendimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgIsNull() {
            addCriterion("activityWinImg is null");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgIsNotNull() {
            addCriterion("activityWinImg is not null");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgEqualTo(String value) {
            addCriterion("activityWinImg =", value, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgNotEqualTo(String value) {
            addCriterion("activityWinImg <>", value, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgGreaterThan(String value) {
            addCriterion("activityWinImg >", value, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgGreaterThanOrEqualTo(String value) {
            addCriterion("activityWinImg >=", value, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgLessThan(String value) {
            addCriterion("activityWinImg <", value, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgLessThanOrEqualTo(String value) {
            addCriterion("activityWinImg <=", value, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgLike(String value) {
            addCriterion("activityWinImg like", value, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgNotLike(String value) {
            addCriterion("activityWinImg not like", value, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgIn(List<String> values) {
            addCriterion("activityWinImg in", values, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgNotIn(List<String> values) {
            addCriterion("activityWinImg not in", values, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgBetween(String value1, String value2) {
            addCriterion("activityWinImg between", value1, value2, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinimgNotBetween(String value1, String value2) {
            addCriterion("activityWinImg not between", value1, value2, "activitywinimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgIsNull() {
            addCriterion("activityWinLinkImg is null");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgIsNotNull() {
            addCriterion("activityWinLinkImg is not null");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgEqualTo(String value) {
            addCriterion("activityWinLinkImg =", value, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgNotEqualTo(String value) {
            addCriterion("activityWinLinkImg <>", value, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgGreaterThan(String value) {
            addCriterion("activityWinLinkImg >", value, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgGreaterThanOrEqualTo(String value) {
            addCriterion("activityWinLinkImg >=", value, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgLessThan(String value) {
            addCriterion("activityWinLinkImg <", value, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgLessThanOrEqualTo(String value) {
            addCriterion("activityWinLinkImg <=", value, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgLike(String value) {
            addCriterion("activityWinLinkImg like", value, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgNotLike(String value) {
            addCriterion("activityWinLinkImg not like", value, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgIn(List<String> values) {
            addCriterion("activityWinLinkImg in", values, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgNotIn(List<String> values) {
            addCriterion("activityWinLinkImg not in", values, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgBetween(String value1, String value2) {
            addCriterion("activityWinLinkImg between", value1, value2, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitywinlinkimgNotBetween(String value1, String value2) {
            addCriterion("activityWinLinkImg not between", value1, value2, "activitywinlinkimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgIsNull() {
            addCriterion("activityBgImg is null");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgIsNotNull() {
            addCriterion("activityBgImg is not null");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgEqualTo(String value) {
            addCriterion("activityBgImg =", value, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgNotEqualTo(String value) {
            addCriterion("activityBgImg <>", value, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgGreaterThan(String value) {
            addCriterion("activityBgImg >", value, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgGreaterThanOrEqualTo(String value) {
            addCriterion("activityBgImg >=", value, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgLessThan(String value) {
            addCriterion("activityBgImg <", value, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgLessThanOrEqualTo(String value) {
            addCriterion("activityBgImg <=", value, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgLike(String value) {
            addCriterion("activityBgImg like", value, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgNotLike(String value) {
            addCriterion("activityBgImg not like", value, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgIn(List<String> values) {
            addCriterion("activityBgImg in", values, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgNotIn(List<String> values) {
            addCriterion("activityBgImg not in", values, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgBetween(String value1, String value2) {
            addCriterion("activityBgImg between", value1, value2, "activitybgimg");
            return (Criteria) this;
        }

        public Criteria andActivitybgimgNotBetween(String value1, String value2) {
            addCriterion("activityBgImg not between", value1, value2, "activitybgimg");
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