package bean;

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
	public boolean procesarVentas(Venta v) {
		boolean exito = false;
		try {
			Utilities.print(v, Venta.class);
			exito = true;
		} catch (Exception e) {
			// logear
		}
		return exito;
	}

}
