package ws.orden;

public class IRecibirOrdenDespachoWsProxy implements ws.orden.IRecibirOrdenDespachoWs {
  private String _endpoint = null;
  private ws.orden.IRecibirOrdenDespachoWs iRecibirOrdenDespachoWs = null;
  
  public IRecibirOrdenDespachoWsProxy() {
    _initIRecibirOrdenDespachoWsProxy();
  }
  
  public IRecibirOrdenDespachoWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initIRecibirOrdenDespachoWsProxy();
  }
  
  private void _initIRecibirOrdenDespachoWsProxy() {
    try {
      iRecibirOrdenDespachoWs = (new ws.orden.RecibirOrdenDespachoWsServiceLocator()).getRecibirOrdenDespachoWsPort();
      if (iRecibirOrdenDespachoWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iRecibirOrdenDespachoWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iRecibirOrdenDespachoWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iRecibirOrdenDespachoWs != null)
      ((javax.xml.rpc.Stub)iRecibirOrdenDespachoWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.orden.IRecibirOrdenDespachoWs getIRecibirOrdenDespachoWs() {
    if (iRecibirOrdenDespachoWs == null)
      _initIRecibirOrdenDespachoWsProxy();
    return iRecibirOrdenDespachoWs;
  }
  
  public ws.orden.RespuestaGenerica recibirOrdenDespacho(ws.orden.OrdenDespacho despacho) throws java.rmi.RemoteException{
    if (iRecibirOrdenDespachoWs == null)
      _initIRecibirOrdenDespachoWsProxy();
    return iRecibirOrdenDespachoWs.recibirOrdenDespacho(despacho);
  }
  
  
}