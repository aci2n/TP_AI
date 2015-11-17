/**
 * RecibirOrdenDespacho.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.orden;

public class RecibirOrdenDespacho  implements java.io.Serializable {
    private ws.orden.OrdenDespacho despacho;

    public RecibirOrdenDespacho() {
    }

    public RecibirOrdenDespacho(
           ws.orden.OrdenDespacho despacho) {
           this.despacho = despacho;
    }


    /**
     * Gets the despacho value for this RecibirOrdenDespacho.
     * 
     * @return despacho
     */
    public ws.orden.OrdenDespacho getDespacho() {
        return despacho;
    }


    /**
     * Sets the despacho value for this RecibirOrdenDespacho.
     * 
     * @param despacho
     */
    public void setDespacho(ws.orden.OrdenDespacho despacho) {
        this.despacho = despacho;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecibirOrdenDespacho)) return false;
        RecibirOrdenDespacho other = (RecibirOrdenDespacho) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.despacho==null && other.getDespacho()==null) || 
             (this.despacho!=null &&
              this.despacho.equals(other.getDespacho())));
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
        if (getDespacho() != null) {
            _hashCode += getDespacho().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecibirOrdenDespacho.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://logistica.interfaces/", "recibirOrdenDespacho"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("despacho");
        elemField.setXmlName(new javax.xml.namespace.QName("", "despacho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://logistica.interfaces/", "ordenDespacho"));
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
