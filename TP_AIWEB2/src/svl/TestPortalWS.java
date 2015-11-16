package svl;

import java.io.IOException;
import java.net.URL;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;

import bean.TestBean;
import interfaces.logistica.IRecibirOrdenDespachoWs;
import interfaces.logistica.OrdenDespacho;
import interfaces.logistica.RespuestaGenerica;
import uade.fain.ia.interfaces.tpo.soap.RecibirOrdenDespachoWsService;
import util.Utilities;

@WebServlet("/TestPortalWS")
public class TestPortalWS extends HttpServlet {
	private static final long serialVersionUID = -3167305565767619986L;

	@EJB
	private TestBean test;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String endpoint = "http://74938c8f.ngrok.io/DespachoWeb/RecibirOrdenDespachoWs";
			URL url = new URL(endpoint + "?wsdl");
			IRecibirOrdenDespachoWs port = new RecibirOrdenDespachoWsService(url).getRecibirOrdenDespachoWsPort();

			BindingProvider bp = (BindingProvider) port;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

			OrdenDespacho orden = new OrdenDespacho();
			orden.setIdLogistica("test");
			orden.setIdOrdenCompra(22);
			orden.setIdOrdenDespacho("50");
			orden.setFecha(Utilities.dateToXmlGregorianCalendar(new Date()));
			RespuestaGenerica respuesta = port.recibirOrdenDespacho(orden);

			response.getWriter()
					.print(String.format("Estado: %s, Mensaje: %s", respuesta.getEstado(), respuesta.getMensaje()));
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}