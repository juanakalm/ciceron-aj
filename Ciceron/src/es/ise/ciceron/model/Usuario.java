package es.ise.ciceron.model;

import java.math.BigDecimal;

public class Usuario {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_USUARIOS_V.ID_USUARIO
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private BigDecimal idUsuario;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_USUARIOS_V.IDENTIFICADOR
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private String identificador;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_USUARIOS_V.CLAVE
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private String clave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_USUARIOS_V.NOMBRE
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_USUARIOS_V.DNI
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private String dni;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_USUARIOS_V.ID_UNIDAD_ORGANIZATIVA
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private BigDecimal idUnidadOrganizativa;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AJ_USUARIOS_V.UNIDAD_ORGANIZATIVA
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    private String unidadOrganizativa;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_USUARIOS_V.ID_USUARIO
     *
     * @return the value of AJ_USUARIOS_V.ID_USUARIO
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public BigDecimal getIdUsuario() {
        return idUsuario;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_USUARIOS_V.ID_USUARIO
     *
     * @param idUsuario the value for AJ_USUARIOS_V.ID_USUARIO
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setIdUsuario(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_USUARIOS_V.IDENTIFICADOR
     *
     * @return the value of AJ_USUARIOS_V.IDENTIFICADOR
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_USUARIOS_V.IDENTIFICADOR
     *
     * @param identificador the value for AJ_USUARIOS_V.IDENTIFICADOR
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador == null ? null : identificador.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_USUARIOS_V.CLAVE
     *
     * @return the value of AJ_USUARIOS_V.CLAVE
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getClave() {
        return clave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_USUARIOS_V.CLAVE
     *
     * @param clave the value for AJ_USUARIOS_V.CLAVE
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setClave(String clave) {
        this.clave = clave == null ? null : clave.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_USUARIOS_V.NOMBRE
     *
     * @return the value of AJ_USUARIOS_V.NOMBRE
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_USUARIOS_V.NOMBRE
     *
     * @param nombre the value for AJ_USUARIOS_V.NOMBRE
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_USUARIOS_V.DNI
     *
     * @return the value of AJ_USUARIOS_V.DNI
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getDni() {
        return dni;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_USUARIOS_V.DNI
     *
     * @param dni the value for AJ_USUARIOS_V.DNI
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setDni(String dni) {
        this.dni = dni == null ? null : dni.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_USUARIOS_V.ID_UNIDAD_ORGANIZATIVA
     *
     * @return the value of AJ_USUARIOS_V.ID_UNIDAD_ORGANIZATIVA
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public BigDecimal getIdUnidadOrganizativa() {
        return idUnidadOrganizativa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_USUARIOS_V.ID_UNIDAD_ORGANIZATIVA
     *
     * @param idUnidadOrganizativa the value for AJ_USUARIOS_V.ID_UNIDAD_ORGANIZATIVA
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setIdUnidadOrganizativa(BigDecimal idUnidadOrganizativa) {
        this.idUnidadOrganizativa = idUnidadOrganizativa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AJ_USUARIOS_V.UNIDAD_ORGANIZATIVA
     *
     * @return the value of AJ_USUARIOS_V.UNIDAD_ORGANIZATIVA
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public String getUnidadOrganizativa() {
        return unidadOrganizativa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AJ_USUARIOS_V.UNIDAD_ORGANIZATIVA
     *
     * @param unidadOrganizativa the value for AJ_USUARIOS_V.UNIDAD_ORGANIZATIVA
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    public void setUnidadOrganizativa(String unidadOrganizativa) {
        this.unidadOrganizativa = unidadOrganizativa == null ? null : unidadOrganizativa.trim();
    }
}