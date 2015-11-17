package ws.orden;

public class RecibirOrdenDespachoWsProxy implements ws.orden.RecibirOrdenDespachoWs {
  private String _endpoint = null;
  private ws.orden.RecibirOrdenDespachoWs recibirOrdenDespachoWs = null;
  
  public RecibirOrdenDespachoWsProxy() {
    _initRecibirOrdenDespachoWsProxy();
  }
  
  public RecibirOrdenDespachoWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initRecibirOrdenDespachoWsProxy();
  }
  
  private void _initRecibirOrdenDespachoWsProxy() {
    try {
      recibirOrdenDespachoWs = (new ws.orden.RecibirOrdenDespachoWsServiceLocator()).getRecibirOrdenDespachoWsPort();
      if (recibirOrdenDespachoWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)recibirOrdenDespachoWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)recibirOrdenDespachoWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (recibirOrdenDespachoWs != null)
      ((javax.xml.rpc.Stub)recibirOrdenDespachoWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.orden.RecibirOrdenDespachoWs getRecibirOrdenDespachoWs() {
    if (recibirOrdenDespachoWs == null)
      _initRecibirOrdenDespachoWsProxy();
    return recibirOrdenDespachoWs;
  }
  
  public ws.orden.RecibirOrdenDespachoResponse recibirOrdenDespacho(ws.orden.RecibirOrdenDespacho parameters) throws java.rmi.RemoteException{
    if (recibirOrdenDespachoWs == null)
      _initRecibirOrdenDespachoWsProxy();
    return recibirOrdenDespachoWs.recibirOrdenDespacho(parameters);
  }
  
  
}