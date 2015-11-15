package servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ModulosBean;
import entity.Modulo;

/**
 * Servlet implementation class ServletInicio
 */
@WebServlet("/inicio")
public class ServletInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private ModulosBean moduloBean;

	public ServletInicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Modulo> m = moduloBean.getMiConfiguracion();
		if (m != null) {
			// m = moduloBean.setMiConfiguracion(new Modulo(Modulos.Email,
			// "localhost", "8180", null));
			request.setAttribute("ip", m.get(0).getIp());
			request.setAttribute("puerto", m.get(0).getPort());
		}

		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
