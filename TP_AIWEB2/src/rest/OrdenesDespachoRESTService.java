package rest;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.OrdenesDespachoBean;
import entity.ExceptionLog;

@Stateless
@Path("/ordenes")
public class OrdenesDespachoRESTService {

	@EJB
	private OrdenesDespachoBean ordenes;
	
	public OrdenesDespachoRESTService() {

	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/actualizar/{id}")
	public boolean actualizarOrden(Integer id) {
		try {
			ordenes.actualizarOrden(id);
			return true;
		} catch (Exception ex) {
			ordenes.log(new ExceptionLog(ex));
			return false;
		}
	}

}
