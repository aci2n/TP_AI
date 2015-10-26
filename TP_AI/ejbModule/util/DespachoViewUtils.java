package util;

import entity.Coordenada;
import entity.Despacho;
import view.CoordenadaView;
import view.DespachoView;

public class DespachoViewUtils implements ViewUtils<Despacho, DespachoView> {

	@Override
	public Despacho fromView(DespachoView view) {
		Despacho despacho =  new Despacho();
		despacho.setNombre(view.getNombre());
		CoordenadaView cView = view.getCoordenada();
		if (cView != null) {
			CoordenadaViewUtils utils = new CoordenadaViewUtils();
			Coordenada coordenada = utils.fromView(cView);
			despacho.setCoordenada(coordenada);
		}
		return despacho;
	}

}
