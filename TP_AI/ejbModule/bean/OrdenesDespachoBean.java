package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import entity.Despacho;
import entity.Estado;
import entity.OrdenDespacho;
import exception.NoExisteException;
import exception.PersistException;
import response.EnviarOrdenesResponse;
import view.OrdenDespachoActivaView;

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

	private List<OrdenDespacho> getOrdenesActivas() {
		return executeQuery("from OrdenDespacho where estado = entity.Estado.ACTIVO");
	}

	public EnviarOrdenesResponse enviarOrdenesActivas() {
		List<OrdenDespacho> ordenesActivas = getOrdenesActivas();
		List<OrdenDespachoActivaView> ordenesActivasView = new ArrayList<>();
		String mensaje = "Ordenes activas enviadas correctamente.";

		for (OrdenDespacho o : ordenesActivas) {
			ordenesActivasView.add(o.getOrdenDespachoActivaView());
			// enviar por ws a portal, setear mensaje
			o.setEstado(Estado.ENTREGADO);
			em.merge(o);
		}

		if (ordenesActivasView.isEmpty()) {
			mensaje = "No hay ordenes activas para enviar en este momento.";
		}
		return new EnviarOrdenesResponse(ordenesActivasView, mensaje);
	}

	public List<OrdenDespachoActivaView> getOrdenesActivasView() {
		List<OrdenDespacho> ordenesActivas = getOrdenesActivas();
		List<OrdenDespachoActivaView> ordenesActivasView = new ArrayList<>();

		for (OrdenDespacho o : ordenesActivas) {
			ordenesActivasView.add(o.getOrdenDespachoActivaView());
		}

		return ordenesActivasView;
	}

	public void actualizarOrden(OrdenDespacho orden, Despacho despacho) {
		orden.setDespacho(despacho);
		em.merge(orden);
	}
}
