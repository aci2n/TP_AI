package servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.VentasBean;
import view.VentaView;

@WebServlet("/VentasSinOrden")
public class VentasSinOrden extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private VentasBean ventasBean;

	public VentasSinOrden() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<VentaView> ventas = ventasBean.obtenerVentasSinOrdenDespacho();
			request.setAttribute("ventas", ventas);
			request.getRequestDispatcher("/WEB-INF/VentasSinOrdenes.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
