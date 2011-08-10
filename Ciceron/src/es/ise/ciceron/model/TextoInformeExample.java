package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TextoInformeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public TextoInformeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
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
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("TEI_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("TEI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("TEI_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("TEI_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("TEI_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEI_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("TEI_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEI_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("TEI_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("TEI_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEI_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEI_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTextoIsNull() {
            addCriterion("TEI_TEXTO is null");
            return (Criteria) this;
        }

        public Criteria andTextoIsNotNull() {
            addCriterion("TEI_TEXTO is not null");
            return (Criteria) this;
        }

        public Criteria andTextoEqualTo(String value) {
            addCriterion("TEI_TEXTO =", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoNotEqualTo(String value) {
            addCriterion("TEI_TEXTO <>", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoGreaterThan(String value) {
            addCriterion("TEI_TEXTO >", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoGreaterThanOrEqualTo(String value) {
            addCriterion("TEI_TEXTO >=", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoLessThan(String value) {
            addCriterion("TEI_TEXTO <", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoLessThanOrEqualTo(String value) {
            addCriterion("TEI_TEXTO <=", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoLike(String value) {
            addCriterion("TEI_TEXTO like", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoNotLike(String value) {
            addCriterion("TEI_TEXTO not like", value, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoIn(List<String> values) {
            addCriterion("TEI_TEXTO in", values, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoNotIn(List<String> values) {
            addCriterion("TEI_TEXTO not in", values, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoBetween(String value1, String value2) {
            addCriterion("TEI_TEXTO between", value1, value2, "texto");
            return (Criteria) this;
        }

        public Criteria andTextoNotBetween(String value1, String value2) {
            addCriterion("TEI_TEXTO not between", value1, value2, "texto");
            return (Criteria) this;
        }

        public Criteria andIdInformeIsNull() {
            addCriterion("TEI_INF_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdInformeIsNotNull() {
            addCriterion("TEI_INF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdInformeEqualTo(BigDecimal value) {
            addCriterion("TEI_INF_ID =", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeNotEqualTo(BigDecimal value) {
            addCriterion("TEI_INF_ID <>", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeGreaterThan(BigDecimal value) {
            addCriterion("TEI_INF_ID >", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEI_INF_ID >=", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeLessThan(BigDecimal value) {
            addCriterion("TEI_INF_ID <", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEI_INF_ID <=", value, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeIn(List<BigDecimal> values) {
            addCriterion("TEI_INF_ID in", values, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeNotIn(List<BigDecimal> values) {
            addCriterion("TEI_INF_ID not in", values, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEI_INF_ID between", value1, value2, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdInformeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEI_INF_ID not between", value1, value2, "idInforme");
            return (Criteria) this;
        }

        public Criteria andIdPuntoIsNull() {
            addCriterion("TEI_P_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdPuntoIsNotNull() {
            addCriterion("TEI_P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdPuntoEqualTo(BigDecimal value) {
            addCriterion("TEI_P_ID =", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoNotEqualTo(BigDecimal value) {
            addCriterion("TEI_P_ID <>", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoGreaterThan(BigDecimal value) {
            addCriterion("TEI_P_ID >", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEI_P_ID >=", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoLessThan(BigDecimal value) {
            addCriterion("TEI_P_ID <", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEI_P_ID <=", value, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoIn(List<BigDecimal> values) {
            addCriterion("TEI_P_ID in", values, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoNotIn(List<BigDecimal> values) {
            addCriterion("TEI_P_ID not in", values, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEI_P_ID between", value1, value2, "idPunto");
            return (Criteria) this;
        }

        public Criteria andIdPuntoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEI_P_ID not between", value1, value2, "idPunto");
            return (Criteria) this;
        }

        public Criteria andUCreacionIsNull() {
            addCriterion("TEI_U_CREACION is null");
            return (Criteria) this;
        }

        public Criteria andUCreacionIsNotNull() {
            addCriterion("TEI_U_CREACION is not null");
            return (Criteria) this;
        }

        public Criteria andUCreacionEqualTo(String value) {
            addCriterion("TEI_U_CREACION =", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionNotEqualTo(String value) {
            addCriterion("TEI_U_CREACION <>", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionGreaterThan(String value) {
            addCriterion("TEI_U_CREACION >", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionGreaterThanOrEqualTo(String value) {
            addCriterion("TEI_U_CREACION >=", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionLessThan(String value) {
            addCriterion("TEI_U_CREACION <", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionLessThanOrEqualTo(String value) {
            addCriterion("TEI_U_CREACION <=", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionLike(String value) {
            addCriterion("TEI_U_CREACION like", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionNotLike(String value) {
            addCriterion("TEI_U_CREACION not like", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionIn(List<String> values) {
            addCriterion("TEI_U_CREACION in", values, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionNotIn(List<String> values) {
            addCriterion("TEI_U_CREACION not in", values, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionBetween(String value1, String value2) {
            addCriterion("TEI_U_CREACION between", value1, value2, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionNotBetween(String value1, String value2) {
            addCriterion("TEI_U_CREACION not between", value1, value2, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionIsNull() {
            addCriterion("TEI_F_CREACION is null");
            return (Criteria) this;
        }

        public Criteria andFCreacionIsNotNull() {
            addCriterion("TEI_F_CREACION is not null");
            return (Criteria) this;
        }

        public Criteria andFCreacionEqualTo(Date value) {
            addCriterionForJDBCDate("TEI_F_CREACION =", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("TEI_F_CREACION <>", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionGreaterThan(Date value) {
            addCriterionForJDBCDate("TEI_F_CREACION >", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEI_F_CREACION >=", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionLessThan(Date value) {
            addCriterionForJDBCDate("TEI_F_CREACION <", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEI_F_CREACION <=", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionIn(List<Date> values) {
            addCriterionForJDBCDate("TEI_F_CREACION in", values, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("TEI_F_CREACION not in", values, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEI_F_CREACION between", value1, value2, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEI_F_CREACION not between", value1, value2, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andUActuIsNull() {
            addCriterion("TEI_U_ACTU is null");
            return (Criteria) this;
        }

        public Criteria andUActuIsNotNull() {
            addCriterion("TEI_U_ACTU is not null");
            return (Criteria) this;
        }

        public Criteria andUActuEqualTo(String value) {
            addCriterion("TEI_U_ACTU =", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuNotEqualTo(String value) {
            addCriterion("TEI_U_ACTU <>", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuGreaterThan(String value) {
            addCriterion("TEI_U_ACTU >", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuGreaterThanOrEqualTo(String value) {
            addCriterion("TEI_U_ACTU >=", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuLessThan(String value) {
            addCriterion("TEI_U_ACTU <", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuLessThanOrEqualTo(String value) {
            addCriterion("TEI_U_ACTU <=", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuLike(String value) {
            addCriterion("TEI_U_ACTU like", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuNotLike(String value) {
            addCriterion("TEI_U_ACTU not like", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuIn(List<String> values) {
            addCriterion("TEI_U_ACTU in", values, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuNotIn(List<String> values) {
            addCriterion("TEI_U_ACTU not in", values, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuBetween(String value1, String value2) {
            addCriterion("TEI_U_ACTU between", value1, value2, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuNotBetween(String value1, String value2) {
            addCriterion("TEI_U_ACTU not between", value1, value2, "uActu");
            return (Criteria) this;
        }

        public Criteria andFActuIsNull() {
            addCriterion("TEI_F_ACTU is null");
            return (Criteria) this;
        }

        public Criteria andFActuIsNotNull() {
            addCriterion("TEI_F_ACTU is not null");
            return (Criteria) this;
        }

        public Criteria andFActuEqualTo(Date value) {
            addCriterionForJDBCDate("TEI_F_ACTU =", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuNotEqualTo(Date value) {
            addCriterionForJDBCDate("TEI_F_ACTU <>", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuGreaterThan(Date value) {
            addCriterionForJDBCDate("TEI_F_ACTU >", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEI_F_ACTU >=", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuLessThan(Date value) {
            addCriterionForJDBCDate("TEI_F_ACTU <", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEI_F_ACTU <=", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuIn(List<Date> values) {
            addCriterionForJDBCDate("TEI_F_ACTU in", values, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuNotIn(List<Date> values) {
            addCriterionForJDBCDate("TEI_F_ACTU not in", values, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEI_F_ACTU between", value1, value2, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEI_F_ACTU not between", value1, value2, "fActu");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoIsNull() {
            addCriterion("TEI_P_ORDEN is null");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoIsNotNull() {
            addCriterion("TEI_P_ORDEN is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoEqualTo(BigDecimal value) {
            addCriterion("TEI_P_ORDEN =", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoNotEqualTo(BigDecimal value) {
            addCriterion("TEI_P_ORDEN <>", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoGreaterThan(BigDecimal value) {
            addCriterion("TEI_P_ORDEN >", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEI_P_ORDEN >=", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoLessThan(BigDecimal value) {
            addCriterion("TEI_P_ORDEN <", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEI_P_ORDEN <=", value, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoIn(List<BigDecimal> values) {
            addCriterion("TEI_P_ORDEN in", values, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoNotIn(List<BigDecimal> values) {
            addCriterion("TEI_P_ORDEN not in", values, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEI_P_ORDEN between", value1, value2, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andOrdenPuntoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEI_P_ORDEN not between", value1, value2, "ordenPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoIsNull() {
            addCriterion("TEI_P_DESCRIPCION is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoIsNotNull() {
            addCriterion("TEI_P_DESCRIPCION is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoEqualTo(String value) {
            addCriterion("TEI_P_DESCRIPCION =", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoNotEqualTo(String value) {
            addCriterion("TEI_P_DESCRIPCION <>", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoGreaterThan(String value) {
            addCriterion("TEI_P_DESCRIPCION >", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoGreaterThanOrEqualTo(String value) {
            addCriterion("TEI_P_DESCRIPCION >=", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoLessThan(String value) {
            addCriterion("TEI_P_DESCRIPCION <", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoLessThanOrEqualTo(String value) {
            addCriterion("TEI_P_DESCRIPCION <=", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoLike(String value) {
            addCriterion("TEI_P_DESCRIPCION like", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoNotLike(String value) {
            addCriterion("TEI_P_DESCRIPCION not like", value, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoIn(List<String> values) {
            addCriterion("TEI_P_DESCRIPCION in", values, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoNotIn(List<String> values) {
            addCriterion("TEI_P_DESCRIPCION not in", values, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoBetween(String value1, String value2) {
            addCriterion("TEI_P_DESCRIPCION between", value1, value2, "descripcionPunto");
            return (Criteria) this;
        }

        public Criteria andDescripcionPuntoNotBetween(String value1, String value2) {
            addCriterion("TEI_P_DESCRIPCION not between", value1, value2, "descripcionPunto");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 08 10:45:32 CEST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_TEXTO_INFORME
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
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