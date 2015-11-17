package ws.ventas;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import bean.VentasBean;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import util.Utilities;
import view.ArticuloView;
import view.CoordenadaView;
import view.ItemArticuloView;
import view.UsuarioView;
import view.VentaView;

@WebService(targetNamespace = "http://webService.monitor.com/", name = "WSProcVentaBean")
public class WSProcVentaBean {

	@EJB
	private VentasBean ventasBean;

	@WebMethod
	@RequestWrapper(localName = "procesarCarrito", targetNamespace = "http://webService.monitor.com/", className = "ws.ventas.ProcesarCarrito")
    @ResponseWrapper(localName = "procesarCarritoResponse", targetNamespace = "http://webService.monitor.com/", className = "ws.ventas.ProcesarCarritoResponse")
    @WebResult(name = "return", targetNamespace = "")
	public String procesarCarrito(@WebParam(name = "arg0", targetNamespace = "") VoCarrito carrito) {
		throw new NotImplementedException();
	}

	@WebMethod
    @RequestWrapper(localName = "procesarVenta", targetNamespace = "http://webService.monitor.com/", className = "ws.ventas.ProcesarVenta")
    @ResponseWrapper(localName = "procesarVentaResponse", targetNamespace = "http://webService.monitor.com/", className = "ws.ventas.ProcesarVentaResponse")
    @WebResult(name = "return", targetNamespace = "")
	public String procesarVenta(@WebParam(name = "arg0", targetNamespace = "") VoVenta venta) throws RemoteException {
		if (venta == null) {
			throw new RemoteException("La venta no puede ser null");
		}

		try {
			VentaView view = new VentaView();
			view.setCodigo(String.valueOf(venta.getCodigoVenta()));
			view.setFecha(venta.getFecha().toGregorianCalendar().getTime());
			view.setPortal(Integer.toString(venta.getIdPortal()));

			Cliente cliente = venta.getCliente();
			UsuarioView usuario = new UsuarioView();
			usuario.setDni(String.valueOf(cliente.getDni()));
			usuario.setNombre(cliente.getNombre());
			usuario.setApellido(cliente.getApelido());

			CoordenadaView coordenada = new CoordenadaView();

			// Asumiendo que la latitud viene como 99.99,99.99
			String[] coordStrings = cliente.getCoordenada().split(",");
			coordenada.setLatitud(Double.parseDouble(coordStrings[0]));
			coordenada.setLongitud(Double.parseDouble(coordStrings[1]));
			usuario.setCoordenada(coordenada);
			view.setUsuario(usuario);

			List<ItemArticuloView> items = new ArrayList<ItemArticuloView>();
			for (VoItemVenta iv : venta.getCollectionItems()) {
				ItemArticuloView ia = new ItemArticuloView();
				ia.setCantidad(iv.getCantidad());

				ArticuloView a = new ArticuloView();
				a.setPrecio(iv.getProducto().getPrecio());
				a.setCodigo(String.valueOf(iv.getProducto().getCodigo()));
				ia.setArticulo(a);

				items.add(ia);
			}

			view.setArticulos(items);

			ventasBean.guardarVenta(view);
		} catch (Exception e) {
			ventasBean.logException(e);
			throw new RemoteException(Utilities.generarMensajeError(e));
		}
		return "SUCCESS";

	}

}
