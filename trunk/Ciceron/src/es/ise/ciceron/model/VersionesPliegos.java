package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.Date;

public class VersionesPliegos {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_NOMBRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_NOMBRE_FICH
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String nombreFichero;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_EXTENSION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String extension;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_VERSION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_NAT_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal idNaturaleza;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_PROC_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal idProcedimiento;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_TS_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal idTiposServicios;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_NORM_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal idNormativa;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_L_ACTIVO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String activo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String uCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String uActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private Date fCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private Date fActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VERSIONES_PLIEGOS.VP_FICHERO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private byte[] fichero;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_ID
     *
     * @return the value of VERSIONES_PLIEGOS.VP_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_ID
     *
     * @param id the value for VERSIONES_PLIEGOS.VP_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_NOMBRE
     *
     * @return the value of VERSIONES_PLIEGOS.VP_NOMBRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_NOMBRE
     *
     * @param nombre the value for VERSIONES_PLIEGOS.VP_NOMBRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_NOMBRE_FICH
     *
     * @return the value of VERSIONES_PLIEGOS.VP_NOMBRE_FICH
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getNombreFichero() {
        return nombreFichero;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_NOMBRE_FICH
     *
     * @param nombreFichero the value for VERSIONES_PLIEGOS.VP_NOMBRE_FICH
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero == null ? null : nombreFichero.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_EXTENSION
     *
     * @return the value of VERSIONES_PLIEGOS.VP_EXTENSION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_EXTENSION
     *
     * @param extension the value for VERSIONES_PLIEGOS.VP_EXTENSION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_VERSION
     *
     * @return the value of VERSIONES_PLIEGOS.VP_VERSION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_VERSION
     *
     * @param version the value for VERSIONES_PLIEGOS.VP_VERSION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_NAT_ID
     *
     * @return the value of VERSIONES_PLIEGOS.VP_NAT_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIdNaturaleza() {
        return idNaturaleza;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_NAT_ID
     *
     * @param idNaturaleza the value for VERSIONES_PLIEGOS.VP_NAT_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIdNaturaleza(BigDecimal idNaturaleza) {
        this.idNaturaleza = idNaturaleza;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_PROC_ID
     *
     * @return the value of VERSIONES_PLIEGOS.VP_PROC_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIdProcedimiento() {
        return idProcedimiento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_PROC_ID
     *
     * @param idProcedimiento the value for VERSIONES_PLIEGOS.VP_PROC_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIdProcedimiento(BigDecimal idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_TS_ID
     *
     * @return the value of VERSIONES_PLIEGOS.VP_TS_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIdTiposServicios() {
        return idTiposServicios;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_TS_ID
     *
     * @param idTiposServicios the value for VERSIONES_PLIEGOS.VP_TS_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIdTiposServicios(BigDecimal idTiposServicios) {
        this.idTiposServicios = idTiposServicios;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_NORM_ID
     *
     * @return the value of VERSIONES_PLIEGOS.VP_NORM_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIdNormativa() {
        return idNormativa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_NORM_ID
     *
     * @param idNormativa the value for VERSIONES_PLIEGOS.VP_NORM_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIdNormativa(BigDecimal idNormativa) {
        this.idNormativa = idNormativa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_L_ACTIVO
     *
     * @return the value of VERSIONES_PLIEGOS.VP_L_ACTIVO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getActivo() {
        return activo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_L_ACTIVO
     *
     * @param activo the value for VERSIONES_PLIEGOS.VP_L_ACTIVO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setActivo(String activo) {
        this.activo = activo == null ? null : activo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_U_CREACION
     *
     * @return the value of VERSIONES_PLIEGOS.VP_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getuCreacion() {
        return uCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_U_CREACION
     *
     * @param uCreacion the value for VERSIONES_PLIEGOS.VP_U_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setuCreacion(String uCreacion) {
        this.uCreacion = uCreacion == null ? null : uCreacion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_U_ACTU
     *
     * @return the value of VERSIONES_PLIEGOS.VP_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getuActu() {
        return uActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_U_ACTU
     *
     * @param uActu the value for VERSIONES_PLIEGOS.VP_U_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setuActu(String uActu) {
        this.uActu = uActu == null ? null : uActu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_F_CREACION
     *
     * @return the value of VERSIONES_PLIEGOS.VP_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Date getfCreacion() {
        return fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_F_CREACION
     *
     * @param fCreacion the value for VERSIONES_PLIEGOS.VP_F_CREACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_F_ACTU
     *
     * @return the value of VERSIONES_PLIEGOS.VP_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public Date getfActu() {
        return fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_F_ACTU
     *
     * @param fActu the value for VERSIONES_PLIEGOS.VP_F_ACTU
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setfActu(Date fActu) {
        this.fActu = fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VERSIONES_PLIEGOS.VP_FICHERO
     *
     * @return the value of VERSIONES_PLIEGOS.VP_FICHERO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public byte[] getFichero() {
        return fichero;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VERSIONES_PLIEGOS.VP_FICHERO
     *
     * @param fichero the value for VERSIONES_PLIEGOS.VP_FICHERO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setFichero(byte[] fichero) {
        this.fichero = fichero;
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

    public void copyCreacion(VersionesPliegos source) {
        this.fCreacion = source.fCreacion;
        this.uCreacion = source.uCreacion;
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }

    public void copyActualizacion(VersionesPliegos source) {
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }
}