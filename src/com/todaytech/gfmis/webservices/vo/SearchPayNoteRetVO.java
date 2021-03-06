/**
 * SearchPayNoteRetVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.todaytech.gfmis.webservices.vo;

public class SearchPayNoteRetVO  extends com.todaytech.gfmis.webservices.common.GenericRetVO  implements java.io.Serializable {
    private java.lang.String bankName;

    private java.lang.String paidTM;

    private java.lang.String payerName;

    private java.lang.String pnNO;

    private java.lang.String receiptNO;

    private double receivableAmt;

    private double receivedAmt;

    private java.lang.String rtNO;

    private int status;

    private java.lang.String unitNO;

    public SearchPayNoteRetVO() {
    }

    public SearchPayNoteRetVO(
           java.lang.String reason,
           java.lang.String returnCode,
           java.lang.String bankName,
           java.lang.String paidTM,
           java.lang.String payerName,
           java.lang.String pnNO,
           java.lang.String receiptNO,
           double receivableAmt,
           double receivedAmt,
           java.lang.String rtNO,
           int status,
           java.lang.String unitNO) {
        super(
            reason,
            returnCode);
        this.bankName = bankName;
        this.paidTM = paidTM;
        this.payerName = payerName;
        this.pnNO = pnNO;
        this.receiptNO = receiptNO;
        this.receivableAmt = receivableAmt;
        this.receivedAmt = receivedAmt;
        this.rtNO = rtNO;
        this.status = status;
        this.unitNO = unitNO;
    }


    /**
     * Gets the bankName value for this SearchPayNoteRetVO.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this SearchPayNoteRetVO.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the paidTM value for this SearchPayNoteRetVO.
     * 
     * @return paidTM
     */
    public java.lang.String getPaidTM() {
        return paidTM;
    }


    /**
     * Sets the paidTM value for this SearchPayNoteRetVO.
     * 
     * @param paidTM
     */
    public void setPaidTM(java.lang.String paidTM) {
        this.paidTM = paidTM;
    }


    /**
     * Gets the payerName value for this SearchPayNoteRetVO.
     * 
     * @return payerName
     */
    public java.lang.String getPayerName() {
        return payerName;
    }


    /**
     * Sets the payerName value for this SearchPayNoteRetVO.
     * 
     * @param payerName
     */
    public void setPayerName(java.lang.String payerName) {
        this.payerName = payerName;
    }


    /**
     * Gets the pnNO value for this SearchPayNoteRetVO.
     * 
     * @return pnNO
     */
    public java.lang.String getPnNO() {
        return pnNO;
    }


    /**
     * Sets the pnNO value for this SearchPayNoteRetVO.
     * 
     * @param pnNO
     */
    public void setPnNO(java.lang.String pnNO) {
        this.pnNO = pnNO;
    }


    /**
     * Gets the receiptNO value for this SearchPayNoteRetVO.
     * 
     * @return receiptNO
     */
    public java.lang.String getReceiptNO() {
        return receiptNO;
    }


    /**
     * Sets the receiptNO value for this SearchPayNoteRetVO.
     * 
     * @param receiptNO
     */
    public void setReceiptNO(java.lang.String receiptNO) {
        this.receiptNO = receiptNO;
    }


    /**
     * Gets the receivableAmt value for this SearchPayNoteRetVO.
     * 
     * @return receivableAmt
     */
    public double getReceivableAmt() {
        return receivableAmt;
    }


    /**
     * Sets the receivableAmt value for this SearchPayNoteRetVO.
     * 
     * @param receivableAmt
     */
    public void setReceivableAmt(double receivableAmt) {
        this.receivableAmt = receivableAmt;
    }


    /**
     * Gets the receivedAmt value for this SearchPayNoteRetVO.
     * 
     * @return receivedAmt
     */
    public double getReceivedAmt() {
        return receivedAmt;
    }


    /**
     * Sets the receivedAmt value for this SearchPayNoteRetVO.
     * 
     * @param receivedAmt
     */
    public void setReceivedAmt(double receivedAmt) {
        this.receivedAmt = receivedAmt;
    }


    /**
     * Gets the rtNO value for this SearchPayNoteRetVO.
     * 
     * @return rtNO
     */
    public java.lang.String getRtNO() {
        return rtNO;
    }


    /**
     * Sets the rtNO value for this SearchPayNoteRetVO.
     * 
     * @param rtNO
     */
    public void setRtNO(java.lang.String rtNO) {
        this.rtNO = rtNO;
    }


    /**
     * Gets the status value for this SearchPayNoteRetVO.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SearchPayNoteRetVO.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the unitNO value for this SearchPayNoteRetVO.
     * 
     * @return unitNO
     */
    public java.lang.String getUnitNO() {
        return unitNO;
    }


    /**
     * Sets the unitNO value for this SearchPayNoteRetVO.
     * 
     * @param unitNO
     */
    public void setUnitNO(java.lang.String unitNO) {
        this.unitNO = unitNO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchPayNoteRetVO)) return false;
        SearchPayNoteRetVO other = (SearchPayNoteRetVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.paidTM==null && other.getPaidTM()==null) || 
             (this.paidTM!=null &&
              this.paidTM.equals(other.getPaidTM()))) &&
            ((this.payerName==null && other.getPayerName()==null) || 
             (this.payerName!=null &&
              this.payerName.equals(other.getPayerName()))) &&
            ((this.pnNO==null && other.getPnNO()==null) || 
             (this.pnNO!=null &&
              this.pnNO.equals(other.getPnNO()))) &&
            ((this.receiptNO==null && other.getReceiptNO()==null) || 
             (this.receiptNO!=null &&
              this.receiptNO.equals(other.getReceiptNO()))) &&
            this.receivableAmt == other.getReceivableAmt() &&
            this.receivedAmt == other.getReceivedAmt() &&
            ((this.rtNO==null && other.getRtNO()==null) || 
             (this.rtNO!=null &&
              this.rtNO.equals(other.getRtNO()))) &&
            this.status == other.getStatus() &&
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
        int _hashCode = super.hashCode();
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getPaidTM() != null) {
            _hashCode += getPaidTM().hashCode();
        }
        if (getPayerName() != null) {
            _hashCode += getPayerName().hashCode();
        }
        if (getPnNO() != null) {
            _hashCode += getPnNO().hashCode();
        }
        if (getReceiptNO() != null) {
            _hashCode += getReceiptNO().hashCode();
        }
        _hashCode += new Double(getReceivableAmt()).hashCode();
        _hashCode += new Double(getReceivedAmt()).hashCode();
        if (getRtNO() != null) {
            _hashCode += getRtNO().hashCode();
        }
        _hashCode += getStatus();
        if (getUnitNO() != null) {
            _hashCode += getUnitNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchPayNoteRetVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchPayNoteRetVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidTM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidTM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payerName"));
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
        elemField.setFieldName("receiptNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivableAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivableAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivedAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
