package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import entity.Coordenada;
import entity.Despacho;
import entity.OrdenDespacho;
import entity.Reporte;
import entity.Usuario;
import entity.Venta;
import exception.NoExisteException;
import exception.PersistException;
import view.PortalView;
import view.VentaView;

@Stateless
public class VentasBean extends GenericBean<Venta> {

	public VentasBean() {
		super(Venta.class);
	}

	public Integer guardarVenta(VentaView view) throws PersistException {
		Venta venta = new Venta();
		venta.setPortal(view.getPortal());
		venta.setTotal(view.getTotal());
		venta.setCodigo(view.getCodigo());
		venta.setFecha(view.getFecha());
		venta.setUsuario(view.getUsuario() != null ? new Usuario(view.getUsuario()) : null);
		venta.setDestino(view.getDestino() != null ? new Coordenada(view.getDestino()) : null);
		venta.setOrden(view.getOrden() != null ? new OrdenDespacho(view.getOrden()) : null);

		save(venta);
		return venta.getId();
	}

	public Venta obtenerVenta(Integer idVenta) throws NoExisteException {
		return null;
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

	public List<VentaView> getAllViews() {
		List<VentaView> ventasView = new ArrayList<>();
		for (Venta v : getAll()) {
			ventasView.add(v.getView());
		}

		return ventasView;
	}

	public List<PortalView> getReportePortales() {
		Reporte reporte = new Reporte();
		for (Venta v : getAll()) {
			reporte.agregarVenta(v);
		}
		reporte.ordenar();

		return reporte.getPortales();
	}

}
