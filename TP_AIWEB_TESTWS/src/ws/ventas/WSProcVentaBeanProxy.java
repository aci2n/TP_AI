package ws.ventas;

public class WSProcVentaBeanProxy implements ws.ventas.WSProcVentaBean {
  private String _endpoint = null;
  private ws.ventas.WSProcVentaBean wSProcVentaBean = null;
  
  public WSProcVentaBeanProxy() {
    _initWSProcVentaBeanProxy();
  }
  
  public WSProcVentaBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSProcVentaBeanProxy();
  }
  
  private void _initWSProcVentaBeanProxy() {
    try {
      wSProcVentaBean = (new ws.ventas.WSProcVentaBeanServiceLocator()).getWSProcVentaBeanPort();
      if (wSProcVentaBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSProcVentaBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSProcVentaBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSProcVentaBean != null)
      ((javax.xml.rpc.Stub)wSProcVentaBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.ventas.WSProcVentaBean getWSProcVentaBean() {
    if (wSProcVentaBean == null)
      _initWSProcVentaBeanProxy();
    return wSProcVentaBean;
  }
  
  public java.lang.String procesarCarrito(com.monitor.webService.VoCarrito arg0) throws java.rmi.RemoteException{
    if (wSProcVentaBean == null)
      _initWSProcVentaBeanProxy();
    return wSProcVentaBean.procesarCarrito(arg0);
  }
  
  public java.lang.String procesarVenta(com.monitor.webService.VoVenta arg0) throws java.rmi.RemoteException{
    if (wSProcVentaBean == null)
      _initWSProcVentaBeanProxy();
    return wSProcVentaBean.procesarVenta(arg0);
  }
  
  
}