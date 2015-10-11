package impl;

public class Usuario extends PersistentObject {
	private static final long serialVersionUID = 1L;

	private String nombre;
	private Coordenada coordenada;

	public Usuario() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

}
