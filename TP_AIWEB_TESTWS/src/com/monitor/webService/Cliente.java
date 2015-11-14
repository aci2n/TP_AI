/**
 * Cliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.monitor.webService;

public class Cliente  implements java.io.Serializable {
    private java.lang.String apelido;

    private java.lang.String coordenada;

    private long dni;

    private long idCliente;

    private java.lang.String nombre;

    public Cliente() {
    }

    public Cliente(
           java.lang.String apelido,
           java.lang.String coordenada,
           long dni,
           long idCliente,
           java.lang.String nombre) {
           this.apelido = apelido;
           this.coordenada = coordenada;
           this.dni = dni;
           this.idCliente = idCliente;
           this.nombre = nombre;
    }


    /**
     * Gets the apelido value for this Cliente.
     * 
     * @return apelido
     */
    public java.lang.String getApelido() {
        return apelido;
    }


    /**
     * Sets the apelido value for this Cliente.
     * 
     * @param apelido
     */
    public void setApelido(java.lang.String apelido) {
        this.apelido = apelido;
    }


    /**
     * Gets the coordenada value for this Cliente.
     * 
     * @return coordenada
     */
    public java.lang.String getCoordenada() {
        return coordenada;
    }


    /**
     * Sets the coordenada value for this Cliente.
     * 
     * @param coordenada
     */
    public void setCoordenada(java.lang.String coordenada) {
        this.coordenada = coordenada;
    }


    /**
     * Gets the dni value for this Cliente.
     * 
     * @return dni
     */
    public long getDni() {
        return dni;
    }


    /**
     * Sets the dni value for this Cliente.
     * 
     * @param dni
     */
    public void setDni(long dni) {
        this.dni = dni;
    }


    /**
     * Gets the idCliente value for this Cliente.
     * 
     * @return idCliente
     */
    public long getIdCliente() {
        return idCliente;
    }


    /**
     * Sets the idCliente value for this Cliente.
     * 
     * @param idCliente
     */
    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }


    /**
     * Gets the nombre value for this Cliente.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Cliente.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cliente)) return false;
        Cliente other = (Cliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apelido==null && other.getApelido()==null) || 
             (this.apelido!=null &&
              this.apelido.equals(other.getApelido()))) &&
            ((this.coordenada==null && other.getCoordenada()==null) || 
             (this.coordenada!=null &&
              this.coordenada.equals(other.getCoordenada()))) &&
            this.dni == other.getDni() &&
            this.idCliente == other.getIdCliente() &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
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
        if (getApelido() != null) {
            _hashCode += getApelido().hashCode();
        }
        if (getCoordenada() != null) {
            _hashCode += getCoordenada().hashCode();
        }
        _hashCode += new Long(getDni()).hashCode();
        _hashCode += new Long(getIdCliente()).hashCode();
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webService.monitor.com/", "cliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apelido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apelido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordenada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordenada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dni");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
