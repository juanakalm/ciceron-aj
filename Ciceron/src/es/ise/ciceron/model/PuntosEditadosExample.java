package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PuntosEditadosExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public PuntosEditadosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
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
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
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
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOSEDITADOS_V
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
     * This class corresponds to the database table AJ_PUNTOSEDITADOS_V
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

        public Criteria andIdTextoInformeIsNull() {
            addCriterion("ID_TEXTO_INFORME is null");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeIsNotNull() {
            addCriterion("ID_TEXTO_INFORME is not null");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeEqualTo(BigDecimal value) {
            addCriterion("ID_TEXTO_INFORME =", value, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeNotEqualTo(BigDecimal value) {
            addCriterion("ID_TEXTO_INFORME <>", value, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeGreaterThan(BigDecimal value) {
            addCriterion("ID_TEXTO_INFORME >", value, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_TEXTO_INFORME >=", value, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeLessThan(BigDecimal value) {
            addCriterion("ID_TEXTO_INFORME <", value, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_TEXTO_INFORME <=", value, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeIn(List<BigDecimal> values) {
            addCriterion("ID_TEXTO_INFORME in", values, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeNotIn(List<BigDecimal> values) {
            addCriterion("ID_TEXTO_INFORME not in", values, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_TEXTO_INFORME between", value1, value2, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdTextoInformeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_TEXTO_INFORME not between", value1, value2, "idTextoInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeIsNull() {
            addCriterion("ID_INFORME is null");
            return (Criteria) this;
        }

        public Criteria andIdInformeIsNotNull() {
            addCriterion("ID_INFORME is not null");
            return (Criteria) this;
        }

        public Criteria andIdInformeEqualTo(BigDecimal value) {
            addCriterion("ID_INFORME =", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeNotEqualTo(BigDecimal value) {
            addCriterion("ID_INFORME <>", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeGreaterThan(BigDecimal value) {
            addCriterion("ID_INFORME >", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_INFORME >=", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeLessThan(BigDecimal value) {
            addCriterion("ID_INFORME <", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_INFORME <=", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeIn(List<BigDecimal> values) {
            addCriterion("ID_INFORME in", values, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeNotIn(List<BigDecimal> values) {
            addCriterion("ID_INFORME not in", values, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_INFORME between", value1, value2, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_INFORME not between", value1, value2, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteIsNull() {
            addCriterion("ID_EXPEDIENTE is null");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteIsNotNull() {
            addCriterion("ID_EXPEDIENTE is not null");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteEqualTo(BigDecimal value) {
            addCriterion("ID_EXPEDIENTE =", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteNotEqualTo(BigDecimal value) {
            addCriterion("ID_EXPEDIENTE <>", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteGreaterThan(BigDecimal value) {
            addCriterion("ID_EXPEDIENTE >", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_EXPEDIENTE >=", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteLessThan(BigDecimal value) {
            addCriterion("ID_EXPEDIENTE <", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_EXPEDIENTE <=", value, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteIn(List<BigDecimal> values) {
            addCriterion("ID_EXPEDIENTE in", values, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteNotIn(List<BigDecimal> values) {
            addCriterion("ID_EXPEDIENTE not in", values, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_EXPEDIENTE between", value1, value2, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andIdExpedienteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_EXPEDIENTE not between", value1, value2, "idExpediente");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoIsNull() {
            addCriterion("ORDEN_PUNTO is null");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoIsNotNull() {
            addCriterion("ORDEN_PUNTO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoEqualTo(BigDecimal value) {
            addCriterion("ORDEN_PUNTO =", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoNotEqualTo(BigDecimal value) {
            addCriterion("ORDEN_PUNTO <>", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoGreaterThan(BigDecimal value) {
            addCriterion("ORDEN_PUNTO >", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDEN_PUNTO >=", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoLessThan(BigDecimal value) {
            addCriterion("ORDEN_PUNTO <", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDEN_PUNTO <=", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoIn(List<BigDecimal> values) {
            addCriterion("ORDEN_PUNTO in", values, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoNotIn(List<BigDecimal> values) {
            addCriterion("ORDEN_PUNTO not in", values, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDEN_PUNTO between", value1, value2, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDEN_PUNTO not between", value1, value2, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("DESCRIPCION is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("DESCRIPCION is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("DESCRIPCION =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("DESCRIPCION <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("DESCRIPCION >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("DESCRIPCION <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("DESCRIPCION like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("DESCRIPCION not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("DESCRIPCION in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("DESCRIPCION not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("DESCRIPCION between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoIsNull() {
            addCriterion("DESCRIPCION_PUNTO is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoIsNotNull() {
            addCriterion("DESCRIPCION_PUNTO is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoEqualTo(String value) {
            addCriterion("DESCRIPCION_PUNTO =", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoNotEqualTo(String value) {
            addCriterion("DESCRIPCION_PUNTO <>", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoGreaterThan(String value) {
            addCriterion("DESCRIPCION_PUNTO >", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_PUNTO >=", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoLessThan(String value) {
            addCriterion("DESCRIPCION_PUNTO <", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_PUNTO <=", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoLike(String value) {
            addCriterion("DESCRIPCION_PUNTO like", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoNotLike(String value) {
            addCriterion("DESCRIPCION_PUNTO not like", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoIn(List<String> values) {
            addCriterion("DESCRIPCION_PUNTO in", values, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoNotIn(List<String> values) {
            addCriterion("DESCRIPCION_PUNTO not in", values, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_PUNTO between", value1, value2, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_PUNTO not between", value1, value2, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueIsNull() {
            addCriterion("DESCRIPCION_BLOQUE is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueIsNotNull() {
            addCriterion("DESCRIPCION_BLOQUE is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueEqualTo(String value) {
            addCriterion("DESCRIPCION_BLOQUE =", value, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueNotEqualTo(String value) {
            addCriterion("DESCRIPCION_BLOQUE <>", value, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueGreaterThan(String value) {
            addCriterion("DESCRIPCION_BLOQUE >", value, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_BLOQUE >=", value, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueLessThan(String value) {
            addCriterion("DESCRIPCION_BLOQUE <", value, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_BLOQUE <=", value, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueLike(String value) {
            addCriterion("DESCRIPCION_BLOQUE like", value, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueNotLike(String value) {
            addCriterion("DESCRIPCION_BLOQUE not like", value, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueIn(List<String> values) {
            addCriterion("DESCRIPCION_BLOQUE in", values, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueNotIn(List<String> values) {
            addCriterion("DESCRIPCION_BLOQUE not in", values, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_BLOQUE between", value1, value2, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionBloqueNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_BLOQUE not between", value1, value2, "descripcionBloque");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaIsNull() {
            addCriterion("DESCRIPCION_TIPOLOGIA is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaIsNotNull() {
            addCriterion("DESCRIPCION_TIPOLOGIA is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaEqualTo(String value) {
            addCriterion("DESCRIPCION_TIPOLOGIA =", value, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaNotEqualTo(String value) {
            addCriterion("DESCRIPCION_TIPOLOGIA <>", value, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaGreaterThan(String value) {
            addCriterion("DESCRIPCION_TIPOLOGIA >", value, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_TIPOLOGIA >=", value, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaLessThan(String value) {
            addCriterion("DESCRIPCION_TIPOLOGIA <", value, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_TIPOLOGIA <=", value, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaLike(String value) {
            addCriterion("DESCRIPCION_TIPOLOGIA like", value, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaNotLike(String value) {
            addCriterion("DESCRIPCION_TIPOLOGIA not like", value, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaIn(List<String> values) {
            addCriterion("DESCRIPCION_TIPOLOGIA in", values, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaNotIn(List<String> values) {
            addCriterion("DESCRIPCION_TIPOLOGIA not in", values, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_TIPOLOGIA between", value1, value2, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andDescripcionTipologiaNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_TIPOLOGIA not between", value1, value2, "descripcionTipologia");
            return (Criteria) this;
        }

        public Criteria andTextoIsNull() {
            addCriterion("TEXTO is null");
            return (Criteria) this;
        }

        public Criteria andTextoIsNotNull() {
            addCriterion("TEXTO is not null");
            return (Criteria) this;
        }

        public Criteria andTextoEqualTo(String value) {
            addCriterion("TEXTO =", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoNotEqualTo(String value) {
            addCriterion("TEXTO <>", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoGreaterThan(String value) {
            addCriterion("TEXTO >", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTO >=", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoLessThan(String value) {
            addCriterion("TEXTO <", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoLessThanOrEqualTo(String value) {
            addCriterion("TEXTO <=", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoLike(String value) {
            addCriterion("TEXTO like", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoNotLike(String value) {
            addCriterion("TEXTO not like", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoIn(List<String> values) {
            addCriterion("TEXTO in", values, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoNotIn(List<String> values) {
            addCriterion("TEXTO not in", values, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoBetween(String value1, String value2) {
            addCriterion("TEXTO between", value1, value2, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoNotBetween(String value1, String value2) {
            addCriterion("TEXTO not between", value1, value2, "texto");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaIsNull() {
            addCriterion("ID_TIPOLOGIA is null");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaIsNotNull() {
            addCriterion("ID_TIPOLOGIA is not null");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaEqualTo(BigDecimal value) {
            addCriterion("ID_TIPOLOGIA =", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaNotEqualTo(BigDecimal value) {
            addCriterion("ID_TIPOLOGIA <>", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaGreaterThan(BigDecimal value) {
            addCriterion("ID_TIPOLOGIA >", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_TIPOLOGIA >=", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaLessThan(BigDecimal value) {
            addCriterion("ID_TIPOLOGIA <", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_TIPOLOGIA <=", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaIn(List<BigDecimal> values) {
            addCriterion("ID_TIPOLOGIA in", values, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaNotIn(List<BigDecimal> values) {
            addCriterion("ID_TIPOLOGIA not in", values, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_TIPOLOGIA between", value1, value2, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_TIPOLOGIA not between", value1, value2, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdBloqueIsNull() {
            addCriterion("ID_BLOQUE is null");
            return (Criteria) this;
        }

        public Criteria andIdBloqueIsNotNull() {
            addCriterion("ID_BLOQUE is not null");
            return (Criteria) this;
        }

        public Criteria andIdBloqueEqualTo(BigDecimal value) {
            addCriterion("ID_BLOQUE =", value, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueNotEqualTo(BigDecimal value) {
            addCriterion("ID_BLOQUE <>", value, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueGreaterThan(BigDecimal value) {
            addCriterion("ID_BLOQUE >", value, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_BLOQUE >=", value, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueLessThan(BigDecimal value) {
            addCriterion("ID_BLOQUE <", value, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_BLOQUE <=", value, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueIn(List<BigDecimal> values) {
            addCriterion("ID_BLOQUE in", values, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueNotIn(List<BigDecimal> values) {
            addCriterion("ID_BLOQUE not in", values, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_BLOQUE between", value1, value2, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdBloqueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_BLOQUE not between", value1, value2, "idBloque");
            return (Criteria) this;
        }

        public Criteria andIdPuntoIsNull() {
            addCriterion("ID_PUNTO is null");
            return (Criteria) this;
        }

        public Criteria andIdPuntoIsNotNull() {
            addCriterion("ID_PUNTO is not null");
            return (Criteria) this;
        }

        public Criteria andIdPuntoEqualTo(BigDecimal value) {
            addCriterion("ID_PUNTO =", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoNotEqualTo(BigDecimal value) {
            addCriterion("ID_PUNTO <>", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoGreaterThan(BigDecimal value) {
            addCriterion("ID_PUNTO >", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_PUNTO >=", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoLessThan(BigDecimal value) {
            addCriterion("ID_PUNTO <", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_PUNTO <=", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoIn(List<BigDecimal> values) {
            addCriterion("ID_PUNTO in", values, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoNotIn(List<BigDecimal> values) {
            addCriterion("ID_PUNTO not in", values, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_PUNTO between", value1, value2, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_PUNTO not between", value1, value2, "idPunto");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_PUNTOSEDITADOS_V
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
     * This class corresponds to the database table AJ_PUNTOSEDITADOS_V
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