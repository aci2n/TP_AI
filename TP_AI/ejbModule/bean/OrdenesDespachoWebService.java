package bean;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entity.ExceptionLog;

@Stateless
@LocalBean
public class OrdenesDespachoWebService {

	@EJB
	private OrdenesDespachoBean ordenes;
	
	public OrdenesDespachoWebService() {

	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/ordenes/{id}")
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
