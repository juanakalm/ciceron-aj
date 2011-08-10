package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.Date;

public class Informe {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_INFORME.INF_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_INFORME.INF_DOC_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal idDocumento;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_INFORME.INF_EXP_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal idExpediente;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_INFORME.INF_U_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String uCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_INFORME.INF_F_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private Date fCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_INFORME.INF_U_ACTU
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String uActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_INFORME.INF_F_ACTU
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private Date fActu;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_INFORME.INF_ID
     *
     * @return the value of AJ_INFORME.INF_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_INFORME.INF_ID
     *
     * @param id the value for AJ_INFORME.INF_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_INFORME.INF_DOC_ID
     *
     * @return the value of AJ_INFORME.INF_DOC_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getIdDocumento() {
        return idDocumento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_INFORME.INF_DOC_ID
     *
     * @param idDocumento the value for AJ_INFORME.INF_DOC_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setIdDocumento(BigDecimal idDocumento) {
        this.idDocumento = idDocumento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_INFORME.INF_EXP_ID
     *
     * @return the value of AJ_INFORME.INF_EXP_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getIdExpediente() {
        return idExpediente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_INFORME.INF_EXP_ID
     *
     * @param idExpediente the value for AJ_INFORME.INF_EXP_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setIdExpediente(BigDecimal idExpediente) {
        this.idExpediente = idExpediente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_INFORME.INF_U_CREACION
     *
     * @return the value of AJ_INFORME.INF_U_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getuCreacion() {
        return uCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_INFORME.INF_U_CREACION
     *
     * @param uCreacion the value for AJ_INFORME.INF_U_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setuCreacion(String uCreacion) {
        this.uCreacion = uCreacion == null ? null : uCreacion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_INFORME.INF_F_CREACION
     *
     * @return the value of AJ_INFORME.INF_F_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public Date getfCreacion() {
        return fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_INFORME.INF_F_CREACION
     *
     * @param fCreacion the value for AJ_INFORME.INF_F_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_INFORME.INF_U_ACTU
     *
     * @return the value of AJ_INFORME.INF_U_ACTU
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getuActu() {
        return uActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_INFORME.INF_U_ACTU
     *
     * @param uActu the value for AJ_INFORME.INF_U_ACTU
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setuActu(String uActu) {
        this.uActu = uActu == null ? null : uActu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_INFORME.INF_F_ACTU
     *
     * @return the value of AJ_INFORME.INF_F_ACTU
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public Date getfActu() {
        return fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_INFORME.INF_F_ACTU
     *
     * @param fActu the value for AJ_INFORME.INF_F_ACTU
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
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

    public void copyCreacion(Informe source) {
        this.fCreacion = source.fCreacion;
        this.uCreacion = source.uCreacion;
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }

    public void copyActualizacion(Informe source) {
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }
}