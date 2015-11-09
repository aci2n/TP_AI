package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import entity.Coordenada;
import entity.Despacho;
import entity.ExceptionLog;
import entity.Venta;
import exception.DespachoException;
import view.DespachoView;
import view.DistanciaADespachoView;

@Stateless
public class DespachosBean extends GenericBean<Despacho> {

	public DespachosBean() {
		super(Despacho.class);
	}
	
	public DespachoView obtenerDespachoRecomendado(Venta venta) throws DespachoException {
		List<Despacho> despachos = getAll();
		
		if (despachos.isEmpty()) {
			throw new DespachoException("No hay despachos activos.");
		}
		
		Coordenada destino = venta.getDestino();
		Despacho cercano = null;
		
		for (Despacho despacho : despachos) {
			if (cercano == null || despacho.obtenerDistanciaACoordenada(destino) < cercano.obtenerDistanciaACoordenada(destino)) {
				cercano = despacho;
			}
		}
		
		if (cercano != null) {
			return cercano.getView();
		}
		
		return null;
	}

	private List<DistanciaADespachoView> obtenerDistanciasADespachos(Coordenada coordenada) throws DespachoException {
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
