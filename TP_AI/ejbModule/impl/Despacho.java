package impl;

public class Despacho extends PersistentObject {
	private static final long serialVersionUID = 1L;

	private Coordenada coordenada;
	private boolean activo;

	public Despacho() {

	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
