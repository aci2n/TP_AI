package rest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.OrdenesDespachoBean;
import bean.VentasBean;
import exception.NoExisteException;
import util.Utilities;
import view.ItemArticuloView;
import view.VentaView;
import ws.orden.IRecibirOrdenDespachoWs;
import ws.orden.IRecibirOrdenDespachoWsProxy;
import ws.orden.Item;
import ws.orden.OrdenDespacho;
import ws.orden.RespuestaGenerica;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Path("/OrdenDeDespacho")
public class OrdenDespachoRESTService {

	@EJB
	private OrdenesDespachoBean ordenesDespachoBean;
	@EJB
	private VentasBean ventasBean;

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
	public Response enviarOrden(Integer idVenta, Integer idDespacho) {
		try {
			VentaView venta = ventasBean.asignarDespachoAVenta(idVenta, idDespacho);
			
			List<Item> wsItems = new ArrayList<Item>();
			for (ItemArticuloView ia : venta.getArticulos()) {
				Item i = new Item(String.valueOf(ia.getArticulo().getCodigo()), ia.getCantidad());
				wsItems.add(i);
			}
			
			OrdenDespacho wsOrden = new OrdenDespacho(
				idDespacho.toString(),
				venta.getOrden().getId(),
				"16",
				Calendar.getInstance(),
				(Item[]) wsItems.toArray()
			);
			
			IRecibirOrdenDespachoWs ws = new IRecibirOrdenDespachoWsProxy();
			return Response.status(200).entity(ws.recibirOrdenDespacho(wsOrden)).build();
		} catch (Exception e) {
			return Response.status(500).entity(Utilities.generarMensajeError(e)).build();
		}
	}
	
	@GET
	@Path("/ordenesActivas")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOrdenesActivas() {
		try {
			return Response.status(200).entity(ordenesDespachoBean.getOrdenesActivasView()).build();
		} catch (Exception e) {
			return Response.status(500).entity(Utilities.generarMensajeError(e)).build();
		}
	}
	
}
