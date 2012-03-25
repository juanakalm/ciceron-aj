package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.Date;

public class Observaciones {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_ID
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_TIPO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private String tipo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_IDENT
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private BigDecimal ident;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_COMENTARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private String comentario;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_F_ENVIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private Date fEnvio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_U_REMITENTE
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private String uRemitente;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_U_DESTINATARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private String uDestinatario;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_F_CREACION
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private Date fCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_F_ACTU
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private Date fActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_U_CREACION
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private String uCreacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_U_ACTU
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private String uActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_MAIL_DESTINATARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private String mailDestinatario;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_RESPUESTA
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private String respuesta;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_OBSERVACIONES.OB_F_RESPUESTA
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    private Date fRespuesta;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_ID
     *
     * @return the value of AJ_OBSERVACIONES.OB_ID
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_ID
     *
     * @param id the value for AJ_OBSERVACIONES.OB_ID
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_TIPO
     *
     * @return the value of AJ_OBSERVACIONES.OB_TIPO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_TIPO
     *
     * @param tipo the value for AJ_OBSERVACIONES.OB_TIPO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setTipo(String tipo) {
        this.tipo = tipo == null ? null : tipo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_IDENT
     *
     * @return the value of AJ_OBSERVACIONES.OB_IDENT
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public BigDecimal getIdent() {
        return ident;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_IDENT
     *
     * @param ident the value for AJ_OBSERVACIONES.OB_IDENT
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setIdent(BigDecimal ident) {
        this.ident = ident;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_COMENTARIO
     *
     * @return the value of AJ_OBSERVACIONES.OB_COMENTARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_COMENTARIO
     *
     * @param comentario the value for AJ_OBSERVACIONES.OB_COMENTARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setComentario(String comentario) {
        this.comentario = comentario == null ? null : comentario.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_F_ENVIO
     *
     * @return the value of AJ_OBSERVACIONES.OB_F_ENVIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public Date getfEnvio() {
        return fEnvio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_F_ENVIO
     *
     * @param fEnvio the value for AJ_OBSERVACIONES.OB_F_ENVIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setfEnvio(Date fEnvio) {
        this.fEnvio = fEnvio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_U_REMITENTE
     *
     * @return the value of AJ_OBSERVACIONES.OB_U_REMITENTE
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public String getuRemitente() {
        return uRemitente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_U_REMITENTE
     *
     * @param uRemitente the value for AJ_OBSERVACIONES.OB_U_REMITENTE
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setuRemitente(String uRemitente) {
        this.uRemitente = uRemitente == null ? null : uRemitente.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_U_DESTINATARIO
     *
     * @return the value of AJ_OBSERVACIONES.OB_U_DESTINATARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public String getuDestinatario() {
        return uDestinatario;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_U_DESTINATARIO
     *
     * @param uDestinatario the value for AJ_OBSERVACIONES.OB_U_DESTINATARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setuDestinatario(String uDestinatario) {
        this.uDestinatario = uDestinatario == null ? null : uDestinatario.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_F_CREACION
     *
     * @return the value of AJ_OBSERVACIONES.OB_F_CREACION
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public Date getfCreacion() {
        return fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_F_CREACION
     *
     * @param fCreacion the value for AJ_OBSERVACIONES.OB_F_CREACION
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setfCreacion(Date fCreacion) {
        this.fCreacion = fCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_F_ACTU
     *
     * @return the value of AJ_OBSERVACIONES.OB_F_ACTU
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public Date getfActu() {
        return fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_F_ACTU
     *
     * @param fActu the value for AJ_OBSERVACIONES.OB_F_ACTU
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setfActu(Date fActu) {
        this.fActu = fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_U_CREACION
     *
     * @return the value of AJ_OBSERVACIONES.OB_U_CREACION
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public String getuCreacion() {
        return uCreacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_U_CREACION
     *
     * @param uCreacion the value for AJ_OBSERVACIONES.OB_U_CREACION
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setuCreacion(String uCreacion) {
        this.uCreacion = uCreacion == null ? null : uCreacion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_U_ACTU
     *
     * @return the value of AJ_OBSERVACIONES.OB_U_ACTU
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public String getuActu() {
        return uActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_U_ACTU
     *
     * @param uActu the value for AJ_OBSERVACIONES.OB_U_ACTU
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setuActu(String uActu) {
        this.uActu = uActu == null ? null : uActu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_MAIL_DESTINATARIO
     *
     * @return the value of AJ_OBSERVACIONES.OB_MAIL_DESTINATARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public String getMailDestinatario() {
        return mailDestinatario;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_MAIL_DESTINATARIO
     *
     * @param mailDestinatario the value for AJ_OBSERVACIONES.OB_MAIL_DESTINATARIO
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setMailDestinatario(String mailDestinatario) {
        this.mailDestinatario = mailDestinatario == null ? null : mailDestinatario.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_RESPUESTA
     *
     * @return the value of AJ_OBSERVACIONES.OB_RESPUESTA
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_RESPUESTA
     *
     * @param respuesta the value for AJ_OBSERVACIONES.OB_RESPUESTA
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta == null ? null : respuesta.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_OBSERVACIONES.OB_F_RESPUESTA
     *
     * @return the value of AJ_OBSERVACIONES.OB_F_RESPUESTA
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public Date getfRespuesta() {
        return fRespuesta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_OBSERVACIONES.OB_F_RESPUESTA
     *
     * @param fRespuesta the value for AJ_OBSERVACIONES.OB_F_RESPUESTA
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    public void setfRespuesta(Date fRespuesta) {
        this.fRespuesta = fRespuesta;
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

    public void copyCreacion(Observaciones source) {
        this.fCreacion = source.fCreacion;
        this.uCreacion = source.uCreacion;
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }

    public void copyActualizacion(Observaciones source) {
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }
}