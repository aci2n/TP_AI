package admin;

import dao.VentaDAO;
import exception.VentaException;
import impl.Venta;

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
}
