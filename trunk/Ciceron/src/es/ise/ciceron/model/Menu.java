package es.ise.ciceron.model;

import java.math.BigDecimal;

public class Menu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_MENUS.M_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_MENUS.M_DESCRIPCION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String descripcion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_MENUS.M_EJECUTABLE
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String ejecutable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_MENUS.M_ORDEN
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal orden;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_MENUS.M_ID
     *
     * @return the value of AJ_MENUS.M_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_MENUS.M_ID
     *
     * @param id the value for AJ_MENUS.M_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_MENUS.M_DESCRIPCION
     *
     * @return the value of AJ_MENUS.M_DESCRIPCION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_MENUS.M_DESCRIPCION
     *
     * @param descripcion the value for AJ_MENUS.M_DESCRIPCION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_MENUS.M_EJECUTABLE
     *
     * @return the value of AJ_MENUS.M_EJECUTABLE
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getEjecutable() {
        return ejecutable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_MENUS.M_EJECUTABLE
     *
     * @param ejecutable the value for AJ_MENUS.M_EJECUTABLE
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setEjecutable(String ejecutable) {
        this.ejecutable = ejecutable == null ? null : ejecutable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_MENUS.M_ORDEN
     *
     * @return the value of AJ_MENUS.M_ORDEN
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getOrden() {
        return orden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_MENUS.M_ORDEN
     *
     * @param orden the value for AJ_MENUS.M_ORDEN
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setOrden(BigDecimal orden) {
        this.orden = orden;
    }
}