/**
 * Venta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean;

public class Venta  extends bean.PersistentObject  implements java.io.Serializable {
    private bean.ItemArticulo[] articulos;

    private bean.Coordenada destino;

    private java.util.Calendar fecha;

    private bean.OrdenDespacho orden;

    private java.lang.String portal;

    private double total;

    private bean.Usuario usuario;

    public Venta() {
    }

    public Venta(
           java.lang.Integer id,
           bean.ItemArticulo[] articulos,
           bean.Coordenada destino,
           java.util.Calendar fecha,
           bean.OrdenDespacho orden,
           java.lang.String portal,
           double total,
           bean.Usuario usuario) {
        super(
            id);
        this.articulos = articulos;
        this.destino = destino;
        this.fecha = fecha;
        this.orden = orden;
        this.portal = portal;
        this.total = total;
        this.usuario = usuario;
    }


    /**
     * Gets the articulos value for this Venta.
     * 
     * @return articulos
     */
    public bean.ItemArticulo[] getArticulos() {
        return articulos;
    }


    /**
     * Sets the articulos value for this Venta.
     * 
     * @param articulos
     */
    public void setArticulos(bean.ItemArticulo[] articulos) {
        this.articulos = articulos;
    }

    public bean.ItemArticulo getArticulos(int i) {
        return this.articulos[i];
    }

    public void setArticulos(int i, bean.ItemArticulo _value) {
        this.articulos[i] = _value;
    }


    /**
     * Gets the destino value for this Venta.
     * 
     * @return destino
     */
    public bean.Coordenada getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this Venta.
     * 
     * @param destino
     */
    public void setDestino(bean.Coordenada destino) {
        this.destino = destino;
    }


    /**
     * Gets the fecha value for this Venta.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Venta.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the orden value for this Venta.
     * 
     * @return orden
     */
    public bean.OrdenDespacho getOrden() {
        return orden;
    }


    /**
     * Sets the orden value for this Venta.
     * 
     * @param orden
     */
    public void setOrden(bean.OrdenDespacho orden) {
        this.orden = orden;
    }


    /**
     * Gets the portal value for this Venta.
     * 
     * @return portal
     */
    public java.lang.String getPortal() {
        return portal;
    }


    /**
     * Sets the portal value for this Venta.
     * 
     * @param portal
     */
    public void setPortal(java.lang.String portal) {
        this.portal = portal;
    }


    /**
     * Gets the total value for this Venta.
     * 
     * @return total
     */
    public double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this Venta.
     * 
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }


    /**
     * Gets the usuario value for this Venta.
     * 
     * @return usuario
     */
    public bean.Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Venta.
     * 
     * @param usuario
     */
    public void setUsuario(bean.Usuario usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Venta)) return false;
        Venta other = (Venta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.articulos==null && other.getArticulos()==null) || 
             (this.articulos!=null &&
              java.util.Arrays.equals(this.articulos, other.getArticulos()))) &&
            ((this.destino==null && other.getDestino()==null) || 
             (this.destino!=null &&
              this.destino.equals(other.getDestino()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.orden==null && other.getOrden()==null) || 
             (this.orden!=null &&
              this.orden.equals(other.getOrden()))) &&
            ((this.portal==null && other.getPortal()==null) || 
             (this.portal!=null &&
              this.portal.equals(other.getPortal()))) &&
            this.total == other.getTotal() &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getArticulos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArticulos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArticulos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getOrden() != null) {
            _hashCode += getOrden().hashCode();
        }
        if (getPortal() != null) {
            _hashCode += getPortal().hashCode();
        }
        _hashCode += new Double(getTotal()).hashCode();
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Venta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean/", "venta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articulos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "articulos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "itemArticulo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "coordenada"));
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
        elemField.setFieldName("orden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "ordenDespacho"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "usuario"));
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
