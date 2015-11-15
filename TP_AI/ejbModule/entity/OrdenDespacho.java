package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import view.OrdenDespachoActivaView;
import view.OrdenDespachoView;

@Entity
@Table(name = "OrdenesDespacho")
public class OrdenDespacho extends PersistentObject implements ViewGenerator<OrdenDespachoView> {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_despacho")
	private Despacho despacho;
	@Column(name = "estado")
	@Enumerated(value = EnumType.STRING)
	private Estado estado;
	@OneToOne(mappedBy = "orden")
	private Venta venta;
	@Basic
	@Column(name = "enviada")
	private Boolean enviada;

	public OrdenDespacho() {

	}

	public OrdenDespacho(Despacho despacho, Estado estado) {
		this.despacho = despacho;
		this.estado = estado;
	}

	public OrdenDespacho(OrdenDespachoView view) {
		this(view.getDespacho() != null ? new Despacho(view.getDespacho()) : null, view.getEstado());
	}

	public Despacho getDespacho() {
		return despacho;
	}

	public void setDespacho(Despacho despacho) {
		this.despacho = despacho;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Boolean getEnviada() {
		return enviada;
	}

	public void setEnviada(Boolean enviada) {
		this.enviada = enviada;
	}

	public OrdenDespachoView getView() {
		OrdenDespachoView odv = new OrdenDespachoView();
		odv.setDespacho(ViewUtil.getViewChecked(despacho));
		odv.setEstado(estado);
		return odv;
	}

	public OrdenDespachoActivaView getOrdenDespachoActivaView() {
		return new OrdenDespachoActivaView(id, venta != null ? venta.getCodigo() : null,
				despacho != null ? despacho.getNombre() : null);
	}
}
