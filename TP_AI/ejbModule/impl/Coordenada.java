package impl;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Coordenada {

	@Column(name = "latitud")
	private double latitud;
	@Column(name = "longitud")
	private double longitud;

	public Coordenada() {

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

}
