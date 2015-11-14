/**
 * WSProcVentaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.ventas;

public interface WSProcVentaBean extends java.rmi.Remote {
    public java.lang.String procesarCarrito(com.monitor.webService.VoCarrito arg0) throws java.rmi.RemoteException;
    public java.lang.String procesarVenta(com.monitor.webService.VoVenta arg0) throws java.rmi.RemoteException;
}
