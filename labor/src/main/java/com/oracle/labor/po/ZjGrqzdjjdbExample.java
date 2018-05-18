package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class ZjGrqzdjjdbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZjGrqzdjjdbExample() {
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

        public Criteria andGrdjjdbhIsNull() {
            addCriterion("GRDJJDBH is null");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhIsNotNull() {
            addCriterion("GRDJJDBH is not null");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhEqualTo(String value) {
            addCriterion("GRDJJDBH =", value, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhNotEqualTo(String value) {
            addCriterion("GRDJJDBH <>", value, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhGreaterThan(String value) {
            addCriterion("GRDJJDBH >", value, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhGreaterThanOrEqualTo(String value) {
            addCriterion("GRDJJDBH >=", value, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhLessThan(String value) {
            addCriterion("GRDJJDBH <", value, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhLessThanOrEqualTo(String value) {
            addCriterion("GRDJJDBH <=", value, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhLike(String value) {
            addCriterion("GRDJJDBH like", value, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhNotLike(String value) {
            addCriterion("GRDJJDBH not like", value, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhIn(List<String> values) {
            addCriterion("GRDJJDBH in", values, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhNotIn(List<String> values) {
            addCriterion("GRDJJDBH not in", values, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhBetween(String value1, String value2) {
            addCriterion("GRDJJDBH between", value1, value2, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andGrdjjdbhNotBetween(String value1, String value2) {
            addCriterion("GRDJJDBH not between", value1, value2, "grdjjdbh");
            return (Criteria) this;
        }

        public Criteria andQzbhIsNull() {
            addCriterion("QZBH is null");
            return (Criteria) this;
        }

        public Criteria andQzbhIsNotNull() {
            addCriterion("QZBH is not null");
            return (Criteria) this;
        }

        public Criteria andQzbhEqualTo(String value) {
            addCriterion("QZBH =", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhNotEqualTo(String value) {
            addCriterion("QZBH <>", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhGreaterThan(String value) {
            addCriterion("QZBH >", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhGreaterThanOrEqualTo(String value) {
            addCriterion("QZBH >=", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhLessThan(String value) {
            addCriterion("QZBH <", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhLessThanOrEqualTo(String value) {
            addCriterion("QZBH <=", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhLike(String value) {
            addCriterion("QZBH like", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhNotLike(String value) {
            addCriterion("QZBH not like", value, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhIn(List<String> values) {
            addCriterion("QZBH in", values, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhNotIn(List<String> values) {
            addCriterion("QZBH not in", values, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhBetween(String value1, String value2) {
            addCriterion("QZBH between", value1, value2, "qzbh");
            return (Criteria) this;
        }

        public Criteria andQzbhNotBetween(String value1, String value2) {
            addCriterion("QZBH not between", value1, value2, "qzbh");
            return (Criteria) this;
        }

        public Criteria andDojyyIsNull() {
            addCriterion("DOJYY is null");
            return (Criteria) this;
        }

        public Criteria andDojyyIsNotNull() {
            addCriterion("DOJYY is not null");
            return (Criteria) this;
        }

        public Criteria andDojyyEqualTo(String value) {
            addCriterion("DOJYY =", value, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyNotEqualTo(String value) {
            addCriterion("DOJYY <>", value, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyGreaterThan(String value) {
            addCriterion("DOJYY >", value, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyGreaterThanOrEqualTo(String value) {
            addCriterion("DOJYY >=", value, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyLessThan(String value) {
            addCriterion("DOJYY <", value, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyLessThanOrEqualTo(String value) {
            addCriterion("DOJYY <=", value, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyLike(String value) {
            addCriterion("DOJYY like", value, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyNotLike(String value) {
            addCriterion("DOJYY not like", value, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyIn(List<String> values) {
            addCriterion("DOJYY in", values, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyNotIn(List<String> values) {
            addCriterion("DOJYY not in", values, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyBetween(String value1, String value2) {
            addCriterion("DOJYY between", value1, value2, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojyyNotBetween(String value1, String value2) {
            addCriterion("DOJYY not between", value1, value2, "dojyy");
            return (Criteria) this;
        }

        public Criteria andDojsjIsNull() {
            addCriterion("DOJSJ is null");
            return (Criteria) this;
        }

        public Criteria andDojsjIsNotNull() {
            addCriterion("DOJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDojsjEqualTo(String value) {
            addCriterion("DOJSJ =", value, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjNotEqualTo(String value) {
            addCriterion("DOJSJ <>", value, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjGreaterThan(String value) {
            addCriterion("DOJSJ >", value, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjGreaterThanOrEqualTo(String value) {
            addCriterion("DOJSJ >=", value, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjLessThan(String value) {
            addCriterion("DOJSJ <", value, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjLessThanOrEqualTo(String value) {
            addCriterion("DOJSJ <=", value, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjLike(String value) {
            addCriterion("DOJSJ like", value, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjNotLike(String value) {
            addCriterion("DOJSJ not like", value, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjIn(List<String> values) {
            addCriterion("DOJSJ in", values, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjNotIn(List<String> values) {
            addCriterion("DOJSJ not in", values, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjBetween(String value1, String value2) {
            addCriterion("DOJSJ between", value1, value2, "dojsj");
            return (Criteria) this;
        }

        public Criteria andDojsjNotBetween(String value1, String value2) {
            addCriterion("DOJSJ not between", value1, value2, "dojsj");
            return (Criteria) this;
        }

        public Criteria andJidyyIsNull() {
            addCriterion("JIDYY is null");
            return (Criteria) this;
        }

        public Criteria andJidyyIsNotNull() {
            addCriterion("JIDYY is not null");
            return (Criteria) this;
        }

        public Criteria andJidyyEqualTo(String value) {
            addCriterion("JIDYY =", value, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyNotEqualTo(String value) {
            addCriterion("JIDYY <>", value, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyGreaterThan(String value) {
            addCriterion("JIDYY >", value, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyGreaterThanOrEqualTo(String value) {
            addCriterion("JIDYY >=", value, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyLessThan(String value) {
            addCriterion("JIDYY <", value, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyLessThanOrEqualTo(String value) {
            addCriterion("JIDYY <=", value, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyLike(String value) {
            addCriterion("JIDYY like", value, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyNotLike(String value) {
            addCriterion("JIDYY not like", value, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyIn(List<String> values) {
            addCriterion("JIDYY in", values, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyNotIn(List<String> values) {
            addCriterion("JIDYY not in", values, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyBetween(String value1, String value2) {
            addCriterion("JIDYY between", value1, value2, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidyyNotBetween(String value1, String value2) {
            addCriterion("JIDYY not between", value1, value2, "jidyy");
            return (Criteria) this;
        }

        public Criteria andJidsjIsNull() {
            addCriterion("JIDSJ is null");
            return (Criteria) this;
        }

        public Criteria andJidsjIsNotNull() {
            addCriterion("JIDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJidsjEqualTo(String value) {
            addCriterion("JIDSJ =", value, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjNotEqualTo(String value) {
            addCriterion("JIDSJ <>", value, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjGreaterThan(String value) {
            addCriterion("JIDSJ >", value, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjGreaterThanOrEqualTo(String value) {
            addCriterion("JIDSJ >=", value, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjLessThan(String value) {
            addCriterion("JIDSJ <", value, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjLessThanOrEqualTo(String value) {
            addCriterion("JIDSJ <=", value, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjLike(String value) {
            addCriterion("JIDSJ like", value, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjNotLike(String value) {
            addCriterion("JIDSJ not like", value, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjIn(List<String> values) {
            addCriterion("JIDSJ in", values, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjNotIn(List<String> values) {
            addCriterion("JIDSJ not in", values, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjBetween(String value1, String value2) {
            addCriterion("JIDSJ between", value1, value2, "jidsj");
            return (Criteria) this;
        }

        public Criteria andJidsjNotBetween(String value1, String value2) {
            addCriterion("JIDSJ not between", value1, value2, "jidsj");
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