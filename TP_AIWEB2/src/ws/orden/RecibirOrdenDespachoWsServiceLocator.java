/**
 * RecibirOrdenDespachoWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.orden;

public class RecibirOrdenDespachoWsServiceLocator extends org.apache.axis.client.Service implements ws.orden.RecibirOrdenDespachoWsService {

    public RecibirOrdenDespachoWsServiceLocator() {
    }


    public RecibirOrdenDespachoWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RecibirOrdenDespachoWsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RecibirOrdenDespachoWsPort
    private java.lang.String RecibirOrdenDespachoWsPort_address = "http://localhost:8080/DespachoWeb/RecibirOrdenDespachoWs";

    public java.lang.String getRecibirOrdenDespachoWsPortAddress() {
        return RecibirOrdenDespachoWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RecibirOrdenDespachoWsPortWSDDServiceName = "RecibirOrdenDespachoWsPort";

    public java.lang.String getRecibirOrdenDespachoWsPortWSDDServiceName() {
        return RecibirOrdenDespachoWsPortWSDDServiceName;
    }

    public void setRecibirOrdenDespachoWsPortWSDDServiceName(java.lang.String name) {
        RecibirOrdenDespachoWsPortWSDDServiceName = name;
    }

    public ws.orden.RecibirOrdenDespachoWs getRecibirOrdenDespachoWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RecibirOrdenDespachoWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRecibirOrdenDespachoWsPort(endpoint);
    }

    public ws.orden.RecibirOrdenDespachoWs getRecibirOrdenDespachoWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.orden.RecibirOrdenDespachoWsServiceSoapBindingStub _stub = new ws.orden.RecibirOrdenDespachoWsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRecibirOrdenDespachoWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRecibirOrdenDespachoWsPortEndpointAddress(java.lang.String address) {
        RecibirOrdenDespachoWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.orden.RecibirOrdenDespachoWs.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.orden.RecibirOrdenDespachoWsServiceSoapBindingStub _stub = new ws.orden.RecibirOrdenDespachoWsServiceSoapBindingStub(new java.net.URL(RecibirOrdenDespachoWsPort_address), this);
                _stub.setPortName(getRecibirOrdenDespachoWsPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RecibirOrdenDespachoWsPort".equals(inputPortName)) {
            return getRecibirOrdenDespachoWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://logistica.interfaces/", "RecibirOrdenDespachoWsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://logistica.interfaces/", "RecibirOrdenDespachoWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RecibirOrdenDespachoWsPort".equals(portName)) {
            setRecibirOrdenDespachoWsPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
