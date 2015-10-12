package dao;

import java.util.List;

import impl.Venta;

public class VentaDAO extends GenericDAO<Venta> {

	public VentaDAO() {
		super(Venta.class);
	}

	public List<Venta> ventasSinOrdenesDeDespacho() {
		return executeQuery("select v from Venta as v left join v.orden as od where od is null");
	}
}
