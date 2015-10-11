package impl;

public class Detalle extends PersistentObject {
	private static final long serialVersionUID = 1L;

	private String titulo;
	private String descripcion;
	
	public Detalle(){
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
