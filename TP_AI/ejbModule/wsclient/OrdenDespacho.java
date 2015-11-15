
package wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para orden-despacho complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="orden-despacho"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_orden_despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_orden_compra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="id_logistica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{http://logistica.interfaces/}item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orden-despacho", propOrder = {
    "idOrdenDespacho",
    "idOrdenCompra",
    "idLogistica",
    "fecha",
    "items"
})
public class OrdenDespacho {

    @XmlElement(name = "id_orden_despacho")
    protected String idOrdenDespacho;
    @XmlElement(name = "id_orden_compra")
    protected Integer idOrdenCompra;
    @XmlElement(name = "id_logistica")
    protected String idLogistica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(nillable = true)
    protected List<Item> items;

    /**
     * Obtiene el valor de la propiedad idOrdenDespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOrdenDespacho() {
        return idOrdenDespacho;
    }

    /**
     * Define el valor de la propiedad idOrdenDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOrdenDespacho(String value) {
        this.idOrdenDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrdenCompra.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOrdenCompra() {
        return idOrdenCompra;
    }

    /**
     * Define el valor de la propiedad idOrdenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOrdenCompra(Integer value) {
        this.idOrdenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad idLogistica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLogistica() {
        return idLogistica;
    }

    /**
     * Define el valor de la propiedad idLogistica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLogistica(String value) {
        this.idLogistica = value;
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
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<Item>();
        }
        return this.items;
    }

}
