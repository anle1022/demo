/**
 * ExternalInterfaceWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.todaytech.gfmis.webservices.face;

public interface ExternalInterfaceWS extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.LogoutRetVO logout(com.todaytech.gfmis.webservices.vo.LogoutVO lpvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.CancelPayNoteRetVO cancelPayNote(com.todaytech.gfmis.webservices.vo.CancelPayNoteVO cpnvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.LoginRetVO login(com.todaytech.gfmis.webservices.vo.LoginVO loginvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNote(com.todaytech.gfmis.webservices.vo.GeneratePayNoteVO gpnvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNoteCG(com.todaytech.gfmis.webservices.vo.GeneratePayNoteCGVO gpnvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNoteGt(com.todaytech.gfmis.webservices.vo.GeneratePayNoteGTVO gpngtvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO searchPayNote(com.todaytech.gfmis.webservices.vo.SearchPayNoteVO spnvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO searchPnnos(com.todaytech.gfmis.webservices.vo.SearchPayNoteVO spnvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.CancelReceiptStockRetVO cancelReceiptStock(com.todaytech.gfmis.webservices.vo.CancelReceiptStockVO crsvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.GenerateReceiptStockRetVO generateReceiptStock(com.todaytech.gfmis.webservices.vo.GenerateReceiptStockVO grsvo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.SendReceiptInfoRetVO sendReceiptInfo(com.todaytech.gfmis.webservices.vo.SendReceiptInfoVO srivo) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueRetVO generateReceiptIssue(com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueVO griv) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.SearchReceiptRetVO printReceiptByGt(com.todaytech.gfmis.webservices.vo.PayNoteVO payNoteVO) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.ChangeReciptRstVO changeReceiptByGt(com.todaytech.gfmis.webservices.vo.ChangeReceiptVO changeReceiptVO) throws java.rmi.RemoteException;
    public com.todaytech.gfmis.webservices.vo.CancelReciptRstVO cancelReceiptByGt(com.todaytech.gfmis.webservices.vo.CancelReciptVO cancelReciptVO) throws java.rmi.RemoteException;
    public java.lang.String batchVoidReceipt(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String receiptStockXml(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String receiptStockUserXml(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String receiptDisableXml(java.lang.String xml) throws java.rmi.RemoteException;
}
