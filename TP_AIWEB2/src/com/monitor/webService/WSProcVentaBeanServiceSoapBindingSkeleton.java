/**
 * WSProcVentaBeanServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.monitor.webService;

public class WSProcVentaBeanServiceSoapBindingSkeleton implements WSProcVentaBean, org.apache.axis.wsdl.Skeleton {
    private com.monitor.webService.WSProcVentaBean impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.monitor.com/", "voCarrito"), com.monitor.webService.VoCarrito.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("procesarCarrito", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservice.monitor.com/", "procesarCarrito"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("procesarCarrito") == null) {
            _myOperations.put("procesarCarrito", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("procesarCarrito")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.monitor.com/", "voVenta"), com.monitor.webService.VoVenta.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("procesarVenta", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservice.monitor.com/", "procesarVenta"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("procesarVenta") == null) {
            _myOperations.put("procesarVenta", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("procesarVenta")).add(_oper);
    }

    public WSProcVentaBeanServiceSoapBindingSkeleton() {
        this.impl = new com.monitor.webService.WSProcVentaBeanServiceSoapBindingImpl();
    }

    public WSProcVentaBeanServiceSoapBindingSkeleton(com.monitor.webService.WSProcVentaBean impl) {
        this.impl = impl;
    }
    public java.lang.String procesarCarrito(com.monitor.webService.VoCarrito arg0) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.procesarCarrito(arg0);
        return ret;
    }

    public java.lang.String procesarVenta(com.monitor.webService.VoVenta arg0) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.procesarVenta(arg0);
        return ret;
    }

}
