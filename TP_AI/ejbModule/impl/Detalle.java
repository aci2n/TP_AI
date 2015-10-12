package impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import view.DetalleView;

@Entity
@Table(name = "Detalles")
public class Detalle extends PersistentObject {
	private static final long serialVersionUID = 1L;

	@Column(name = "titulo")
	private String titulo;
	@Column(name = "descripcion")
	private String descripcion;

	public Detalle() {

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

	public DetalleView getView() {
		DetalleView dv = new DetalleView();
		dv.setDescripcion(descripcion);
		dv.setTitulo(titulo);
		return dv;
	}

}
