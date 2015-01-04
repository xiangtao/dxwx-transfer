package com.axj.apiw.model;

import java.util.ArrayList;
import java.util.List;

public class TinySiteHomepageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startIndex;

    protected Integer pageSize;

    public TinySiteHomepageExample() {
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

        public Criteria andCoverphotopathIsNull() {
            addCriterion("coverPhotoPath is null");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathIsNotNull() {
            addCriterion("coverPhotoPath is not null");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathEqualTo(String value) {
            addCriterion("coverPhotoPath =", value, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathNotEqualTo(String value) {
            addCriterion("coverPhotoPath <>", value, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathGreaterThan(String value) {
            addCriterion("coverPhotoPath >", value, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathGreaterThanOrEqualTo(String value) {
            addCriterion("coverPhotoPath >=", value, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathLessThan(String value) {
            addCriterion("coverPhotoPath <", value, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathLessThanOrEqualTo(String value) {
            addCriterion("coverPhotoPath <=", value, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathLike(String value) {
            addCriterion("coverPhotoPath like", value, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathNotLike(String value) {
            addCriterion("coverPhotoPath not like", value, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathIn(List<String> values) {
            addCriterion("coverPhotoPath in", values, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathNotIn(List<String> values) {
            addCriterion("coverPhotoPath not in", values, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathBetween(String value1, String value2) {
            addCriterion("coverPhotoPath between", value1, value2, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andCoverphotopathNotBetween(String value1, String value2) {
            addCriterion("coverPhotoPath not between", value1, value2, "coverphotopath");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgIsNull() {
            addCriterion("backgroundImg is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgIsNotNull() {
            addCriterion("backgroundImg is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgEqualTo(String value) {
            addCriterion("backgroundImg =", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgNotEqualTo(String value) {
            addCriterion("backgroundImg <>", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgGreaterThan(String value) {
            addCriterion("backgroundImg >", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgGreaterThanOrEqualTo(String value) {
            addCriterion("backgroundImg >=", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgLessThan(String value) {
            addCriterion("backgroundImg <", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgLessThanOrEqualTo(String value) {
            addCriterion("backgroundImg <=", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgLike(String value) {
            addCriterion("backgroundImg like", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgNotLike(String value) {
            addCriterion("backgroundImg not like", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgIn(List<String> values) {
            addCriterion("backgroundImg in", values, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgNotIn(List<String> values) {
            addCriterion("backgroundImg not in", values, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgBetween(String value1, String value2) {
            addCriterion("backgroundImg between", value1, value2, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgNotBetween(String value1, String value2) {
            addCriterion("backgroundImg not between", value1, value2, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andMusicurlIsNull() {
            addCriterion("musicUrl is null");
            return (Criteria) this;
        }

        public Criteria andMusicurlIsNotNull() {
            addCriterion("musicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMusicurlEqualTo(String value) {
            addCriterion("musicUrl =", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlNotEqualTo(String value) {
            addCriterion("musicUrl <>", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlGreaterThan(String value) {
            addCriterion("musicUrl >", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlGreaterThanOrEqualTo(String value) {
            addCriterion("musicUrl >=", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlLessThan(String value) {
            addCriterion("musicUrl <", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlLessThanOrEqualTo(String value) {
            addCriterion("musicUrl <=", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlLike(String value) {
            addCriterion("musicUrl like", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlNotLike(String value) {
            addCriterion("musicUrl not like", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlIn(List<String> values) {
            addCriterion("musicUrl in", values, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlNotIn(List<String> values) {
            addCriterion("musicUrl not in", values, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlBetween(String value1, String value2) {
            addCriterion("musicUrl between", value1, value2, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlNotBetween(String value1, String value2) {
            addCriterion("musicUrl not between", value1, value2, "musicurl");
            return (Criteria) this;
        }

        public Criteria andFlashtypeIsNull() {
            addCriterion("flashType is null");
            return (Criteria) this;
        }

        public Criteria andFlashtypeIsNotNull() {
            addCriterion("flashType is not null");
            return (Criteria) this;
        }

        public Criteria andFlashtypeEqualTo(Byte value) {
            addCriterion("flashType =", value, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeNotEqualTo(Byte value) {
            addCriterion("flashType <>", value, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeGreaterThan(Byte value) {
            addCriterion("flashType >", value, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("flashType >=", value, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeLessThan(Byte value) {
            addCriterion("flashType <", value, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeLessThanOrEqualTo(Byte value) {
            addCriterion("flashType <=", value, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeIn(List<Byte> values) {
            addCriterion("flashType in", values, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeNotIn(List<Byte> values) {
            addCriterion("flashType not in", values, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeBetween(Byte value1, Byte value2) {
            addCriterion("flashType between", value1, value2, "flashtype");
            return (Criteria) this;
        }

        public Criteria andFlashtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("flashType not between", value1, value2, "flashtype");
            return (Criteria) this;
        }

        public Criteria andShotdescIsNull() {
            addCriterion("shotDesc is null");
            return (Criteria) this;
        }

        public Criteria andShotdescIsNotNull() {
            addCriterion("shotDesc is not null");
            return (Criteria) this;
        }

        public Criteria andShotdescEqualTo(String value) {
            addCriterion("shotDesc =", value, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescNotEqualTo(String value) {
            addCriterion("shotDesc <>", value, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescGreaterThan(String value) {
            addCriterion("shotDesc >", value, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescGreaterThanOrEqualTo(String value) {
            addCriterion("shotDesc >=", value, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescLessThan(String value) {
            addCriterion("shotDesc <", value, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescLessThanOrEqualTo(String value) {
            addCriterion("shotDesc <=", value, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescLike(String value) {
            addCriterion("shotDesc like", value, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescNotLike(String value) {
            addCriterion("shotDesc not like", value, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescIn(List<String> values) {
            addCriterion("shotDesc in", values, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescNotIn(List<String> values) {
            addCriterion("shotDesc not in", values, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescBetween(String value1, String value2) {
            addCriterion("shotDesc between", value1, value2, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andShotdescNotBetween(String value1, String value2) {
            addCriterion("shotDesc not between", value1, value2, "shotdesc");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("copyright not between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeIsNull() {
            addCriterion("statisticalCode is null");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeIsNotNull() {
            addCriterion("statisticalCode is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeEqualTo(String value) {
            addCriterion("statisticalCode =", value, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeNotEqualTo(String value) {
            addCriterion("statisticalCode <>", value, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeGreaterThan(String value) {
            addCriterion("statisticalCode >", value, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("statisticalCode >=", value, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeLessThan(String value) {
            addCriterion("statisticalCode <", value, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeLessThanOrEqualTo(String value) {
            addCriterion("statisticalCode <=", value, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeLike(String value) {
            addCriterion("statisticalCode like", value, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeNotLike(String value) {
            addCriterion("statisticalCode not like", value, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeIn(List<String> values) {
            addCriterion("statisticalCode in", values, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeNotIn(List<String> values) {
            addCriterion("statisticalCode not in", values, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeBetween(String value1, String value2) {
            addCriterion("statisticalCode between", value1, value2, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andStatisticalcodeNotBetween(String value1, String value2) {
            addCriterion("statisticalCode not between", value1, value2, "statisticalcode");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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