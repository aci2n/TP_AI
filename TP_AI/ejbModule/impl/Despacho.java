package impl;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import view.DespachoCercanoView;
import view.DespachoView;

@Entity
@Table(name = "Despachos")
public class Despacho extends PersistentObject implements ViewGenerator<DespachoView> {
	private static final long serialVersionUID = 1L;

	@Embedded
	private Coordenada coordenada;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "activo")
	private boolean activo;

	public Despacho() {

	}

	public DespachoCercanoView getDespachoCercanoView(Coordenada c) {
		DespachoCercanoView despachoCercano = new DespachoCercanoView();
		despachoCercano.setId(id);
		despachoCercano.setNombre(nombre);
		despachoCercano.setDistancia(coordenada.calcularDistanciaEnKilometros(c));

		return despachoCercano;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DespachoView getView() {
		DespachoView dv = new DespachoView();
		dv.setActivo(activo);
		dv.setCoordenada(ViewUtil.getViewChecked(coordenada));
		dv.setNombre(nombre);
		return dv;
	}

}
