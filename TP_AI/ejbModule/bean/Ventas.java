package bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Venta;

@WebService
@Stateless
@LocalBean
public class Ventas {

	@PersistenceContext(unitName = "CRM")
	private EntityManager em;

	public Ventas() {

	}

	@WebMethod
	public void testAgregarVenta() {
		Venta v = new Venta();
		em.persist(v);
	}

}
