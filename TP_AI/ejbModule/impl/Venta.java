package impl;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ventas")
public class Venta extends PersistentObject {
	private static final long serialVersionUID = 1L;

	@OneToMany
	@JoinColumn(name = "id_articulo")
	private List<ItemArticulo> articulos;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "portal")
	private String portal;
	@Column(name = "total")
	private double total;
	@Embedded
	private Coordenada destino;
	@OneToOne(mappedBy = "venta")
	private OrdenDespacho orden;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Venta() {
	}

	public List<ItemArticulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<ItemArticulo> articulos) {
		this.articulos = articulos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getPortal() {
		return portal;
	}

	public void setPortal(String portal) {
		this.portal = portal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Coordenada getDestino() {
		return destino;
	}

	public void setDestino(Coordenada destino) {
		this.destino = destino;
	}

	public OrdenDespacho getOrden() {
		return orden;
	}

	public void setOrden(OrdenDespacho orden) {
		this.orden = orden;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
