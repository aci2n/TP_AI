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
	@AttributeOverrides({ @AttributeOverride(name = "latitud", column = @Column(name = "latitud_usuario") ),
			@AttributeOverride(name = "longitud", column = @Column(name = "longitud_usuario") ) })
	private Coordenada coordenada;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;

	public Usuario() {

	}

	public Usuario(String dni, Coordenada coordenada, String nombre, String apellido) {
		this.dni = dni;
		this.coordenada = coordenada;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Usuario(UsuarioView view) {
		this(view.getDni(), view.getCoordenada() != null ? new Coordenada(view.getCoordenada()) : null,
				view.getNombre(), view.getApellido());
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

	public UsuarioView getView() {
		UsuarioView uv = new UsuarioView();
		uv.setNombre(nombre);
		uv.setApellido(apellido);
		uv.setCoordenada(ViewUtil.getViewChecked(coordenada));
		uv.setDni(dni);
		return uv;
	}

}
