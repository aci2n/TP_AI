/**
 * VentasWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean;

public interface VentasWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getVentasWebServicePortAddress();

    public bean.VentasWebService getVentasWebServicePort() throws javax.xml.rpc.ServiceException;

    public bean.VentasWebService getVentasWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
