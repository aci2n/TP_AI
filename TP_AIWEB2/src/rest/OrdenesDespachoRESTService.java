package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import bean.OrdenesDespachoBean;

@Stateless
@Path("/ordenesDespacho")
public class OrdenesDespachoRESTService {

	@EJB
	private OrdenesDespachoBean ordenes;

	public OrdenesDespachoRESTService() {

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/actualizar/{id}")
	public boolean actualizarOrden(@PathParam("id") Integer id) {
		try {
			ordenes.actualizarOrden(id);
			return true;
		} catch (Exception e) {
			ordenes.logException(e);
			return false;
		}
	}

}
