package impl;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import view.OrdenDespachoView;
import view.ViewUtil;

@Embeddable
public class OrdenDespacho implements ViewGenerator<OrdenDespachoView> {	
	@ManyToOne
	@JoinColumn(name = "id_despacho")
	private Despacho despacho;
	@Column(name = "estado")
	@Enumerated(value = EnumType.STRING)
	private Estado estado;

	public OrdenDespacho() {

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

	public OrdenDespachoView getView() {
		OrdenDespachoView odv = new OrdenDespachoView();
		odv.setDespacho(ViewUtil.getViewChecked(despacho));
		odv.setEstado(estado);
		return odv;
	}
}
