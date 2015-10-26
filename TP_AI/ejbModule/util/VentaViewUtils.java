package util;

import java.util.ArrayList;
import java.util.List;

import entity.Coordenada;
import entity.ItemArticulo;
import entity.Usuario;
import entity.Venta;
import view.CoordenadaView;
import view.ItemArticuloView;
import view.UsuarioView;
import view.VentaView;

public class VentaViewUtils implements ViewUtils<Venta, VentaView> {

	@Override
	public Venta fromView(VentaView view) {
		Venta venta = new Venta();
		venta.setCodigo(view.getCodigo());
		venta.setFecha(view.getFecha());
		venta.setPortal(view.getPortal());
		venta.setTotal(view.getTotal());
		
		UsuarioView uView = view.getUsuario();
		if (uView != null) {
			UsuarioViewUtils utils = new UsuarioViewUtils();
			Usuario usuario = utils.fromView(uView);
			venta.setUsuario(usuario);
		}
		
		CoordenadaView cView = view.getDestino();
		if (cView != null) {
			CoordenadaViewUtils utils = new CoordenadaViewUtils();
			Coordenada coordenada = utils.fromView(cView);
			venta.setDestino(coordenada);
		}
		
		List<ItemArticuloView> iaViews = view.getArticulos();
		if (iaViews != null) {
			List<ItemArticulo> ias = new ArrayList<ItemArticulo>();
			for (ItemArticuloView iaView : iaViews) {
				ItemArticuloViewUtils utils = new ItemArticuloViewUtils();
				ItemArticulo ia = utils.fromView(iaView);
				ias.add(ia);
			}
			venta.setArticulos(ias);
		}
		
		return venta;
	}

}
