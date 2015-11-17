package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.ModulosBean;
import bean.OrdenesDespachoBean;
import bean.VentasBean;
import entity.Estado;
import entity.Modulos;
import exception.NoExisteException;
import response.RecibirCambioEstadoResponse;
import util.Utilities;
import view.ItemArticuloView;
import view.VentaView;
import ws.orden.Item;
import ws.orden.OrdenDespacho;
import ws.orden.RecibirOrdenDespacho;
import ws.orden.RecibirOrdenDespachoResponse;
import ws.orden.RecibirOrdenDespachoWs;
import ws.orden.RecibirOrdenDespachoWsProxy;

@Stateless
@Path("/OrdenDeDespacho")
public class OrdenDespachoRESTService {

	@EJB
	private OrdenesDespachoBean ordenesDespachoBean;
	@EJB
	private VentasBean ventasBean;
	@EJB
	private ModulosBean modulosBean;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response recibirCambioEstado(OrdenesDespachoArray ordenes) {
		int status = 200;
		List<RecibirCambioEstadoResponse> response = new ArrayList<>();

		for (OrdenDespachoJson orden : ordenes.getOrdenes()) {
			try {
				ordenesDespachoBean.actualizarOrden(orden.getIdOrdenDeDespacho(), Estado.ENTREGADO);
				response.add(
						new RecibirCambioEstadoResponse(orden.getIdOrdenDeDespacho().toString(), "Orden de despacho actualizada correctamente."));
			} catch (NoExisteException e) {
				status = 400;
				response.add(new RecibirCambioEstadoResponse(orden.getIdOrdenDeDespacho().toString(), "No existe la orden de despacho enviada."));
				ordenesDespachoBean.logException(e);
			}
		}

		return Response.status(status).entity(response).build();
	}

	@POST
	@Path("/enviar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response enviarOrden(@FormParam("idVenta") int idVenta, @FormParam("idDespacho") int idDespacho) {
		try {
			String url = Utilities.normalizarUrl(modulosBean.getUrlModulo(idDespacho, Modulos.Despacho)) + "DespachoWeb/RecibirOrdenDespachoWs";
			RecibirOrdenDespachoWs ws = new RecibirOrdenDespachoWsProxy(url);

			VentaView venta = ventasBean.asignarDespachoAVenta(idVenta, idDespacho);

			List<Item> wsItems = new ArrayList<Item>();
			for (ItemArticuloView ia : venta.getArticulos()) {
				Item i = new Item(ia.getArticulo().getCodigo(), ia.getCantidad());
				wsItems.add(i);
			}

			OrdenDespacho wsOrden = new OrdenDespacho(venta.getOrden().getId().toString(), venta.getId(), "16",
					Utilities.dateToString(venta.getFecha()), wsItems.toArray(new Item[wsItems.size()]));

			RecibirOrdenDespachoResponse respuesta = ws.recibirOrdenDespacho(new RecibirOrdenDespacho(wsOrden));
			
			String estado = respuesta.get_return().getEstado();
			if (estado.equalsIgnoreCase("OK")) {
				ordenesDespachoBean.actualizarOrden(venta.getOrden().getId(), Estado.ACTIVO);
			}
			return Response.status(200).entity(estado + " - " + respuesta.get_return().getMensaje()).build();
		} catch (Exception e) {
			return Response.status(400).entity(Utilities.generarMensajeError(e)).build();
		} // ksae7162
	}

}
