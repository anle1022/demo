/**
 * GenerateReceiptIssueVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.todaytech.gfmis.webservices.vo;

public class GenerateReceiptIssueVO  extends com.todaytech.gfmis.webservices.common.GenericVO  implements java.io.Serializable {
    private java.lang.String desunitId;

    private com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueSubVO[] listdtos;

    private int noNeedPay;

    private int opcode;

    private int operatorId;

    private double sumcost;

    private int sumpieces;

    private java.lang.String unitId;

    public GenerateReceiptIssueVO() {
    }

    public GenerateReceiptIssueVO(
           java.lang.String loginKey,
           java.lang.String desunitId,
           com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueSubVO[] listdtos,
           int noNeedPay,
           int opcode,
           int operatorId,
           double sumcost,
           int sumpieces,
           java.lang.String unitId) {
        super(
            loginKey);
        this.desunitId = desunitId;
        this.listdtos = listdtos;
        this.noNeedPay = noNeedPay;
        this.opcode = opcode;
        this.operatorId = operatorId;
        this.sumcost = sumcost;
        this.sumpieces = sumpieces;
        this.unitId = unitId;
    }


    /**
     * Gets the desunitId value for this GenerateReceiptIssueVO.
     * 
     * @return desunitId
     */
    public java.lang.String getDesunitId() {
        return desunitId;
    }


    /**
     * Sets the desunitId value for this GenerateReceiptIssueVO.
     * 
     * @param desunitId
     */
    public void setDesunitId(java.lang.String desunitId) {
        this.desunitId = desunitId;
    }


    /**
     * Gets the listdtos value for this GenerateReceiptIssueVO.
     * 
     * @return listdtos
     */
    public com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueSubVO[] getListdtos() {
        return listdtos;
    }


    /**
     * Sets the listdtos value for this GenerateReceiptIssueVO.
     * 
     * @param listdtos
     */
    public void setListdtos(com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueSubVO[] listdtos) {
        this.listdtos = listdtos;
    }


    /**
     * Gets the noNeedPay value for this GenerateReceiptIssueVO.
     * 
     * @return noNeedPay
     */
    public int getNoNeedPay() {
        return noNeedPay;
    }


    /**
     * Sets the noNeedPay value for this GenerateReceiptIssueVO.
     * 
     * @param noNeedPay
     */
    public void setNoNeedPay(int noNeedPay) {
        this.noNeedPay = noNeedPay;
    }


    /**
     * Gets the opcode value for this GenerateReceiptIssueVO.
     * 
     * @return opcode
     */
    public int getOpcode() {
        return opcode;
    }


    /**
     * Sets the opcode value for this GenerateReceiptIssueVO.
     * 
     * @param opcode
     */
    public void setOpcode(int opcode) {
        this.opcode = opcode;
    }


    /**
     * Gets the operatorId value for this GenerateReceiptIssueVO.
     * 
     * @return operatorId
     */
    public int getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this GenerateReceiptIssueVO.
     * 
     * @param operatorId
     */
    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the sumcost value for this GenerateReceiptIssueVO.
     * 
     * @return sumcost
     */
    public double getSumcost() {
        return sumcost;
    }


    /**
     * Sets the sumcost value for this GenerateReceiptIssueVO.
     * 
     * @param sumcost
     */
    public void setSumcost(double sumcost) {
        this.sumcost = sumcost;
    }


    /**
     * Gets the sumpieces value for this GenerateReceiptIssueVO.
     * 
     * @return sumpieces
     */
    public int getSumpieces() {
        return sumpieces;
    }


    /**
     * Sets the sumpieces value for this GenerateReceiptIssueVO.
     * 
     * @param sumpieces
     */
    public void setSumpieces(int sumpieces) {
        this.sumpieces = sumpieces;
    }


    /**
     * Gets the unitId value for this GenerateReceiptIssueVO.
     * 
     * @return unitId
     */
    public java.lang.String getUnitId() {
        return unitId;
    }


    /**
     * Sets the unitId value for this GenerateReceiptIssueVO.
     * 
     * @param unitId
     */
    public void setUnitId(java.lang.String unitId) {
        this.unitId = unitId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateReceiptIssueVO)) return false;
        GenerateReceiptIssueVO other = (GenerateReceiptIssueVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.desunitId==null && other.getDesunitId()==null) || 
             (this.desunitId!=null &&
              this.desunitId.equals(other.getDesunitId()))) &&
            ((this.listdtos==null && other.getListdtos()==null) || 
             (this.listdtos!=null &&
              java.util.Arrays.equals(this.listdtos, other.getListdtos()))) &&
            this.noNeedPay == other.getNoNeedPay() &&
            this.opcode == other.getOpcode() &&
            this.operatorId == other.getOperatorId() &&
            this.sumcost == other.getSumcost() &&
            this.sumpieces == other.getSumpieces() &&
            ((this.unitId==null && other.getUnitId()==null) || 
             (this.unitId!=null &&
              this.unitId.equals(other.getUnitId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDesunitId() != null) {
            _hashCode += getDesunitId().hashCode();
        }
        if (getListdtos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListdtos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListdtos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNoNeedPay();
        _hashCode += getOpcode();
        _hashCode += getOperatorId();
        _hashCode += new Double(getSumcost()).hashCode();
        _hashCode += getSumpieces();
        if (getUnitId() != null) {
            _hashCode += getUnitId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateReceiptIssueVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptIssueVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desunitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desunitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listdtos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listdtos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptIssueSubVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noNeedPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noNeedPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumcost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sumcost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumpieces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sumpieces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitId"));
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
