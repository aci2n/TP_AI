package test;

import admin.ControladorPrincipal;
import impl.Despacho;
import dao.DespachoDAO;
import dao.VentaDAO;
import impl.Venta;
import util.Utilities;

public class TestAsignarDespachoAVenta {
	public static void main(String[] args) {
		try {
			Venta v = new Venta();
			v.setPortal("Esto es un portal de prueba.");
			VentaDAO vd = new VentaDAO();
			int idv = vd.insert(v);
			
			Despacho d = new Despacho();
			d.setActivo(true);
			DespachoDAO dd = new DespachoDAO();
			int idd = dd.insert(d);
			
			ControladorPrincipal.getInstancia().asignarDespachoAVenta(idd, idv);
			
			Utilities.print(vd.get(idv), Venta.class);
			
			vd.delete(v);
			dd.delete(d);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}
}
