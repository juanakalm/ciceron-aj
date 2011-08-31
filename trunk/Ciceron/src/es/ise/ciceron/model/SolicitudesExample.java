package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SolicitudesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public SolicitudesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
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
     * This method corresponds to the database table CONTA.SOLICITUDES
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
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
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
     * This class corresponds to the database table CONTA.SOLICITUDES
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

        public Criteria andIdIsNull() {
            addCriterion("S_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("S_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("S_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("S_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("S_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("S_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("S_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("S_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEjecIsNull() {
            addCriterion("S_EJEC is null");
            return (Criteria) this;
        }

        public Criteria andEjecIsNotNull() {
            addCriterion("S_EJEC is not null");
            return (Criteria) this;
        }

        public Criteria andEjecEqualTo(String value) {
            addCriterion("S_EJEC =", value, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecNotEqualTo(String value) {
            addCriterion("S_EJEC <>", value, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecGreaterThan(String value) {
            addCriterion("S_EJEC >", value, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecGreaterThanOrEqualTo(String value) {
            addCriterion("S_EJEC >=", value, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecLessThan(String value) {
            addCriterion("S_EJEC <", value, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecLessThanOrEqualTo(String value) {
            addCriterion("S_EJEC <=", value, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecLike(String value) {
            addCriterion("S_EJEC like", value, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecNotLike(String value) {
            addCriterion("S_EJEC not like", value, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecIn(List<String> values) {
            addCriterion("S_EJEC in", values, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecNotIn(List<String> values) {
            addCriterion("S_EJEC not in", values, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecBetween(String value1, String value2) {
            addCriterion("S_EJEC between", value1, value2, "ejec");
            return (Criteria) this;
        }

        public Criteria andEjecNotBetween(String value1, String value2) {
            addCriterion("S_EJEC not between", value1, value2, "ejec");
            return (Criteria) this;
        }

        public Criteria andTipoIsNull() {
            addCriterion("S_TIPO is null");
            return (Criteria) this;
        }

        public Criteria andTipoIsNotNull() {
            addCriterion("S_TIPO is not null");
            return (Criteria) this;
        }

        public Criteria andTipoEqualTo(BigDecimal value) {
            addCriterion("S_TIPO =", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotEqualTo(BigDecimal value) {
            addCriterion("S_TIPO <>", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoGreaterThan(BigDecimal value) {
            addCriterion("S_TIPO >", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_TIPO >=", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoLessThan(BigDecimal value) {
            addCriterion("S_TIPO <", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_TIPO <=", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoIn(List<BigDecimal> values) {
            addCriterion("S_TIPO in", values, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotIn(List<BigDecimal> values) {
            addCriterion("S_TIPO not in", values, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_TIPO between", value1, value2, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_TIPO not between", value1, value2, "tipo");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("S_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("S_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("S_DESC =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("S_DESC <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("S_DESC >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("S_DESC >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("S_DESC <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("S_DESC <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("S_DESC like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("S_DESC not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("S_DESC in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("S_DESC not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("S_DESC between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("S_DESC not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andPadreIsNull() {
            addCriterion("S_PADRE is null");
            return (Criteria) this;
        }

        public Criteria andPadreIsNotNull() {
            addCriterion("S_PADRE is not null");
            return (Criteria) this;
        }

        public Criteria andPadreEqualTo(BigDecimal value) {
            addCriterion("S_PADRE =", value, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreNotEqualTo(BigDecimal value) {
            addCriterion("S_PADRE <>", value, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreGreaterThan(BigDecimal value) {
            addCriterion("S_PADRE >", value, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_PADRE >=", value, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreLessThan(BigDecimal value) {
            addCriterion("S_PADRE <", value, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_PADRE <=", value, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreIn(List<BigDecimal> values) {
            addCriterion("S_PADRE in", values, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreNotIn(List<BigDecimal> values) {
            addCriterion("S_PADRE not in", values, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_PADRE between", value1, value2, "padre");
            return (Criteria) this;
        }

        public Criteria andPadreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_PADRE not between", value1, value2, "padre");
            return (Criteria) this;
        }

        public Criteria andRutaIsNull() {
            addCriterion("S_RUTA is null");
            return (Criteria) this;
        }

        public Criteria andRutaIsNotNull() {
            addCriterion("S_RUTA is not null");
            return (Criteria) this;
        }

        public Criteria andRutaEqualTo(BigDecimal value) {
            addCriterion("S_RUTA =", value, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaNotEqualTo(BigDecimal value) {
            addCriterion("S_RUTA <>", value, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaGreaterThan(BigDecimal value) {
            addCriterion("S_RUTA >", value, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_RUTA >=", value, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaLessThan(BigDecimal value) {
            addCriterion("S_RUTA <", value, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_RUTA <=", value, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaIn(List<BigDecimal> values) {
            addCriterion("S_RUTA in", values, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaNotIn(List<BigDecimal> values) {
            addCriterion("S_RUTA not in", values, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_RUTA between", value1, value2, "ruta");
            return (Criteria) this;
        }

        public Criteria andRutaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_RUTA not between", value1, value2, "ruta");
            return (Criteria) this;
        }

        public Criteria andFormatoIsNull() {
            addCriterion("S_FORMATO is null");
            return (Criteria) this;
        }

        public Criteria andFormatoIsNotNull() {
            addCriterion("S_FORMATO is not null");
            return (Criteria) this;
        }

        public Criteria andFormatoEqualTo(BigDecimal value) {
            addCriterion("S_FORMATO =", value, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoNotEqualTo(BigDecimal value) {
            addCriterion("S_FORMATO <>", value, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoGreaterThan(BigDecimal value) {
            addCriterion("S_FORMATO >", value, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_FORMATO >=", value, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoLessThan(BigDecimal value) {
            addCriterion("S_FORMATO <", value, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_FORMATO <=", value, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoIn(List<BigDecimal> values) {
            addCriterion("S_FORMATO in", values, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoNotIn(List<BigDecimal> values) {
            addCriterion("S_FORMATO not in", values, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_FORMATO between", value1, value2, "formato");
            return (Criteria) this;
        }

        public Criteria andFormatoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_FORMATO not between", value1, value2, "formato");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("S_VISIBLE is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("S_VISIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(String value) {
            addCriterion("S_VISIBLE =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(String value) {
            addCriterion("S_VISIBLE <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(String value) {
            addCriterion("S_VISIBLE >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(String value) {
            addCriterion("S_VISIBLE >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(String value) {
            addCriterion("S_VISIBLE <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(String value) {
            addCriterion("S_VISIBLE <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLike(String value) {
            addCriterion("S_VISIBLE like", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotLike(String value) {
            addCriterion("S_VISIBLE not like", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<String> values) {
            addCriterion("S_VISIBLE in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<String> values) {
            addCriterion("S_VISIBLE not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(String value1, String value2) {
            addCriterion("S_VISIBLE between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(String value1, String value2) {
            addCriterion("S_VISIBLE not between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andGerenciaIsNull() {
            addCriterion("S_GERENCIA is null");
            return (Criteria) this;
        }

        public Criteria andGerenciaIsNotNull() {
            addCriterion("S_GERENCIA is not null");
            return (Criteria) this;
        }

        public Criteria andGerenciaEqualTo(String value) {
            addCriterion("S_GERENCIA =", value, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaNotEqualTo(String value) {
            addCriterion("S_GERENCIA <>", value, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaGreaterThan(String value) {
            addCriterion("S_GERENCIA >", value, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaGreaterThanOrEqualTo(String value) {
            addCriterion("S_GERENCIA >=", value, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaLessThan(String value) {
            addCriterion("S_GERENCIA <", value, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaLessThanOrEqualTo(String value) {
            addCriterion("S_GERENCIA <=", value, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaLike(String value) {
            addCriterion("S_GERENCIA like", value, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaNotLike(String value) {
            addCriterion("S_GERENCIA not like", value, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaIn(List<String> values) {
            addCriterion("S_GERENCIA in", values, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaNotIn(List<String> values) {
            addCriterion("S_GERENCIA not in", values, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaBetween(String value1, String value2) {
            addCriterion("S_GERENCIA between", value1, value2, "gerencia");
            return (Criteria) this;
        }

        public Criteria andGerenciaNotBetween(String value1, String value2) {
            addCriterion("S_GERENCIA not between", value1, value2, "gerencia");
            return (Criteria) this;
        }

        public Criteria andExcelIsNull() {
            addCriterion("S_EXCEL is null");
            return (Criteria) this;
        }

        public Criteria andExcelIsNotNull() {
            addCriterion("S_EXCEL is not null");
            return (Criteria) this;
        }

        public Criteria andExcelEqualTo(String value) {
            addCriterion("S_EXCEL =", value, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelNotEqualTo(String value) {
            addCriterion("S_EXCEL <>", value, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelGreaterThan(String value) {
            addCriterion("S_EXCEL >", value, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelGreaterThanOrEqualTo(String value) {
            addCriterion("S_EXCEL >=", value, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelLessThan(String value) {
            addCriterion("S_EXCEL <", value, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelLessThanOrEqualTo(String value) {
            addCriterion("S_EXCEL <=", value, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelLike(String value) {
            addCriterion("S_EXCEL like", value, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelNotLike(String value) {
            addCriterion("S_EXCEL not like", value, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelIn(List<String> values) {
            addCriterion("S_EXCEL in", values, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelNotIn(List<String> values) {
            addCriterion("S_EXCEL not in", values, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelBetween(String value1, String value2) {
            addCriterion("S_EXCEL between", value1, value2, "excel");
            return (Criteria) this;
        }

        public Criteria andExcelNotBetween(String value1, String value2) {
            addCriterion("S_EXCEL not between", value1, value2, "excel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelIsNull() {
            addCriterion("S_CONSULTA_EXCEL is null");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelIsNotNull() {
            addCriterion("S_CONSULTA_EXCEL is not null");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelEqualTo(String value) {
            addCriterion("S_CONSULTA_EXCEL =", value, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelNotEqualTo(String value) {
            addCriterion("S_CONSULTA_EXCEL <>", value, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelGreaterThan(String value) {
            addCriterion("S_CONSULTA_EXCEL >", value, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelGreaterThanOrEqualTo(String value) {
            addCriterion("S_CONSULTA_EXCEL >=", value, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelLessThan(String value) {
            addCriterion("S_CONSULTA_EXCEL <", value, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelLessThanOrEqualTo(String value) {
            addCriterion("S_CONSULTA_EXCEL <=", value, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelLike(String value) {
            addCriterion("S_CONSULTA_EXCEL like", value, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelNotLike(String value) {
            addCriterion("S_CONSULTA_EXCEL not like", value, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelIn(List<String> values) {
            addCriterion("S_CONSULTA_EXCEL in", values, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelNotIn(List<String> values) {
            addCriterion("S_CONSULTA_EXCEL not in", values, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelBetween(String value1, String value2) {
            addCriterion("S_CONSULTA_EXCEL between", value1, value2, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelNotBetween(String value1, String value2) {
            addCriterion("S_CONSULTA_EXCEL not between", value1, value2, "consultaExcel");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebIsNull() {
            addCriterion("S_CONSULTA_EXCEL_WEB is null");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebIsNotNull() {
            addCriterion("S_CONSULTA_EXCEL_WEB is not null");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebEqualTo(String value) {
            addCriterion("S_CONSULTA_EXCEL_WEB =", value, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebNotEqualTo(String value) {
            addCriterion("S_CONSULTA_EXCEL_WEB <>", value, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebGreaterThan(String value) {
            addCriterion("S_CONSULTA_EXCEL_WEB >", value, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebGreaterThanOrEqualTo(String value) {
            addCriterion("S_CONSULTA_EXCEL_WEB >=", value, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebLessThan(String value) {
            addCriterion("S_CONSULTA_EXCEL_WEB <", value, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebLessThanOrEqualTo(String value) {
            addCriterion("S_CONSULTA_EXCEL_WEB <=", value, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebLike(String value) {
            addCriterion("S_CONSULTA_EXCEL_WEB like", value, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebNotLike(String value) {
            addCriterion("S_CONSULTA_EXCEL_WEB not like", value, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebIn(List<String> values) {
            addCriterion("S_CONSULTA_EXCEL_WEB in", values, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebNotIn(List<String> values) {
            addCriterion("S_CONSULTA_EXCEL_WEB not in", values, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebBetween(String value1, String value2) {
            addCriterion("S_CONSULTA_EXCEL_WEB between", value1, value2, "consultaExcelWeb");
            return (Criteria) this;
        }

        public Criteria andConsultaExcelWebNotBetween(String value1, String value2) {
            addCriterion("S_CONSULTA_EXCEL_WEB not between", value1, value2, "consultaExcelWeb");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CONTA.SOLICITUDES
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
     * This class corresponds to the database table CONTA.SOLICITUDES
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