package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import entity.Coordenada;
import entity.Despacho;
import entity.ExceptionLog;
import exception.DespachoException;
import view.DistanciaADespachoView;

@Stateless
public class DespachosBean extends GenericBean<Despacho> {

	public DespachosBean() {
		super(Despacho.class);
	}

	public List<DistanciaADespachoView> obtenerDistanciasADespacho(Coordenada coordenada) throws DespachoException {
		List<Despacho> despachos = executeQuery("from Despacho where activo = true");
		if (despachos.size() == 0) {
			throw new DespachoException("No hay despachos activos.");
		}

		List<DistanciaADespachoView> distanciasADespacho = new ArrayList<>();
		for (Despacho despacho : despachos) {
			try {
				distanciasADespacho.add(despacho.getDistanciaADespachoView(coordenada));
			} catch (DespachoException e) {
				em.persist(new ExceptionLog(e));
			}
		}

		distanciasADespacho.sort((a, b) -> (int) Math.ceil(a.getDistancia() - b.getDistancia()));

		return distanciasADespacho;
	}

}
