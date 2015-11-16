
package interfaces.logistica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para recibirOrdenDespacho complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="recibirOrdenDespacho"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="despacho" type="{http://logistica.interfaces/}orden-despacho" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recibirOrdenDespacho", propOrder = {
    "despacho"
})
public class RecibirOrdenDespacho {

    protected OrdenDespacho despacho;

    /**
     * Obtiene el valor de la propiedad despacho.
     * 
     * @return
     *     possible object is
     *     {@link OrdenDespacho }
     *     
     */
    public OrdenDespacho getDespacho() {
        return despacho;
    }

    /**
     * Define el valor de la propiedad despacho.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdenDespacho }
     *     
     */
    public void setDespacho(OrdenDespacho value) {
        this.despacho = value;
    }

}
