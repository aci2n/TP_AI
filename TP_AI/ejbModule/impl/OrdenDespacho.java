package impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrdenesDespacho")
public class OrdenDespacho extends PersistentObject {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_despacho")
	private Despacho despacho;
	@OneToOne
	@JoinColumn(name = "id_venta")
	private Venta venta;
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

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}
