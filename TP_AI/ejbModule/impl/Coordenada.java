package impl;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import view.CoordenadaView;

@Embeddable
public class Coordenada implements ViewGenerator<CoordenadaView> {
	private static final double kilometrosPorGrado = 111.12f;

	@Column(name = "latitud")
	private double latitud;
	@Column(name = "longitud")
	private double longitud;

	public Coordenada() {

	}

	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public double calcularDistanciaEnKilometros(Coordenada coordenada) {
		float difLatitud = (float) Math.abs(this.latitud - coordenada.getLatitud());
		float difLongitud = (float) Math.abs(this.longitud - coordenada.getLongitud());
		float cateto = (float) Math.sqrt((difLatitud * difLatitud) + (difLongitud * difLongitud));
		return cateto * kilometrosPorGrado;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public CoordenadaView getView() {
		CoordenadaView cv = new CoordenadaView();
		cv.setLatitud(latitud);
		cv.setLongitud(longitud);
		return cv;
	}

}
