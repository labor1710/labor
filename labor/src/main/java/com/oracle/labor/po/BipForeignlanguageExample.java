package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class BipForeignlanguageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipForeignlanguageExample() {
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

        public Criteria andBipFlIdIsNull() {
            addCriterion("bip_fl_id is null");
            return (Criteria) this;
        }

        public Criteria andBipFlIdIsNotNull() {
            addCriterion("bip_fl_id is not null");
            return (Criteria) this;
        }

        public Criteria andBipFlIdEqualTo(String value) {
            addCriterion("bip_fl_id =", value, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdNotEqualTo(String value) {
            addCriterion("bip_fl_id <>", value, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdGreaterThan(String value) {
            addCriterion("bip_fl_id >", value, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdGreaterThanOrEqualTo(String value) {
            addCriterion("bip_fl_id >=", value, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdLessThan(String value) {
            addCriterion("bip_fl_id <", value, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdLessThanOrEqualTo(String value) {
            addCriterion("bip_fl_id <=", value, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdLike(String value) {
            addCriterion("bip_fl_id like", value, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdNotLike(String value) {
            addCriterion("bip_fl_id not like", value, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdIn(List<String> values) {
            addCriterion("bip_fl_id in", values, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdNotIn(List<String> values) {
            addCriterion("bip_fl_id not in", values, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdBetween(String value1, String value2) {
            addCriterion("bip_fl_id between", value1, value2, "bipFlId");
            return (Criteria) this;
        }

        public Criteria andBipFlIdNotBetween(String value1, String value2) {
            addCriterion("bip_fl_id not between", value1, value2, "bipFlId");
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

        public Criteria andBipFlYearsIsNull() {
            addCriterion("bip_fl_years is null");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsIsNotNull() {
            addCriterion("bip_fl_years is not null");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsEqualTo(String value) {
            addCriterion("bip_fl_years =", value, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsNotEqualTo(String value) {
            addCriterion("bip_fl_years <>", value, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsGreaterThan(String value) {
            addCriterion("bip_fl_years >", value, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsGreaterThanOrEqualTo(String value) {
            addCriterion("bip_fl_years >=", value, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsLessThan(String value) {
            addCriterion("bip_fl_years <", value, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsLessThanOrEqualTo(String value) {
            addCriterion("bip_fl_years <=", value, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsLike(String value) {
            addCriterion("bip_fl_years like", value, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsNotLike(String value) {
            addCriterion("bip_fl_years not like", value, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsIn(List<String> values) {
            addCriterion("bip_fl_years in", values, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsNotIn(List<String> values) {
            addCriterion("bip_fl_years not in", values, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsBetween(String value1, String value2) {
            addCriterion("bip_fl_years between", value1, value2, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlYearsNotBetween(String value1, String value2) {
            addCriterion("bip_fl_years not between", value1, value2, "bipFlYears");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyIsNull() {
            addCriterion("bip_fl_jywy is null");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyIsNotNull() {
            addCriterion("bip_fl_jywy is not null");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyEqualTo(String value) {
            addCriterion("bip_fl_jywy =", value, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyNotEqualTo(String value) {
            addCriterion("bip_fl_jywy <>", value, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyGreaterThan(String value) {
            addCriterion("bip_fl_jywy >", value, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyGreaterThanOrEqualTo(String value) {
            addCriterion("bip_fl_jywy >=", value, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyLessThan(String value) {
            addCriterion("bip_fl_jywy <", value, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyLessThanOrEqualTo(String value) {
            addCriterion("bip_fl_jywy <=", value, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyLike(String value) {
            addCriterion("bip_fl_jywy like", value, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyNotLike(String value) {
            addCriterion("bip_fl_jywy not like", value, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyIn(List<String> values) {
            addCriterion("bip_fl_jywy in", values, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyNotIn(List<String> values) {
            addCriterion("bip_fl_jywy not in", values, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyBetween(String value1, String value2) {
            addCriterion("bip_fl_jywy between", value1, value2, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlJywyNotBetween(String value1, String value2) {
            addCriterion("bip_fl_jywy not between", value1, value2, "bipFlJywy");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmIsNull() {
            addCriterion("bip_fl_wysm is null");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmIsNotNull() {
            addCriterion("bip_fl_wysm is not null");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmEqualTo(String value) {
            addCriterion("bip_fl_wysm =", value, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmNotEqualTo(String value) {
            addCriterion("bip_fl_wysm <>", value, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmGreaterThan(String value) {
            addCriterion("bip_fl_wysm >", value, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmGreaterThanOrEqualTo(String value) {
            addCriterion("bip_fl_wysm >=", value, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmLessThan(String value) {
            addCriterion("bip_fl_wysm <", value, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmLessThanOrEqualTo(String value) {
            addCriterion("bip_fl_wysm <=", value, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmLike(String value) {
            addCriterion("bip_fl_wysm like", value, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmNotLike(String value) {
            addCriterion("bip_fl_wysm not like", value, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmIn(List<String> values) {
            addCriterion("bip_fl_wysm in", values, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmNotIn(List<String> values) {
            addCriterion("bip_fl_wysm not in", values, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmBetween(String value1, String value2) {
            addCriterion("bip_fl_wysm between", value1, value2, "bipFlWysm");
            return (Criteria) this;
        }

        public Criteria andBipFlWysmNotBetween(String value1, String value2) {
            addCriterion("bip_fl_wysm not between", value1, value2, "bipFlWysm");
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