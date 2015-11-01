package view;

import entity.Estado;

public class OrdenDespachoView {
	private Integer id;
	private DespachoView despacho;
	private Estado estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
