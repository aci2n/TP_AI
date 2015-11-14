package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.auditoria.WSInformeAuditoriaBean;
import ws.auditoria.WSInformeAuditoriaBeanProxy;

@WebServlet("/AuditoriaWS")
public class AuditoriaWS extends HttpServlet {
	private static final long serialVersionUID = -5198762760696469673L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WSInformeAuditoriaBean service = new WSInformeAuditoriaBeanProxy();
		response.getWriter().print(service.agregarInforme(TestUtil.log()));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
