package test;

import dao.VentaDAO;
import impl.Venta;
import util.Utilities;

public class TestVentasSinOrdenesDeDespacho {

	public static void main(String[] args) {
		try {
			Venta v = new Venta();
			VentaDAO vDao = new VentaDAO();
			vDao.insert(v);
			Utilities.printList(new VentaDAO().ventasSinOrdenesDeDespacho(), Venta.class);
			vDao.delete(v);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

}
