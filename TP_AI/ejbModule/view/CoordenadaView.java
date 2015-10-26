package view;

import entity.Coordenada;

public class CoordenadaView implements View<Coordenada> {
	private double latitud;
	private double longitud;

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
