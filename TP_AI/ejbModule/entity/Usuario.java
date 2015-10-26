package entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import view.UsuarioView;

@Embeddable
public class Usuario implements ViewGenerator<UsuarioView> {

	@Column(name = "dni")
	private String dni;
	@Embedded
	@AttributeOverrides({ 
		@AttributeOverride(name = "latitud", column = @Column(name = "latitud_usuario")),
		@AttributeOverride(name = "longitud", column = @Column(name = "longitud_usuario")) 
	})
	private Coordenada coordenada;

	public Usuario() {

	}

	public Usuario(String dni, Coordenada coordenada) {
		this.dni = dni;
		this.coordenada = coordenada;
	}

	public Usuario(UsuarioView view) {
		this(view.getDni(), view.getCoordenada() != null ? new Coordenada(view.getCoordenada()) : null);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
		uv.setDni(dni);
		return uv;
	}

}
