package svl;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ArticulosBean;

@WebServlet("/BestSellers")
public class BestSellers extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2144800669939482599L;
	@EJB
	private ArticulosBean articulosBean;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("bestSellers", articulosBean.getBestSellers());
		request.getRequestDispatcher("/WEB-INF/bestSellers.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
}
