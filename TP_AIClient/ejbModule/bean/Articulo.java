/**
 * Articulo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean;

public class Articulo  extends bean.PersistentObject  implements java.io.Serializable {
    private int codigo;

    private java.lang.String descripcion;

    private bean.Detalle[] detalles;

    private java.lang.String marca;

    private java.lang.String nombre;

    private java.lang.String origen;

    private java.lang.String pathFoto;

    private double precio;

    public Articulo() {
    }

    public Articulo(
           java.lang.Integer id,
           int codigo,
           java.lang.String descripcion,
           bean.Detalle[] detalles,
           java.lang.String marca,
           java.lang.String nombre,
           java.lang.String origen,
           java.lang.String pathFoto,
           double precio) {
        super(
            id);
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.detalles = detalles;
        this.marca = marca;
        this.nombre = nombre;
        this.origen = origen;
        this.pathFoto = pathFoto;
        this.precio = precio;
    }


    /**
     * Gets the codigo value for this Articulo.
     * 
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Articulo.
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descripcion value for this Articulo.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Articulo.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the detalles value for this Articulo.
     * 
     * @return detalles
     */
    public bean.Detalle[] getDetalles() {
        return detalles;
    }


    /**
     * Sets the detalles value for this Articulo.
     * 
     * @param detalles
     */
    public void setDetalles(bean.Detalle[] detalles) {
        this.detalles = detalles;
    }

    public bean.Detalle getDetalles(int i) {
        return this.detalles[i];
    }

    public void setDetalles(int i, bean.Detalle _value) {
        this.detalles[i] = _value;
    }


    /**
     * Gets the marca value for this Articulo.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this Articulo.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the nombre value for this Articulo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Articulo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the origen value for this Articulo.
     * 
     * @return origen
     */
    public java.lang.String getOrigen() {
        return origen;
    }


    /**
     * Sets the origen value for this Articulo.
     * 
     * @param origen
     */
    public void setOrigen(java.lang.String origen) {
        this.origen = origen;
    }


    /**
     * Gets the pathFoto value for this Articulo.
     * 
     * @return pathFoto
     */
    public java.lang.String getPathFoto() {
        return pathFoto;
    }


    /**
     * Sets the pathFoto value for this Articulo.
     * 
     * @param pathFoto
     */
    public void setPathFoto(java.lang.String pathFoto) {
        this.pathFoto = pathFoto;
    }


    /**
     * Gets the precio value for this Articulo.
     * 
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }


    /**
     * Sets the precio value for this Articulo.
     * 
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Articulo)) return false;
        Articulo other = (Articulo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.codigo == other.getCodigo() &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.detalles==null && other.getDetalles()==null) || 
             (this.detalles!=null &&
              java.util.Arrays.equals(this.detalles, other.getDetalles()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.origen==null && other.getOrigen()==null) || 
             (this.origen!=null &&
              this.origen.equals(other.getOrigen()))) &&
            ((this.pathFoto==null && other.getPathFoto()==null) || 
             (this.pathFoto!=null &&
              this.pathFoto.equals(other.getPathFoto()))) &&
            this.precio == other.getPrecio();
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
        _hashCode += getCodigo();
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getDetalles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getOrigen() != null) {
            _hashCode += getOrigen().hashCode();
        }
        if (getPathFoto() != null) {
            _hashCode += getPathFoto().hashCode();
        }
        _hashCode += new Double(getPrecio()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Articulo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean/", "articulo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detalles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean/", "detalle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathFoto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathFoto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
