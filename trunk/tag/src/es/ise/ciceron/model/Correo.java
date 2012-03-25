package es.ise.ciceron.model;

import java.math.BigDecimal;

public class Correo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_CORREOS_V.FIR_UC_ID
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    private BigDecimal idUnidadFirmante;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_CORREOS_V.US_NOMBRE
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_CORREOS_V.US_DNI
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    private String dni;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_CORREOS_V.US_IDENTIFICADOR
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    private String identificador;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_CORREOS_V.EMAIL
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_CORREOS_V.FIR_UC_ID
     *
     * @return the value of AJ_CORREOS_V.FIR_UC_ID
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public BigDecimal getIdUnidadFirmante() {
        return idUnidadFirmante;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_CORREOS_V.FIR_UC_ID
     *
     * @param idUnidadFirmante the value for AJ_CORREOS_V.FIR_UC_ID
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void setIdUnidadFirmante(BigDecimal idUnidadFirmante) {
        this.idUnidadFirmante = idUnidadFirmante;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_CORREOS_V.US_NOMBRE
     *
     * @return the value of AJ_CORREOS_V.US_NOMBRE
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_CORREOS_V.US_NOMBRE
     *
     * @param nombre the value for AJ_CORREOS_V.US_NOMBRE
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_CORREOS_V.US_DNI
     *
     * @return the value of AJ_CORREOS_V.US_DNI
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public String getDni() {
        return dni;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_CORREOS_V.US_DNI
     *
     * @param dni the value for AJ_CORREOS_V.US_DNI
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void setDni(String dni) {
        this.dni = dni == null ? null : dni.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_CORREOS_V.US_IDENTIFICADOR
     *
     * @return the value of AJ_CORREOS_V.US_IDENTIFICADOR
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_CORREOS_V.US_IDENTIFICADOR
     *
     * @param identificador the value for AJ_CORREOS_V.US_IDENTIFICADOR
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador == null ? null : identificador.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_CORREOS_V.EMAIL
     *
     * @return the value of AJ_CORREOS_V.EMAIL
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_CORREOS_V.EMAIL
     *
     * @param email the value for AJ_CORREOS_V.EMAIL
     *
     * @mbggenerated Thu Aug 25 13:32:16 CEST 2011
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}