package admin;

import java.util.ArrayList;
import java.util.List;

import dao.DespachoDAO;
import exception.DespachoException;
import impl.Coordenada;
import impl.Despacho;
import view.DespachoCercanoView;

public class DespachoAdministrador {
	private DespachoDAO dao;

	public DespachoAdministrador() {
		dao = new DespachoDAO();
	}

	public List<DespachoCercanoView> obtenerDespachosCercanos(Coordenada coordenada) throws DespachoException {
		List<Despacho> despachos = dao.getDespachosActivos();
		if (despachos.size() == 0) {
			throw new DespachoException("No hay despachos activos.");
		}
		List<DespachoCercanoView> despachosCercanos = new ArrayList<>();
		for (Despacho despacho : despachos) {
			despachosCercanos.add(despacho.getDespachoCercanoView(coordenada));
		}
		despachosCercanos.sort((a, b) -> (int) Math.ceil(a.getDistancia() - b.getDistancia()));
		return despachosCercanos;
	}

	public Despacho get(Integer id) throws DespachoException {
		Despacho d = dao.get(id);
		if (d == null) {
			throw new DespachoException("No existe despacho con el ID ingresado.");
		}
		return d;
	}

}
