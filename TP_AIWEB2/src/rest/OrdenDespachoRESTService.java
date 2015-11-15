package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.OrdenesDespachoBean;
import exception.NoExisteException;
import util.Utilities;

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

	@POST
	@Path("/enviar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response enviarOrdenesActivas() {
		try {
			return Response.status(200).entity(ordenesDespachoBean.enviarOrdenesActivas()).build();
		} catch (Exception e) {
			return Response.status(400).entity(Utilities.generarMensajeError(e)).build();
		}
	}

}
