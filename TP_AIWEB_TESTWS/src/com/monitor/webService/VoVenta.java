/**
 * VoVenta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.monitor.webService;

public class VoVenta  implements java.io.Serializable {
    private com.monitor.webService.Cliente cliente;

    private int codigoVenta;

    private com.monitor.webService.VoItemVenta[] collectionItems;

    private java.lang.String estado;

    private java.util.Calendar fecha;

    private int idPortal;

    public VoVenta() {
    }

    public VoVenta(
           com.monitor.webService.Cliente cliente,
           int codigoVenta,
           com.monitor.webService.VoItemVenta[] collectionItems,
           java.lang.String estado,
           java.util.Calendar fecha,
           int idPortal) {
           this.cliente = cliente;
           this.codigoVenta = codigoVenta;
           this.collectionItems = collectionItems;
           this.estado = estado;
           this.fecha = fecha;
           this.idPortal = idPortal;
    }


    /**
     * Gets the cliente value for this VoVenta.
     * 
     * @return cliente
     */
    public com.monitor.webService.Cliente getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this VoVenta.
     * 
     * @param cliente
     */
    public void setCliente(com.monitor.webService.Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the codigoVenta value for this VoVenta.
     * 
     * @return codigoVenta
     */
    public int getCodigoVenta() {
        return codigoVenta;
    }


    /**
     * Sets the codigoVenta value for this VoVenta.
     * 
     * @param codigoVenta
     */
    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }


    /**
     * Gets the collectionItems value for this VoVenta.
     * 
     * @return collectionItems
     */
    public com.monitor.webService.VoItemVenta[] getCollectionItems() {
        return collectionItems;
    }


    /**
     * Sets the collectionItems value for this VoVenta.
     * 
     * @param collectionItems
     */
    public void setCollectionItems(com.monitor.webService.VoItemVenta[] collectionItems) {
        this.collectionItems = collectionItems;
    }

    public com.monitor.webService.VoItemVenta getCollectionItems(int i) {
        return this.collectionItems[i];
    }

    public void setCollectionItems(int i, com.monitor.webService.VoItemVenta _value) {
        this.collectionItems[i] = _value;
    }


    /**
     * Gets the estado value for this VoVenta.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this VoVenta.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the fecha value for this VoVenta.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this VoVenta.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the idPortal value for this VoVenta.
     * 
     * @return idPortal
     */
    public int getIdPortal() {
        return idPortal;
    }


    /**
     * Sets the idPortal value for this VoVenta.
     * 
     * @param idPortal
     */
    public void setIdPortal(int idPortal) {
        this.idPortal = idPortal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoVenta)) return false;
        VoVenta other = (VoVenta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            this.codigoVenta == other.getCodigoVenta() &&
            ((this.collectionItems==null && other.getCollectionItems()==null) || 
             (this.collectionItems!=null &&
              java.util.Arrays.equals(this.collectionItems, other.getCollectionItems()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            this.idPortal == other.getIdPortal();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        _hashCode += getCodigoVenta();
        if (getCollectionItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollectionItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollectionItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        _hashCode += getIdPortal();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoVenta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webService.monitor.com/", "voVenta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webService.monitor.com/", "cliente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoVenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoVenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectionItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webService.monitor.com/", "voItemVenta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
