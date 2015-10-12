package bean;

public class VentasWebServiceProxy implements bean.VentasWebService {
  private String _endpoint = null;
  private bean.VentasWebService ventasWebService = null;
  
  public VentasWebServiceProxy() {
    _initVentasWebServiceProxy();
  }
  
  public VentasWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initVentasWebServiceProxy();
  }
  
  private void _initVentasWebServiceProxy() {
    try {
      ventasWebService = (new bean.VentasWebServiceServiceLocator()).getVentasWebServicePort();
      if (ventasWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ventasWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ventasWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ventasWebService != null)
      ((javax.xml.rpc.Stub)ventasWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bean.VentasWebService getVentasWebService() {
    if (ventasWebService == null)
      _initVentasWebServiceProxy();
    return ventasWebService;
  }
  
  public boolean procesarVentas(bean.Venta[] arg0) throws java.rmi.RemoteException{
    if (ventasWebService == null)
      _initVentasWebServiceProxy();
    return ventasWebService.procesarVentas(arg0);
  }
  
  
}