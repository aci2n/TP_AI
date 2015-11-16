package svl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.TestBean;

@WebServlet("/Seed")
public class Seed extends HttpServlet {
	private static final long serialVersionUID = -3167305565767619986L;

	@EJB
	private TestBean test;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			//out.println(test.generateRandomList(() -> test.articulo(), 20, true));
			out.println(test.generateRandomList(() -> test.venta(), 20, true));
			out.println(test.generateRandomList(() -> test.log(), 10, true));
			//out.println(test.generateRandomList(() -> test.despacho(), 3, true));
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}