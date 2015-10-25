package test;

import bean.Ventas;
import bean.VentasProxy;

public class TestVentasWebService {

	public static void main(String[] args) {
		try {
			Ventas vp = new VentasProxy();
			vp.testAgregarVenta();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

}
