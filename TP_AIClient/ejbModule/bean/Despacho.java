/**
 * Despacho.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean;

public class Despacho  extends bean.PersistentObject  implements java.io.Serializable {
    private boolean activo;

    private bean.Coordenada coordenada;

    public Despacho() {
    }

    public Despacho(
           java.lang.Integer id,
           boolean activo,
           bean.Coordenada coordenada) {
        super(
            id);
        this.activo = activo;
        this.coordenada = coordenada;
    }


    /**
     * Gets the activo value for this Despacho.
     * 
     * @return activo
     */
    public boolean isActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this Despacho.
     * 
     * @param activo
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    /**
     * Gets the coordenada value for this Despacho.
     * 
     * @return coordenada
     */
    public bean.Coordenada getCoordenada() {
        return coordenada;
    }


    /**
     * Sets the coordenada value for this Despacho.
     * 
     * @param coordenada
     */
    public void setCoordenada(bean.Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Despacho)) return false;
        Despacho other = (Despacho) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.activo == other.isActivo() &&
            ((this.coordenada==null && other.getCoordenada()==null) || 
             (this.coordenada!=null &&
              this.coordenada.equals(other.getCoordenada())));
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
        _hashCode += (isActivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCoordenada() != null) {
            _hashCode += getCoordenada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Despacho.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean/", "despacho"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordenada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordenada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "coordenada"));
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
