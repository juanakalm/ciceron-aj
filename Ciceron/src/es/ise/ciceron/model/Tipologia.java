package es.ise.ciceron.model;

import java.math.BigDecimal;

public class Tipologia {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_TIPOLOGIA_INFORMES.TI_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_TIPOLOGIA_INFORMES.TI_DESCRIPCION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String descripcion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_TIPOLOGIA_INFORMES.TI_ID
     *
     * @return the value of AJ_TIPOLOGIA_INFORMES.TI_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_TIPOLOGIA_INFORMES.TI_ID
     *
     * @param id the value for AJ_TIPOLOGIA_INFORMES.TI_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_TIPOLOGIA_INFORMES.TI_DESCRIPCION
     *
     * @return the value of AJ_TIPOLOGIA_INFORMES.TI_DESCRIPCION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_TIPOLOGIA_INFORMES.TI_DESCRIPCION
     *
     * @param descripcion the value for AJ_TIPOLOGIA_INFORMES.TI_DESCRIPCION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }
}