package servletsTest;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EnvioInformesBean;
import entity.Log;



/**
 * Servlet implementation class PruebaMDB
 */
@WebServlet("/PruebaMDB")
public class PruebaMDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private EnvioInformesBean envioInformes;

	public PruebaMDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("PruebaMDB.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mensaje = request.getParameter("mensaje");
		if (mensaje != null) {

			List<Log> logs = new ArrayList<Log>();
			logs.add(new Log("Monitor", mensaje, Calendar.getInstance().getTime()));
			envioInformes.enviarInformes(logs);
			response.getWriter().append("Mensaje enviado").append(request.getContextPath());

		} else {
			response.getWriter().append("Hubo un error").append(request.getContextPath());

		}

	}

}
