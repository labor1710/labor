package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class BipSkillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipSkillExample() {
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

        public Criteria andBipSIdIsNull() {
            addCriterion("bip_s_id is null");
            return (Criteria) this;
        }

        public Criteria andBipSIdIsNotNull() {
            addCriterion("bip_s_id is not null");
            return (Criteria) this;
        }

        public Criteria andBipSIdEqualTo(String value) {
            addCriterion("bip_s_id =", value, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdNotEqualTo(String value) {
            addCriterion("bip_s_id <>", value, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdGreaterThan(String value) {
            addCriterion("bip_s_id >", value, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdGreaterThanOrEqualTo(String value) {
            addCriterion("bip_s_id >=", value, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdLessThan(String value) {
            addCriterion("bip_s_id <", value, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdLessThanOrEqualTo(String value) {
            addCriterion("bip_s_id <=", value, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdLike(String value) {
            addCriterion("bip_s_id like", value, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdNotLike(String value) {
            addCriterion("bip_s_id not like", value, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdIn(List<String> values) {
            addCriterion("bip_s_id in", values, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdNotIn(List<String> values) {
            addCriterion("bip_s_id not in", values, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdBetween(String value1, String value2) {
            addCriterion("bip_s_id between", value1, value2, "bipSId");
            return (Criteria) this;
        }

        public Criteria andBipSIdNotBetween(String value1, String value2) {
            addCriterion("bip_s_id not between", value1, value2, "bipSId");
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

        public Criteria andBipSYearsIsNull() {
            addCriterion("bip_s_years is null");
            return (Criteria) this;
        }

        public Criteria andBipSYearsIsNotNull() {
            addCriterion("bip_s_years is not null");
            return (Criteria) this;
        }

        public Criteria andBipSYearsEqualTo(String value) {
            addCriterion("bip_s_years =", value, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsNotEqualTo(String value) {
            addCriterion("bip_s_years <>", value, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsGreaterThan(String value) {
            addCriterion("bip_s_years >", value, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsGreaterThanOrEqualTo(String value) {
            addCriterion("bip_s_years >=", value, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsLessThan(String value) {
            addCriterion("bip_s_years <", value, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsLessThanOrEqualTo(String value) {
            addCriterion("bip_s_years <=", value, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsLike(String value) {
            addCriterion("bip_s_years like", value, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsNotLike(String value) {
            addCriterion("bip_s_years not like", value, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsIn(List<String> values) {
            addCriterion("bip_s_years in", values, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsNotIn(List<String> values) {
            addCriterion("bip_s_years not in", values, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsBetween(String value1, String value2) {
            addCriterion("bip_s_years between", value1, value2, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSYearsNotBetween(String value1, String value2) {
            addCriterion("bip_s_years not between", value1, value2, "bipSYears");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnIsNull() {
            addCriterion("bip_s_zyjn is null");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnIsNotNull() {
            addCriterion("bip_s_zyjn is not null");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnEqualTo(String value) {
            addCriterion("bip_s_zyjn =", value, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnNotEqualTo(String value) {
            addCriterion("bip_s_zyjn <>", value, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnGreaterThan(String value) {
            addCriterion("bip_s_zyjn >", value, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnGreaterThanOrEqualTo(String value) {
            addCriterion("bip_s_zyjn >=", value, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnLessThan(String value) {
            addCriterion("bip_s_zyjn <", value, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnLessThanOrEqualTo(String value) {
            addCriterion("bip_s_zyjn <=", value, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnLike(String value) {
            addCriterion("bip_s_zyjn like", value, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnNotLike(String value) {
            addCriterion("bip_s_zyjn not like", value, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnIn(List<String> values) {
            addCriterion("bip_s_zyjn in", values, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnNotIn(List<String> values) {
            addCriterion("bip_s_zyjn not in", values, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnBetween(String value1, String value2) {
            addCriterion("bip_s_zyjn between", value1, value2, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSZyjnNotBetween(String value1, String value2) {
            addCriterion("bip_s_zyjn not between", value1, value2, "bipSZyjn");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjIsNull() {
            addCriterion("bip_s_jsdj is null");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjIsNotNull() {
            addCriterion("bip_s_jsdj is not null");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjEqualTo(String value) {
            addCriterion("bip_s_jsdj =", value, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjNotEqualTo(String value) {
            addCriterion("bip_s_jsdj <>", value, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjGreaterThan(String value) {
            addCriterion("bip_s_jsdj >", value, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjGreaterThanOrEqualTo(String value) {
            addCriterion("bip_s_jsdj >=", value, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjLessThan(String value) {
            addCriterion("bip_s_jsdj <", value, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjLessThanOrEqualTo(String value) {
            addCriterion("bip_s_jsdj <=", value, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjLike(String value) {
            addCriterion("bip_s_jsdj like", value, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjNotLike(String value) {
            addCriterion("bip_s_jsdj not like", value, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjIn(List<String> values) {
            addCriterion("bip_s_jsdj in", values, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjNotIn(List<String> values) {
            addCriterion("bip_s_jsdj not in", values, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjBetween(String value1, String value2) {
            addCriterion("bip_s_jsdj between", value1, value2, "bipSJsdj");
            return (Criteria) this;
        }

        public Criteria andBipSJsdjNotBetween(String value1, String value2) {
            addCriterion("bip_s_jsdj not between", value1, value2, "bipSJsdj");
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