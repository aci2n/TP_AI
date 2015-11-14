/**
 * WSProcVentaBeanServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.ventas;

public class WSProcVentaBeanServiceServiceLocator extends org.apache.axis.client.Service implements ws.ventas.WSProcVentaBeanServiceService {

    public WSProcVentaBeanServiceServiceLocator() {
    }


    public WSProcVentaBeanServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSProcVentaBeanServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSProcVentaBeanServicePort
    private java.lang.String WSProcVentaBeanServicePort_address = "http://localhost:8080/TP_AIWEB/WSProcVentaBeanService";

    public java.lang.String getWSProcVentaBeanServicePortAddress() {
        return WSProcVentaBeanServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSProcVentaBeanServicePortWSDDServiceName = "WSProcVentaBeanServicePort";

    public java.lang.String getWSProcVentaBeanServicePortWSDDServiceName() {
        return WSProcVentaBeanServicePortWSDDServiceName;
    }

    public void setWSProcVentaBeanServicePortWSDDServiceName(java.lang.String name) {
        WSProcVentaBeanServicePortWSDDServiceName = name;
    }

    public ws.ventas.WSProcVentaBeanService getWSProcVentaBeanServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSProcVentaBeanServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSProcVentaBeanServicePort(endpoint);
    }

    public ws.ventas.WSProcVentaBeanService getWSProcVentaBeanServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.ventas.WSProcVentaBeanServiceServiceSoapBindingStub _stub = new ws.ventas.WSProcVentaBeanServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSProcVentaBeanServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSProcVentaBeanServicePortEndpointAddress(java.lang.String address) {
        WSProcVentaBeanServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.ventas.WSProcVentaBeanService.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.ventas.WSProcVentaBeanServiceServiceSoapBindingStub _stub = new ws.ventas.WSProcVentaBeanServiceServiceSoapBindingStub(new java.net.URL(WSProcVentaBeanServicePort_address), this);
                _stub.setPortName(getWSProcVentaBeanServicePortWSDDServiceName());
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
        if ("WSProcVentaBeanServicePort".equals(inputPortName)) {
            return getWSProcVentaBeanServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ventas.ws/", "WSProcVentaBeanServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ventas.ws/", "WSProcVentaBeanServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSProcVentaBeanServicePort".equals(portName)) {
            setWSProcVentaBeanServicePortEndpointAddress(address);
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
