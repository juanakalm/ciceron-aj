/**
 * DocumentoWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ise.portafirma.ws;

@SuppressWarnings({ "serial", "rawtypes" })
public class DocumentoWS implements java.io.Serializable
{
	private java.lang.String CHASH;

	private java.lang.String DARCHIVO;

	private java.lang.String DMIME;

	private java.util.Calendar FCREACION;

	private java.util.Calendar FMODIFICACION;

	private java.math.BigDecimal NTAMANIO;

	private java.lang.String PETCHASH;

	private java.lang.String TDOCCTIPODOCUMENTO;

	public DocumentoWS()
	{
	}

	public DocumentoWS(java.lang.String CHASH, java.lang.String DARCHIVO, java.lang.String DMIME, java.util.Calendar FCREACION, java.util.Calendar FMODIFICACION, java.math.BigDecimal NTAMANIO, java.lang.String PETCHASH, java.lang.String TDOCCTIPODOCUMENTO)
	{
		this.CHASH = CHASH;
		this.DARCHIVO = DARCHIVO;
		this.DMIME = DMIME;
		this.FCREACION = FCREACION;
		this.FMODIFICACION = FMODIFICACION;
		this.NTAMANIO = NTAMANIO;
		this.PETCHASH = PETCHASH;
		this.TDOCCTIPODOCUMENTO = TDOCCTIPODOCUMENTO;
	}

	/**
	 * Gets the CHASH value for this DocumentoWS.
	 * 
	 * @return CHASH
	 */
	public java.lang.String getCHASH()
	{
		return CHASH;
	}

	/**
	 * Sets the CHASH value for this DocumentoWS.
	 * 
	 * @param CHASH
	 */
	public void setCHASH(java.lang.String CHASH)
	{
		this.CHASH = CHASH;
	}

	/**
	 * Gets the DARCHIVO value for this DocumentoWS.
	 * 
	 * @return DARCHIVO
	 */
	public java.lang.String getDARCHIVO()
	{
		return DARCHIVO;
	}

	/**
	 * Sets the DARCHIVO value for this DocumentoWS.
	 * 
	 * @param DARCHIVO
	 */
	public void setDARCHIVO(java.lang.String DARCHIVO)
	{
		this.DARCHIVO = DARCHIVO;
	}

	/**
	 * Gets the DMIME value for this DocumentoWS.
	 * 
	 * @return DMIME
	 */
	public java.lang.String getDMIME()
	{
		return DMIME;
	}

	/**
	 * Sets the DMIME value for this DocumentoWS.
	 * 
	 * @param DMIME
	 */
	public void setDMIME(java.lang.String DMIME)
	{
		this.DMIME = DMIME;
	}

	/**
	 * Gets the FCREACION value for this DocumentoWS.
	 * 
	 * @return FCREACION
	 */
	public java.util.Calendar getFCREACION()
	{
		return FCREACION;
	}

	/**
	 * Sets the FCREACION value for this DocumentoWS.
	 * 
	 * @param FCREACION
	 */
	public void setFCREACION(java.util.Calendar FCREACION)
	{
		this.FCREACION = FCREACION;
	}

	/**
	 * Gets the FMODIFICACION value for this DocumentoWS.
	 * 
	 * @return FMODIFICACION
	 */
	public java.util.Calendar getFMODIFICACION()
	{
		return FMODIFICACION;
	}

	/**
	 * Sets the FMODIFICACION value for this DocumentoWS.
	 * 
	 * @param FMODIFICACION
	 */
	public void setFMODIFICACION(java.util.Calendar FMODIFICACION)
	{
		this.FMODIFICACION = FMODIFICACION;
	}

	/**
	 * Gets the NTAMANIO value for this DocumentoWS.
	 * 
	 * @return NTAMANIO
	 */
	public java.math.BigDecimal getNTAMANIO()
	{
		return NTAMANIO;
	}

	/**
	 * Sets the NTAMANIO value for this DocumentoWS.
	 * 
	 * @param NTAMANIO
	 */
	public void setNTAMANIO(java.math.BigDecimal NTAMANIO)
	{
		this.NTAMANIO = NTAMANIO;
	}

	/**
	 * Gets the PETCHASH value for this DocumentoWS.
	 * 
	 * @return PETCHASH
	 */
	public java.lang.String getPETCHASH()
	{
		return PETCHASH;
	}

	/**
	 * Sets the PETCHASH value for this DocumentoWS.
	 * 
	 * @param PETCHASH
	 */
	public void setPETCHASH(java.lang.String PETCHASH)
	{
		this.PETCHASH = PETCHASH;
	}

	/**
	 * Gets the TDOCCTIPODOCUMENTO value for this DocumentoWS.
	 * 
	 * @return TDOCCTIPODOCUMENTO
	 */
	public java.lang.String getTDOCCTIPODOCUMENTO()
	{
		return TDOCCTIPODOCUMENTO;
	}

	/**
	 * Sets the TDOCCTIPODOCUMENTO value for this DocumentoWS.
	 * 
	 * @param TDOCCTIPODOCUMENTO
	 */
	public void setTDOCCTIPODOCUMENTO(java.lang.String TDOCCTIPODOCUMENTO)
	{
		this.TDOCCTIPODOCUMENTO = TDOCCTIPODOCUMENTO;
	}

	private java.lang.Object __equalsCalc = null;

	@SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj)
	{
		if (!(obj instanceof DocumentoWS))
			return false;
		DocumentoWS other = (DocumentoWS) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null)
		{
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.CHASH == null && other.getCHASH() == null) || (this.CHASH != null && this.CHASH.equals(other.getCHASH()))) && ((this.DARCHIVO == null && other.getDARCHIVO() == null) || (this.DARCHIVO != null && this.DARCHIVO.equals(other.getDARCHIVO())))
				&& ((this.DMIME == null && other.getDMIME() == null) || (this.DMIME != null && this.DMIME.equals(other.getDMIME()))) && ((this.FCREACION == null && other.getFCREACION() == null) || (this.FCREACION != null && this.FCREACION.equals(other.getFCREACION())))
				&& ((this.FMODIFICACION == null && other.getFMODIFICACION() == null) || (this.FMODIFICACION != null && this.FMODIFICACION.equals(other.getFMODIFICACION())))
				&& ((this.NTAMANIO == null && other.getNTAMANIO() == null) || (this.NTAMANIO != null && this.NTAMANIO.equals(other.getNTAMANIO()))) && ((this.PETCHASH == null && other.getPETCHASH() == null) || (this.PETCHASH != null && this.PETCHASH.equals(other.getPETCHASH())))
				&& ((this.TDOCCTIPODOCUMENTO == null && other.getTDOCCTIPODOCUMENTO() == null) || (this.TDOCCTIPODOCUMENTO != null && this.TDOCCTIPODOCUMENTO.equals(other.getTDOCCTIPODOCUMENTO())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode()
	{
		if (__hashCodeCalc)
		{
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getCHASH() != null)
		{
			_hashCode += getCHASH().hashCode();
		}
		if (getDARCHIVO() != null)
		{
			_hashCode += getDARCHIVO().hashCode();
		}
		if (getDMIME() != null)
		{
			_hashCode += getDMIME().hashCode();
		}
		if (getFCREACION() != null)
		{
			_hashCode += getFCREACION().hashCode();
		}
		if (getFMODIFICACION() != null)
		{
			_hashCode += getFMODIFICACION().hashCode();
		}
		if (getNTAMANIO() != null)
		{
			_hashCode += getNTAMANIO().hashCode();
		}
		if (getPETCHASH() != null)
		{
			_hashCode += getPETCHASH().hashCode();
		}
		if (getTDOCCTIPODOCUMENTO() != null)
		{
			_hashCode += getTDOCCTIPODOCUMENTO().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(DocumentoWS.class, true);

	static
	{
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pfirma", "DocumentoWS"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("CHASH");
		elemField.setXmlName(new javax.xml.namespace.QName("", "CHASH"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("DARCHIVO");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DARCHIVO"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("DMIME");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DMIME"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FCREACION");
		elemField.setXmlName(new javax.xml.namespace.QName("", "FCREACION"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FMODIFICACION");
		elemField.setXmlName(new javax.xml.namespace.QName("", "FMODIFICACION"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("NTAMANIO");
		elemField.setXmlName(new javax.xml.namespace.QName("", "NTAMANIO"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("PETCHASH");
		elemField.setXmlName(new javax.xml.namespace.QName("", "PETCHASH"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("TDOCCTIPODOCUMENTO");
		elemField.setXmlName(new javax.xml.namespace.QName("", "TDOCCTIPODOCUMENTO"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc()
	{
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType)
	{
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType)
	{
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
