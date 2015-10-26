package view;

public class UsuarioView {
	private String dni;
	private CoordenadaView coordenada;

	public CoordenadaView getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(CoordenadaView coordenada) {
		this.coordenada = coordenada;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
