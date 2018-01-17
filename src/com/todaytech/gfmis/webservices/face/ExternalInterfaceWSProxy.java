package com.todaytech.gfmis.webservices.face;

public class ExternalInterfaceWSProxy implements com.todaytech.gfmis.webservices.face.ExternalInterfaceWS {
  private String _endpoint = null;
  private com.todaytech.gfmis.webservices.face.ExternalInterfaceWS externalInterfaceWS = null;
  
  public ExternalInterfaceWSProxy() {
    _initExternalInterfaceWSProxy();
  }
  
  public ExternalInterfaceWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initExternalInterfaceWSProxy();
  }
  
  private void _initExternalInterfaceWSProxy() {
    try {
      externalInterfaceWS = (new com.todaytech.gfmis.webservices.face.ExternalInterfaceWSServiceLocator()).getExternalInterfaceWS();
      if (externalInterfaceWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)externalInterfaceWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)externalInterfaceWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (externalInterfaceWS != null)
      ((javax.xml.rpc.Stub)externalInterfaceWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.todaytech.gfmis.webservices.face.ExternalInterfaceWS getExternalInterfaceWS() {
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    externalInterfaceWS.main(args);
  }
  
  public com.todaytech.gfmis.webservices.vo.LogoutRetVO logout(com.todaytech.gfmis.webservices.vo.LogoutVO lpvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.logout(lpvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.CancelPayNoteRetVO cancelPayNote(com.todaytech.gfmis.webservices.vo.CancelPayNoteVO cpnvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.cancelPayNote(cpnvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.LoginRetVO login(com.todaytech.gfmis.webservices.vo.LoginVO loginvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.login(loginvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNote(com.todaytech.gfmis.webservices.vo.GeneratePayNoteVO gpnvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.generatePayNote(gpnvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNoteCG(com.todaytech.gfmis.webservices.vo.GeneratePayNoteCGVO gpnvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.generatePayNoteCG(gpnvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO generatePayNoteGt(com.todaytech.gfmis.webservices.vo.GeneratePayNoteGTVO gpngtvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.generatePayNoteGt(gpngtvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO searchPayNote(com.todaytech.gfmis.webservices.vo.SearchPayNoteVO spnvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.searchPayNote(spnvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.SearchPayNoteRetVO searchPnnos(com.todaytech.gfmis.webservices.vo.SearchPayNoteVO spnvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.searchPnnos(spnvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.CancelReceiptStockRetVO cancelReceiptStock(com.todaytech.gfmis.webservices.vo.CancelReceiptStockVO crsvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.cancelReceiptStock(crsvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.GenerateReceiptStockRetVO generateReceiptStock(com.todaytech.gfmis.webservices.vo.GenerateReceiptStockVO grsvo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.generateReceiptStock(grsvo);
  }
  
  public com.todaytech.gfmis.webservices.vo.SendReceiptInfoRetVO sendReceiptInfo(com.todaytech.gfmis.webservices.vo.SendReceiptInfoVO srivo) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.sendReceiptInfo(srivo);
  }
  
  public com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueRetVO generateReceiptIssue(com.todaytech.gfmis.webservices.vo.GenerateReceiptIssueVO griv) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.generateReceiptIssue(griv);
  }
  
  public com.todaytech.gfmis.webservices.vo.SearchReceiptRetVO printReceiptByGt(com.todaytech.gfmis.webservices.vo.PayNoteVO payNoteVO) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.printReceiptByGt(payNoteVO);
  }
  
  public com.todaytech.gfmis.webservices.vo.ChangeReciptRstVO changeReceiptByGt(com.todaytech.gfmis.webservices.vo.ChangeReceiptVO changeReceiptVO) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.changeReceiptByGt(changeReceiptVO);
  }
  
  public com.todaytech.gfmis.webservices.vo.CancelReciptRstVO cancelReceiptByGt(com.todaytech.gfmis.webservices.vo.CancelReciptVO cancelReciptVO) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.cancelReceiptByGt(cancelReciptVO);
  }
  
  public java.lang.String batchVoidReceipt(java.lang.String xml) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.batchVoidReceipt(xml);
  }
  
  public java.lang.String receiptStockXml(java.lang.String xml) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.receiptStockXml(xml);
  }
  
  public java.lang.String receiptStockUserXml(java.lang.String xml) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.receiptStockUserXml(xml);
  }
  
  public java.lang.String receiptDisableXml(java.lang.String xml) throws java.rmi.RemoteException{
    if (externalInterfaceWS == null)
      _initExternalInterfaceWSProxy();
    return externalInterfaceWS.receiptDisableXml(xml);
  }
  
  
}