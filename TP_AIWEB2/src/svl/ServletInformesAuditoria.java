package svl;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import bean.EnvioInformesBean;
import entity.LogMail;

/**
 * Servlet implementation class ServletInfomesAuditoria
 */
@WebServlet("/informes")
public class ServletInformesAuditoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EnvioInformesBean envioInformesBean;
	
    public ServletInformesAuditoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("listadoInformes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String informes = request.getParameter("informes");
		if(informes != null){
			
			Type type = new TypeToken<List<LogMail>>() {
			}.getType();
			List<LogMail> logs = new Gson().fromJson(informes, type);
			
			envioInformesBean.enviarInformes(logs);
			envioInformesBean.borrarInformes();
		}
	}

}
