package svl;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.VentasBean;
import exception.NoExisteException;

/**
 * Servlet implementation class ServletVerDetalles
 */
@WebServlet("/verDetalles")
public class ServletVerDetalles extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private VentasBean ventasBean;

	public ServletVerDetalles() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("actual", ventasBean.getView(request.getParameter("codigo")));
			request.getRequestDispatcher("/WEB-INF/Detalles.jsp").forward(request, response);
		} catch (NoExisteException e) {
			throw new ServletException(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
