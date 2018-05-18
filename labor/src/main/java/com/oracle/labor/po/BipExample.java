package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class BipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipExample() {
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

        public Criteria andBipCitizenidIsNull() {
            addCriterion("bip_citizenid is null");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidIsNotNull() {
            addCriterion("bip_citizenid is not null");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidEqualTo(String value) {
            addCriterion("bip_citizenid =", value, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidNotEqualTo(String value) {
            addCriterion("bip_citizenid <>", value, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidGreaterThan(String value) {
            addCriterion("bip_citizenid >", value, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidGreaterThanOrEqualTo(String value) {
            addCriterion("bip_citizenid >=", value, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidLessThan(String value) {
            addCriterion("bip_citizenid <", value, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidLessThanOrEqualTo(String value) {
            addCriterion("bip_citizenid <=", value, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidLike(String value) {
            addCriterion("bip_citizenid like", value, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidNotLike(String value) {
            addCriterion("bip_citizenid not like", value, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidIn(List<String> values) {
            addCriterion("bip_citizenid in", values, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidNotIn(List<String> values) {
            addCriterion("bip_citizenid not in", values, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidBetween(String value1, String value2) {
            addCriterion("bip_citizenid between", value1, value2, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipCitizenidNotBetween(String value1, String value2) {
            addCriterion("bip_citizenid not between", value1, value2, "bipCitizenid");
            return (Criteria) this;
        }

        public Criteria andBipSexIsNull() {
            addCriterion("bip_sex is null");
            return (Criteria) this;
        }

        public Criteria andBipSexIsNotNull() {
            addCriterion("bip_sex is not null");
            return (Criteria) this;
        }

        public Criteria andBipSexEqualTo(String value) {
            addCriterion("bip_sex =", value, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexNotEqualTo(String value) {
            addCriterion("bip_sex <>", value, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexGreaterThan(String value) {
            addCriterion("bip_sex >", value, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexGreaterThanOrEqualTo(String value) {
            addCriterion("bip_sex >=", value, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexLessThan(String value) {
            addCriterion("bip_sex <", value, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexLessThanOrEqualTo(String value) {
            addCriterion("bip_sex <=", value, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexLike(String value) {
            addCriterion("bip_sex like", value, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexNotLike(String value) {
            addCriterion("bip_sex not like", value, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexIn(List<String> values) {
            addCriterion("bip_sex in", values, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexNotIn(List<String> values) {
            addCriterion("bip_sex not in", values, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexBetween(String value1, String value2) {
            addCriterion("bip_sex between", value1, value2, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipSexNotBetween(String value1, String value2) {
            addCriterion("bip_sex not between", value1, value2, "bipSex");
            return (Criteria) this;
        }

        public Criteria andBipAgeIsNull() {
            addCriterion("bip_age is null");
            return (Criteria) this;
        }

        public Criteria andBipAgeIsNotNull() {
            addCriterion("bip_age is not null");
            return (Criteria) this;
        }

        public Criteria andBipAgeEqualTo(String value) {
            addCriterion("bip_age =", value, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeNotEqualTo(String value) {
            addCriterion("bip_age <>", value, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeGreaterThan(String value) {
            addCriterion("bip_age >", value, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeGreaterThanOrEqualTo(String value) {
            addCriterion("bip_age >=", value, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeLessThan(String value) {
            addCriterion("bip_age <", value, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeLessThanOrEqualTo(String value) {
            addCriterion("bip_age <=", value, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeLike(String value) {
            addCriterion("bip_age like", value, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeNotLike(String value) {
            addCriterion("bip_age not like", value, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeIn(List<String> values) {
            addCriterion("bip_age in", values, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeNotIn(List<String> values) {
            addCriterion("bip_age not in", values, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeBetween(String value1, String value2) {
            addCriterion("bip_age between", value1, value2, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipAgeNotBetween(String value1, String value2) {
            addCriterion("bip_age not between", value1, value2, "bipAge");
            return (Criteria) this;
        }

        public Criteria andBipNameIsNull() {
            addCriterion("bip_name is null");
            return (Criteria) this;
        }

        public Criteria andBipNameIsNotNull() {
            addCriterion("bip_name is not null");
            return (Criteria) this;
        }

        public Criteria andBipNameEqualTo(String value) {
            addCriterion("bip_name =", value, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameNotEqualTo(String value) {
            addCriterion("bip_name <>", value, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameGreaterThan(String value) {
            addCriterion("bip_name >", value, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameGreaterThanOrEqualTo(String value) {
            addCriterion("bip_name >=", value, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameLessThan(String value) {
            addCriterion("bip_name <", value, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameLessThanOrEqualTo(String value) {
            addCriterion("bip_name <=", value, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameLike(String value) {
            addCriterion("bip_name like", value, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameNotLike(String value) {
            addCriterion("bip_name not like", value, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameIn(List<String> values) {
            addCriterion("bip_name in", values, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameNotIn(List<String> values) {
            addCriterion("bip_name not in", values, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameBetween(String value1, String value2) {
            addCriterion("bip_name between", value1, value2, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipNameNotBetween(String value1, String value2) {
            addCriterion("bip_name not between", value1, value2, "bipName");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayIsNull() {
            addCriterion("bip_birthday is null");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayIsNotNull() {
            addCriterion("bip_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayEqualTo(String value) {
            addCriterion("bip_birthday =", value, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayNotEqualTo(String value) {
            addCriterion("bip_birthday <>", value, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayGreaterThan(String value) {
            addCriterion("bip_birthday >", value, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("bip_birthday >=", value, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayLessThan(String value) {
            addCriterion("bip_birthday <", value, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayLessThanOrEqualTo(String value) {
            addCriterion("bip_birthday <=", value, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayLike(String value) {
            addCriterion("bip_birthday like", value, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayNotLike(String value) {
            addCriterion("bip_birthday not like", value, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayIn(List<String> values) {
            addCriterion("bip_birthday in", values, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayNotIn(List<String> values) {
            addCriterion("bip_birthday not in", values, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayBetween(String value1, String value2) {
            addCriterion("bip_birthday between", value1, value2, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipBirthdayNotBetween(String value1, String value2) {
            addCriterion("bip_birthday not between", value1, value2, "bipBirthday");
            return (Criteria) this;
        }

        public Criteria andBipMinzuIsNull() {
            addCriterion("bip_minzu is null");
            return (Criteria) this;
        }

        public Criteria andBipMinzuIsNotNull() {
            addCriterion("bip_minzu is not null");
            return (Criteria) this;
        }

        public Criteria andBipMinzuEqualTo(String value) {
            addCriterion("bip_minzu =", value, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuNotEqualTo(String value) {
            addCriterion("bip_minzu <>", value, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuGreaterThan(String value) {
            addCriterion("bip_minzu >", value, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("bip_minzu >=", value, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuLessThan(String value) {
            addCriterion("bip_minzu <", value, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuLessThanOrEqualTo(String value) {
            addCriterion("bip_minzu <=", value, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuLike(String value) {
            addCriterion("bip_minzu like", value, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuNotLike(String value) {
            addCriterion("bip_minzu not like", value, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuIn(List<String> values) {
            addCriterion("bip_minzu in", values, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuNotIn(List<String> values) {
            addCriterion("bip_minzu not in", values, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuBetween(String value1, String value2) {
            addCriterion("bip_minzu between", value1, value2, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipMinzuNotBetween(String value1, String value2) {
            addCriterion("bip_minzu not between", value1, value2, "bipMinzu");
            return (Criteria) this;
        }

        public Criteria andBipZzmmIsNull() {
            addCriterion("bip_zzmm is null");
            return (Criteria) this;
        }

        public Criteria andBipZzmmIsNotNull() {
            addCriterion("bip_zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andBipZzmmEqualTo(String value) {
            addCriterion("bip_zzmm =", value, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmNotEqualTo(String value) {
            addCriterion("bip_zzmm <>", value, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmGreaterThan(String value) {
            addCriterion("bip_zzmm >", value, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("bip_zzmm >=", value, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmLessThan(String value) {
            addCriterion("bip_zzmm <", value, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmLessThanOrEqualTo(String value) {
            addCriterion("bip_zzmm <=", value, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmLike(String value) {
            addCriterion("bip_zzmm like", value, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmNotLike(String value) {
            addCriterion("bip_zzmm not like", value, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmIn(List<String> values) {
            addCriterion("bip_zzmm in", values, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmNotIn(List<String> values) {
            addCriterion("bip_zzmm not in", values, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmBetween(String value1, String value2) {
            addCriterion("bip_zzmm between", value1, value2, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipZzmmNotBetween(String value1, String value2) {
            addCriterion("bip_zzmm not between", value1, value2, "bipZzmm");
            return (Criteria) this;
        }

        public Criteria andBipHyzkIsNull() {
            addCriterion("bip_hyzk is null");
            return (Criteria) this;
        }

        public Criteria andBipHyzkIsNotNull() {
            addCriterion("bip_hyzk is not null");
            return (Criteria) this;
        }

        public Criteria andBipHyzkEqualTo(String value) {
            addCriterion("bip_hyzk =", value, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkNotEqualTo(String value) {
            addCriterion("bip_hyzk <>", value, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkGreaterThan(String value) {
            addCriterion("bip_hyzk >", value, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkGreaterThanOrEqualTo(String value) {
            addCriterion("bip_hyzk >=", value, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkLessThan(String value) {
            addCriterion("bip_hyzk <", value, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkLessThanOrEqualTo(String value) {
            addCriterion("bip_hyzk <=", value, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkLike(String value) {
            addCriterion("bip_hyzk like", value, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkNotLike(String value) {
            addCriterion("bip_hyzk not like", value, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkIn(List<String> values) {
            addCriterion("bip_hyzk in", values, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkNotIn(List<String> values) {
            addCriterion("bip_hyzk not in", values, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkBetween(String value1, String value2) {
            addCriterion("bip_hyzk between", value1, value2, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHyzkNotBetween(String value1, String value2) {
            addCriterion("bip_hyzk not between", value1, value2, "bipHyzk");
            return (Criteria) this;
        }

        public Criteria andBipHjxzIsNull() {
            addCriterion("bip_hjxz is null");
            return (Criteria) this;
        }

        public Criteria andBipHjxzIsNotNull() {
            addCriterion("bip_hjxz is not null");
            return (Criteria) this;
        }

        public Criteria andBipHjxzEqualTo(String value) {
            addCriterion("bip_hjxz =", value, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzNotEqualTo(String value) {
            addCriterion("bip_hjxz <>", value, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzGreaterThan(String value) {
            addCriterion("bip_hjxz >", value, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzGreaterThanOrEqualTo(String value) {
            addCriterion("bip_hjxz >=", value, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzLessThan(String value) {
            addCriterion("bip_hjxz <", value, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzLessThanOrEqualTo(String value) {
            addCriterion("bip_hjxz <=", value, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzLike(String value) {
            addCriterion("bip_hjxz like", value, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzNotLike(String value) {
            addCriterion("bip_hjxz not like", value, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzIn(List<String> values) {
            addCriterion("bip_hjxz in", values, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzNotIn(List<String> values) {
            addCriterion("bip_hjxz not in", values, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzBetween(String value1, String value2) {
            addCriterion("bip_hjxz between", value1, value2, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipHjxzNotBetween(String value1, String value2) {
            addCriterion("bip_hjxz not between", value1, value2, "bipHjxz");
            return (Criteria) this;
        }

        public Criteria andBipRylbIsNull() {
            addCriterion("bip_rylb is null");
            return (Criteria) this;
        }

        public Criteria andBipRylbIsNotNull() {
            addCriterion("bip_rylb is not null");
            return (Criteria) this;
        }

        public Criteria andBipRylbEqualTo(String value) {
            addCriterion("bip_rylb =", value, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbNotEqualTo(String value) {
            addCriterion("bip_rylb <>", value, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbGreaterThan(String value) {
            addCriterion("bip_rylb >", value, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbGreaterThanOrEqualTo(String value) {
            addCriterion("bip_rylb >=", value, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbLessThan(String value) {
            addCriterion("bip_rylb <", value, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbLessThanOrEqualTo(String value) {
            addCriterion("bip_rylb <=", value, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbLike(String value) {
            addCriterion("bip_rylb like", value, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbNotLike(String value) {
            addCriterion("bip_rylb not like", value, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbIn(List<String> values) {
            addCriterion("bip_rylb in", values, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbNotIn(List<String> values) {
            addCriterion("bip_rylb not in", values, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbBetween(String value1, String value2) {
            addCriterion("bip_rylb between", value1, value2, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipRylbNotBetween(String value1, String value2) {
            addCriterion("bip_rylb not between", value1, value2, "bipRylb");
            return (Criteria) this;
        }

        public Criteria andBipJkzkIsNull() {
            addCriterion("bip_jkzk is null");
            return (Criteria) this;
        }

        public Criteria andBipJkzkIsNotNull() {
            addCriterion("bip_jkzk is not null");
            return (Criteria) this;
        }

        public Criteria andBipJkzkEqualTo(String value) {
            addCriterion("bip_jkzk =", value, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkNotEqualTo(String value) {
            addCriterion("bip_jkzk <>", value, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkGreaterThan(String value) {
            addCriterion("bip_jkzk >", value, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkGreaterThanOrEqualTo(String value) {
            addCriterion("bip_jkzk >=", value, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkLessThan(String value) {
            addCriterion("bip_jkzk <", value, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkLessThanOrEqualTo(String value) {
            addCriterion("bip_jkzk <=", value, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkLike(String value) {
            addCriterion("bip_jkzk like", value, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkNotLike(String value) {
            addCriterion("bip_jkzk not like", value, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkIn(List<String> values) {
            addCriterion("bip_jkzk in", values, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkNotIn(List<String> values) {
            addCriterion("bip_jkzk not in", values, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkBetween(String value1, String value2) {
            addCriterion("bip_jkzk between", value1, value2, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipJkzkNotBetween(String value1, String value2) {
            addCriterion("bip_jkzk not between", value1, value2, "bipJkzk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkIsNull() {
            addCriterion("bip_cjqk is null");
            return (Criteria) this;
        }

        public Criteria andBipCjqkIsNotNull() {
            addCriterion("bip_cjqk is not null");
            return (Criteria) this;
        }

        public Criteria andBipCjqkEqualTo(String value) {
            addCriterion("bip_cjqk =", value, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkNotEqualTo(String value) {
            addCriterion("bip_cjqk <>", value, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkGreaterThan(String value) {
            addCriterion("bip_cjqk >", value, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkGreaterThanOrEqualTo(String value) {
            addCriterion("bip_cjqk >=", value, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkLessThan(String value) {
            addCriterion("bip_cjqk <", value, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkLessThanOrEqualTo(String value) {
            addCriterion("bip_cjqk <=", value, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkLike(String value) {
            addCriterion("bip_cjqk like", value, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkNotLike(String value) {
            addCriterion("bip_cjqk not like", value, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkIn(List<String> values) {
            addCriterion("bip_cjqk in", values, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkNotIn(List<String> values) {
            addCriterion("bip_cjqk not in", values, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkBetween(String value1, String value2) {
            addCriterion("bip_cjqk between", value1, value2, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipCjqkNotBetween(String value1, String value2) {
            addCriterion("bip_cjqk not between", value1, value2, "bipCjqk");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftIsNull() {
            addCriterion("bip_eyesightleft is null");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftIsNotNull() {
            addCriterion("bip_eyesightleft is not null");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftEqualTo(String value) {
            addCriterion("bip_eyesightleft =", value, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftNotEqualTo(String value) {
            addCriterion("bip_eyesightleft <>", value, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftGreaterThan(String value) {
            addCriterion("bip_eyesightleft >", value, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftGreaterThanOrEqualTo(String value) {
            addCriterion("bip_eyesightleft >=", value, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftLessThan(String value) {
            addCriterion("bip_eyesightleft <", value, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftLessThanOrEqualTo(String value) {
            addCriterion("bip_eyesightleft <=", value, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftLike(String value) {
            addCriterion("bip_eyesightleft like", value, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftNotLike(String value) {
            addCriterion("bip_eyesightleft not like", value, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftIn(List<String> values) {
            addCriterion("bip_eyesightleft in", values, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftNotIn(List<String> values) {
            addCriterion("bip_eyesightleft not in", values, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftBetween(String value1, String value2) {
            addCriterion("bip_eyesightleft between", value1, value2, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightleftNotBetween(String value1, String value2) {
            addCriterion("bip_eyesightleft not between", value1, value2, "bipEyesightleft");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightIsNull() {
            addCriterion("bip_eyesightright is null");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightIsNotNull() {
            addCriterion("bip_eyesightright is not null");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightEqualTo(String value) {
            addCriterion("bip_eyesightright =", value, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightNotEqualTo(String value) {
            addCriterion("bip_eyesightright <>", value, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightGreaterThan(String value) {
            addCriterion("bip_eyesightright >", value, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightGreaterThanOrEqualTo(String value) {
            addCriterion("bip_eyesightright >=", value, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightLessThan(String value) {
            addCriterion("bip_eyesightright <", value, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightLessThanOrEqualTo(String value) {
            addCriterion("bip_eyesightright <=", value, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightLike(String value) {
            addCriterion("bip_eyesightright like", value, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightNotLike(String value) {
            addCriterion("bip_eyesightright not like", value, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightIn(List<String> values) {
            addCriterion("bip_eyesightright in", values, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightNotIn(List<String> values) {
            addCriterion("bip_eyesightright not in", values, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightBetween(String value1, String value2) {
            addCriterion("bip_eyesightright between", value1, value2, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipEyesightrightNotBetween(String value1, String value2) {
            addCriterion("bip_eyesightright not between", value1, value2, "bipEyesightright");
            return (Criteria) this;
        }

        public Criteria andBipLongIsNull() {
            addCriterion("bip_long is null");
            return (Criteria) this;
        }

        public Criteria andBipLongIsNotNull() {
            addCriterion("bip_long is not null");
            return (Criteria) this;
        }

        public Criteria andBipLongEqualTo(String value) {
            addCriterion("bip_long =", value, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongNotEqualTo(String value) {
            addCriterion("bip_long <>", value, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongGreaterThan(String value) {
            addCriterion("bip_long >", value, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongGreaterThanOrEqualTo(String value) {
            addCriterion("bip_long >=", value, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongLessThan(String value) {
            addCriterion("bip_long <", value, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongLessThanOrEqualTo(String value) {
            addCriterion("bip_long <=", value, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongLike(String value) {
            addCriterion("bip_long like", value, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongNotLike(String value) {
            addCriterion("bip_long not like", value, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongIn(List<String> values) {
            addCriterion("bip_long in", values, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongNotIn(List<String> values) {
            addCriterion("bip_long not in", values, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongBetween(String value1, String value2) {
            addCriterion("bip_long between", value1, value2, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipLongNotBetween(String value1, String value2) {
            addCriterion("bip_long not between", value1, value2, "bipLong");
            return (Criteria) this;
        }

        public Criteria andBipWeightIsNull() {
            addCriterion("bip_weight is null");
            return (Criteria) this;
        }

        public Criteria andBipWeightIsNotNull() {
            addCriterion("bip_weight is not null");
            return (Criteria) this;
        }

        public Criteria andBipWeightEqualTo(String value) {
            addCriterion("bip_weight =", value, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightNotEqualTo(String value) {
            addCriterion("bip_weight <>", value, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightGreaterThan(String value) {
            addCriterion("bip_weight >", value, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightGreaterThanOrEqualTo(String value) {
            addCriterion("bip_weight >=", value, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightLessThan(String value) {
            addCriterion("bip_weight <", value, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightLessThanOrEqualTo(String value) {
            addCriterion("bip_weight <=", value, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightLike(String value) {
            addCriterion("bip_weight like", value, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightNotLike(String value) {
            addCriterion("bip_weight not like", value, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightIn(List<String> values) {
            addCriterion("bip_weight in", values, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightNotIn(List<String> values) {
            addCriterion("bip_weight not in", values, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightBetween(String value1, String value2) {
            addCriterion("bip_weight between", value1, value2, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipWeightNotBetween(String value1, String value2) {
            addCriterion("bip_weight not between", value1, value2, "bipWeight");
            return (Criteria) this;
        }

        public Criteria andBipHkszdIsNull() {
            addCriterion("bip_hkszd is null");
            return (Criteria) this;
        }

        public Criteria andBipHkszdIsNotNull() {
            addCriterion("bip_hkszd is not null");
            return (Criteria) this;
        }

        public Criteria andBipHkszdEqualTo(String value) {
            addCriterion("bip_hkszd =", value, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdNotEqualTo(String value) {
            addCriterion("bip_hkszd <>", value, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdGreaterThan(String value) {
            addCriterion("bip_hkszd >", value, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdGreaterThanOrEqualTo(String value) {
            addCriterion("bip_hkszd >=", value, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdLessThan(String value) {
            addCriterion("bip_hkszd <", value, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdLessThanOrEqualTo(String value) {
            addCriterion("bip_hkszd <=", value, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdLike(String value) {
            addCriterion("bip_hkszd like", value, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdNotLike(String value) {
            addCriterion("bip_hkszd not like", value, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdIn(List<String> values) {
            addCriterion("bip_hkszd in", values, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdNotIn(List<String> values) {
            addCriterion("bip_hkszd not in", values, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdBetween(String value1, String value2) {
            addCriterion("bip_hkszd between", value1, value2, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipHkszdNotBetween(String value1, String value2) {
            addCriterion("bip_hkszd not between", value1, value2, "bipHkszd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdIsNull() {
            addCriterion("bip_whcd is null");
            return (Criteria) this;
        }

        public Criteria andBipWhcdIsNotNull() {
            addCriterion("bip_whcd is not null");
            return (Criteria) this;
        }

        public Criteria andBipWhcdEqualTo(String value) {
            addCriterion("bip_whcd =", value, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdNotEqualTo(String value) {
            addCriterion("bip_whcd <>", value, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdGreaterThan(String value) {
            addCriterion("bip_whcd >", value, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdGreaterThanOrEqualTo(String value) {
            addCriterion("bip_whcd >=", value, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdLessThan(String value) {
            addCriterion("bip_whcd <", value, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdLessThanOrEqualTo(String value) {
            addCriterion("bip_whcd <=", value, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdLike(String value) {
            addCriterion("bip_whcd like", value, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdNotLike(String value) {
            addCriterion("bip_whcd not like", value, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdIn(List<String> values) {
            addCriterion("bip_whcd in", values, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdNotIn(List<String> values) {
            addCriterion("bip_whcd not in", values, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdBetween(String value1, String value2) {
            addCriterion("bip_whcd between", value1, value2, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipWhcdNotBetween(String value1, String value2) {
            addCriterion("bip_whcd not between", value1, value2, "bipWhcd");
            return (Criteria) this;
        }

        public Criteria andBipSubjectIsNull() {
            addCriterion("bip_subject is null");
            return (Criteria) this;
        }

        public Criteria andBipSubjectIsNotNull() {
            addCriterion("bip_subject is not null");
            return (Criteria) this;
        }

        public Criteria andBipSubjectEqualTo(String value) {
            addCriterion("bip_subject =", value, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectNotEqualTo(String value) {
            addCriterion("bip_subject <>", value, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectGreaterThan(String value) {
            addCriterion("bip_subject >", value, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("bip_subject >=", value, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectLessThan(String value) {
            addCriterion("bip_subject <", value, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectLessThanOrEqualTo(String value) {
            addCriterion("bip_subject <=", value, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectLike(String value) {
            addCriterion("bip_subject like", value, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectNotLike(String value) {
            addCriterion("bip_subject not like", value, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectIn(List<String> values) {
            addCriterion("bip_subject in", values, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectNotIn(List<String> values) {
            addCriterion("bip_subject not in", values, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectBetween(String value1, String value2) {
            addCriterion("bip_subject between", value1, value2, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipSubjectNotBetween(String value1, String value2) {
            addCriterion("bip_subject not between", value1, value2, "bipSubject");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolIsNull() {
            addCriterion("bip_graduateschool is null");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolIsNotNull() {
            addCriterion("bip_graduateschool is not null");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolEqualTo(String value) {
            addCriterion("bip_graduateschool =", value, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolNotEqualTo(String value) {
            addCriterion("bip_graduateschool <>", value, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolGreaterThan(String value) {
            addCriterion("bip_graduateschool >", value, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("bip_graduateschool >=", value, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolLessThan(String value) {
            addCriterion("bip_graduateschool <", value, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("bip_graduateschool <=", value, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolLike(String value) {
            addCriterion("bip_graduateschool like", value, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolNotLike(String value) {
            addCriterion("bip_graduateschool not like", value, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolIn(List<String> values) {
            addCriterion("bip_graduateschool in", values, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolNotIn(List<String> values) {
            addCriterion("bip_graduateschool not in", values, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolBetween(String value1, String value2) {
            addCriterion("bip_graduateschool between", value1, value2, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipGraduateschoolNotBetween(String value1, String value2) {
            addCriterion("bip_graduateschool not between", value1, value2, "bipGraduateschool");
            return (Criteria) this;
        }

        public Criteria andBipBysjIsNull() {
            addCriterion("bip_bysj is null");
            return (Criteria) this;
        }

        public Criteria andBipBysjIsNotNull() {
            addCriterion("bip_bysj is not null");
            return (Criteria) this;
        }

        public Criteria andBipBysjEqualTo(String value) {
            addCriterion("bip_bysj =", value, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjNotEqualTo(String value) {
            addCriterion("bip_bysj <>", value, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjGreaterThan(String value) {
            addCriterion("bip_bysj >", value, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjGreaterThanOrEqualTo(String value) {
            addCriterion("bip_bysj >=", value, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjLessThan(String value) {
            addCriterion("bip_bysj <", value, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjLessThanOrEqualTo(String value) {
            addCriterion("bip_bysj <=", value, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjLike(String value) {
            addCriterion("bip_bysj like", value, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjNotLike(String value) {
            addCriterion("bip_bysj not like", value, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjIn(List<String> values) {
            addCriterion("bip_bysj in", values, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjNotIn(List<String> values) {
            addCriterion("bip_bysj not in", values, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjBetween(String value1, String value2) {
            addCriterion("bip_bysj between", value1, value2, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipBysjNotBetween(String value1, String value2) {
            addCriterion("bip_bysj not between", value1, value2, "bipBysj");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2IsNull() {
            addCriterion("bip_educationallevel2 is null");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2IsNotNull() {
            addCriterion("bip_educationallevel2 is not null");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2EqualTo(String value) {
            addCriterion("bip_educationallevel2 =", value, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2NotEqualTo(String value) {
            addCriterion("bip_educationallevel2 <>", value, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2GreaterThan(String value) {
            addCriterion("bip_educationallevel2 >", value, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2GreaterThanOrEqualTo(String value) {
            addCriterion("bip_educationallevel2 >=", value, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2LessThan(String value) {
            addCriterion("bip_educationallevel2 <", value, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2LessThanOrEqualTo(String value) {
            addCriterion("bip_educationallevel2 <=", value, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2Like(String value) {
            addCriterion("bip_educationallevel2 like", value, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2NotLike(String value) {
            addCriterion("bip_educationallevel2 not like", value, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2In(List<String> values) {
            addCriterion("bip_educationallevel2 in", values, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2NotIn(List<String> values) {
            addCriterion("bip_educationallevel2 not in", values, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2Between(String value1, String value2) {
            addCriterion("bip_educationallevel2 between", value1, value2, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipEducationallevel2NotBetween(String value1, String value2) {
            addCriterion("bip_educationallevel2 not between", value1, value2, "bipEducationallevel2");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneIsNull() {
            addCriterion("bip_con_telephone is null");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneIsNotNull() {
            addCriterion("bip_con_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneEqualTo(String value) {
            addCriterion("bip_con_telephone =", value, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneNotEqualTo(String value) {
            addCriterion("bip_con_telephone <>", value, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneGreaterThan(String value) {
            addCriterion("bip_con_telephone >", value, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("bip_con_telephone >=", value, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneLessThan(String value) {
            addCriterion("bip_con_telephone <", value, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneLessThanOrEqualTo(String value) {
            addCriterion("bip_con_telephone <=", value, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneLike(String value) {
            addCriterion("bip_con_telephone like", value, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneNotLike(String value) {
            addCriterion("bip_con_telephone not like", value, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneIn(List<String> values) {
            addCriterion("bip_con_telephone in", values, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneNotIn(List<String> values) {
            addCriterion("bip_con_telephone not in", values, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneBetween(String value1, String value2) {
            addCriterion("bip_con_telephone between", value1, value2, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConTelephoneNotBetween(String value1, String value2) {
            addCriterion("bip_con_telephone not between", value1, value2, "bipConTelephone");
            return (Criteria) this;
        }

        public Criteria andBipConMobileIsNull() {
            addCriterion("bip_con_mobile is null");
            return (Criteria) this;
        }

        public Criteria andBipConMobileIsNotNull() {
            addCriterion("bip_con_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andBipConMobileEqualTo(String value) {
            addCriterion("bip_con_mobile =", value, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileNotEqualTo(String value) {
            addCriterion("bip_con_mobile <>", value, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileGreaterThan(String value) {
            addCriterion("bip_con_mobile >", value, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileGreaterThanOrEqualTo(String value) {
            addCriterion("bip_con_mobile >=", value, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileLessThan(String value) {
            addCriterion("bip_con_mobile <", value, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileLessThanOrEqualTo(String value) {
            addCriterion("bip_con_mobile <=", value, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileLike(String value) {
            addCriterion("bip_con_mobile like", value, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileNotLike(String value) {
            addCriterion("bip_con_mobile not like", value, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileIn(List<String> values) {
            addCriterion("bip_con_mobile in", values, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileNotIn(List<String> values) {
            addCriterion("bip_con_mobile not in", values, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileBetween(String value1, String value2) {
            addCriterion("bip_con_mobile between", value1, value2, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConMobileNotBetween(String value1, String value2) {
            addCriterion("bip_con_mobile not between", value1, value2, "bipConMobile");
            return (Criteria) this;
        }

        public Criteria andBipConEmailIsNull() {
            addCriterion("bip_con_email is null");
            return (Criteria) this;
        }

        public Criteria andBipConEmailIsNotNull() {
            addCriterion("bip_con_email is not null");
            return (Criteria) this;
        }

        public Criteria andBipConEmailEqualTo(String value) {
            addCriterion("bip_con_email =", value, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailNotEqualTo(String value) {
            addCriterion("bip_con_email <>", value, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailGreaterThan(String value) {
            addCriterion("bip_con_email >", value, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailGreaterThanOrEqualTo(String value) {
            addCriterion("bip_con_email >=", value, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailLessThan(String value) {
            addCriterion("bip_con_email <", value, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailLessThanOrEqualTo(String value) {
            addCriterion("bip_con_email <=", value, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailLike(String value) {
            addCriterion("bip_con_email like", value, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailNotLike(String value) {
            addCriterion("bip_con_email not like", value, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailIn(List<String> values) {
            addCriterion("bip_con_email in", values, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailNotIn(List<String> values) {
            addCriterion("bip_con_email not in", values, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailBetween(String value1, String value2) {
            addCriterion("bip_con_email between", value1, value2, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConEmailNotBetween(String value1, String value2) {
            addCriterion("bip_con_email not between", value1, value2, "bipConEmail");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeIsNull() {
            addCriterion("bip_con_postcode is null");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeIsNotNull() {
            addCriterion("bip_con_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeEqualTo(String value) {
            addCriterion("bip_con_postcode =", value, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeNotEqualTo(String value) {
            addCriterion("bip_con_postcode <>", value, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeGreaterThan(String value) {
            addCriterion("bip_con_postcode >", value, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bip_con_postcode >=", value, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeLessThan(String value) {
            addCriterion("bip_con_postcode <", value, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeLessThanOrEqualTo(String value) {
            addCriterion("bip_con_postcode <=", value, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeLike(String value) {
            addCriterion("bip_con_postcode like", value, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeNotLike(String value) {
            addCriterion("bip_con_postcode not like", value, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeIn(List<String> values) {
            addCriterion("bip_con_postcode in", values, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeNotIn(List<String> values) {
            addCriterion("bip_con_postcode not in", values, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeBetween(String value1, String value2) {
            addCriterion("bip_con_postcode between", value1, value2, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConPostcodeNotBetween(String value1, String value2) {
            addCriterion("bip_con_postcode not between", value1, value2, "bipConPostcode");
            return (Criteria) this;
        }

        public Criteria andBipConContactIsNull() {
            addCriterion("bip_con_contact is null");
            return (Criteria) this;
        }

        public Criteria andBipConContactIsNotNull() {
            addCriterion("bip_con_contact is not null");
            return (Criteria) this;
        }

        public Criteria andBipConContactEqualTo(String value) {
            addCriterion("bip_con_contact =", value, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactNotEqualTo(String value) {
            addCriterion("bip_con_contact <>", value, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactGreaterThan(String value) {
            addCriterion("bip_con_contact >", value, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactGreaterThanOrEqualTo(String value) {
            addCriterion("bip_con_contact >=", value, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactLessThan(String value) {
            addCriterion("bip_con_contact <", value, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactLessThanOrEqualTo(String value) {
            addCriterion("bip_con_contact <=", value, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactLike(String value) {
            addCriterion("bip_con_contact like", value, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactNotLike(String value) {
            addCriterion("bip_con_contact not like", value, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactIn(List<String> values) {
            addCriterion("bip_con_contact in", values, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactNotIn(List<String> values) {
            addCriterion("bip_con_contact not in", values, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactBetween(String value1, String value2) {
            addCriterion("bip_con_contact between", value1, value2, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContactNotBetween(String value1, String value2) {
            addCriterion("bip_con_contact not between", value1, value2, "bipConContact");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelIsNull() {
            addCriterion("bip_con_contacttel is null");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelIsNotNull() {
            addCriterion("bip_con_contacttel is not null");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelEqualTo(String value) {
            addCriterion("bip_con_contacttel =", value, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelNotEqualTo(String value) {
            addCriterion("bip_con_contacttel <>", value, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelGreaterThan(String value) {
            addCriterion("bip_con_contacttel >", value, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelGreaterThanOrEqualTo(String value) {
            addCriterion("bip_con_contacttel >=", value, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelLessThan(String value) {
            addCriterion("bip_con_contacttel <", value, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelLessThanOrEqualTo(String value) {
            addCriterion("bip_con_contacttel <=", value, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelLike(String value) {
            addCriterion("bip_con_contacttel like", value, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelNotLike(String value) {
            addCriterion("bip_con_contacttel not like", value, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelIn(List<String> values) {
            addCriterion("bip_con_contacttel in", values, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelNotIn(List<String> values) {
            addCriterion("bip_con_contacttel not in", values, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelBetween(String value1, String value2) {
            addCriterion("bip_con_contacttel between", value1, value2, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipConContacttelNotBetween(String value1, String value2) {
            addCriterion("bip_con_contacttel not between", value1, value2, "bipConContacttel");
            return (Criteria) this;
        }

        public Criteria andBipResAddressIsNull() {
            addCriterion("bip_res_address is null");
            return (Criteria) this;
        }

        public Criteria andBipResAddressIsNotNull() {
            addCriterion("bip_res_address is not null");
            return (Criteria) this;
        }

        public Criteria andBipResAddressEqualTo(String value) {
            addCriterion("bip_res_address =", value, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressNotEqualTo(String value) {
            addCriterion("bip_res_address <>", value, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressGreaterThan(String value) {
            addCriterion("bip_res_address >", value, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bip_res_address >=", value, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressLessThan(String value) {
            addCriterion("bip_res_address <", value, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressLessThanOrEqualTo(String value) {
            addCriterion("bip_res_address <=", value, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressLike(String value) {
            addCriterion("bip_res_address like", value, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressNotLike(String value) {
            addCriterion("bip_res_address not like", value, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressIn(List<String> values) {
            addCriterion("bip_res_address in", values, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressNotIn(List<String> values) {
            addCriterion("bip_res_address not in", values, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressBetween(String value1, String value2) {
            addCriterion("bip_res_address between", value1, value2, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipResAddressNotBetween(String value1, String value2) {
            addCriterion("bip_res_address not between", value1, value2, "bipResAddress");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityIsNull() {
            addCriterion("bip_t_lowersecurity is null");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityIsNotNull() {
            addCriterion("bip_t_lowersecurity is not null");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityEqualTo(String value) {
            addCriterion("bip_t_lowersecurity =", value, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityNotEqualTo(String value) {
            addCriterion("bip_t_lowersecurity <>", value, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityGreaterThan(String value) {
            addCriterion("bip_t_lowersecurity >", value, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_lowersecurity >=", value, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityLessThan(String value) {
            addCriterion("bip_t_lowersecurity <", value, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityLessThanOrEqualTo(String value) {
            addCriterion("bip_t_lowersecurity <=", value, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityLike(String value) {
            addCriterion("bip_t_lowersecurity like", value, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityNotLike(String value) {
            addCriterion("bip_t_lowersecurity not like", value, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityIn(List<String> values) {
            addCriterion("bip_t_lowersecurity in", values, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityNotIn(List<String> values) {
            addCriterion("bip_t_lowersecurity not in", values, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityBetween(String value1, String value2) {
            addCriterion("bip_t_lowersecurity between", value1, value2, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTLowersecurityNotBetween(String value1, String value2) {
            addCriterion("bip_t_lowersecurity not between", value1, value2, "bipTLowersecurity");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalIsNull() {
            addCriterion("bip_t_criminal is null");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalIsNotNull() {
            addCriterion("bip_t_criminal is not null");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalEqualTo(String value) {
            addCriterion("bip_t_criminal =", value, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalNotEqualTo(String value) {
            addCriterion("bip_t_criminal <>", value, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalGreaterThan(String value) {
            addCriterion("bip_t_criminal >", value, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_criminal >=", value, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalLessThan(String value) {
            addCriterion("bip_t_criminal <", value, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalLessThanOrEqualTo(String value) {
            addCriterion("bip_t_criminal <=", value, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalLike(String value) {
            addCriterion("bip_t_criminal like", value, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalNotLike(String value) {
            addCriterion("bip_t_criminal not like", value, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalIn(List<String> values) {
            addCriterion("bip_t_criminal in", values, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalNotIn(List<String> values) {
            addCriterion("bip_t_criminal not in", values, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalBetween(String value1, String value2) {
            addCriterion("bip_t_criminal between", value1, value2, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTCriminalNotBetween(String value1, String value2) {
            addCriterion("bip_t_criminal not between", value1, value2, "bipTCriminal");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteIsNull() {
            addCriterion("bip_t_destitute is null");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteIsNotNull() {
            addCriterion("bip_t_destitute is not null");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteEqualTo(String value) {
            addCriterion("bip_t_destitute =", value, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteNotEqualTo(String value) {
            addCriterion("bip_t_destitute <>", value, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteGreaterThan(String value) {
            addCriterion("bip_t_destitute >", value, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_destitute >=", value, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteLessThan(String value) {
            addCriterion("bip_t_destitute <", value, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteLessThanOrEqualTo(String value) {
            addCriterion("bip_t_destitute <=", value, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteLike(String value) {
            addCriterion("bip_t_destitute like", value, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteNotLike(String value) {
            addCriterion("bip_t_destitute not like", value, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteIn(List<String> values) {
            addCriterion("bip_t_destitute in", values, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteNotIn(List<String> values) {
            addCriterion("bip_t_destitute not in", values, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteBetween(String value1, String value2) {
            addCriterion("bip_t_destitute between", value1, value2, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTDestituteNotBetween(String value1, String value2) {
            addCriterion("bip_t_destitute not between", value1, value2, "bipTDestitute");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantIsNull() {
            addCriterion("bip_t_peasant is null");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantIsNotNull() {
            addCriterion("bip_t_peasant is not null");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantEqualTo(String value) {
            addCriterion("bip_t_peasant =", value, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantNotEqualTo(String value) {
            addCriterion("bip_t_peasant <>", value, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantGreaterThan(String value) {
            addCriterion("bip_t_peasant >", value, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_peasant >=", value, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantLessThan(String value) {
            addCriterion("bip_t_peasant <", value, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantLessThanOrEqualTo(String value) {
            addCriterion("bip_t_peasant <=", value, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantLike(String value) {
            addCriterion("bip_t_peasant like", value, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantNotLike(String value) {
            addCriterion("bip_t_peasant not like", value, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantIn(List<String> values) {
            addCriterion("bip_t_peasant in", values, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantNotIn(List<String> values) {
            addCriterion("bip_t_peasant not in", values, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantBetween(String value1, String value2) {
            addCriterion("bip_t_peasant between", value1, value2, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTPeasantNotBetween(String value1, String value2) {
            addCriterion("bip_t_peasant not between", value1, value2, "bipTPeasant");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranIsNull() {
            addCriterion("bip_t_veteran is null");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranIsNotNull() {
            addCriterion("bip_t_veteran is not null");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranEqualTo(String value) {
            addCriterion("bip_t_veteran =", value, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranNotEqualTo(String value) {
            addCriterion("bip_t_veteran <>", value, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranGreaterThan(String value) {
            addCriterion("bip_t_veteran >", value, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_veteran >=", value, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranLessThan(String value) {
            addCriterion("bip_t_veteran <", value, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranLessThanOrEqualTo(String value) {
            addCriterion("bip_t_veteran <=", value, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranLike(String value) {
            addCriterion("bip_t_veteran like", value, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranNotLike(String value) {
            addCriterion("bip_t_veteran not like", value, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranIn(List<String> values) {
            addCriterion("bip_t_veteran in", values, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranNotIn(List<String> values) {
            addCriterion("bip_t_veteran not in", values, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranBetween(String value1, String value2) {
            addCriterion("bip_t_veteran between", value1, value2, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTVeteranNotBetween(String value1, String value2) {
            addCriterion("bip_t_veteran not between", value1, value2, "bipTVeteran");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesIsNull() {
            addCriterion("bip_t_othercities is null");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesIsNotNull() {
            addCriterion("bip_t_othercities is not null");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesEqualTo(String value) {
            addCriterion("bip_t_othercities =", value, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesNotEqualTo(String value) {
            addCriterion("bip_t_othercities <>", value, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesGreaterThan(String value) {
            addCriterion("bip_t_othercities >", value, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_othercities >=", value, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesLessThan(String value) {
            addCriterion("bip_t_othercities <", value, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesLessThanOrEqualTo(String value) {
            addCriterion("bip_t_othercities <=", value, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesLike(String value) {
            addCriterion("bip_t_othercities like", value, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesNotLike(String value) {
            addCriterion("bip_t_othercities not like", value, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesIn(List<String> values) {
            addCriterion("bip_t_othercities in", values, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesNotIn(List<String> values) {
            addCriterion("bip_t_othercities not in", values, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesBetween(String value1, String value2) {
            addCriterion("bip_t_othercities between", value1, value2, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTOthercitiesNotBetween(String value1, String value2) {
            addCriterion("bip_t_othercities not between", value1, value2, "bipTOthercities");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzIsNull() {
            addCriterion("bip_t_czjyyhz is null");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzIsNotNull() {
            addCriterion("bip_t_czjyyhz is not null");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzEqualTo(String value) {
            addCriterion("bip_t_czjyyhz =", value, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzNotEqualTo(String value) {
            addCriterion("bip_t_czjyyhz <>", value, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzGreaterThan(String value) {
            addCriterion("bip_t_czjyyhz >", value, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_czjyyhz >=", value, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzLessThan(String value) {
            addCriterion("bip_t_czjyyhz <", value, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzLessThanOrEqualTo(String value) {
            addCriterion("bip_t_czjyyhz <=", value, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzLike(String value) {
            addCriterion("bip_t_czjyyhz like", value, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzNotLike(String value) {
            addCriterion("bip_t_czjyyhz not like", value, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzIn(List<String> values) {
            addCriterion("bip_t_czjyyhz in", values, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzNotIn(List<String> values) {
            addCriterion("bip_t_czjyyhz not in", values, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzBetween(String value1, String value2) {
            addCriterion("bip_t_czjyyhz between", value1, value2, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTCzjyyhzNotBetween(String value1, String value2) {
            addCriterion("bip_t_czjyyhz not between", value1, value2, "bipTCzjyyhz");
            return (Criteria) this;
        }

        public Criteria andBipTRhflIsNull() {
            addCriterion("bip_t_rhfl is null");
            return (Criteria) this;
        }

        public Criteria andBipTRhflIsNotNull() {
            addCriterion("bip_t_rhfl is not null");
            return (Criteria) this;
        }

        public Criteria andBipTRhflEqualTo(String value) {
            addCriterion("bip_t_rhfl =", value, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflNotEqualTo(String value) {
            addCriterion("bip_t_rhfl <>", value, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflGreaterThan(String value) {
            addCriterion("bip_t_rhfl >", value, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_rhfl >=", value, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflLessThan(String value) {
            addCriterion("bip_t_rhfl <", value, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflLessThanOrEqualTo(String value) {
            addCriterion("bip_t_rhfl <=", value, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflLike(String value) {
            addCriterion("bip_t_rhfl like", value, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflNotLike(String value) {
            addCriterion("bip_t_rhfl not like", value, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflIn(List<String> values) {
            addCriterion("bip_t_rhfl in", values, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflNotIn(List<String> values) {
            addCriterion("bip_t_rhfl not in", values, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflBetween(String value1, String value2) {
            addCriterion("bip_t_rhfl between", value1, value2, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTRhflNotBetween(String value1, String value2) {
            addCriterion("bip_t_rhfl not between", value1, value2, "bipTRhfl");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateIsNull() {
            addCriterion("bip_t_newgraduate is null");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateIsNotNull() {
            addCriterion("bip_t_newgraduate is not null");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateEqualTo(String value) {
            addCriterion("bip_t_newgraduate =", value, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateNotEqualTo(String value) {
            addCriterion("bip_t_newgraduate <>", value, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateGreaterThan(String value) {
            addCriterion("bip_t_newgraduate >", value, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateGreaterThanOrEqualTo(String value) {
            addCriterion("bip_t_newgraduate >=", value, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateLessThan(String value) {
            addCriterion("bip_t_newgraduate <", value, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateLessThanOrEqualTo(String value) {
            addCriterion("bip_t_newgraduate <=", value, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateLike(String value) {
            addCriterion("bip_t_newgraduate like", value, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateNotLike(String value) {
            addCriterion("bip_t_newgraduate not like", value, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateIn(List<String> values) {
            addCriterion("bip_t_newgraduate in", values, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateNotIn(List<String> values) {
            addCriterion("bip_t_newgraduate not in", values, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateBetween(String value1, String value2) {
            addCriterion("bip_t_newgraduate between", value1, value2, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipTNewgraduateNotBetween(String value1, String value2) {
            addCriterion("bip_t_newgraduate not between", value1, value2, "bipTNewgraduate");
            return (Criteria) this;
        }

        public Criteria andBipPcDjIsNull() {
            addCriterion("bip_pc_dj is null");
            return (Criteria) this;
        }

        public Criteria andBipPcDjIsNotNull() {
            addCriterion("bip_pc_dj is not null");
            return (Criteria) this;
        }

        public Criteria andBipPcDjEqualTo(String value) {
            addCriterion("bip_pc_dj =", value, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjNotEqualTo(String value) {
            addCriterion("bip_pc_dj <>", value, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjGreaterThan(String value) {
            addCriterion("bip_pc_dj >", value, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjGreaterThanOrEqualTo(String value) {
            addCriterion("bip_pc_dj >=", value, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjLessThan(String value) {
            addCriterion("bip_pc_dj <", value, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjLessThanOrEqualTo(String value) {
            addCriterion("bip_pc_dj <=", value, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjLike(String value) {
            addCriterion("bip_pc_dj like", value, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjNotLike(String value) {
            addCriterion("bip_pc_dj not like", value, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjIn(List<String> values) {
            addCriterion("bip_pc_dj in", values, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjNotIn(List<String> values) {
            addCriterion("bip_pc_dj not in", values, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjBetween(String value1, String value2) {
            addCriterion("bip_pc_dj between", value1, value2, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcDjNotBetween(String value1, String value2) {
            addCriterion("bip_pc_dj not between", value1, value2, "bipPcDj");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdIsNull() {
            addCriterion("bip_pc_slcd is null");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdIsNotNull() {
            addCriterion("bip_pc_slcd is not null");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdEqualTo(String value) {
            addCriterion("bip_pc_slcd =", value, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdNotEqualTo(String value) {
            addCriterion("bip_pc_slcd <>", value, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdGreaterThan(String value) {
            addCriterion("bip_pc_slcd >", value, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdGreaterThanOrEqualTo(String value) {
            addCriterion("bip_pc_slcd >=", value, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdLessThan(String value) {
            addCriterion("bip_pc_slcd <", value, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdLessThanOrEqualTo(String value) {
            addCriterion("bip_pc_slcd <=", value, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdLike(String value) {
            addCriterion("bip_pc_slcd like", value, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdNotLike(String value) {
            addCriterion("bip_pc_slcd not like", value, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdIn(List<String> values) {
            addCriterion("bip_pc_slcd in", values, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdNotIn(List<String> values) {
            addCriterion("bip_pc_slcd not in", values, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdBetween(String value1, String value2) {
            addCriterion("bip_pc_slcd between", value1, value2, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipPcSlcdNotBetween(String value1, String value2) {
            addCriterion("bip_pc_slcd not between", value1, value2, "bipPcSlcd");
            return (Criteria) this;
        }

        public Criteria andBipResumeIsNull() {
            addCriterion("bip_resume is null");
            return (Criteria) this;
        }

        public Criteria andBipResumeIsNotNull() {
            addCriterion("bip_resume is not null");
            return (Criteria) this;
        }

        public Criteria andBipResumeEqualTo(String value) {
            addCriterion("bip_resume =", value, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeNotEqualTo(String value) {
            addCriterion("bip_resume <>", value, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeGreaterThan(String value) {
            addCriterion("bip_resume >", value, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeGreaterThanOrEqualTo(String value) {
            addCriterion("bip_resume >=", value, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeLessThan(String value) {
            addCriterion("bip_resume <", value, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeLessThanOrEqualTo(String value) {
            addCriterion("bip_resume <=", value, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeLike(String value) {
            addCriterion("bip_resume like", value, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeNotLike(String value) {
            addCriterion("bip_resume not like", value, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeIn(List<String> values) {
            addCriterion("bip_resume in", values, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeNotIn(List<String> values) {
            addCriterion("bip_resume not in", values, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeBetween(String value1, String value2) {
            addCriterion("bip_resume between", value1, value2, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipResumeNotBetween(String value1, String value2) {
            addCriterion("bip_resume not between", value1, value2, "bipResume");
            return (Criteria) this;
        }

        public Criteria andBipQtsmIsNull() {
            addCriterion("bip_qtsm is null");
            return (Criteria) this;
        }

        public Criteria andBipQtsmIsNotNull() {
            addCriterion("bip_qtsm is not null");
            return (Criteria) this;
        }

        public Criteria andBipQtsmEqualTo(String value) {
            addCriterion("bip_qtsm =", value, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmNotEqualTo(String value) {
            addCriterion("bip_qtsm <>", value, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmGreaterThan(String value) {
            addCriterion("bip_qtsm >", value, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmGreaterThanOrEqualTo(String value) {
            addCriterion("bip_qtsm >=", value, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmLessThan(String value) {
            addCriterion("bip_qtsm <", value, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmLessThanOrEqualTo(String value) {
            addCriterion("bip_qtsm <=", value, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmLike(String value) {
            addCriterion("bip_qtsm like", value, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmNotLike(String value) {
            addCriterion("bip_qtsm not like", value, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmIn(List<String> values) {
            addCriterion("bip_qtsm in", values, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmNotIn(List<String> values) {
            addCriterion("bip_qtsm not in", values, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmBetween(String value1, String value2) {
            addCriterion("bip_qtsm between", value1, value2, "bipQtsm");
            return (Criteria) this;
        }

        public Criteria andBipQtsmNotBetween(String value1, String value2) {
            addCriterion("bip_qtsm not between", value1, value2, "bipQtsm");
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