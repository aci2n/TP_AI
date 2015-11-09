package entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import exception.DespachoException;
import view.DespachoView;
import view.DistanciaADespachoView;

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

	public Despacho(Coordenada coordenada, String nombre, boolean activo) {
		this.coordenada = coordenada;
		this.nombre = nombre;
		this.activo = activo;
	}
	
	public Despacho(DespachoView view) {
		this(
			view.getCoordenada() != null ? new Coordenada(view.getCoordenada()) : null,
			view.getNombre(),
			view.isActivo()
		);
	}

	public DistanciaADespachoView getDistanciaADespachoView(Coordenada c) throws DespachoException {
		if (coordenada == null) {
			throw new DespachoException(
					String.format("El despacho %d no tiene una coordenada asignada.", id));
		}

		DistanciaADespachoView distanciaADespacho = new DistanciaADespachoView();
		distanciaADespacho.setId(id);
		distanciaADespacho.setNombre(nombre);
		distanciaADespacho.setDistancia(coordenada.calcularDistanciaEnKilometros(c));

		return distanciaADespacho;
	}
	
	public double obtenerDistanciaACoordenada(Coordenada c) throws DespachoException {
		if (coordenada == null) {
			throw new DespachoException(String.format("El despacho %d no tiene una coordenada asignada.", id));
		}

		return coordenada.calcularDistanciaEnKilometros(c);
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
