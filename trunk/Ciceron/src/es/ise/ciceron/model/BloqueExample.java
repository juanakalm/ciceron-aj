package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BloqueExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public BloqueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
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
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
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
            addCriterion("B_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("B_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("B_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("B_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("B_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("B_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("B_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("B_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("B_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("B_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("B_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("B_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("B_DESCRIPCION is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("B_DESCRIPCION is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("B_DESCRIPCION =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("B_DESCRIPCION <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("B_DESCRIPCION >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("B_DESCRIPCION >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("B_DESCRIPCION <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("B_DESCRIPCION <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("B_DESCRIPCION like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("B_DESCRIPCION not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("B_DESCRIPCION in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("B_DESCRIPCION not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("B_DESCRIPCION between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("B_DESCRIPCION not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andOrdenIsNull() {
            addCriterion("B_ORDEN is null");
            return (Criteria) this;
        }

        public Criteria andOrdenIsNotNull() {
            addCriterion("B_ORDEN is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenEqualTo(BigDecimal value) {
            addCriterion("B_ORDEN =", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenNotEqualTo(BigDecimal value) {
            addCriterion("B_ORDEN <>", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenGreaterThan(BigDecimal value) {
            addCriterion("B_ORDEN >", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("B_ORDEN >=", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenLessThan(BigDecimal value) {
            addCriterion("B_ORDEN <", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("B_ORDEN <=", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenIn(List<BigDecimal> values) {
            addCriterion("B_ORDEN in", values, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenNotIn(List<BigDecimal> values) {
            addCriterion("B_ORDEN not in", values, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("B_ORDEN between", value1, value2, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("B_ORDEN not between", value1, value2, "orden");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaIsNull() {
            addCriterion("B_TI_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaIsNotNull() {
            addCriterion("B_TI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaEqualTo(BigDecimal value) {
            addCriterion("B_TI_ID =", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaNotEqualTo(BigDecimal value) {
            addCriterion("B_TI_ID <>", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaGreaterThan(BigDecimal value) {
            addCriterion("B_TI_ID >", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("B_TI_ID >=", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaLessThan(BigDecimal value) {
            addCriterion("B_TI_ID <", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("B_TI_ID <=", value, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaIn(List<BigDecimal> values) {
            addCriterion("B_TI_ID in", values, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaNotIn(List<BigDecimal> values) {
            addCriterion("B_TI_ID not in", values, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("B_TI_ID between", value1, value2, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andIdTipologiaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("B_TI_ID not between", value1, value2, "idTipologia");
            return (Criteria) this;
        }

        public Criteria andUCreacionIsNull() {
            addCriterion("B_U_CREACION is null");
            return (Criteria) this;
        }

        public Criteria andUCreacionIsNotNull() {
            addCriterion("B_U_CREACION is not null");
            return (Criteria) this;
        }

        public Criteria andUCreacionEqualTo(String value) {
            addCriterion("B_U_CREACION =", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionNotEqualTo(String value) {
            addCriterion("B_U_CREACION <>", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionGreaterThan(String value) {
            addCriterion("B_U_CREACION >", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionGreaterThanOrEqualTo(String value) {
            addCriterion("B_U_CREACION >=", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionLessThan(String value) {
            addCriterion("B_U_CREACION <", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionLessThanOrEqualTo(String value) {
            addCriterion("B_U_CREACION <=", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionLike(String value) {
            addCriterion("B_U_CREACION like", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionNotLike(String value) {
            addCriterion("B_U_CREACION not like", value, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionIn(List<String> values) {
            addCriterion("B_U_CREACION in", values, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionNotIn(List<String> values) {
            addCriterion("B_U_CREACION not in", values, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionBetween(String value1, String value2) {
            addCriterion("B_U_CREACION between", value1, value2, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andUCreacionNotBetween(String value1, String value2) {
            addCriterion("B_U_CREACION not between", value1, value2, "uCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionIsNull() {
            addCriterion("B_F_CREACION is null");
            return (Criteria) this;
        }

        public Criteria andFCreacionIsNotNull() {
            addCriterion("B_F_CREACION is not null");
            return (Criteria) this;
        }

        public Criteria andFCreacionEqualTo(Date value) {
            addCriterionForJDBCDate("B_F_CREACION =", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("B_F_CREACION <>", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionGreaterThan(Date value) {
            addCriterionForJDBCDate("B_F_CREACION >", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("B_F_CREACION >=", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionLessThan(Date value) {
            addCriterionForJDBCDate("B_F_CREACION <", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("B_F_CREACION <=", value, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionIn(List<Date> values) {
            addCriterionForJDBCDate("B_F_CREACION in", values, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("B_F_CREACION not in", values, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("B_F_CREACION between", value1, value2, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andFCreacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("B_F_CREACION not between", value1, value2, "fCreacion");
            return (Criteria) this;
        }

        public Criteria andUActuIsNull() {
            addCriterion("B_U_ACTU is null");
            return (Criteria) this;
        }

        public Criteria andUActuIsNotNull() {
            addCriterion("B_U_ACTU is not null");
            return (Criteria) this;
        }

        public Criteria andUActuEqualTo(String value) {
            addCriterion("B_U_ACTU =", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuNotEqualTo(String value) {
            addCriterion("B_U_ACTU <>", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuGreaterThan(String value) {
            addCriterion("B_U_ACTU >", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuGreaterThanOrEqualTo(String value) {
            addCriterion("B_U_ACTU >=", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuLessThan(String value) {
            addCriterion("B_U_ACTU <", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuLessThanOrEqualTo(String value) {
            addCriterion("B_U_ACTU <=", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuLike(String value) {
            addCriterion("B_U_ACTU like", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuNotLike(String value) {
            addCriterion("B_U_ACTU not like", value, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuIn(List<String> values) {
            addCriterion("B_U_ACTU in", values, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuNotIn(List<String> values) {
            addCriterion("B_U_ACTU not in", values, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuBetween(String value1, String value2) {
            addCriterion("B_U_ACTU between", value1, value2, "uActu");
            return (Criteria) this;
        }

        public Criteria andUActuNotBetween(String value1, String value2) {
            addCriterion("B_U_ACTU not between", value1, value2, "uActu");
            return (Criteria) this;
        }

        public Criteria andFActuIsNull() {
            addCriterion("B_F_ACTU is null");
            return (Criteria) this;
        }

        public Criteria andFActuIsNotNull() {
            addCriterion("B_F_ACTU is not null");
            return (Criteria) this;
        }

        public Criteria andFActuEqualTo(Date value) {
            addCriterionForJDBCDate("B_F_ACTU =", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuNotEqualTo(Date value) {
            addCriterionForJDBCDate("B_F_ACTU <>", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuGreaterThan(Date value) {
            addCriterionForJDBCDate("B_F_ACTU >", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("B_F_ACTU >=", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuLessThan(Date value) {
            addCriterionForJDBCDate("B_F_ACTU <", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("B_F_ACTU <=", value, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuIn(List<Date> values) {
            addCriterionForJDBCDate("B_F_ACTU in", values, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuNotIn(List<Date> values) {
            addCriterionForJDBCDate("B_F_ACTU not in", values, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("B_F_ACTU between", value1, value2, "fActu");
            return (Criteria) this;
        }

        public Criteria andFActuNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("B_F_ACTU not between", value1, value2, "fActu");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 09 13:50:46 CEST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
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