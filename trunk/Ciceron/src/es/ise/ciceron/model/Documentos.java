package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.Date;

public class Documentos {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_X_DOCUMENTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_TD_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal idTipoDocumento;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_X_EXPEDIENTE
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal idExpediente;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.CREADOR
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String uCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.F_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private Date fCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.MODIFICADOR
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String uActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.F_MODIFICACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private Date fActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_F_FIRMA
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private Date fechaFirma;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_F_PORTAFIRMA
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private Date fechaEnvio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_D_DOCUMENTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String nombreFichero;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_EXTENSION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String extension;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_MOD_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private BigDecimal idModificado;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_DOCHASH
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String dochash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_PETHASH
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private String hashPeticion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_F_DEVUELTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private Date fechaDevuelto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ISE_DOCUMENTOS.DOC_FICHERO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    private byte[] fichero;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_X_DOCUMENTO
     *
     * @return the value of ISE_DOCUMENTOS.DOC_X_DOCUMENTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_X_DOCUMENTO
     *
     * @param id the value for ISE_DOCUMENTOS.DOC_X_DOCUMENTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_TD_ID
     *
     * @return the value of ISE_DOCUMENTOS.DOC_TD_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_TD_ID
     *
     * @param idTipoDocumento the value for ISE_DOCUMENTOS.DOC_TD_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setIdTipoDocumento(BigDecimal idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_X_EXPEDIENTE
     *
     * @return the value of ISE_DOCUMENTOS.DOC_X_EXPEDIENTE
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getIdExpediente() {
        return idExpediente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_X_EXPEDIENTE
     *
     * @param idExpediente the value for ISE_DOCUMENTOS.DOC_X_EXPEDIENTE
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setIdExpediente(BigDecimal idExpediente) {
        this.idExpediente = idExpediente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.CREADOR
     *
     * @return the value of ISE_DOCUMENTOS.CREADOR
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getuCreacion() {
        return uCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.CREADOR
     *
     * @param uCreacion the value for ISE_DOCUMENTOS.CREADOR
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setuCreacion(String uCreacion) {
        this.uCreacion = uCreacion == null ? null : uCreacion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.F_CREACION
     *
     * @return the value of ISE_DOCUMENTOS.F_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public Date getfCreacion() {
        return fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.F_CREACION
     *
     * @param fCreacion the value for ISE_DOCUMENTOS.F_CREACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.MODIFICADOR
     *
     * @return the value of ISE_DOCUMENTOS.MODIFICADOR
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getuActu() {
        return uActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.MODIFICADOR
     *
     * @param uActu the value for ISE_DOCUMENTOS.MODIFICADOR
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setuActu(String uActu) {
        this.uActu = uActu == null ? null : uActu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.F_MODIFICACION
     *
     * @return the value of ISE_DOCUMENTOS.F_MODIFICACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public Date getfActu() {
        return fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.F_MODIFICACION
     *
     * @param fActu the value for ISE_DOCUMENTOS.F_MODIFICACION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setfActu(Date fActu) {
        this.fActu = fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_F_FIRMA
     *
     * @return the value of ISE_DOCUMENTOS.DOC_F_FIRMA
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public Date getFechaFirma() {
        return fechaFirma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_F_FIRMA
     *
     * @param fechaFirma the value for ISE_DOCUMENTOS.DOC_F_FIRMA
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setFechaFirma(Date fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_F_PORTAFIRMA
     *
     * @return the value of ISE_DOCUMENTOS.DOC_F_PORTAFIRMA
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_F_PORTAFIRMA
     *
     * @param fechaEnvio the value for ISE_DOCUMENTOS.DOC_F_PORTAFIRMA
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_D_DOCUMENTO
     *
     * @return the value of ISE_DOCUMENTOS.DOC_D_DOCUMENTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getNombreFichero() {
        return nombreFichero;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_D_DOCUMENTO
     *
     * @param nombreFichero the value for ISE_DOCUMENTOS.DOC_D_DOCUMENTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero == null ? null : nombreFichero.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_EXTENSION
     *
     * @return the value of ISE_DOCUMENTOS.DOC_EXTENSION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_EXTENSION
     *
     * @param extension the value for ISE_DOCUMENTOS.DOC_EXTENSION
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_MOD_ID
     *
     * @return the value of ISE_DOCUMENTOS.DOC_MOD_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public BigDecimal getIdModificado() {
        return idModificado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_MOD_ID
     *
     * @param idModificado the value for ISE_DOCUMENTOS.DOC_MOD_ID
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setIdModificado(BigDecimal idModificado) {
        this.idModificado = idModificado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_DOCHASH
     *
     * @return the value of ISE_DOCUMENTOS.DOC_DOCHASH
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getDochash() {
        return dochash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_DOCHASH
     *
     * @param dochash the value for ISE_DOCUMENTOS.DOC_DOCHASH
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setDochash(String dochash) {
        this.dochash = dochash == null ? null : dochash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_PETHASH
     *
     * @return the value of ISE_DOCUMENTOS.DOC_PETHASH
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public String getHashPeticion() {
        return hashPeticion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_PETHASH
     *
     * @param hashPeticion the value for ISE_DOCUMENTOS.DOC_PETHASH
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setHashPeticion(String hashPeticion) {
        this.hashPeticion = hashPeticion == null ? null : hashPeticion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_F_DEVUELTO
     *
     * @return the value of ISE_DOCUMENTOS.DOC_F_DEVUELTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public Date getFechaDevuelto() {
        return fechaDevuelto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_F_DEVUELTO
     *
     * @param fechaDevuelto the value for ISE_DOCUMENTOS.DOC_F_DEVUELTO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public void setFechaDevuelto(Date fechaDevuelto) {
        this.fechaDevuelto = fechaDevuelto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISE_DOCUMENTOS.DOC_FICHERO
     *
     * @return the value of ISE_DOCUMENTOS.DOC_FICHERO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
     */
    public byte[] getFichero() {
        return fichero;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISE_DOCUMENTOS.DOC_FICHERO
     *
     * @param fichero the value for ISE_DOCUMENTOS.DOC_FICHERO
     *
     * @mbggenerated Mon Aug 08 10:45:32 CEST 2011
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

    public void copyCreacion(Documentos source) {
        this.fCreacion = source.fCreacion;
        this.uCreacion = source.uCreacion;
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }

    public void copyActualizacion(Documentos source) {
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }
}