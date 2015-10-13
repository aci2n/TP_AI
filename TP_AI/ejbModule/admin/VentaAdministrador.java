package admin;

import java.util.ArrayList;
import java.util.List;

import dao.VentaDAO;
import exception.VentaException;
import impl.Despacho;
import impl.Venta;
import view.VentaView;

public class VentaAdministrador {
	private VentaDAO dao;

	public VentaAdministrador() {
		dao = new VentaDAO();
	}

	public Venta get(Integer id) throws VentaException {
		Venta v = dao.get(id);
		if (v == null) {
			throw new VentaException("No existe venta con el ID ingresado.");
		}
		return v;
	}

	public void asignarDespachoAVenta(Integer idVenta, Despacho despacho) throws VentaException {
		Venta venta = get(idVenta);
		venta.asignarDespacho(despacho);
		dao.update(venta);
	}

	public List<VentaView> obtenerVentasSinOrdenDespacho() {
		List<Venta> ventasSinOrden = dao.ventasSinOrdenesDespacho();
		List<VentaView> ventasSinOrdenView = new ArrayList<>();
		for (Venta v : ventasSinOrden) {
			ventasSinOrdenView.add(v.getView());
		}
		return ventasSinOrdenView;
	}
}
