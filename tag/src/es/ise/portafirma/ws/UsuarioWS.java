/**
 * UsuarioWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ise.portafirma.ws;

@SuppressWarnings({"serial", "rawtypes"})
public class UsuarioWS implements java.io.Serializable
{
	private java.lang.String CDNI;

	private java.lang.String DAPELL1;

	private java.lang.String DAPELL2;

	private java.lang.String DNOMBRE;

	public UsuarioWS()
	{
	}

	public UsuarioWS(java.lang.String CDNI, java.lang.String DAPELL1, java.lang.String DAPELL2, java.lang.String DNOMBRE)
	{
		this.CDNI = CDNI;
		this.DAPELL1 = DAPELL1;
		this.DAPELL2 = DAPELL2;
		this.DNOMBRE = DNOMBRE;
	}

	/**
	 * Gets the CDNI value for this UsuarioWS.
	 * 
	 * @return CDNI
	 */
	public java.lang.String getCDNI()
	{
		return CDNI;
	}

	/**
	 * Sets the CDNI value for this UsuarioWS.
	 * 
	 * @param CDNI
	 */
	public void setCDNI(java.lang.String CDNI)
	{
		this.CDNI = CDNI;
	}

	/**
	 * Gets the DAPELL1 value for this UsuarioWS.
	 * 
	 * @return DAPELL1
	 */
	public java.lang.String getDAPELL1()
	{
		return DAPELL1;
	}

	/**
	 * Sets the DAPELL1 value for this UsuarioWS.
	 * 
	 * @param DAPELL1
	 */
	public void setDAPELL1(java.lang.String DAPELL1)
	{
		this.DAPELL1 = DAPELL1;
	}

	/**
	 * Gets the DAPELL2 value for this UsuarioWS.
	 * 
	 * @return DAPELL2
	 */
	public java.lang.String getDAPELL2()
	{
		return DAPELL2;
	}

	/**
	 * Sets the DAPELL2 value for this UsuarioWS.
	 * 
	 * @param DAPELL2
	 */
	public void setDAPELL2(java.lang.String DAPELL2)
	{
		this.DAPELL2 = DAPELL2;
	}

	/**
	 * Gets the DNOMBRE value for this UsuarioWS.
	 * 
	 * @return DNOMBRE
	 */
	public java.lang.String getDNOMBRE()
	{
		return DNOMBRE;
	}

	/**
	 * Sets the DNOMBRE value for this UsuarioWS.
	 * 
	 * @param DNOMBRE
	 */
	public void setDNOMBRE(java.lang.String DNOMBRE)
	{
		this.DNOMBRE = DNOMBRE;
	}

	private java.lang.Object __equalsCalc = null;

	@SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj)
	{
		if (!(obj instanceof UsuarioWS))
			return false;
		UsuarioWS other = (UsuarioWS) obj;
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
		_equals = true && ((this.CDNI == null && other.getCDNI() == null) || (this.CDNI != null && this.CDNI.equals(other.getCDNI()))) && ((this.DAPELL1 == null && other.getDAPELL1() == null) || (this.DAPELL1 != null && this.DAPELL1.equals(other.getDAPELL1())))
				&& ((this.DAPELL2 == null && other.getDAPELL2() == null) || (this.DAPELL2 != null && this.DAPELL2.equals(other.getDAPELL2()))) && ((this.DNOMBRE == null && other.getDNOMBRE() == null) || (this.DNOMBRE != null && this.DNOMBRE.equals(other.getDNOMBRE())));
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
		if (getCDNI() != null)
		{
			_hashCode += getCDNI().hashCode();
		}
		if (getDAPELL1() != null)
		{
			_hashCode += getDAPELL1().hashCode();
		}
		if (getDAPELL2() != null)
		{
			_hashCode += getDAPELL2().hashCode();
		}
		if (getDNOMBRE() != null)
		{
			_hashCode += getDNOMBRE().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(UsuarioWS.class, true);

	static
	{
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pfirma", "UsuarioWS"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("CDNI");
		elemField.setXmlName(new javax.xml.namespace.QName("", "CDNI"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("DAPELL1");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DAPELL1"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("DAPELL2");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DAPELL2"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("DNOMBRE");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DNOMBRE"));
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
