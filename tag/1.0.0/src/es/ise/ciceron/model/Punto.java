package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.Date;

public class Punto {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_B_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal idBloque;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_DESCRIPCION_CORTA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String descripcionCorta;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_DESCRIPCION_LARGA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String descripcionLarga;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_ORDEN
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal orden;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String uCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private Date fCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String uActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_PUNTOS.P_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private Date fActu;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_ID
     *
     * @return the value of AJ_PUNTOS.P_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_ID
     *
     * @param id the value for AJ_PUNTOS.P_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_B_ID
     *
     * @return the value of AJ_PUNTOS.P_B_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIdBloque() {
        return idBloque;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_B_ID
     *
     * @param idBloque the value for AJ_PUNTOS.P_B_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIdBloque(BigDecimal idBloque) {
        this.idBloque = idBloque;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_DESCRIPCION_CORTA
     *
     * @return the value of AJ_PUNTOS.P_DESCRIPCION_CORTA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_DESCRIPCION_CORTA
     *
     * @param descripcionCorta the value for AJ_PUNTOS.P_DESCRIPCION_CORTA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta == null ? null : descripcionCorta.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_DESCRIPCION_LARGA
     *
     * @return the value of AJ_PUNTOS.P_DESCRIPCION_LARGA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_DESCRIPCION_LARGA
     *
     * @param descripcionLarga the value for AJ_PUNTOS.P_DESCRIPCION_LARGA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga == null ? null : descripcionLarga.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_ORDEN
     *
     * @return the value of AJ_PUNTOS.P_ORDEN
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getOrden() {
        return orden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_ORDEN
     *
     * @param orden the value for AJ_PUNTOS.P_ORDEN
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setOrden(BigDecimal orden) {
        this.orden = orden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_U_CREACION
     *
     * @return the value of AJ_PUNTOS.P_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getuCreacion() {
        return uCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_U_CREACION
     *
     * @param uCreacion the value for AJ_PUNTOS.P_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setuCreacion(String uCreacion) {
        this.uCreacion = uCreacion == null ? null : uCreacion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_F_CREACION
     *
     * @return the value of AJ_PUNTOS.P_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Date getfCreacion() {
        return fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_F_CREACION
     *
     * @param fCreacion the value for AJ_PUNTOS.P_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_U_ACTU
     *
     * @return the value of AJ_PUNTOS.P_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getuActu() {
        return uActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_U_ACTU
     *
     * @param uActu the value for AJ_PUNTOS.P_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setuActu(String uActu) {
        this.uActu = uActu == null ? null : uActu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_PUNTOS.P_F_ACTU
     *
     * @return the value of AJ_PUNTOS.P_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Date getfActu() {
        return fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_PUNTOS.P_F_ACTU
     *
     * @param fActu the value for AJ_PUNTOS.P_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setfActu(Date fActu) {
        this.fActu = fActu;
    }

    public void setActualizacion(Date fecha, Usuario usuario) {
        this.fActu = fecha;
        this.uActu = usuario.getIdentificador();
    }

    public void setCreacion(Date fecha, Usuario usuario) {
        this.fCreacion = fecha;
        this.uCreacion = usuario.getIdentificador();
        this.fActu = fecha;
        this.uActu = usuario.getIdentificador();
    }

    public void copyCreacion(Punto source) {
        this.fCreacion = source.fCreacion;
        this.uCreacion = source.uCreacion;
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }

    public void copyActualizacion(Punto source) {
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }
}