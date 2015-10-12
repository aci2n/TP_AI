package test;

import bean.Venta;
import bean.VentasWebService;
import bean.VentasWebServiceProxy;

public class TestVentasWebService {

	public static void main(String[] args) {
		try {
			VentasWebService vws = new VentasWebServiceProxy();
			Venta v = new Venta();
			v.setPortal("Esto es un portal de prueba.");
			Venta[] ventas = {v};
			vws.procesarVentas(ventas);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

}
