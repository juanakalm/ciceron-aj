package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProcedimientoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public ProcedimientoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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
            addCriterion("PROC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("PROC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("PROC_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("PROC_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("PROC_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROC_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("PROC_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROC_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("PROC_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("PROC_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROC_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROC_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("PROC_DESCRIPCION is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("PROC_DESCRIPCION is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("PROC_DESCRIPCION =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("PROC_DESCRIPCION <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("PROC_DESCRIPCION >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_DESCRIPCION >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("PROC_DESCRIPCION <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("PROC_DESCRIPCION <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("PROC_DESCRIPCION like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("PROC_DESCRIPCION not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("PROC_DESCRIPCION in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("PROC_DESCRIPCION not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("PROC_DESCRIPCION between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("PROC_DESCRIPCION not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andPdcIdIsNull() {
            addCriterion("PROC_PDC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPdcIdIsNotNull() {
            addCriterion("PROC_PDC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPdcIdEqualTo(BigDecimal value) {
            addCriterion("PROC_PDC_ID =", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdNotEqualTo(BigDecimal value) {
            addCriterion("PROC_PDC_ID <>", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdGreaterThan(BigDecimal value) {
            addCriterion("PROC_PDC_ID >", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROC_PDC_ID >=", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdLessThan(BigDecimal value) {
            addCriterion("PROC_PDC_ID <", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROC_PDC_ID <=", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdIn(List<BigDecimal> values) {
            addCriterion("PROC_PDC_ID in", values, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdNotIn(List<BigDecimal> values) {
            addCriterion("PROC_PDC_ID not in", values, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROC_PDC_ID between", value1, value2, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROC_PDC_ID not between", value1, value2, "pdcId");
            return (Criteria) this;
        }

        public Criteria andValidoIsNull() {
            addCriterion("PROC_VALIDO is null");
            return (Criteria) this;
        }

        public Criteria andValidoIsNotNull() {
            addCriterion("PROC_VALIDO is not null");
            return (Criteria) this;
        }

        public Criteria andValidoEqualTo(String value) {
            addCriterion("PROC_VALIDO =", value, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoNotEqualTo(String value) {
            addCriterion("PROC_VALIDO <>", value, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoGreaterThan(String value) {
            addCriterion("PROC_VALIDO >", value, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_VALIDO >=", value, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoLessThan(String value) {
            addCriterion("PROC_VALIDO <", value, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoLessThanOrEqualTo(String value) {
            addCriterion("PROC_VALIDO <=", value, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoLike(String value) {
            addCriterion("PROC_VALIDO like", value, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoNotLike(String value) {
            addCriterion("PROC_VALIDO not like", value, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoIn(List<String> values) {
            addCriterion("PROC_VALIDO in", values, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoNotIn(List<String> values) {
            addCriterion("PROC_VALIDO not in", values, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoBetween(String value1, String value2) {
            addCriterion("PROC_VALIDO between", value1, value2, "valido");
            return (Criteria) this;
        }

        public Criteria andValidoNotBetween(String value1, String value2) {
            addCriterion("PROC_VALIDO not between", value1, value2, "valido");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated do_not_delete_during_merge Fri Jul 01 12:35:22 CEST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROCEDIMIENTOS_V
     *
     * @mbggenerated Fri Jul 01 12:35:22 CEST 2011
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}