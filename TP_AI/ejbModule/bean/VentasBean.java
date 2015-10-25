package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entity.Despacho;
import entity.Venta;
import exception.NoExisteException;
import view.VentaView;

@Stateless
@LocalBean
public class VentasBean extends GenericBean<Venta> implements VentasBeanRemote {

	public VentasBean() {
		super(Venta.class);
	}

	public void asignarDespachoAVenta(Integer idVenta, Despacho despacho) throws NoExisteException {
		Venta venta = get(idVenta);
		venta.asignarDespacho(despacho);
		em.merge(venta);
	}

	public List<VentaView> obtenerVentasSinOrdenDespacho() {
		List<Venta> ventasSinOrden = executeQuery("select v from Venta as v left join v.orden as od where od is null");
		List<VentaView> ventasSinOrdenView = new ArrayList<>();
		
		for (Venta v : ventasSinOrden) {
			ventasSinOrdenView.add(v.getView());
		}
		
		return ventasSinOrdenView;
	}

}
