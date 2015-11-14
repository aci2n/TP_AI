package ws.auditoria;

public class WSInformeAuditoriaBeanProxy implements ws.auditoria.WSInformeAuditoriaBean {
  private String _endpoint = null;
  private ws.auditoria.WSInformeAuditoriaBean wSInformeAuditoriaBean = null;
  
  public WSInformeAuditoriaBeanProxy() {
    _initWSInformeAuditoriaBeanProxy();
  }
  
  public WSInformeAuditoriaBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSInformeAuditoriaBeanProxy();
  }
  
  private void _initWSInformeAuditoriaBeanProxy() {
    try {
      wSInformeAuditoriaBean = (new ws.auditoria.WSInformeAuditoriaBeanServiceLocator()).getWSInformeAuditoriaBeanPort();
      if (wSInformeAuditoriaBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSInformeAuditoriaBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSInformeAuditoriaBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSInformeAuditoriaBean != null)
      ((javax.xml.rpc.Stub)wSInformeAuditoriaBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.auditoria.WSInformeAuditoriaBean getWSInformeAuditoriaBean() {
    if (wSInformeAuditoriaBean == null)
      _initWSInformeAuditoriaBeanProxy();
    return wSInformeAuditoriaBean;
  }
  
  public boolean agregarInforme(com.monitor.webService.LogDTO arg0) throws java.rmi.RemoteException{
    if (wSInformeAuditoriaBean == null)
      _initWSInformeAuditoriaBeanProxy();
    return wSInformeAuditoriaBean.agregarInforme(arg0);
  }
  
  
}