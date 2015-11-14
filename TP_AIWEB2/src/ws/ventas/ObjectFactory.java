
package ws.ventas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monitor.webservice package. 
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

    private final static QName _ProcesarCarrito_QNAME = new QName("http://webService.monitor.com/", "procesarCarrito");
    private final static QName _ProcesarCarritoResponse_QNAME = new QName("http://webService.monitor.com/", "procesarCarritoResponse");
    private final static QName _ProcesarVenta_QNAME = new QName("http://webService.monitor.com/", "procesarVenta");
    private final static QName _ProcesarVentaResponse_QNAME = new QName("http://webService.monitor.com/", "procesarVentaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monitor.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcesarCarrito }
     * 
     */
    public ProcesarCarrito createProcesarCarrito() {
        return new ProcesarCarrito();
    }

    /**
     * Create an instance of {@link ProcesarCarritoResponse }
     * 
     */
    public ProcesarCarritoResponse createProcesarCarritoResponse() {
        return new ProcesarCarritoResponse();
    }

    /**
     * Create an instance of {@link ProcesarVenta }
     * 
     */
    public ProcesarVenta createProcesarVenta() {
        return new ProcesarVenta();
    }

    /**
     * Create an instance of {@link ProcesarVentaResponse }
     * 
     */
    public ProcesarVentaResponse createProcesarVentaResponse() {
        return new ProcesarVentaResponse();
    }

    /**
     * Create an instance of {@link VoCarrito }
     * 
     */
    public VoCarrito createVoCarrito() {
        return new VoCarrito();
    }

    /**
     * Create an instance of {@link VoVenta }
     * 
     */
    public VoVenta createVoVenta() {
        return new VoVenta();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link VoItemVenta }
     * 
     */
    public VoItemVenta createVoItemVenta() {
        return new VoItemVenta();
    }

    /**
     * Create an instance of {@link VoProducto }
     * 
     */
    public VoProducto createVoProducto() {
        return new VoProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarCarrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.monitor.com/", name = "procesarCarrito")
    public JAXBElement<ProcesarCarrito> createProcesarCarrito(ProcesarCarrito value) {
        return new JAXBElement<ProcesarCarrito>(_ProcesarCarrito_QNAME, ProcesarCarrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarCarritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.monitor.com/", name = "procesarCarritoResponse")
    public JAXBElement<ProcesarCarritoResponse> createProcesarCarritoResponse(ProcesarCarritoResponse value) {
        return new JAXBElement<ProcesarCarritoResponse>(_ProcesarCarritoResponse_QNAME, ProcesarCarritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.monitor.com/", name = "procesarVenta")
    public JAXBElement<ProcesarVenta> createProcesarVenta(ProcesarVenta value) {
        return new JAXBElement<ProcesarVenta>(_ProcesarVenta_QNAME, ProcesarVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.monitor.com/", name = "procesarVentaResponse")
    public JAXBElement<ProcesarVentaResponse> createProcesarVentaResponse(ProcesarVentaResponse value) {
        return new JAXBElement<ProcesarVentaResponse>(_ProcesarVentaResponse_QNAME, ProcesarVentaResponse.class, null, value);
    }

}