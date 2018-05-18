package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class ZjGrqzdjbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZjGrqzdjbExample() {
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

        public Criteria andQzbhIsNull() {
            addCriterion("qzbh is null");
            return (Criteria) this;
        }

        public Criteria andQzbhIsNotNull() {
            addCriterion("qzbh is not null");
            return (Criteria) this;
        }

        public Criteria andQzbhEqualTo(String value) {
            addCriterion("qzbh =", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhNotEqualTo(String value) {
            addCriterion("qzbh <>", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhGreaterThan(String value) {
            addCriterion("qzbh >", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhGreaterThanOrEqualTo(String value) {
            addCriterion("qzbh >=", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhLessThan(String value) {
            addCriterion("qzbh <", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhLessThanOrEqualTo(String value) {
            addCriterion("qzbh <=", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhLike(String value) {
            addCriterion("qzbh like", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhNotLike(String value) {
            addCriterion("qzbh not like", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhIn(List<String> values) {
            addCriterion("qzbh in", values, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhNotIn(List<String> values) {
            addCriterion("qzbh not in", values, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhBetween(String value1, String value2) {
            addCriterion("qzbh between", value1, value2, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhNotBetween(String value1, String value2) {
            addCriterion("qzbh not between", value1, value2, "qzbh");
            return (Criteria) this;
        }

        public Criteria andBipIdIsNull() {
            addCriterion("bip_id is null");
            return (Criteria) this;
        }

        public Criteria andBipIdIsNotNull() {
            addCriterion("bip_id is not null");
            return (Criteria) this;
        }

        public Criteria andBipIdEqualTo(String value) {
            addCriterion("bip_id =", value, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdNotEqualTo(String value) {
            addCriterion("bip_id <>", value, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdGreaterThan(String value) {
            addCriterion("bip_id >", value, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdGreaterThanOrEqualTo(String value) {
            addCriterion("bip_id >=", value, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdLessThan(String value) {
            addCriterion("bip_id <", value, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdLessThanOrEqualTo(String value) {
            addCriterion("bip_id <=", value, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdLike(String value) {
            addCriterion("bip_id like", value, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdNotLike(String value) {
            addCriterion("bip_id not like", value, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdIn(List<String> values) {
            addCriterion("bip_id in", values, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdNotIn(List<String> values) {
            addCriterion("bip_id not in", values, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdBetween(String value1, String value2) {
            addCriterion("bip_id between", value1, value2, "bipId");
            return (Criteria) this;
        }

        public Criteria andBipIdNotBetween(String value1, String value2) {
            addCriterion("bip_id not between", value1, value2, "bipId");
            return (Criteria) this;
        }

        public Criteria andDwxxIsNull() {
            addCriterion("dwxx is null");
            return (Criteria) this;
        }

        public Criteria andDwxxIsNotNull() {
            addCriterion("dwxx is not null");
            return (Criteria) this;
        }

        public Criteria andDwxxEqualTo(String value) {
            addCriterion("dwxx =", value, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxNotEqualTo(String value) {
            addCriterion("dwxx <>", value, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxGreaterThan(String value) {
            addCriterion("dwxx >", value, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxGreaterThanOrEqualTo(String value) {
            addCriterion("dwxx >=", value, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxLessThan(String value) {
            addCriterion("dwxx <", value, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxLessThanOrEqualTo(String value) {
            addCriterion("dwxx <=", value, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxLike(String value) {
            addCriterion("dwxx like", value, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxNotLike(String value) {
            addCriterion("dwxx not like", value, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxIn(List<String> values) {
            addCriterion("dwxx in", values, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxNotIn(List<String> values) {
            addCriterion("dwxx not in", values, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxBetween(String value1, String value2) {
            addCriterion("dwxx between", value1, value2, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwxxNotBetween(String value1, String value2) {
            addCriterion("dwxx not between", value1, value2, "dwxx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxIsNull() {
            addCriterion("dwjjlx is null");
            return (Criteria) this;
        }

        public Criteria andDwjjlxIsNotNull() {
            addCriterion("dwjjlx is not null");
            return (Criteria) this;
        }

        public Criteria andDwjjlxEqualTo(String value) {
            addCriterion("dwjjlx =", value, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxNotEqualTo(String value) {
            addCriterion("dwjjlx <>", value, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxGreaterThan(String value) {
            addCriterion("dwjjlx >", value, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxGreaterThanOrEqualTo(String value) {
            addCriterion("dwjjlx >=", value, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxLessThan(String value) {
            addCriterion("dwjjlx <", value, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxLessThanOrEqualTo(String value) {
            addCriterion("dwjjlx <=", value, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxLike(String value) {
            addCriterion("dwjjlx like", value, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxNotLike(String value) {
            addCriterion("dwjjlx not like", value, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxIn(List<String> values) {
            addCriterion("dwjjlx in", values, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxNotIn(List<String> values) {
            addCriterion("dwjjlx not in", values, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxBetween(String value1, String value2) {
            addCriterion("dwjjlx between", value1, value2, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwjjlxNotBetween(String value1, String value2) {
            addCriterion("dwjjlx not between", value1, value2, "dwjjlx");
            return (Criteria) this;
        }

        public Criteria andDwhyIsNull() {
            addCriterion("dwhy is null");
            return (Criteria) this;
        }

        public Criteria andDwhyIsNotNull() {
            addCriterion("dwhy is not null");
            return (Criteria) this;
        }

        public Criteria andDwhyEqualTo(String value) {
            addCriterion("dwhy =", value, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyNotEqualTo(String value) {
            addCriterion("dwhy <>", value, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyGreaterThan(String value) {
            addCriterion("dwhy >", value, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyGreaterThanOrEqualTo(String value) {
            addCriterion("dwhy >=", value, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyLessThan(String value) {
            addCriterion("dwhy <", value, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyLessThanOrEqualTo(String value) {
            addCriterion("dwhy <=", value, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyLike(String value) {
            addCriterion("dwhy like", value, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyNotLike(String value) {
            addCriterion("dwhy not like", value, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyIn(List<String> values) {
            addCriterion("dwhy in", values, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyNotIn(List<String> values) {
            addCriterion("dwhy not in", values, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyBetween(String value1, String value2) {
            addCriterion("dwhy between", value1, value2, "dwhy");
            return (Criteria) this;
        }

        public Criteria andDwhyNotBetween(String value1, String value2) {
            addCriterion("dwhy not between", value1, value2, "dwhy");
            return (Criteria) this;
        }

        public Criteria andGzdqIsNull() {
            addCriterion("gzdq is null");
            return (Criteria) this;
        }

        public Criteria andGzdqIsNotNull() {
            addCriterion("gzdq is not null");
            return (Criteria) this;
        }

        public Criteria andGzdqEqualTo(String value) {
            addCriterion("gzdq =", value, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqNotEqualTo(String value) {
            addCriterion("gzdq <>", value, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqGreaterThan(String value) {
            addCriterion("gzdq >", value, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqGreaterThanOrEqualTo(String value) {
            addCriterion("gzdq >=", value, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqLessThan(String value) {
            addCriterion("gzdq <", value, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqLessThanOrEqualTo(String value) {
            addCriterion("gzdq <=", value, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqLike(String value) {
            addCriterion("gzdq like", value, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqNotLike(String value) {
            addCriterion("gzdq not like", value, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqIn(List<String> values) {
            addCriterion("gzdq in", values, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqNotIn(List<String> values) {
            addCriterion("gzdq not in", values, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqBetween(String value1, String value2) {
            addCriterion("gzdq between", value1, value2, "gzdq");
            return (Criteria) this;
        }

        public Criteria andGzdqNotBetween(String value1, String value2) {
            addCriterion("gzdq not between", value1, value2, "gzdq");
            return (Criteria) this;
        }

        public Criteria andSfdjIsNull() {
            addCriterion("SFDJ is null");
            return (Criteria) this;
        }

        public Criteria andSfdjIsNotNull() {
            addCriterion("SFDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSfdjEqualTo(String value) {
            addCriterion("SFDJ =", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjNotEqualTo(String value) {
            addCriterion("SFDJ <>", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjGreaterThan(String value) {
            addCriterion("SFDJ >", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjGreaterThanOrEqualTo(String value) {
            addCriterion("SFDJ >=", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjLessThan(String value) {
            addCriterion("SFDJ <", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjLessThanOrEqualTo(String value) {
            addCriterion("SFDJ <=", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjLike(String value) {
            addCriterion("SFDJ like", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjNotLike(String value) {
            addCriterion("SFDJ not like", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjIn(List<String> values) {
            addCriterion("SFDJ in", values, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjNotIn(List<String> values) {
            addCriterion("SFDJ not in", values, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjBetween(String value1, String value2) {
            addCriterion("SFDJ between", value1, value2, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjNotBetween(String value1, String value2) {
            addCriterion("SFDJ not between", value1, value2, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfjsdxIsNull() {
            addCriterion("SFJSDX is null");
            return (Criteria) this;
        }

        public Criteria andSfjsdxIsNotNull() {
            addCriterion("SFJSDX is not null");
            return (Criteria) this;
        }

        public Criteria andSfjsdxEqualTo(String value) {
            addCriterion("SFJSDX =", value, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxNotEqualTo(String value) {
            addCriterion("SFJSDX <>", value, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxGreaterThan(String value) {
            addCriterion("SFJSDX >", value, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxGreaterThanOrEqualTo(String value) {
            addCriterion("SFJSDX >=", value, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxLessThan(String value) {
            addCriterion("SFJSDX <", value, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxLessThanOrEqualTo(String value) {
            addCriterion("SFJSDX <=", value, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxLike(String value) {
            addCriterion("SFJSDX like", value, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxNotLike(String value) {
            addCriterion("SFJSDX not like", value, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxIn(List<String> values) {
            addCriterion("SFJSDX in", values, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxNotIn(List<String> values) {
            addCriterion("SFJSDX not in", values, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxBetween(String value1, String value2) {
            addCriterion("SFJSDX between", value1, value2, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfjsdxNotBetween(String value1, String value2) {
            addCriterion("SFJSDX not between", value1, value2, "sfjsdx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxIsNull() {
            addCriterion("SFCJPX is null");
            return (Criteria) this;
        }

        public Criteria andSfcjpxIsNotNull() {
            addCriterion("SFCJPX is not null");
            return (Criteria) this;
        }

        public Criteria andSfcjpxEqualTo(String value) {
            addCriterion("SFCJPX =", value, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxNotEqualTo(String value) {
            addCriterion("SFCJPX <>", value, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxGreaterThan(String value) {
            addCriterion("SFCJPX >", value, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxGreaterThanOrEqualTo(String value) {
            addCriterion("SFCJPX >=", value, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxLessThan(String value) {
            addCriterion("SFCJPX <", value, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxLessThanOrEqualTo(String value) {
            addCriterion("SFCJPX <=", value, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxLike(String value) {
            addCriterion("SFCJPX like", value, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxNotLike(String value) {
            addCriterion("SFCJPX not like", value, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxIn(List<String> values) {
            addCriterion("SFCJPX in", values, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxNotIn(List<String> values) {
            addCriterion("SFCJPX not in", values, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxBetween(String value1, String value2) {
            addCriterion("SFCJPX between", value1, value2, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfcjpxNotBetween(String value1, String value2) {
            addCriterion("SFCJPX not between", value1, value2, "sfcjpx");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdIsNull() {
            addCriterion("SFJSZYZD is null");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdIsNotNull() {
            addCriterion("SFJSZYZD is not null");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdEqualTo(String value) {
            addCriterion("SFJSZYZD =", value, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdNotEqualTo(String value) {
            addCriterion("SFJSZYZD <>", value, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdGreaterThan(String value) {
            addCriterion("SFJSZYZD >", value, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdGreaterThanOrEqualTo(String value) {
            addCriterion("SFJSZYZD >=", value, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdLessThan(String value) {
            addCriterion("SFJSZYZD <", value, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdLessThanOrEqualTo(String value) {
            addCriterion("SFJSZYZD <=", value, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdLike(String value) {
            addCriterion("SFJSZYZD like", value, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdNotLike(String value) {
            addCriterion("SFJSZYZD not like", value, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdIn(List<String> values) {
            addCriterion("SFJSZYZD in", values, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdNotIn(List<String> values) {
            addCriterion("SFJSZYZD not in", values, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdBetween(String value1, String value2) {
            addCriterion("SFJSZYZD between", value1, value2, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andSfjszyzdNotBetween(String value1, String value2) {
            addCriterion("SFJSZYZD not between", value1, value2, "sfjszyzd");
            return (Criteria) this;
        }

        public Criteria andDjyxqIsNull() {
            addCriterion("djyxq is null");
            return (Criteria) this;
        }

        public Criteria andDjyxqIsNotNull() {
            addCriterion("djyxq is not null");
            return (Criteria) this;
        }

        public Criteria andDjyxqEqualTo(String value) {
            addCriterion("djyxq =", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotEqualTo(String value) {
            addCriterion("djyxq <>", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqGreaterThan(String value) {
            addCriterion("djyxq >", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("djyxq >=", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqLessThan(String value) {
            addCriterion("djyxq <", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqLessThanOrEqualTo(String value) {
            addCriterion("djyxq <=", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqLike(String value) {
            addCriterion("djyxq like", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotLike(String value) {
            addCriterion("djyxq not like", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqIn(List<String> values) {
            addCriterion("djyxq in", values, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotIn(List<String> values) {
            addCriterion("djyxq not in", values, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqBetween(String value1, String value2) {
            addCriterion("djyxq between", value1, value2, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotBetween(String value1, String value2) {
            addCriterion("djyxq not between", value1, value2, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNull() {
            addCriterion("DJSJ is null");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNotNull() {
            addCriterion("DJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjsjEqualTo(String value) {
            addCriterion("DJSJ =", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotEqualTo(String value) {
            addCriterion("DJSJ <>", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThan(String value) {
            addCriterion("DJSJ >", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThanOrEqualTo(String value) {
            addCriterion("DJSJ >=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThan(String value) {
            addCriterion("DJSJ <", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThanOrEqualTo(String value) {
            addCriterion("DJSJ <=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLike(String value) {
            addCriterion("DJSJ like", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotLike(String value) {
            addCriterion("DJSJ not like", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIn(List<String> values) {
            addCriterion("DJSJ in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotIn(List<String> values) {
            addCriterion("DJSJ not in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjBetween(String value1, String value2) {
            addCriterion("DJSJ between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotBetween(String value1, String value2) {
            addCriterion("DJSJ not between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andGdsjIsNull() {
            addCriterion("GDSJ is null");
            return (Criteria) this;
        }

        public Criteria andGdsjIsNotNull() {
            addCriterion("GDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGdsjEqualTo(String value) {
            addCriterion("GDSJ =", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotEqualTo(String value) {
            addCriterion("GDSJ <>", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjGreaterThan(String value) {
            addCriterion("GDSJ >", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjGreaterThanOrEqualTo(String value) {
            addCriterion("GDSJ >=", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjLessThan(String value) {
            addCriterion("GDSJ <", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjLessThanOrEqualTo(String value) {
            addCriterion("GDSJ <=", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjLike(String value) {
            addCriterion("GDSJ like", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotLike(String value) {
            addCriterion("GDSJ not like", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjIn(List<String> values) {
            addCriterion("GDSJ in", values, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotIn(List<String> values) {
            addCriterion("GDSJ not in", values, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjBetween(String value1, String value2) {
            addCriterion("GDSJ between", value1, value2, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotBetween(String value1, String value2) {
            addCriterion("GDSJ not between", value1, value2, "gdsj");
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