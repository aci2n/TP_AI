package bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import impl.Venta;
import util.Utilities;

@Stateless
@WebService
public class VentasWebService {
	public VentasWebService() {
	}

	@WebMethod
	public boolean procesarVentas(List<Venta> ventas) {
		boolean exito = false;
		try {
			Utilities.printList(ventas, Venta.class);
		} catch (Exception e) {
			// logear
		}
		return exito;
	}

}
