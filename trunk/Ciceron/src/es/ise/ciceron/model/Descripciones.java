package es.ise.ciceron.model;

import java.math.BigDecimal;
import java.util.Date;

public class Descripciones {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DESCRIPCIONES.D_ID
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    private BigDecimal idDescripcion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DESCRIPCIONES.D_U_ACTU
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    private String uActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DESCRIPCIONES.D_F_ACTU
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    private Date fActu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DESCRIPCIONES.D_EXP_ID
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DESCRIPCIONES.D_COMENTARIO_AJ
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    private String comentarioAj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DESCRIPCIONES.D_RESPUESTA_AJ
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    private String respuestaAj;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DESCRIPCIONES.D_ID
     *
     * @return the value of DESCRIPCIONES.D_ID
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public BigDecimal getIdDescripcion() {
        return idDescripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DESCRIPCIONES.D_ID
     *
     * @param idDescripcion the value for DESCRIPCIONES.D_ID
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public void setIdDescripcion(BigDecimal idDescripcion) {
        this.idDescripcion = idDescripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DESCRIPCIONES.D_U_ACTU
     *
     * @return the value of DESCRIPCIONES.D_U_ACTU
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public String getuActu() {
        return uActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DESCRIPCIONES.D_U_ACTU
     *
     * @param uActu the value for DESCRIPCIONES.D_U_ACTU
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public void setuActu(String uActu) {
        this.uActu = uActu == null ? null : uActu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DESCRIPCIONES.D_F_ACTU
     *
     * @return the value of DESCRIPCIONES.D_F_ACTU
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public Date getfActu() {
        return fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DESCRIPCIONES.D_F_ACTU
     *
     * @param fActu the value for DESCRIPCIONES.D_F_ACTU
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public void setfActu(Date fActu) {
        this.fActu = fActu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DESCRIPCIONES.D_EXP_ID
     *
     * @return the value of DESCRIPCIONES.D_EXP_ID
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DESCRIPCIONES.D_EXP_ID
     *
     * @param id the value for DESCRIPCIONES.D_EXP_ID
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DESCRIPCIONES.D_COMENTARIO_AJ
     *
     * @return the value of DESCRIPCIONES.D_COMENTARIO_AJ
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public String getComentarioAj() {
        return comentarioAj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DESCRIPCIONES.D_COMENTARIO_AJ
     *
     * @param comentarioAj the value for DESCRIPCIONES.D_COMENTARIO_AJ
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public void setComentarioAj(String comentarioAj) {
        this.comentarioAj = comentarioAj == null ? null : comentarioAj.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DESCRIPCIONES.D_RESPUESTA_AJ
     *
     * @return the value of DESCRIPCIONES.D_RESPUESTA_AJ
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public String getRespuestaAj() {
        return respuestaAj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DESCRIPCIONES.D_RESPUESTA_AJ
     *
     * @param respuestaAj the value for DESCRIPCIONES.D_RESPUESTA_AJ
     *
     * @mbggenerated Wed Aug 24 13:51:43 CEST 2011
     */
    public void setRespuestaAj(String respuestaAj) {
        this.respuestaAj = respuestaAj == null ? null : respuestaAj.trim();
    }

    public void setActualizacion(Date fecha, Usuario usuario) {
        this.fActu = fecha;
        this.uActu = usuario.getIdentificador();
    }

    public void copyActualizacion(Descripciones source) {
        this.fActu = source.fActu;
        this.uActu = source.uActu;
    }
}