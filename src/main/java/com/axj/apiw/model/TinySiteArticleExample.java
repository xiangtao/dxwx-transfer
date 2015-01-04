package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.List;

public class TinySiteArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public TinySiteArticleExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Byte value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Byte value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Byte value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Byte value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Byte value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Byte value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Byte> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Byte> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Byte value1, Byte value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Byte value1, Byte value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathIsNull() {
            addCriterion("coverImgPath is null");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathIsNotNull() {
            addCriterion("coverImgPath is not null");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathEqualTo(String value) {
            addCriterion("coverImgPath =", value, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathNotEqualTo(String value) {
            addCriterion("coverImgPath <>", value, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathGreaterThan(String value) {
            addCriterion("coverImgPath >", value, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathGreaterThanOrEqualTo(String value) {
            addCriterion("coverImgPath >=", value, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathLessThan(String value) {
            addCriterion("coverImgPath <", value, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathLessThanOrEqualTo(String value) {
            addCriterion("coverImgPath <=", value, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathLike(String value) {
            addCriterion("coverImgPath like", value, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathNotLike(String value) {
            addCriterion("coverImgPath not like", value, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathIn(List<String> values) {
            addCriterion("coverImgPath in", values, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathNotIn(List<String> values) {
            addCriterion("coverImgPath not in", values, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathBetween(String value1, String value2) {
            addCriterion("coverImgPath between", value1, value2, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andCoverimgpathNotBetween(String value1, String value2) {
            addCriterion("coverImgPath not between", value1, value2, "coverimgpath");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverIsNull() {
            addCriterion("isShowCover is null");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverIsNotNull() {
            addCriterion("isShowCover is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverEqualTo(Byte value) {
            addCriterion("isShowCover =", value, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverNotEqualTo(Byte value) {
            addCriterion("isShowCover <>", value, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverGreaterThan(Byte value) {
            addCriterion("isShowCover >", value, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverGreaterThanOrEqualTo(Byte value) {
            addCriterion("isShowCover >=", value, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverLessThan(Byte value) {
            addCriterion("isShowCover <", value, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverLessThanOrEqualTo(Byte value) {
            addCriterion("isShowCover <=", value, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverIn(List<Byte> values) {
            addCriterion("isShowCover in", values, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverNotIn(List<Byte> values) {
            addCriterion("isShowCover not in", values, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverBetween(Byte value1, Byte value2) {
            addCriterion("isShowCover between", value1, value2, "isshowcover");
            return (Criteria) this;
        }

        public Criteria andIsshowcoverNotBetween(Byte value1, Byte value2) {
            addCriterion("isShowCover not between", value1, value2, "isshowcover");
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

        public Criteria andOutlinkIsNull() {
            addCriterion("outLink is null");
            return (Criteria) this;
        }

        public Criteria andOutlinkIsNotNull() {
            addCriterion("outLink is not null");
            return (Criteria) this;
        }

        public Criteria andOutlinkEqualTo(String value) {
            addCriterion("outLink =", value, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkNotEqualTo(String value) {
            addCriterion("outLink <>", value, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkGreaterThan(String value) {
            addCriterion("outLink >", value, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkGreaterThanOrEqualTo(String value) {
            addCriterion("outLink >=", value, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkLessThan(String value) {
            addCriterion("outLink <", value, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkLessThanOrEqualTo(String value) {
            addCriterion("outLink <=", value, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkLike(String value) {
            addCriterion("outLink like", value, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkNotLike(String value) {
            addCriterion("outLink not like", value, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkIn(List<String> values) {
            addCriterion("outLink in", values, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkNotIn(List<String> values) {
            addCriterion("outLink not in", values, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkBetween(String value1, String value2) {
            addCriterion("outLink between", value1, value2, "outlink");
            return (Criteria) this;
        }

        public Criteria andOutlinkNotBetween(String value1, String value2) {
            addCriterion("outLink not between", value1, value2, "outlink");
            return (Criteria) this;
        }
        
        
        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }
        public Criteria andOrderEqualTo(String value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(String value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }
        
        
        public Criteria andViewNumberIsNull() {
            addCriterion("viewNumber is null");
            return (Criteria) this;
        }

        public Criteria andViewNumberIsNotNull() {
            addCriterion("viewNumber is not null");
            return (Criteria) this;
        }
        
        public Criteria andViewNumberEqualTo(String value) {
            addCriterion("viewNumber =", value, "viewnumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberNotEqualTo(String value) {
            addCriterion("viewNumber <>", value, "viewnumber");
            return (Criteria) this;
        }
        
        public Criteria andWechatIdEqualTo(Long value) {
        	addCriterion("wechatId =", value, "wechatid");
        	return (Criteria) this;
        }
        
        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
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