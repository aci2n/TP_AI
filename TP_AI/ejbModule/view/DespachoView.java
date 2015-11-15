package view;

public class DespachoView {
	private Integer id;
	private String nombre;
	private CoordenadaView coordenada;
	private boolean activo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CoordenadaView getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(CoordenadaView coordenada) {
		this.coordenada = coordenada;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
