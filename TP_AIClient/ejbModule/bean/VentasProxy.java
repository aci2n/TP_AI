package bean;

public class VentasProxy implements bean.Ventas {
  private String _endpoint = null;
  private bean.Ventas ventas = null;
  
  public VentasProxy() {
    _initVentasProxy();
  }
  
  public VentasProxy(String endpoint) {
    _endpoint = endpoint;
    _initVentasProxy();
  }
  
  private void _initVentasProxy() {
    try {
      ventas = (new bean.VentasServiceLocator()).getVentasPort();
      if (ventas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ventas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ventas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ventas != null)
      ((javax.xml.rpc.Stub)ventas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bean.Ventas getVentas() {
    if (ventas == null)
      _initVentasProxy();
    return ventas;
  }
  
  public void testAgregarVenta() throws java.rmi.RemoteException{
    if (ventas == null)
      _initVentasProxy();
    ventas.testAgregarVenta();
  }
  
  
}