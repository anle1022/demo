/**
 * ChangeReceiptVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.todaytech.gfmis.webservices.vo;

public class ChangeReceiptVO  implements java.io.Serializable {
    private java.lang.String changeResone;

    private java.lang.String loginKey;

    private java.lang.String newReceiptNO;

    private java.lang.String newReceiptType;

    private java.lang.String oldReceiptNO;

    private java.lang.String oldReceiptType;

    private java.lang.String pnNO;

    private java.lang.String unitNO;

    public ChangeReceiptVO() {
    }

    public ChangeReceiptVO(
           java.lang.String changeResone,
           java.lang.String loginKey,
           java.lang.String newReceiptNO,
           java.lang.String newReceiptType,
           java.lang.String oldReceiptNO,
           java.lang.String oldReceiptType,
           java.lang.String pnNO,
           java.lang.String unitNO) {
           this.changeResone = changeResone;
           this.loginKey = loginKey;
           this.newReceiptNO = newReceiptNO;
           this.newReceiptType = newReceiptType;
           this.oldReceiptNO = oldReceiptNO;
           this.oldReceiptType = oldReceiptType;
           this.pnNO = pnNO;
           this.unitNO = unitNO;
    }


    /**
     * Gets the changeResone value for this ChangeReceiptVO.
     * 
     * @return changeResone
     */
    public java.lang.String getChangeResone() {
        return changeResone;
    }


    /**
     * Sets the changeResone value for this ChangeReceiptVO.
     * 
     * @param changeResone
     */
    public void setChangeResone(java.lang.String changeResone) {
        this.changeResone = changeResone;
    }


    /**
     * Gets the loginKey value for this ChangeReceiptVO.
     * 
     * @return loginKey
     */
    public java.lang.String getLoginKey() {
        return loginKey;
    }


    /**
     * Sets the loginKey value for this ChangeReceiptVO.
     * 
     * @param loginKey
     */
    public void setLoginKey(java.lang.String loginKey) {
        this.loginKey = loginKey;
    }


    /**
     * Gets the newReceiptNO value for this ChangeReceiptVO.
     * 
     * @return newReceiptNO
     */
    public java.lang.String getNewReceiptNO() {
        return newReceiptNO;
    }


    /**
     * Sets the newReceiptNO value for this ChangeReceiptVO.
     * 
     * @param newReceiptNO
     */
    public void setNewReceiptNO(java.lang.String newReceiptNO) {
        this.newReceiptNO = newReceiptNO;
    }


    /**
     * Gets the newReceiptType value for this ChangeReceiptVO.
     * 
     * @return newReceiptType
     */
    public java.lang.String getNewReceiptType() {
        return newReceiptType;
    }


    /**
     * Sets the newReceiptType value for this ChangeReceiptVO.
     * 
     * @param newReceiptType
     */
    public void setNewReceiptType(java.lang.String newReceiptType) {
        this.newReceiptType = newReceiptType;
    }


    /**
     * Gets the oldReceiptNO value for this ChangeReceiptVO.
     * 
     * @return oldReceiptNO
     */
    public java.lang.String getOldReceiptNO() {
        return oldReceiptNO;
    }


    /**
     * Sets the oldReceiptNO value for this ChangeReceiptVO.
     * 
     * @param oldReceiptNO
     */
    public void setOldReceiptNO(java.lang.String oldReceiptNO) {
        this.oldReceiptNO = oldReceiptNO;
    }


    /**
     * Gets the oldReceiptType value for this ChangeReceiptVO.
     * 
     * @return oldReceiptType
     */
    public java.lang.String getOldReceiptType() {
        return oldReceiptType;
    }


    /**
     * Sets the oldReceiptType value for this ChangeReceiptVO.
     * 
     * @param oldReceiptType
     */
    public void setOldReceiptType(java.lang.String oldReceiptType) {
        this.oldReceiptType = oldReceiptType;
    }


    /**
     * Gets the pnNO value for this ChangeReceiptVO.
     * 
     * @return pnNO
     */
    public java.lang.String getPnNO() {
        return pnNO;
    }


    /**
     * Sets the pnNO value for this ChangeReceiptVO.
     * 
     * @param pnNO
     */
    public void setPnNO(java.lang.String pnNO) {
        this.pnNO = pnNO;
    }


    /**
     * Gets the unitNO value for this ChangeReceiptVO.
     * 
     * @return unitNO
     */
    public java.lang.String getUnitNO() {
        return unitNO;
    }


    /**
     * Sets the unitNO value for this ChangeReceiptVO.
     * 
     * @param unitNO
     */
    public void setUnitNO(java.lang.String unitNO) {
        this.unitNO = unitNO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeReceiptVO)) return false;
        ChangeReceiptVO other = (ChangeReceiptVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeResone==null && other.getChangeResone()==null) || 
             (this.changeResone!=null &&
              this.changeResone.equals(other.getChangeResone()))) &&
            ((this.loginKey==null && other.getLoginKey()==null) || 
             (this.loginKey!=null &&
              this.loginKey.equals(other.getLoginKey()))) &&
            ((this.newReceiptNO==null && other.getNewReceiptNO()==null) || 
             (this.newReceiptNO!=null &&
              this.newReceiptNO.equals(other.getNewReceiptNO()))) &&
            ((this.newReceiptType==null && other.getNewReceiptType()==null) || 
             (this.newReceiptType!=null &&
              this.newReceiptType.equals(other.getNewReceiptType()))) &&
            ((this.oldReceiptNO==null && other.getOldReceiptNO()==null) || 
             (this.oldReceiptNO!=null &&
              this.oldReceiptNO.equals(other.getOldReceiptNO()))) &&
            ((this.oldReceiptType==null && other.getOldReceiptType()==null) || 
             (this.oldReceiptType!=null &&
              this.oldReceiptType.equals(other.getOldReceiptType()))) &&
            ((this.pnNO==null && other.getPnNO()==null) || 
             (this.pnNO!=null &&
              this.pnNO.equals(other.getPnNO()))) &&
            ((this.unitNO==null && other.getUnitNO()==null) || 
             (this.unitNO!=null &&
              this.unitNO.equals(other.getUnitNO())));
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
        if (getChangeResone() != null) {
            _hashCode += getChangeResone().hashCode();
        }
        if (getLoginKey() != null) {
            _hashCode += getLoginKey().hashCode();
        }
        if (getNewReceiptNO() != null) {
            _hashCode += getNewReceiptNO().hashCode();
        }
        if (getNewReceiptType() != null) {
            _hashCode += getNewReceiptType().hashCode();
        }
        if (getOldReceiptNO() != null) {
            _hashCode += getOldReceiptNO().hashCode();
        }
        if (getOldReceiptType() != null) {
            _hashCode += getOldReceiptType().hashCode();
        }
        if (getPnNO() != null) {
            _hashCode += getPnNO().hashCode();
        }
        if (getUnitNO() != null) {
            _hashCode += getUnitNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeReceiptVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "ChangeReceiptVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeResone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeResone"));
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
        elemField.setFieldName("newReceiptNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newReceiptNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newReceiptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newReceiptType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldReceiptNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldReceiptNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldReceiptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldReceiptType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pnNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitNO"));
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
