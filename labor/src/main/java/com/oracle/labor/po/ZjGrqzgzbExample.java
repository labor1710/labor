package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class ZjGrqzgzbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZjGrqzgzbExample() {
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

        public Criteria andQzgzbhIsNull() {
            addCriterion("QZGZBH is null");
            return (Criteria) this;
        }

        public Criteria andQzgzbhIsNotNull() {
            addCriterion("QZGZBH is not null");
            return (Criteria) this;
        }

        public Criteria andQzgzbhEqualTo(String value) {
            addCriterion("QZGZBH =", value, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhNotEqualTo(String value) {
            addCriterion("QZGZBH <>", value, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhGreaterThan(String value) {
            addCriterion("QZGZBH >", value, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhGreaterThanOrEqualTo(String value) {
            addCriterion("QZGZBH >=", value, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhLessThan(String value) {
            addCriterion("QZGZBH <", value, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhLessThanOrEqualTo(String value) {
            addCriterion("QZGZBH <=", value, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhLike(String value) {
            addCriterion("QZGZBH like", value, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhNotLike(String value) {
            addCriterion("QZGZBH not like", value, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhIn(List<String> values) {
            addCriterion("QZGZBH in", values, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhNotIn(List<String> values) {
            addCriterion("QZGZBH not in", values, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhBetween(String value1, String value2) {
            addCriterion("QZGZBH between", value1, value2, "qzgzbh");
            return (Criteria) this;
        }

        public Criteria andQzgzbhNotBetween(String value1, String value2) {
            addCriterion("QZGZBH not between", value1, value2, "qzgzbh");
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

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andGzIsNull() {
            addCriterion("GZ is null");
            return (Criteria) this;
        }

        public Criteria andGzIsNotNull() {
            addCriterion("GZ is not null");
            return (Criteria) this;
        }

        public Criteria andGzEqualTo(String value) {
            addCriterion("GZ =", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzNotEqualTo(String value) {
            addCriterion("GZ <>", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzGreaterThan(String value) {
            addCriterion("GZ >", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzGreaterThanOrEqualTo(String value) {
            addCriterion("GZ >=", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzLessThan(String value) {
            addCriterion("GZ <", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzLessThanOrEqualTo(String value) {
            addCriterion("GZ <=", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzLike(String value) {
            addCriterion("GZ like", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzNotLike(String value) {
            addCriterion("GZ not like", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzIn(List<String> values) {
            addCriterion("GZ in", values, "gz");
            return (Criteria) this;
        }

        public Criteria andGzNotIn(List<String> values) {
            addCriterion("GZ not in", values, "gz");
            return (Criteria) this;
        }

        public Criteria andGzBetween(String value1, String value2) {
            addCriterion("GZ between", value1, value2, "gz");
            return (Criteria) this;
        }

        public Criteria andGzNotBetween(String value1, String value2) {
            addCriterion("GZ not between", value1, value2, "gz");
            return (Criteria) this;
        }

        public Criteria andYgxsIsNull() {
            addCriterion("YGXS is null");
            return (Criteria) this;
        }

        public Criteria andYgxsIsNotNull() {
            addCriterion("YGXS is not null");
            return (Criteria) this;
        }

        public Criteria andYgxsEqualTo(String value) {
            addCriterion("YGXS =", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsNotEqualTo(String value) {
            addCriterion("YGXS <>", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsGreaterThan(String value) {
            addCriterion("YGXS >", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsGreaterThanOrEqualTo(String value) {
            addCriterion("YGXS >=", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsLessThan(String value) {
            addCriterion("YGXS <", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsLessThanOrEqualTo(String value) {
            addCriterion("YGXS <=", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsLike(String value) {
            addCriterion("YGXS like", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsNotLike(String value) {
            addCriterion("YGXS not like", value, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsIn(List<String> values) {
            addCriterion("YGXS in", values, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsNotIn(List<String> values) {
            addCriterion("YGXS not in", values, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsBetween(String value1, String value2) {
            addCriterion("YGXS between", value1, value2, "ygxs");
            return (Criteria) this;
        }

        public Criteria andYgxsNotBetween(String value1, String value2) {
            addCriterion("YGXS not between", value1, value2, "ygxs");
            return (Criteria) this;
        }

        public Criteria andZdyxIsNull() {
            addCriterion("ZDYX is null");
            return (Criteria) this;
        }

        public Criteria andZdyxIsNotNull() {
            addCriterion("ZDYX is not null");
            return (Criteria) this;
        }

        public Criteria andZdyxEqualTo(String value) {
            addCriterion("ZDYX =", value, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxNotEqualTo(String value) {
            addCriterion("ZDYX <>", value, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxGreaterThan(String value) {
            addCriterion("ZDYX >", value, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxGreaterThanOrEqualTo(String value) {
            addCriterion("ZDYX >=", value, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxLessThan(String value) {
            addCriterion("ZDYX <", value, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxLessThanOrEqualTo(String value) {
            addCriterion("ZDYX <=", value, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxLike(String value) {
            addCriterion("ZDYX like", value, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxNotLike(String value) {
            addCriterion("ZDYX not like", value, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxIn(List<String> values) {
            addCriterion("ZDYX in", values, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxNotIn(List<String> values) {
            addCriterion("ZDYX not in", values, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxBetween(String value1, String value2) {
            addCriterion("ZDYX between", value1, value2, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZdyxNotBetween(String value1, String value2) {
            addCriterion("ZDYX not between", value1, value2, "zdyx");
            return (Criteria) this;
        }

        public Criteria andZgyxIsNull() {
            addCriterion("ZGYX is null");
            return (Criteria) this;
        }

        public Criteria andZgyxIsNotNull() {
            addCriterion("ZGYX is not null");
            return (Criteria) this;
        }

        public Criteria andZgyxEqualTo(String value) {
            addCriterion("ZGYX =", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxNotEqualTo(String value) {
            addCriterion("ZGYX <>", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxGreaterThan(String value) {
            addCriterion("ZGYX >", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxGreaterThanOrEqualTo(String value) {
            addCriterion("ZGYX >=", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxLessThan(String value) {
            addCriterion("ZGYX <", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxLessThanOrEqualTo(String value) {
            addCriterion("ZGYX <=", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxLike(String value) {
            addCriterion("ZGYX like", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxNotLike(String value) {
            addCriterion("ZGYX not like", value, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxIn(List<String> values) {
            addCriterion("ZGYX in", values, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxNotIn(List<String> values) {
            addCriterion("ZGYX not in", values, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxBetween(String value1, String value2) {
            addCriterion("ZGYX between", value1, value2, "zgyx");
            return (Criteria) this;
        }

        public Criteria andZgyxNotBetween(String value1, String value2) {
            addCriterion("ZGYX not between", value1, value2, "zgyx");
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