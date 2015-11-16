package svl;

import java.io.IOException;
import java.util.Calendar;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.TestBean;
import ws.orden.IRecibirOrdenDespachoWs;
import ws.orden.IRecibirOrdenDespachoWsProxy;
import ws.orden.Item;
import ws.orden.OrdenDespacho;
import ws.orden.RespuestaGenerica;

@WebServlet("/TestPortalWS")
public class TestPortalWS extends HttpServlet {
	private static final long serialVersionUID = -3167305565767619986L;

	@EJB
	private TestBean test;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String endpoint = "http://74938c8f.ngrok.io/DespachoWeb/RecibirOrdenDespachoWs";
			IRecibirOrdenDespachoWs port = new IRecibirOrdenDespachoWsProxy(endpoint);

			OrdenDespacho wsOrden = new OrdenDespacho("2", 27, "16", Calendar.getInstance(), new Item[0]);

			RespuestaGenerica respuesta = port.recibirOrdenDespacho(wsOrden);
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