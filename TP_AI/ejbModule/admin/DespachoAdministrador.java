package admin;

import java.util.ArrayList;
import java.util.List;

import dao.DespachoDAO;
import exception.DespachoException;
import exception.DistanciaADespachoException;
import exceptionlogger.ExceptionLogger;
import impl.Coordenada;
import impl.Despacho;
import view.DistanciaADespachoView;

public class DespachoAdministrador {
	private DespachoDAO dao;

	public DespachoAdministrador() {
		dao = new DespachoDAO();
	}

	public List<DistanciaADespachoView> obtenerDistanciasADespacho(Coordenada coordenada) throws DespachoException {
		List<Despacho> despachos = dao.getDespachosActivos();
		if (despachos.size() == 0) {
			throw new DespachoException("No hay despachos activos.");
		}
		List<DistanciaADespachoView> distanciasADespacho = new ArrayList<>();
		for (Despacho despacho : despachos) {
			try {
				distanciasADespacho.add(despacho.getDistanciaADespachoView(coordenada));
			} catch (DistanciaADespachoException e) {
				ExceptionLogger.log(e);
			}
		}
		distanciasADespacho.sort((a, b) -> (int) Math.ceil(a.getDistancia() - b.getDistancia()));
		return distanciasADespacho;
	}

	public Despacho get(Integer id) throws DespachoException {
		Despacho d = dao.get(id);
		if (d == null) {
			throw new DespachoException("No existe despacho con el ID ingresado.");
		}
		return d;
	}

}
