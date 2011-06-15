package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.Date;

public class Bloque {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_BLOQUES.B_ID
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_BLOQUES.B_DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private String descripcion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_BLOQUES.B_ORDEN
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private BigDecimal orden;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_BLOQUES.B_TI_ID
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private BigDecimal idTipologia;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_BLOQUES.B_U_CREACION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private String uCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_BLOQUES.B_F_CREACION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private Date fCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_BLOQUES.B_U_ACTU
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private String uActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_BLOQUES.B_F_ACTU
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private Date fActu;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_BLOQUES.B_ID
     *
     * @return the value of AJ_BLOQUES.B_ID
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_BLOQUES.B_ID
     *
     * @param id the value for AJ_BLOQUES.B_ID
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_BLOQUES.B_DESCRIPCION
     *
     * @return the value of AJ_BLOQUES.B_DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_BLOQUES.B_DESCRIPCION
     *
     * @param descripcion the value for AJ_BLOQUES.B_DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_BLOQUES.B_ORDEN
     *
     * @return the value of AJ_BLOQUES.B_ORDEN
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public BigDecimal getOrden() {
        return orden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_BLOQUES.B_ORDEN
     *
     * @param orden the value for AJ_BLOQUES.B_ORDEN
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setOrden(BigDecimal orden) {
        this.orden = orden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_BLOQUES.B_TI_ID
     *
     * @return the value of AJ_BLOQUES.B_TI_ID
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public BigDecimal getIdTipologia() {
        return idTipologia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_BLOQUES.B_TI_ID
     *
     * @param idTipologia the value for AJ_BLOQUES.B_TI_ID
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setIdTipologia(BigDecimal idTipologia) {
        this.idTipologia = idTipologia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_BLOQUES.B_U_CREACION
     *
     * @return the value of AJ_BLOQUES.B_U_CREACION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getuCreacion() {
        return uCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_BLOQUES.B_U_CREACION
     *
     * @param uCreacion the value for AJ_BLOQUES.B_U_CREACION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setuCreacion(String uCreacion) {
        this.uCreacion = uCreacion == null ? null : uCreacion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_BLOQUES.B_F_CREACION
     *
     * @return the value of AJ_BLOQUES.B_F_CREACION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public Date getfCreacion() {
        return fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_BLOQUES.B_F_CREACION
     *
     * @param fCreacion the value for AJ_BLOQUES.B_F_CREACION
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_BLOQUES.B_U_ACTU
     *
     * @return the value of AJ_BLOQUES.B_U_ACTU
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getuActu() {
        return uActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_BLOQUES.B_U_ACTU
     *
     * @param uActu the value for AJ_BLOQUES.B_U_ACTU
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setuActu(String uActu) {
        this.uActu = uActu == null ? null : uActu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_BLOQUES.B_F_ACTU
     *
     * @return the value of AJ_BLOQUES.B_F_ACTU
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public Date getfActu() {
        return fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_BLOQUES.B_F_ACTU
     *
     * @param fActu the value for AJ_BLOQUES.B_F_ACTU
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
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

    public void copyCreacion(Bloque source) {
        this.fCreacion = source.fCreacion;
        this.uCreacion = source.uCreacion;
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }

    public void copyActualizacion(Bloque source) {
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }
}