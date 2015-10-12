package test;

import admin.ControladorPrincipal;
import dao.DespachoDAO;
import dao.VentaDAO;
import impl.Despacho;
import impl.OrdenDespacho;
import impl.Venta;
import util.Utilities;
import view.VentaView;

public class TestVentasSinOrdenesDeDespacho {

	public static void main(String[] args) {
		try {
			Venta v = new Venta();
			v.setPortal("Esto es un portal de prueba para una venta sin orden de despacho.");
			
			Despacho d = new Despacho();
			d.setNombre("Despacho");
			new DespachoDAO().insert(d);
			
			OrdenDespacho o = new OrdenDespacho();
			o.setDespacho(d);
			
			Venta v2 = new Venta();
			v2.setPortal("Esto es un portal de prueba para una venta con orden de despacho.");
			v2.setOrden(o);

			VentaDAO vDao = new VentaDAO();
			vDao.insert(v);
			vDao.insert(v2);
			
			Utilities.printList(ControladorPrincipal.getInstancia().obtenerVentasSinOrdenDespacho(), VentaView.class);
			
			vDao.delete(v);
			vDao.delete(v2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

}
