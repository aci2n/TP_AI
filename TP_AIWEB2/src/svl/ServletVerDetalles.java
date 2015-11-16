package svl;

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
		
		List<VentaView> ventas = (List<VentaView>) ventasBean.getAllViews();
		String codigoVenta = request.getParameter("codigo");
		VentaView actual = null;
		try{
			for(VentaView v : ventas){
				if(v.getCodigo().equals(codigoVenta)){
					actual = v;
					break;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		request.setAttribute("actual", actual);
		request.getRequestDispatcher("/WEB-INF/Detalles.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("Ventas").forward(request, response);
	}

}
