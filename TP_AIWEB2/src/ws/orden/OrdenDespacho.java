/**
 * OrdenDespacho.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.orden;

public class OrdenDespacho  implements java.io.Serializable {
    private java.lang.String id_orden_despacho;

    private java.lang.Integer id_orden_compra;

    private java.lang.String id_logistica;

    private java.util.Calendar fecha;

    private ws.orden.Item[] items;

    public OrdenDespacho() {
    }

    public OrdenDespacho(
           java.lang.String id_orden_despacho,
           java.lang.Integer id_orden_compra,
           java.lang.String id_logistica,
           java.util.Calendar fecha,
           ws.orden.Item[] items) {
           this.id_orden_despacho = id_orden_despacho;
           this.id_orden_compra = id_orden_compra;
           this.id_logistica = id_logistica;
           this.fecha = fecha;
           this.items = items;
    }


    /**
     * Gets the id_orden_despacho value for this OrdenDespacho.
     * 
     * @return id_orden_despacho
     */
    public java.lang.String getId_orden_despacho() {
        return id_orden_despacho;
    }


    /**
     * Sets the id_orden_despacho value for this OrdenDespacho.
     * 
     * @param id_orden_despacho
     */
    public void setId_orden_despacho(java.lang.String id_orden_despacho) {
        this.id_orden_despacho = id_orden_despacho;
    }


    /**
     * Gets the id_orden_compra value for this OrdenDespacho.
     * 
     * @return id_orden_compra
     */
    public java.lang.Integer getId_orden_compra() {
        return id_orden_compra;
    }


    /**
     * Sets the id_orden_compra value for this OrdenDespacho.
     * 
     * @param id_orden_compra
     */
    public void setId_orden_compra(java.lang.Integer id_orden_compra) {
        this.id_orden_compra = id_orden_compra;
    }


    /**
     * Gets the id_logistica value for this OrdenDespacho.
     * 
     * @return id_logistica
     */
    public java.lang.String getId_logistica() {
        return id_logistica;
    }


    /**
     * Sets the id_logistica value for this OrdenDespacho.
     * 
     * @param id_logistica
     */
    public void setId_logistica(java.lang.String id_logistica) {
        this.id_logistica = id_logistica;
    }


    /**
     * Gets the fecha value for this OrdenDespacho.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this OrdenDespacho.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the items value for this OrdenDespacho.
     * 
     * @return items
     */
    public ws.orden.Item[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this OrdenDespacho.
     * 
     * @param items
     */
    public void setItems(ws.orden.Item[] items) {
        this.items = items;
    }

    public ws.orden.Item getItems(int i) {
        return this.items[i];
    }

    public void setItems(int i, ws.orden.Item _value) {
        this.items[i] = _value;
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
        _equals = true && 
            ((this.id_orden_despacho==null && other.getId_orden_despacho()==null) || 
             (this.id_orden_despacho!=null &&
              this.id_orden_despacho.equals(other.getId_orden_despacho()))) &&
            ((this.id_orden_compra==null && other.getId_orden_compra()==null) || 
             (this.id_orden_compra!=null &&
              this.id_orden_compra.equals(other.getId_orden_compra()))) &&
            ((this.id_logistica==null && other.getId_logistica()==null) || 
             (this.id_logistica!=null &&
              this.id_logistica.equals(other.getId_logistica()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems())));
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
        if (getId_orden_despacho() != null) {
            _hashCode += getId_orden_despacho().hashCode();
        }
        if (getId_orden_compra() != null) {
            _hashCode += getId_orden_compra().hashCode();
        }
        if (getId_logistica() != null) {
            _hashCode += getId_logistica().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrdenDespacho.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://logistica.interfaces/", "orden-despacho"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_orden_despacho");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_orden_despacho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_orden_compra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_orden_compra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_logistica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_logistica"));
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
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://logistica.interfaces/", "item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
