package impl;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import view.UsuarioView;

@Entity
@Table(name = "Usuarios")
public class Usuario extends PersistentObject implements ViewGenerator<UsuarioView> {
	private static final long serialVersionUID = 1L;

	@Column(name = "nombre")
	private String nombre;
	@Embedded
	private Coordenada coordenada;

	public Usuario() {
		
	}

	public Usuario(String nombre, Coordenada coordenada) {
		this.nombre = nombre;
		this.coordenada = coordenada;
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
		uv.setCoordenada(ViewUtil.getViewChecked(coordenada));
		uv.setNombre(nombre);
		return uv;
	}

}
