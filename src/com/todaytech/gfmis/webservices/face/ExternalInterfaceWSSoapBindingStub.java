/**
 * ExternalInterfaceWSSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.todaytech.gfmis.webservices.face;

public class ExternalInterfaceWSSoapBindingStub extends org.apache.axis.client.Stub implements com.todaytech.gfmis.webservices.face.ExternalInterfaceWS {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("main");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "args"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "lpvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LogoutVO"), com.todaytech.gfmis.webservices.vo.LogoutVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LogoutRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.LogoutRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "logoutReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelPayNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpnvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelPayNoteVO"), com.todaytech.gfmis.webservices.vo.CancelPayNoteVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelPayNoteRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.CancelPayNoteRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cancelPayNoteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loginvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LoginVO"), com.todaytech.gfmis.webservices.vo.LoginVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LoginRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.LoginRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "LoginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePayNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gpnvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteVO"), com.todaytech.gfmis.webservices.vo.GeneratePayNoteVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generatePayNoteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePayNoteCG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gpnvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteCGVO"), com.todaytech.gfmis.webservices.vo.GeneratePayNoteCGVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generatePayNoteCGReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePayNoteGt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gpngtvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteGTVO"), com.todaytech.gfmis.webservices.vo.GeneratePayNoteGTVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generatePayNoteGtReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPayNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "spnvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchPayNoteVO"), com.todaytech.gfmis.webservices.vo.SearchPayNoteVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchPayNoteRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "searchPayNoteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPnnos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "spnvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchPayNoteVO"), com.todaytech.gfmis.webservices.vo.SearchPayNoteVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchPayNoteRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "searchPnnosReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelReceiptStock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crsvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReceiptStockVO"), com.todaytech.gfmis.webservices.vo.CancelReceiptStockVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReceiptStockRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.CancelReceiptStockRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cancelReceiptStockReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateReceiptStock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "grsvo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptStockVO"), com.todaytech.gfmis.webservices.vo.GenerateReceiptStockVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptStockRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.GenerateReceiptStockRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generateReceiptStockReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendReceiptInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "srivo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SendReceiptInfoVO"), com.todaytech.gfmis.webservices.vo.SendReceiptInfoVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SendReceiptInfoRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.SendReceiptInfoRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sendReceiptInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateReceiptIssue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "griv"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptIssueVO"), com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptIssueRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generateReceiptIssueReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("printReceiptByGt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payNoteVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "PayNoteVO"), com.todaytech.gfmis.webservices.vo.PayNoteVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchReceiptRetVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.SearchReceiptRetVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "printReceiptByGtReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeReceiptByGt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "changeReceiptVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "ChangeReceiptVO"), com.todaytech.gfmis.webservices.vo.ChangeReceiptVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "ChangeReciptRstVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.ChangeReciptRstVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeReceiptByGtReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelReceiptByGt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancelReciptVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReciptVO"), com.todaytech.gfmis.webservices.vo.CancelReciptVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReciptRstVO"));
        oper.setReturnClass(com.todaytech.gfmis.webservices.vo.CancelReciptRstVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cancelReceiptByGtReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("batchVoidReceipt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "batchVoidReceiptReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiptStockXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "receiptStockXmlReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiptStockUserXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "receiptStockUserXmlReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiptDisableXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "receiptDisableXmlReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    public ExternalInterfaceWSSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ExternalInterfaceWSSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ExternalInterfaceWSSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://common.webservices.gfmis.todaytech.com", "BaseWssVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.common.BaseWssVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservices.gfmis.todaytech.com", "GenericRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.common.GenericRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservices.gfmis.todaytech.com", "GenericVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.common.GenericVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "ArrayOf_tns1_GenerateReceiptIssueSubVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueSubVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptIssueSubVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelPayNoteRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.CancelPayNoteRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelPayNoteVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.CancelPayNoteVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReceiptStockRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.CancelReceiptStockRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReceiptStockVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.CancelReceiptStockVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReciptRstVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.CancelReciptRstVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "CancelReciptVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.CancelReciptVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "ChangeReceiptVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.ChangeReceiptVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "ChangeReciptRstVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.ChangeReciptRstVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteCGVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GeneratePayNoteCGVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteGTVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GeneratePayNoteGTVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePayNoteVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GeneratePayNoteVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GeneratePenaltyPNVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GeneratePenaltyPNVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptIssueRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptIssueSubVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueSubVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptIssueVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptStockRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GenerateReceiptStockRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "GenerateReceiptStockVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.GenerateReceiptStockVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LoginRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.LoginRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LoginVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.LoginVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LogoutRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.LogoutRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "LogoutVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.LogoutVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "PayNoteVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.PayNoteVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchPayNoteRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchPayNoteVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.SearchPayNoteVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SearchReceiptRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.SearchReceiptRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SendReceiptInfoRetVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.SendReceiptInfoRetVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.webservices.gfmis.todaytech.com", "SendReceiptInfoVO");
            cachedSerQNames.add(qName);
            cls = com.todaytech.gfmis.webservices.vo.SendReceiptInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void main(java.lang.String[] args) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "main"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {args});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.LogoutRetVO logout(com.todaytech.gfmis.webservices.vo.LogoutVO lpvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {lpvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.LogoutRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.LogoutRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.LogoutRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.CancelPayNoteRetVO cancelPayNote(com.todaytech.gfmis.webservices.vo.CancelPayNoteVO cpnvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "cancelPayNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cpnvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.CancelPayNoteRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.CancelPayNoteRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.CancelPayNoteRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.LoginRetVO login(com.todaytech.gfmis.webservices.vo.LoginVO loginvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "Login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loginvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.LoginRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.LoginRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.LoginRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNote(com.todaytech.gfmis.webservices.vo.GeneratePayNoteVO gpnvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "generatePayNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gpnvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNoteCG(com.todaytech.gfmis.webservices.vo.GeneratePayNoteCGVO gpnvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "generatePayNoteCG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gpnvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNoteGt(com.todaytech.gfmis.webservices.vo.GeneratePayNoteGTVO gpngtvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "generatePayNoteGt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gpngtvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO searchPayNote(com.todaytech.gfmis.webservices.vo.SearchPayNoteVO spnvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "searchPayNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {spnvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO searchPnnos(com.todaytech.gfmis.webservices.vo.SearchPayNoteVO spnvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "searchPnnos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {spnvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.CancelReceiptStockRetVO cancelReceiptStock(com.todaytech.gfmis.webservices.vo.CancelReceiptStockVO crsvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "cancelReceiptStock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {crsvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.CancelReceiptStockRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.CancelReceiptStockRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.CancelReceiptStockRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.GenerateReceiptStockRetVO generateReceiptStock(com.todaytech.gfmis.webservices.vo.GenerateReceiptStockVO grsvo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "generateReceiptStock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {grsvo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.GenerateReceiptStockRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.GenerateReceiptStockRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.GenerateReceiptStockRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.SendReceiptInfoRetVO sendReceiptInfo(com.todaytech.gfmis.webservices.vo.SendReceiptInfoVO srivo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "sendReceiptInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {srivo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.SendReceiptInfoRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.SendReceiptInfoRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.SendReceiptInfoRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueRetVO generateReceiptIssue(com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueVO griv) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "generateReceiptIssue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {griv});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.SearchReceiptRetVO printReceiptByGt(com.todaytech.gfmis.webservices.vo.PayNoteVO payNoteVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "printReceiptByGt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {payNoteVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.SearchReceiptRetVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.SearchReceiptRetVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.SearchReceiptRetVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.ChangeReciptRstVO changeReceiptByGt(com.todaytech.gfmis.webservices.vo.ChangeReceiptVO changeReceiptVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "changeReceiptByGt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeReceiptVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.ChangeReciptRstVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.ChangeReciptRstVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.ChangeReciptRstVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.todaytech.gfmis.webservices.vo.CancelReciptRstVO cancelReceiptByGt(com.todaytech.gfmis.webservices.vo.CancelReciptVO cancelReciptVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "cancelReceiptByGt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelReciptVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.todaytech.gfmis.webservices.vo.CancelReciptRstVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.todaytech.gfmis.webservices.vo.CancelReciptRstVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.todaytech.gfmis.webservices.vo.CancelReciptRstVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String batchVoidReceipt(java.lang.String xml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "batchVoidReceipt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String receiptStockXml(java.lang.String xml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "receiptStockXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String receiptStockUserXml(java.lang.String xml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "receiptStockUserXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String receiptDisableXml(java.lang.String xml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://face.webservices.gfmis.todaytech.com", "receiptDisableXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
