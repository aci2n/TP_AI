package impl;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import view.UsuarioView;

@Entity
@Table(name = "Usuarios")
public class Usuario extends PersistentObject {
	private static final long serialVersionUID = 1L;

	@Column(name = "nombre")
	private String nombre;
	@Embedded
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

	public UsuarioView getView() {
		UsuarioView uv = new UsuarioView();
		uv.setCoordenada(coordenada.getView());
		uv.setNombre(nombre);
		return uv;
	}

}
