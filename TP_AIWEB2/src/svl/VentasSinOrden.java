package svl;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.VentasBean;

@WebServlet("/VentasSinOrden")
public class VentasSinOrden extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private VentasBean ventas;

	public VentasSinOrden() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("ventasDespachoRecomendado", ventas.obtenerVentasSinOrdenDespacho());
		request.getRequestDispatcher("/WEB-INF/VentasSinOrden.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
