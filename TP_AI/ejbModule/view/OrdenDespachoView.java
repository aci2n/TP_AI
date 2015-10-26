package view;

import entity.Estado;
import entity.OrdenDespacho;

public class OrdenDespachoView implements View<OrdenDespacho> {
	private DespachoView despacho;
	private Estado estado;

	public DespachoView getDespacho() {
		return despacho;
	}

	public void setDespacho(DespachoView despacho) {
		this.despacho = despacho;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
