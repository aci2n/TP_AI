package svl;

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
import entity.Modulos;
import exception.PersistException;

/**
 * Servlet implementation class ServletAgregarConfiguracion
 */
@WebServlet("/configuracion")
public class ServletAgregarConfiguracion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private ModulosBean modulosBean;

	public ServletAgregarConfiguracion() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Modulo> configuraciones = modulosBean.getAll();
		if (configuraciones != null) {
			request.setAttribute("modulos", configuraciones);
		}

		request.getRequestDispatcher("configuracion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ip = (String) request.getParameter("ip_dir");
		String puerto = request.getParameter("puerto");
		String cola = request.getParameter("cola");
		String modulo = request.getParameter("modulo");

		if (ip != null && puerto != null && modulo != null) {

			try {
				modulosBean.save(new Modulo(Modulos.valueOf(modulo), ip, puerto, ""));
			} catch (PersistException e) {

				e.printStackTrace();
			}
		}

	}

}
