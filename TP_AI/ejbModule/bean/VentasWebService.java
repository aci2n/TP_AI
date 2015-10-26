package bean;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import entity.ExceptionLog;
import view.VentaView;

@Stateless
@LocalBean
@WebService
public class VentasWebService implements VentasWebServiceRemote, VentasWebServiceLocal {

	@EJB
	private VentasBean ventasBean;

	public VentasWebService() {

	}

	@WebMethod
	public boolean planificarDespacho(VentaView venta){
		try {
			ventasBean.guardarVenta(venta);
			return true;
		} catch (Exception e) {
			ventasBean.log(new ExceptionLog(e));
			return false;
		}
	}

}
