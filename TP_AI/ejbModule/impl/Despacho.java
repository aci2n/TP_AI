package impl;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Despachos")
public class Despacho extends PersistentObject {
	private static final long serialVersionUID = 1L;

	@Embedded
	private Coordenada coordenada;
	@Column(name = "activo")
	private boolean activo;

	public Despacho() {

	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
