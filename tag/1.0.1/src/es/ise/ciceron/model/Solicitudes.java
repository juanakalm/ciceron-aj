package es.ise.ciceron.model;

import java.math.BigDecimal;

public class Solicitudes {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_EJEC
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String ejec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_TIPO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal tipo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_DESC
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String descripcion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_PADRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal padre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_RUTA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal ruta;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_FORMATO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private BigDecimal formato;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_VISIBLE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String visible;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_GERENCIA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String gerencia;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_EXCEL
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String excel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_CONSULTA_EXCEL
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String consultaExcel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTA.SOLICITUDES.S_CONSULTA_EXCEL_WEB
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    private String consultaExcelWeb;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_ID
     *
     * @return the value of CONTA.SOLICITUDES.S_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_ID
     *
     * @param id the value for CONTA.SOLICITUDES.S_ID
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_EJEC
     *
     * @return the value of CONTA.SOLICITUDES.S_EJEC
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getEjec() {
        return ejec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_EJEC
     *
     * @param ejec the value for CONTA.SOLICITUDES.S_EJEC
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setEjec(String ejec) {
        this.ejec = ejec == null ? null : ejec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_TIPO
     *
     * @return the value of CONTA.SOLICITUDES.S_TIPO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getTipo() {
        return tipo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_TIPO
     *
     * @param tipo the value for CONTA.SOLICITUDES.S_TIPO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setTipo(BigDecimal tipo) {
        this.tipo = tipo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_DESC
     *
     * @return the value of CONTA.SOLICITUDES.S_DESC
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_DESC
     *
     * @param descripcion the value for CONTA.SOLICITUDES.S_DESC
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_PADRE
     *
     * @return the value of CONTA.SOLICITUDES.S_PADRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getPadre() {
        return padre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_PADRE
     *
     * @param padre the value for CONTA.SOLICITUDES.S_PADRE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setPadre(BigDecimal padre) {
        this.padre = padre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_RUTA
     *
     * @return the value of CONTA.SOLICITUDES.S_RUTA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getRuta() {
        return ruta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_RUTA
     *
     * @param ruta the value for CONTA.SOLICITUDES.S_RUTA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setRuta(BigDecimal ruta) {
        this.ruta = ruta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_FORMATO
     *
     * @return the value of CONTA.SOLICITUDES.S_FORMATO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public BigDecimal getFormato() {
        return formato;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_FORMATO
     *
     * @param formato the value for CONTA.SOLICITUDES.S_FORMATO
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setFormato(BigDecimal formato) {
        this.formato = formato;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_VISIBLE
     *
     * @return the value of CONTA.SOLICITUDES.S_VISIBLE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getVisible() {
        return visible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_VISIBLE
     *
     * @param visible the value for CONTA.SOLICITUDES.S_VISIBLE
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setVisible(String visible) {
        this.visible = visible == null ? null : visible.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_GERENCIA
     *
     * @return the value of CONTA.SOLICITUDES.S_GERENCIA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getGerencia() {
        return gerencia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_GERENCIA
     *
     * @param gerencia the value for CONTA.SOLICITUDES.S_GERENCIA
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setGerencia(String gerencia) {
        this.gerencia = gerencia == null ? null : gerencia.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_EXCEL
     *
     * @return the value of CONTA.SOLICITUDES.S_EXCEL
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getExcel() {
        return excel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_EXCEL
     *
     * @param excel the value for CONTA.SOLICITUDES.S_EXCEL
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setExcel(String excel) {
        this.excel = excel == null ? null : excel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_CONSULTA_EXCEL
     *
     * @return the value of CONTA.SOLICITUDES.S_CONSULTA_EXCEL
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getConsultaExcel() {
        return consultaExcel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_CONSULTA_EXCEL
     *
     * @param consultaExcel the value for CONTA.SOLICITUDES.S_CONSULTA_EXCEL
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setConsultaExcel(String consultaExcel) {
        this.consultaExcel = consultaExcel == null ? null : consultaExcel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTA.SOLICITUDES.S_CONSULTA_EXCEL_WEB
     *
     * @return the value of CONTA.SOLICITUDES.S_CONSULTA_EXCEL_WEB
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public String getConsultaExcelWeb() {
        return consultaExcelWeb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTA.SOLICITUDES.S_CONSULTA_EXCEL_WEB
     *
     * @param consultaExcelWeb the value for CONTA.SOLICITUDES.S_CONSULTA_EXCEL_WEB
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    public void setConsultaExcelWeb(String consultaExcelWeb) {
        this.consultaExcelWeb = consultaExcelWeb == null ? null : consultaExcelWeb.trim();
    }
}