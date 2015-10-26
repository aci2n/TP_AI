package util;

import entity.Coordenada;
import view.CoordenadaView;


public class CoordenadaViewUtils implements ViewUtils<Coordenada, CoordenadaView> {

	@Override
	public Coordenada fromView(CoordenadaView view) {
		Coordenada coordenada = new Coordenada();
		coordenada.setLatitud(view.getLatitud());
		coordenada.setLongitud(view.getLongitud());
		return coordenada;
	}

}
