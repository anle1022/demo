/**
 * LoginRetVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.todaytech.gfmis.webservices.vo;

public class LoginRetVO  implements java.io.Serializable {
    private java.lang.String loginKey;

    private java.lang.String reason;

    private java.lang.String returnCode;

    public LoginRetVO() {
    }

    public LoginRetVO(
           java.lang.String loginKey,
           java.lang.String reason,
           java.lang.String returnCode) {
           this.loginKey = loginKey;
           this.reason = reason;
           this.returnCode = returnCode;
    }


    public String toString() {
		return "LoginRetVO [loginKey=" + loginKey + ", reason=" + reason
				+ ", returnCode=" + returnCode + "]";
	}

	/**
     * Gets the loginKey value for this LoginRetVO.
     * 
     * @return loginKey
     */
    public java.lang.String getLoginKey() {
        return loginKey;
    }


    /**
     * Sets the loginKey value for this LoginRetVO.
     * 
     * @param loginKey
     */
    public void setLoginKey(java.lang.String loginKey) {
        this.loginKey = loginKey;
    }


    /**
     * Gets the reason value for this LoginRetVO.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this LoginRetVO.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the returnCode value for this LoginRetVO.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this LoginRetVO.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginRetVO)) return false;
        LoginRetVO other = (LoginRetVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginKey==null && other.getLoginKey()==null) || 
             (this.loginKey!=null &&
              this.loginKey.equals(other.getLoginKey()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLoginKey() != null) {
            _hashCode += getLoginKey().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginRetVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LoginRetVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
