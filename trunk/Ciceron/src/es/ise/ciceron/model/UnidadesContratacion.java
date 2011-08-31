package es.ise.ciceron.model;

import java.math.BigDecimal;

public class UnidadesContratacion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.UC_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.UC_DESCRIPCION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String descripcion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.ACR_TRECE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String acronimoTrece;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.UC_ACR
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String acronimo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.UC_UO_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal idUnidadOrganizativa;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.UC_PUESTO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String puesto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.UC_FIRMANTE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String firmante;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.UC_PIE_FIRMA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String pieFirma;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDADES_CONTRATACION.UC_NOMBRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String nombre;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.UC_ID
     *
     * @return the value of UNIDADES_CONTRATACION.UC_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.UC_ID
     *
     * @param id the value for UNIDADES_CONTRATACION.UC_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.UC_DESCRIPCION
     *
     * @return the value of UNIDADES_CONTRATACION.UC_DESCRIPCION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.UC_DESCRIPCION
     *
     * @param descripcion the value for UNIDADES_CONTRATACION.UC_DESCRIPCION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.ACR_TRECE
     *
     * @return the value of UNIDADES_CONTRATACION.ACR_TRECE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getAcronimoTrece() {
        return acronimoTrece;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.ACR_TRECE
     *
     * @param acronimoTrece the value for UNIDADES_CONTRATACION.ACR_TRECE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setAcronimoTrece(String acronimoTrece) {
        this.acronimoTrece = acronimoTrece == null ? null : acronimoTrece.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.UC_ACR
     *
     * @return the value of UNIDADES_CONTRATACION.UC_ACR
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getAcronimo() {
        return acronimo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.UC_ACR
     *
     * @param acronimo the value for UNIDADES_CONTRATACION.UC_ACR
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo == null ? null : acronimo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.UC_UO_ID
     *
     * @return the value of UNIDADES_CONTRATACION.UC_UO_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getIdUnidadOrganizativa() {
        return idUnidadOrganizativa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.UC_UO_ID
     *
     * @param idUnidadOrganizativa the value for UNIDADES_CONTRATACION.UC_UO_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setIdUnidadOrganizativa(BigDecimal idUnidadOrganizativa) {
        this.idUnidadOrganizativa = idUnidadOrganizativa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.UC_PUESTO
     *
     * @return the value of UNIDADES_CONTRATACION.UC_PUESTO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.UC_PUESTO
     *
     * @param puesto the value for UNIDADES_CONTRATACION.UC_PUESTO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto == null ? null : puesto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.UC_FIRMANTE
     *
     * @return the value of UNIDADES_CONTRATACION.UC_FIRMANTE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getFirmante() {
        return firmante;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.UC_FIRMANTE
     *
     * @param firmante the value for UNIDADES_CONTRATACION.UC_FIRMANTE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setFirmante(String firmante) {
        this.firmante = firmante == null ? null : firmante.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.UC_PIE_FIRMA
     *
     * @return the value of UNIDADES_CONTRATACION.UC_PIE_FIRMA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getPieFirma() {
        return pieFirma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.UC_PIE_FIRMA
     *
     * @param pieFirma the value for UNIDADES_CONTRATACION.UC_PIE_FIRMA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setPieFirma(String pieFirma) {
        this.pieFirma = pieFirma == null ? null : pieFirma.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDADES_CONTRATACION.UC_NOMBRE
     *
     * @return the value of UNIDADES_CONTRATACION.UC_NOMBRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDADES_CONTRATACION.UC_NOMBRE
     *
     * @param nombre the value for UNIDADES_CONTRATACION.UC_NOMBRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }
}