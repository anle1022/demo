/**
 * CancelReciptVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.todaytech.gfmis.webservices.vo;

public class CancelReciptVO  implements java.io.Serializable {
    private java.lang.String cancelResone;

    private java.lang.String loginKey;

    private java.lang.String receiptNO;

    private java.lang.String receiptType;

    public CancelReciptVO() {
    }

    public CancelReciptVO(
           java.lang.String cancelResone,
           java.lang.String loginKey,
           java.lang.String receiptNO,
           java.lang.String receiptType) {
           this.cancelResone = cancelResone;
           this.loginKey = loginKey;
           this.receiptNO = receiptNO;
           this.receiptType = receiptType;
    }


    /**
     * Gets the cancelResone value for this CancelReciptVO.
     * 
     * @return cancelResone
     */
    public java.lang.String getCancelResone() {
        return cancelResone;
    }


    /**
     * Sets the cancelResone value for this CancelReciptVO.
     * 
     * @param cancelResone
     */
    public void setCancelResone(java.lang.String cancelResone) {
        this.cancelResone = cancelResone;
    }


    /**
     * Gets the loginKey value for this CancelReciptVO.
     * 
     * @return loginKey
     */
    public java.lang.String getLoginKey() {
        return loginKey;
    }


    /**
     * Sets the loginKey value for this CancelReciptVO.
     * 
     * @param loginKey
     */
    public void setLoginKey(java.lang.String loginKey) {
        this.loginKey = loginKey;
    }


    /**
     * Gets the receiptNO value for this CancelReciptVO.
     * 
     * @return receiptNO
     */
    public java.lang.String getReceiptNO() {
        return receiptNO;
    }


    /**
     * Sets the receiptNO value for this CancelReciptVO.
     * 
     * @param receiptNO
     */
    public void setReceiptNO(java.lang.String receiptNO) {
        this.receiptNO = receiptNO;
    }


    /**
     * Gets the receiptType value for this CancelReciptVO.
     * 
     * @return receiptType
     */
    public java.lang.String getReceiptType() {
        return receiptType;
    }


    /**
     * Sets the receiptType value for this CancelReciptVO.
     * 
     * @param receiptType
     */
    public void setReceiptType(java.lang.String receiptType) {
        this.receiptType = receiptType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelReciptVO)) return false;
        CancelReciptVO other = (CancelReciptVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelResone==null && other.getCancelResone()==null) || 
             (this.cancelResone!=null &&
              this.cancelResone.equals(other.getCancelResone()))) &&
            ((this.loginKey==null && other.getLoginKey()==null) || 
             (this.loginKey!=null &&
              this.loginKey.equals(other.getLoginKey()))) &&
            ((this.receiptNO==null && other.getReceiptNO()==null) || 
             (this.receiptNO!=null &&
              this.receiptNO.equals(other.getReceiptNO()))) &&
            ((this.receiptType==null && other.getReceiptType()==null) || 
             (this.receiptType!=null &&
              this.receiptType.equals(other.getReceiptType())));
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
        if (getCancelResone() != null) {
            _hashCode += getCancelResone().hashCode();
        }
        if (getLoginKey() != null) {
            _hashCode += getLoginKey().hashCode();
        }
        if (getReceiptNO() != null) {
            _hashCode += getReceiptNO().hashCode();
        }
        if (getReceiptType() != null) {
            _hashCode += getReceiptType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelReciptVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReciptVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelResone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelResone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptType"));
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
