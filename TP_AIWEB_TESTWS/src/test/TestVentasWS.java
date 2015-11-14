package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.Config;
import ws.ventas.WSProcVentaBeanService;
import ws.ventas.WSProcVentaBeanServiceProxy;

@WebServlet("/TestVentasWS")
public class TestVentasWS extends HttpServlet {
	private static final long serialVersionUID = -6851060808069782909L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().print(Config.getSetting("ventas_ws_url"));
		WSProcVentaBeanService service = new WSProcVentaBeanServiceProxy();
		response.getWriter().print(service.procesarVenta(TestUtil.venta()));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
