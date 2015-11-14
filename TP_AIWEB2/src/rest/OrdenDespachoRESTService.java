package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.OrdenesDespachoBean;
import exception.NoExisteException;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Path("/OrdenDeDespacho")
public class OrdenDespachoRESTService {
	
	@EJB
	private OrdenesDespachoBean ordenesDespachoBean;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void recibirCambioEstado(OrdenesDespachoArray ordenes) throws NoExisteException {
		for (OrdenDespachoJson orden : ordenes.getOrdenes()) {
			ordenesDespachoBean.actualizarOrden(orden.getIdOrdenDeDespacho());
		}
	}
	
}
