package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.VentasBean;
import util.Utilities;

@Stateless
@Path("/ventas")
public class VentasRESTService {

	@EJB
	private VentasBean ventas;

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response asignarDespachoAVenta(@FormParam("idVenta") int idVenta, @FormParam("idDespacho") int idDespacho) {
		try {
			ventas.asignarDespachoAVenta(idVenta, idDespacho);
			return Response.status(200).entity("Despacho asignado correctamente.").build();
		} catch (Exception e) {
			return Response.status(400).entity(Utilities.generarMensajeError(e)).build();
		}
	}

}
