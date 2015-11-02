package bean;

import javax.ejb.Stateless;

import entity.Estado;
import entity.OrdenDespacho;
import exception.NoExisteException;

@Stateless
public class OrdenesDespachoBean extends GenericBean<OrdenDespacho> {

	public OrdenesDespachoBean() {
		super(OrdenDespacho.class);
	}

	public void actualizarOrden(Integer id) throws NoExisteException {
		OrdenDespacho orden = get(id);
		orden.setEstado(Estado.ENTREGADO);
		em.merge(orden);
	}

}
