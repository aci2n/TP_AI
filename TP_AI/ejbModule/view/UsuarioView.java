package view;

public class UsuarioView {
	private String dni;
	private CoordenadaView coordenada;
	private String nombre;
	private String apellido;

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
