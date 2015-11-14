/**
 * WSInformeAuditoriaBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.auditoria;

public class WSInformeAuditoriaBeanServiceLocator extends org.apache.axis.client.Service implements ws.auditoria.WSInformeAuditoriaBeanService {

    public WSInformeAuditoriaBeanServiceLocator() {
    }


    public WSInformeAuditoriaBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSInformeAuditoriaBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSInformeAuditoriaBeanPort
    private java.lang.String WSInformeAuditoriaBeanPort_address = "http://localhost:8080/TP_AIWEB/WSInformeAuditoriaBean";

    public java.lang.String getWSInformeAuditoriaBeanPortAddress() {
        return WSInformeAuditoriaBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSInformeAuditoriaBeanPortWSDDServiceName = "WSInformeAuditoriaBeanPort";

    public java.lang.String getWSInformeAuditoriaBeanPortWSDDServiceName() {
        return WSInformeAuditoriaBeanPortWSDDServiceName;
    }

    public void setWSInformeAuditoriaBeanPortWSDDServiceName(java.lang.String name) {
        WSInformeAuditoriaBeanPortWSDDServiceName = name;
    }

    public ws.auditoria.WSInformeAuditoriaBean getWSInformeAuditoriaBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSInformeAuditoriaBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSInformeAuditoriaBeanPort(endpoint);
    }

    public ws.auditoria.WSInformeAuditoriaBean getWSInformeAuditoriaBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.auditoria.WSInformeAuditoriaBeanServiceSoapBindingStub _stub = new ws.auditoria.WSInformeAuditoriaBeanServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSInformeAuditoriaBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSInformeAuditoriaBeanPortEndpointAddress(java.lang.String address) {
        WSInformeAuditoriaBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.auditoria.WSInformeAuditoriaBean.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.auditoria.WSInformeAuditoriaBeanServiceSoapBindingStub _stub = new ws.auditoria.WSInformeAuditoriaBeanServiceSoapBindingStub(new java.net.URL(WSInformeAuditoriaBeanPort_address), this);
                _stub.setPortName(getWSInformeAuditoriaBeanPortWSDDServiceName());
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
        if ("WSInformeAuditoriaBeanPort".equals(inputPortName)) {
            return getWSInformeAuditoriaBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://auditoria.ws/", "WSInformeAuditoriaBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://auditoria.ws/", "WSInformeAuditoriaBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSInformeAuditoriaBeanPort".equals(portName)) {
            setWSInformeAuditoriaBeanPortEndpointAddress(address);
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
