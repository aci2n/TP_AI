
package com.monitor.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para voVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="voVenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" type="{http://webService.monitor.com/}cliente" minOccurs="0"/&gt;
 *         &lt;element name="codigoVenta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="collectionItems" type="{http://webService.monitor.com/}voItemVenta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idPortal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voVenta", propOrder = {
    "cliente",
    "codigoVenta",
    "collectionItems",
    "estado",
    "fecha",
    "idPortal"
})
public class VoVenta {

    protected Cliente cliente;
    protected int codigoVenta;
    @XmlElement(nillable = true)
    protected List<VoItemVenta> collectionItems;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected int idPortal;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoVenta.
     * 
     */
    public int getCodigoVenta() {
        return codigoVenta;
    }

    /**
     * Define el valor de la propiedad codigoVenta.
     * 
     */
    public void setCodigoVenta(int value) {
        this.codigoVenta = value;
    }

    /**
     * Gets the value of the collectionItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoItemVenta }
     * 
     * 
     */
    public List<VoItemVenta> getCollectionItems() {
        if (collectionItems == null) {
            collectionItems = new ArrayList<VoItemVenta>();
        }
        return this.collectionItems;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idPortal.
     * 
     */
    public int getIdPortal() {
        return idPortal;
    }

    /**
     * Define el valor de la propiedad idPortal.
     * 
     */
    public void setIdPortal(int value) {
        this.idPortal = value;
    }

}
