package ws.ventas;

public class WSProcVentaBeanServiceProxy implements ws.ventas.WSProcVentaBeanService {
  private String _endpoint = null;
  private ws.ventas.WSProcVentaBeanService wSProcVentaBeanService = null;
  
  public WSProcVentaBeanServiceProxy() {
    _initWSProcVentaBeanServiceProxy();
  }
  
  public WSProcVentaBeanServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSProcVentaBeanServiceProxy();
  }
  
  private void _initWSProcVentaBeanServiceProxy() {
    try {
      wSProcVentaBeanService = (new ws.ventas.WSProcVentaBeanServiceServiceLocator()).getWSProcVentaBeanServicePort();
      if (wSProcVentaBeanService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSProcVentaBeanService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSProcVentaBeanService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSProcVentaBeanService != null)
      ((javax.xml.rpc.Stub)wSProcVentaBeanService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.ventas.WSProcVentaBeanService getWSProcVentaBeanService() {
    if (wSProcVentaBeanService == null)
      _initWSProcVentaBeanServiceProxy();
    return wSProcVentaBeanService;
  }
  
  public java.lang.String procesarCarrito(com.monitor.webService.VoCarrito arg0) throws java.rmi.RemoteException{
    if (wSProcVentaBeanService == null)
      _initWSProcVentaBeanServiceProxy();
    return wSProcVentaBeanService.procesarCarrito(arg0);
  }
  
  public java.lang.String procesarVenta(com.monitor.webService.VoVenta arg0) throws java.rmi.RemoteException{
    if (wSProcVentaBeanService == null)
      _initWSProcVentaBeanServiceProxy();
    return wSProcVentaBeanService.procesarVenta(arg0);
  }
  
  
}