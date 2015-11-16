package uade.fain.ia.interfaces.tpo.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import interfaces.logistica.IRecibirOrdenDespachoWs;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.5
 * 2015-11-15T21:16:44.498-03:00
 * Generated source version: 3.0.5
 * 
 */
@WebServiceClient(name = "RecibirOrdenDespachoWsService", 
                  wsdlLocation = "file:/C:/Users/Alvaro%20Calace/git/mars/tp_ai/TP_AIEAR/EarContent/resources/ordenDespachoWS2.wsdl",
                  targetNamespace = "http://soap.tpo.interfaces.ia.fain.uade/") 
public class RecibirOrdenDespachoWsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://logistica.interfaces/", "RecibirOrdenDespachoWsService");
    public final static QName RecibirOrdenDespachoWsPort = new QName("http://logistica.interfaces/", "RecibirOrdenDespachoWsPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Alvaro%20Calace/git/mars/tp_ai/TP_AIEAR/EarContent/resources/ordenDespachoWS2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RecibirOrdenDespachoWsService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Alvaro%20Calace/git/mars/tp_ai/TP_AIEAR/EarContent/resources/ordenDespachoWS2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RecibirOrdenDespachoWsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RecibirOrdenDespachoWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RecibirOrdenDespachoWsService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RecibirOrdenDespachoWsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RecibirOrdenDespachoWsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RecibirOrdenDespachoWsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IRecibirOrdenDespachoWs
     */
    @WebEndpoint(name = "RecibirOrdenDespachoWsPort")
    public IRecibirOrdenDespachoWs getRecibirOrdenDespachoWsPort() {
        return super.getPort(RecibirOrdenDespachoWsPort, IRecibirOrdenDespachoWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRecibirOrdenDespachoWs
     */
    @WebEndpoint(name = "RecibirOrdenDespachoWsPort")
    public IRecibirOrdenDespachoWs getRecibirOrdenDespachoWsPort(WebServiceFeature... features) {
        return super.getPort(RecibirOrdenDespachoWsPort, IRecibirOrdenDespachoWs.class, features);
    }

}