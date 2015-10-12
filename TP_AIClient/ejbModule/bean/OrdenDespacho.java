/**
 * OrdenDespacho.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean;

public class OrdenDespacho  extends bean.PersistentObject  implements java.io.Serializable {
    private bean.Despacho despacho;

    private bean.Estado estado;

    private bean.Venta venta;

    public OrdenDespacho() {
    }

    public OrdenDespacho(
           java.lang.Integer id,
           bean.Despacho despacho,
           bean.Estado estado,
           bean.Venta venta) {
        super(
            id);
        this.despacho = despacho;
        this.estado = estado;
        this.venta = venta;
    }


    /**
     * Gets the despacho value for this OrdenDespacho.
     * 
     * @return despacho
     */
    public bean.Despacho getDespacho() {
        return despacho;
    }


    /**
     * Sets the despacho value for this OrdenDespacho.
     * 
     * @param despacho
     */
    public void setDespacho(bean.Despacho despacho) {
        this.despacho = despacho;
    }


    /**
     * Gets the estado value for this OrdenDespacho.
     * 
     * @return estado
     */
    public bean.Estado getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this OrdenDespacho.
     * 
     * @param estado
     */
    public void setEstado(bean.Estado estado) {
        this.estado = estado;
    }


    /**
     * Gets the venta value for this OrdenDespacho.
     * 
     * @return venta
     */
    public bean.Venta getVenta() {
        return venta;
    }


    /**
     * Sets the venta value for this OrdenDespacho.
     * 
     * @param venta
     */
    public void setVenta(bean.Venta venta) {
        this.venta = venta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrdenDespacho)) return false;
        OrdenDespacho other = (OrdenDespacho) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.despacho==null && other.getDespacho()==null) || 
             (this.despacho!=null &&
              this.despacho.equals(other.getDespacho()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.venta==null && other.getVenta()==null) || 
             (this.venta!=null &&
              this.venta.equals(other.getVenta())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDespacho() != null) {
            _hashCode += getDespacho().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getVenta() != null) {
            _hashCode += getVenta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrdenDespacho.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean/", "ordenDespacho"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("despacho");
        elemField.setXmlName(new javax.xml.namespace.QName("", "despacho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "despacho"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "estado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "venta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "venta"));
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
