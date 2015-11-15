package bean;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import entity.Despacho;
import entity.Estado;
import entity.OrdenDespacho;
import entity.Venta;
import exception.NoExisteException;
import exception.PersistException;

@Stateless
public class OrdenesDespachoBean extends GenericBean<OrdenDespacho> {

	@EJB
	private OrdenesDespachoBean ordenes;

	public OrdenesDespachoBean() {
		super(OrdenDespacho.class);
	}

	public void actualizarOrden(Integer id) throws NoExisteException {
		OrdenDespacho orden = get(id);
		orden.setEstado(Estado.ENTREGADO);
		em.merge(orden);
	}

	public void asignarOrdenDespacho(Venta venta, Despacho despacho) throws PersistException {
		OrdenDespacho orden = new OrdenDespacho(despacho, Estado.ACTIVO);
		save(orden);
		venta.setOrden(orden);
	}

}
