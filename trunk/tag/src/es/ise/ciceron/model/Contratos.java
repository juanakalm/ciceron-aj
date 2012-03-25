package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.Date;

public class Contratos {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_EXP_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal idExpediente;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_DESCRIPCION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String descripcion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_EN_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal idEntidad;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_FECHA_FORMALIZACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private Date fechaFormalizacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_IMPORTE_BASE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal importeBase;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_IMPORTE_IVA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal importeIva;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_IVA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal iva;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String uCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private Date fCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String uActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private Date fActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_CERRADO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String cerrado;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATOS.CON_F_CIERRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private Date fechaCierre;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_ID
     *
     * @return the value of CONTRATOS.CON_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_ID
     *
     * @param id the value for CONTRATOS.CON_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_EXP_ID
     *
     * @return the value of CONTRATOS.CON_EXP_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIdExpediente() {
        return idExpediente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_EXP_ID
     *
     * @param idExpediente the value for CONTRATOS.CON_EXP_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIdExpediente(BigDecimal idExpediente) {
        this.idExpediente = idExpediente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_DESCRIPCION
     *
     * @return the value of CONTRATOS.CON_DESCRIPCION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_DESCRIPCION
     *
     * @param descripcion the value for CONTRATOS.CON_DESCRIPCION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_EN_ID
     *
     * @return the value of CONTRATOS.CON_EN_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIdEntidad() {
        return idEntidad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_EN_ID
     *
     * @param idEntidad the value for CONTRATOS.CON_EN_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIdEntidad(BigDecimal idEntidad) {
        this.idEntidad = idEntidad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_FECHA_FORMALIZACION
     *
     * @return the value of CONTRATOS.CON_FECHA_FORMALIZACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Date getFechaFormalizacion() {
        return fechaFormalizacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_FECHA_FORMALIZACION
     *
     * @param fechaFormalizacion the value for CONTRATOS.CON_FECHA_FORMALIZACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setFechaFormalizacion(Date fechaFormalizacion) {
        this.fechaFormalizacion = fechaFormalizacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_IMPORTE_BASE
     *
     * @return the value of CONTRATOS.CON_IMPORTE_BASE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getImporteBase() {
        return importeBase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_IMPORTE_BASE
     *
     * @param importeBase the value for CONTRATOS.CON_IMPORTE_BASE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setImporteBase(BigDecimal importeBase) {
        this.importeBase = importeBase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_IMPORTE_IVA
     *
     * @return the value of CONTRATOS.CON_IMPORTE_IVA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getImporteIva() {
        return importeIva;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_IMPORTE_IVA
     *
     * @param importeIva the value for CONTRATOS.CON_IMPORTE_IVA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setImporteIva(BigDecimal importeIva) {
        this.importeIva = importeIva;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_IVA
     *
     * @return the value of CONTRATOS.CON_IVA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIva() {
        return iva;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_IVA
     *
     * @param iva the value for CONTRATOS.CON_IVA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_U_CREACION
     *
     * @return the value of CONTRATOS.CON_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getuCreacion() {
        return uCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_U_CREACION
     *
     * @param uCreacion the value for CONTRATOS.CON_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setuCreacion(String uCreacion) {
        this.uCreacion = uCreacion == null ? null : uCreacion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_F_CREACION
     *
     * @return the value of CONTRATOS.CON_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Date getfCreacion() {
        return fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_F_CREACION
     *
     * @param fCreacion the value for CONTRATOS.CON_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_U_ACTU
     *
     * @return the value of CONTRATOS.CON_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getuActu() {
        return uActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_U_ACTU
     *
     * @param uActu the value for CONTRATOS.CON_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setuActu(String uActu) {
        this.uActu = uActu == null ? null : uActu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_F_ACTU
     *
     * @return the value of CONTRATOS.CON_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Date getfActu() {
        return fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_F_ACTU
     *
     * @param fActu the value for CONTRATOS.CON_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setfActu(Date fActu) {
        this.fActu = fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_CERRADO
     *
     * @return the value of CONTRATOS.CON_CERRADO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getCerrado() {
        return cerrado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_CERRADO
     *
     * @param cerrado the value for CONTRATOS.CON_CERRADO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setCerrado(String cerrado) {
        this.cerrado = cerrado == null ? null : cerrado.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATOS.CON_F_CIERRE
     *
     * @return the value of CONTRATOS.CON_F_CIERRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Date getFechaCierre() {
        return fechaCierre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATOS.CON_F_CIERRE
     *
     * @param fechaCierre the value for CONTRATOS.CON_F_CIERRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
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

    public void copyCreacion(Contratos source) {
        this.fCreacion = source.fCreacion;
        this.uCreacion = source.uCreacion;
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }

    public void copyActualizacion(Contratos source) {
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }
}