package test;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monitor.webService.WSInformeAuditoriaBeanService;

@WebServlet("/AuditoriaWS")
public class AuditoriaWS extends HttpServlet {
	private static final long serialVersionUID = -5198762760696469673L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		com.monitor.webService.LogDTO log = new com.monitor.webService.LogDTO();
		log.setFecha(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		log.setIdModulo("1");
		log.setMensaje("hola");
		com.monitor.webService.WSInformeAuditoriaBean service = new WSInformeAuditoriaBeanService(
				new URL("http://4d159ae1.ngrok.io/TP_AIWEB/WSInformeAuditoriaBean?wsdl"))
						.getWSInformeAuditoriaBeanPort();
		
		response.getWriter().print(service.agregarInforme(log));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
