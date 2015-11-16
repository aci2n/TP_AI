
package interfaces.logistica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the interfaces.logistica package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RecibirOrdenDespacho_QNAME = new QName("http://logistica.interfaces/", "recibirOrdenDespacho");
    private final static QName _RecibirOrdenDespachoResponse_QNAME = new QName("http://logistica.interfaces/", "recibirOrdenDespachoResponse");
    private final static QName _Resultado_QNAME = new QName("http://logistica.interfaces/", "resultado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: interfaces.logistica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecibirOrdenDespacho }
     * 
     */
    public RecibirOrdenDespacho createRecibirOrdenDespacho() {
        return new RecibirOrdenDespacho();
    }

    /**
     * Create an instance of {@link RecibirOrdenDespachoResponse }
     * 
     */
    public RecibirOrdenDespachoResponse createRecibirOrdenDespachoResponse() {
        return new RecibirOrdenDespachoResponse();
    }

    /**
     * Create an instance of {@link RespuestaGenerica }
     * 
     */
    public RespuestaGenerica createRespuestaGenerica() {
        return new RespuestaGenerica();
    }

    /**
     * Create an instance of {@link OrdenDespacho }
     * 
     */
    public OrdenDespacho createOrdenDespacho() {
        return new OrdenDespacho();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecibirOrdenDespacho }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logistica.interfaces/", name = "recibirOrdenDespacho")
    public JAXBElement<RecibirOrdenDespacho> createRecibirOrdenDespacho(RecibirOrdenDespacho value) {
        return new JAXBElement<RecibirOrdenDespacho>(_RecibirOrdenDespacho_QNAME, RecibirOrdenDespacho.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecibirOrdenDespachoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logistica.interfaces/", name = "recibirOrdenDespachoResponse")
    public JAXBElement<RecibirOrdenDespachoResponse> createRecibirOrdenDespachoResponse(RecibirOrdenDespachoResponse value) {
        return new JAXBElement<RecibirOrdenDespachoResponse>(_RecibirOrdenDespachoResponse_QNAME, RecibirOrdenDespachoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaGenerica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logistica.interfaces/", name = "resultado")
    public JAXBElement<RespuestaGenerica> createResultado(RespuestaGenerica value) {
        return new JAXBElement<RespuestaGenerica>(_Resultado_QNAME, RespuestaGenerica.class, null, value);
    }

}
