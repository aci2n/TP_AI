package bean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import entity.Despacho;
import entity.Estado;
import entity.OrdenDespacho;
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

	public OrdenDespacho generarOrdenDespacho(Despacho despacho) throws PersistException {
		OrdenDespacho orden = new OrdenDespacho(despacho, Estado.ACTIVO);
		save(orden);
		return orden;
	}

	public List<OrdenDespacho> getOrdenesActivas() {
		return executeQuery("from OrdenDespacho where estado = entity.Estado.ACTIVO");
	}

}
