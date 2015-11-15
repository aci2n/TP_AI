package rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.OrdenesDespachoBean;
import entity.OrdenDespacho;
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
			List<OrdenDespacho> ordenesActivas = ordenesDespachoBean.getOrdenesActivas();
			String mensaje = "Ordenes activas enviadas correctamente.";
			String ordenesJson = ordenesDespachoBean.toJson(ordenesActivas);

			for (OrdenDespacho o : ordenesActivas) {
				// enviar por ws a portal, setear mensaje
			}

			return Response.status(200).entity(new EnviarOrdenesResponse(ordenesJson, mensaje)).build();
		} catch (Exception e) {
			return Response.status(400).entity(new EnviarOrdenesResponse(null, Utilities.generarMensajeError(e)))
					.build();
		}
	}

}
