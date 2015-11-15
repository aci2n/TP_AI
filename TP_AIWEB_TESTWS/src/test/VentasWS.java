package test;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.TestBean;
import ws.ventas.WSProcVentaBean;
import ws.ventas.WSProcVentaBeanProxy;

@WebServlet("/VentasWS")
public class VentasWS extends HttpServlet {
	private static final long serialVersionUID = -3167305565767619986L;

	@EJB
	private TestBean test;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WSProcVentaBean service = new WSProcVentaBeanProxy();
		response.getWriter().print(service.procesarVenta(TestUtil.venta()));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
