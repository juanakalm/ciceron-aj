/**
 * EntregaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ise.portafirma.ws;

@SuppressWarnings({ "serial", "rawtypes" })
public class EntregaWS implements java.io.Serializable
{
	private java.lang.String CESTADO;

	private java.lang.String CTRANSACTIONID;

	private java.lang.String DARCHIVO;

	private java.lang.String DESTCDNI;

	private java.lang.String DOCCHASH;

	private java.util.Calendar FESTADO;

	public EntregaWS()
	{
	}

	public EntregaWS(java.lang.String CESTADO, java.lang.String CTRANSACTIONID, java.lang.String DARCHIVO, java.lang.String DESTCDNI, java.lang.String DOCCHASH, java.util.Calendar FESTADO)
	{
		this.CESTADO = CESTADO;
		this.CTRANSACTIONID = CTRANSACTIONID;
		this.DARCHIVO = DARCHIVO;
		this.DESTCDNI = DESTCDNI;
		this.DOCCHASH = DOCCHASH;
		this.FESTADO = FESTADO;
	}

	/**
	 * Gets the CESTADO value for this EntregaWS.
	 * 
	 * @return CESTADO
	 */
	public java.lang.String getCESTADO()
	{
		return CESTADO;
	}

	/**
	 * Sets the CESTADO value for this EntregaWS.
	 * 
	 * @param CESTADO
	 */
	public void setCESTADO(java.lang.String CESTADO)
	{
		this.CESTADO = CESTADO;
	}

	/**
	 * Gets the CTRANSACTIONID value for this EntregaWS.
	 * 
	 * @return CTRANSACTIONID
	 */
	public java.lang.String getCTRANSACTIONID()
	{
		return CTRANSACTIONID;
	}

	/**
	 * Sets the CTRANSACTIONID value for this EntregaWS.
	 * 
	 * @param CTRANSACTIONID
	 */
	public void setCTRANSACTIONID(java.lang.String CTRANSACTIONID)
	{
		this.CTRANSACTIONID = CTRANSACTIONID;
	}

	/**
	 * Gets the DARCHIVO value for this EntregaWS.
	 * 
	 * @return DARCHIVO
	 */
	public java.lang.String getDARCHIVO()
	{
		return DARCHIVO;
	}

	/**
	 * Sets the DARCHIVO value for this EntregaWS.
	 * 
	 * @param DARCHIVO
	 */
	public void setDARCHIVO(java.lang.String DARCHIVO)
	{
		this.DARCHIVO = DARCHIVO;
	}

	/**
	 * Gets the DESTCDNI value for this EntregaWS.
	 * 
	 * @return DESTCDNI
	 */
	public java.lang.String getDESTCDNI()
	{
		return DESTCDNI;
	}

	/**
	 * Sets the DESTCDNI value for this EntregaWS.
	 * 
	 * @param DESTCDNI
	 */
	public void setDESTCDNI(java.lang.String DESTCDNI)
	{
		this.DESTCDNI = DESTCDNI;
	}

	/**
	 * Gets the DOCCHASH value for this EntregaWS.
	 * 
	 * @return DOCCHASH
	 */
	public java.lang.String getDOCCHASH()
	{
		return DOCCHASH;
	}

	/**
	 * Sets the DOCCHASH value for this EntregaWS.
	 * 
	 * @param DOCCHASH
	 */
	public void setDOCCHASH(java.lang.String DOCCHASH)
	{
		this.DOCCHASH = DOCCHASH;
	}

	/**
	 * Gets the FESTADO value for this EntregaWS.
	 * 
	 * @return FESTADO
	 */
	public java.util.Calendar getFESTADO()
	{
		return FESTADO;
	}

	/**
	 * Sets the FESTADO value for this EntregaWS.
	 * 
	 * @param FESTADO
	 */
	public void setFESTADO(java.util.Calendar FESTADO)
	{
		this.FESTADO = FESTADO;
	}

	private java.lang.Object __equalsCalc = null;

	@SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj)
	{
		if (!(obj instanceof EntregaWS))
			return false;
		EntregaWS other = (EntregaWS) obj;
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
		_equals = true && ((this.CESTADO == null && other.getCESTADO() == null) || (this.CESTADO != null && this.CESTADO.equals(other.getCESTADO())))
				&& ((this.CTRANSACTIONID == null && other.getCTRANSACTIONID() == null) || (this.CTRANSACTIONID != null && this.CTRANSACTIONID.equals(other.getCTRANSACTIONID())))
				&& ((this.DARCHIVO == null && other.getDARCHIVO() == null) || (this.DARCHIVO != null && this.DARCHIVO.equals(other.getDARCHIVO()))) && ((this.DESTCDNI == null && other.getDESTCDNI() == null) || (this.DESTCDNI != null && this.DESTCDNI.equals(other.getDESTCDNI())))
				&& ((this.DOCCHASH == null && other.getDOCCHASH() == null) || (this.DOCCHASH != null && this.DOCCHASH.equals(other.getDOCCHASH()))) && ((this.FESTADO == null && other.getFESTADO() == null) || (this.FESTADO != null && this.FESTADO.equals(other.getFESTADO())));
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
		if (getCESTADO() != null)
		{
			_hashCode += getCESTADO().hashCode();
		}
		if (getCTRANSACTIONID() != null)
		{
			_hashCode += getCTRANSACTIONID().hashCode();
		}
		if (getDARCHIVO() != null)
		{
			_hashCode += getDARCHIVO().hashCode();
		}
		if (getDESTCDNI() != null)
		{
			_hashCode += getDESTCDNI().hashCode();
		}
		if (getDOCCHASH() != null)
		{
			_hashCode += getDOCCHASH().hashCode();
		}
		if (getFESTADO() != null)
		{
			_hashCode += getFESTADO().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(EntregaWS.class, true);

	static
	{
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pfirma", "EntregaWS"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("CESTADO");
		elemField.setXmlName(new javax.xml.namespace.QName("", "CESTADO"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("CTRANSACTIONID");
		elemField.setXmlName(new javax.xml.namespace.QName("", "CTRANSACTIONID"));
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
		elemField.setFieldName("DESTCDNI");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DESTCDNI"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("DOCCHASH");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DOCCHASH"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FESTADO");
		elemField.setXmlName(new javax.xml.namespace.QName("", "FESTADO"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
