package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContratosVExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public ContratosVExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
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
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
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

        public Criteria andIdContratoIsNull() {
            addCriterion("CON_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdContratoIsNotNull() {
            addCriterion("CON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdContratoEqualTo(BigDecimal value) {
            addCriterion("CON_ID =", value, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoNotEqualTo(BigDecimal value) {
            addCriterion("CON_ID <>", value, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoGreaterThan(BigDecimal value) {
            addCriterion("CON_ID >", value, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_ID >=", value, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoLessThan(BigDecimal value) {
            addCriterion("CON_ID <", value, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_ID <=", value, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoIn(List<BigDecimal> values) {
            addCriterion("CON_ID in", values, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoNotIn(List<BigDecimal> values) {
            addCriterion("CON_ID not in", values, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_ID between", value1, value2, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdContratoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_ID not between", value1, value2, "idContrato");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteIsNull() {
            addCriterion("CON_EXP_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteIsNotNull() {
            addCriterion("CON_EXP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteEqualTo(BigDecimal value) {
            addCriterion("CON_EXP_ID =", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteNotEqualTo(BigDecimal value) {
            addCriterion("CON_EXP_ID <>", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteGreaterThan(BigDecimal value) {
            addCriterion("CON_EXP_ID >", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_EXP_ID >=", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteLessThan(BigDecimal value) {
            addCriterion("CON_EXP_ID <", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_EXP_ID <=", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteIn(List<BigDecimal> values) {
            addCriterion("CON_EXP_ID in", values, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteNotIn(List<BigDecimal> values) {
            addCriterion("CON_EXP_ID not in", values, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_EXP_ID between", value1, value2, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_EXP_ID not between", value1, value2, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andCodigoIsNull() {
            addCriterion("EXP_CODIGO is null");
            return (Criteria) this;
        }

        public Criteria andCodigoIsNotNull() {
            addCriterion("EXP_CODIGO is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoEqualTo(String value) {
            addCriterion("EXP_CODIGO =", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotEqualTo(String value) {
            addCriterion("EXP_CODIGO <>", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoGreaterThan(String value) {
            addCriterion("EXP_CODIGO >", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoGreaterThanOrEqualTo(String value) {
            addCriterion("EXP_CODIGO >=", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLessThan(String value) {
            addCriterion("EXP_CODIGO <", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLessThanOrEqualTo(String value) {
            addCriterion("EXP_CODIGO <=", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLike(String value) {
            addCriterion("EXP_CODIGO like", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotLike(String value) {
            addCriterion("EXP_CODIGO not like", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoIn(List<String> values) {
            addCriterion("EXP_CODIGO in", values, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotIn(List<String> values) {
            addCriterion("EXP_CODIGO not in", values, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoBetween(String value1, String value2) {
            addCriterion("EXP_CODIGO between", value1, value2, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotBetween(String value1, String value2) {
            addCriterion("EXP_CODIGO not between", value1, value2, "codigo");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("CON_DESCRIPCION is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("CON_DESCRIPCION is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("CON_DESCRIPCION =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("CON_DESCRIPCION <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("CON_DESCRIPCION >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("CON_DESCRIPCION >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("CON_DESCRIPCION <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("CON_DESCRIPCION <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("CON_DESCRIPCION like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("CON_DESCRIPCION not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("CON_DESCRIPCION in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("CON_DESCRIPCION not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("CON_DESCRIPCION between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("CON_DESCRIPCION not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andIdEntidadIsNull() {
            addCriterion("EN_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdEntidadIsNotNull() {
            addCriterion("EN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEntidadEqualTo(BigDecimal value) {
            addCriterion("EN_ID =", value, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadNotEqualTo(BigDecimal value) {
            addCriterion("EN_ID <>", value, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadGreaterThan(BigDecimal value) {
            addCriterion("EN_ID >", value, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_ID >=", value, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadLessThan(BigDecimal value) {
            addCriterion("EN_ID <", value, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_ID <=", value, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadIn(List<BigDecimal> values) {
            addCriterion("EN_ID in", values, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadNotIn(List<BigDecimal> values) {
            addCriterion("EN_ID not in", values, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_ID between", value1, value2, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andIdEntidadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_ID not between", value1, value2, "idEntidad");
            return (Criteria) this;
        }

        public Criteria andCifIsNull() {
            addCriterion("EN_CIF is null");
            return (Criteria) this;
        }

        public Criteria andCifIsNotNull() {
            addCriterion("EN_CIF is not null");
            return (Criteria) this;
        }

        public Criteria andCifEqualTo(String value) {
            addCriterion("EN_CIF =", value, "cif");
            return (Criteria) this;
        }

        public Criteria andCifNotEqualTo(String value) {
            addCriterion("EN_CIF <>", value, "cif");
            return (Criteria) this;
        }

        public Criteria andCifGreaterThan(String value) {
            addCriterion("EN_CIF >", value, "cif");
            return (Criteria) this;
        }

        public Criteria andCifGreaterThanOrEqualTo(String value) {
            addCriterion("EN_CIF >=", value, "cif");
            return (Criteria) this;
        }

        public Criteria andCifLessThan(String value) {
            addCriterion("EN_CIF <", value, "cif");
            return (Criteria) this;
        }

        public Criteria andCifLessThanOrEqualTo(String value) {
            addCriterion("EN_CIF <=", value, "cif");
            return (Criteria) this;
        }

        public Criteria andCifLike(String value) {
            addCriterion("EN_CIF like", value, "cif");
            return (Criteria) this;
        }

        public Criteria andCifNotLike(String value) {
            addCriterion("EN_CIF not like", value, "cif");
            return (Criteria) this;
        }

        public Criteria andCifIn(List<String> values) {
            addCriterion("EN_CIF in", values, "cif");
            return (Criteria) this;
        }

        public Criteria andCifNotIn(List<String> values) {
            addCriterion("EN_CIF not in", values, "cif");
            return (Criteria) this;
        }

        public Criteria andCifBetween(String value1, String value2) {
            addCriterion("EN_CIF between", value1, value2, "cif");
            return (Criteria) this;
        }

        public Criteria andCifNotBetween(String value1, String value2) {
            addCriterion("EN_CIF not between", value1, value2, "cif");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("EN_NOMBRE is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("EN_NOMBRE is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("EN_NOMBRE =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("EN_NOMBRE <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("EN_NOMBRE >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("EN_NOMBRE >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("EN_NOMBRE <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("EN_NOMBRE <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("EN_NOMBRE like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("EN_NOMBRE not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("EN_NOMBRE in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("EN_NOMBRE not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("EN_NOMBRE between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("EN_NOMBRE not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andSecuenciaIsNull() {
            addCriterion("EXP_SECUENCIA is null");
            return (Criteria) this;
        }

        public Criteria andSecuenciaIsNotNull() {
            addCriterion("EXP_SECUENCIA is not null");
            return (Criteria) this;
        }

        public Criteria andSecuenciaEqualTo(BigDecimal value) {
            addCriterion("EXP_SECUENCIA =", value, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaNotEqualTo(BigDecimal value) {
            addCriterion("EXP_SECUENCIA <>", value, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaGreaterThan(BigDecimal value) {
            addCriterion("EXP_SECUENCIA >", value, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXP_SECUENCIA >=", value, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaLessThan(BigDecimal value) {
            addCriterion("EXP_SECUENCIA <", value, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXP_SECUENCIA <=", value, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaIn(List<BigDecimal> values) {
            addCriterion("EXP_SECUENCIA in", values, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaNotIn(List<BigDecimal> values) {
            addCriterion("EXP_SECUENCIA not in", values, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXP_SECUENCIA between", value1, value2, "secuencia");
            return (Criteria) this;
        }

        public Criteria andSecuenciaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXP_SECUENCIA not between", value1, value2, "secuencia");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 24 09:41:32 CEST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_CONTRATOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
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