package impl;

public class Coordenada extends PersistentObject {
	private static final long serialVersionUID = 1L;

	private double latitud;
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
