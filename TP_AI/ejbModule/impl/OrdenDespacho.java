package impl;

public class OrdenDespacho extends PersistentObject {
	private static final long serialVersionUID = 1L;

	private Despacho despacho;
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

}
