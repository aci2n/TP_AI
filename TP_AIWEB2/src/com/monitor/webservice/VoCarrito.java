
package com.monitor.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para voCarrito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="voCarrito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idBusqueda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voCarrito", propOrder = {
    "idBusqueda"
})
public class VoCarrito {

    protected int idBusqueda;

    /**
     * Obtiene el valor de la propiedad idBusqueda.
     * 
     */
    public int getIdBusqueda() {
        return idBusqueda;
    }

    /**
     * Define el valor de la propiedad idBusqueda.
     * 
     */
    public void setIdBusqueda(int value) {
        this.idBusqueda = value;
    }

}
