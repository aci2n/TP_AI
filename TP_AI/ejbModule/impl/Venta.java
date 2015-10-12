package impl;

import java.util.Date;
import java.util.List;

public class Venta extends PersistentObject {
	private static final long serialVersionUID = 1L;

	private List<ItemArticulo> articulos;
	private Date fecha;
	private String portal;
	private double total;
	private Coordenada destino;
	private OrdenDespacho orden;
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
