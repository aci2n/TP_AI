package ws.ventas;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import bean.VentasBean;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import util.Utilities;
import view.ArticuloView;
import view.CoordenadaView;
import view.ItemArticuloView;
import view.UsuarioView;
import view.VentaView;

@WebService
public class WSProcVentaBean {

	@EJB
	private VentasBean ventasBean;

	@WebMethod
	public String procesarCarrito(VoCarrito carrito) {
		throw new NotImplementedException();
	}

	@WebMethod
	public String procesarVenta(VoVenta venta) throws RemoteException {
		if (venta == null) {
			throw new RemoteException("La venta no puede ser null");
		}

		try {
			VentaView view = new VentaView();
			view.setCodigo(String.valueOf(venta.getCodigoVenta()));
			view.setFecha(venta.getFecha().toGregorianCalendar().getTime());

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
				a.setCodigo(Long.valueOf(iv.getProducto().getCodigo()).intValue());
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
