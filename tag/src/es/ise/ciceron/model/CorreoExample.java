package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CorreoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public CorreoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
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
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
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

        public Criteria andIdUnidadFirmanteIsNull() {
            addCriterion("FIR_UC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteIsNotNull() {
            addCriterion("FIR_UC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteEqualTo(BigDecimal value) {
            addCriterion("FIR_UC_ID =", value, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteNotEqualTo(BigDecimal value) {
            addCriterion("FIR_UC_ID <>", value, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteGreaterThan(BigDecimal value) {
            addCriterion("FIR_UC_ID >", value, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIR_UC_ID >=", value, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteLessThan(BigDecimal value) {
            addCriterion("FIR_UC_ID <", value, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIR_UC_ID <=", value, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteIn(List<BigDecimal> values) {
            addCriterion("FIR_UC_ID in", values, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteNotIn(List<BigDecimal> values) {
            addCriterion("FIR_UC_ID not in", values, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIR_UC_ID between", value1, value2, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andIdUnidadFirmanteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIR_UC_ID not between", value1, value2, "idUnidadFirmante");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("US_NOMBRE is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("US_NOMBRE is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("US_NOMBRE =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("US_NOMBRE <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("US_NOMBRE >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("US_NOMBRE >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("US_NOMBRE <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("US_NOMBRE <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("US_NOMBRE like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("US_NOMBRE not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("US_NOMBRE in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("US_NOMBRE not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("US_NOMBRE between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("US_NOMBRE not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andDniIsNull() {
            addCriterion("US_DNI is null");
            return (Criteria) this;
        }

        public Criteria andDniIsNotNull() {
            addCriterion("US_DNI is not null");
            return (Criteria) this;
        }

        public Criteria andDniEqualTo(String value) {
            addCriterion("US_DNI =", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotEqualTo(String value) {
            addCriterion("US_DNI <>", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniGreaterThan(String value) {
            addCriterion("US_DNI >", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniGreaterThanOrEqualTo(String value) {
            addCriterion("US_DNI >=", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLessThan(String value) {
            addCriterion("US_DNI <", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLessThanOrEqualTo(String value) {
            addCriterion("US_DNI <=", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLike(String value) {
            addCriterion("US_DNI like", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotLike(String value) {
            addCriterion("US_DNI not like", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniIn(List<String> values) {
            addCriterion("US_DNI in", values, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotIn(List<String> values) {
            addCriterion("US_DNI not in", values, "dni");
            return (Criteria) this;
        }

        public Criteria andDniBetween(String value1, String value2) {
            addCriterion("US_DNI between", value1, value2, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotBetween(String value1, String value2) {
            addCriterion("US_DNI not between", value1, value2, "dni");
            return (Criteria) this;
        }

        public Criteria andIdentificadorIsNull() {
            addCriterion("US_IDENTIFICADOR is null");
            return (Criteria) this;
        }

        public Criteria andIdentificadorIsNotNull() {
            addCriterion("US_IDENTIFICADOR is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificadorEqualTo(String value) {
            addCriterion("US_IDENTIFICADOR =", value, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorNotEqualTo(String value) {
            addCriterion("US_IDENTIFICADOR <>", value, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorGreaterThan(String value) {
            addCriterion("US_IDENTIFICADOR >", value, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorGreaterThanOrEqualTo(String value) {
            addCriterion("US_IDENTIFICADOR >=", value, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorLessThan(String value) {
            addCriterion("US_IDENTIFICADOR <", value, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorLessThanOrEqualTo(String value) {
            addCriterion("US_IDENTIFICADOR <=", value, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorLike(String value) {
            addCriterion("US_IDENTIFICADOR like", value, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorNotLike(String value) {
            addCriterion("US_IDENTIFICADOR not like", value, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorIn(List<String> values) {
            addCriterion("US_IDENTIFICADOR in", values, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorNotIn(List<String> values) {
            addCriterion("US_IDENTIFICADOR not in", values, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorBetween(String value1, String value2) {
            addCriterion("US_IDENTIFICADOR between", value1, value2, "identificador");
            return (Criteria) this;
        }

        public Criteria andIdentificadorNotBetween(String value1, String value2) {
            addCriterion("US_IDENTIFICADOR not between", value1, value2, "identificador");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 25 13:32:16 CEST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_CORREOS_V
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
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