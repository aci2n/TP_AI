package view;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VentaView {
	private List<ItemArticuloView> articulos;
	private Date fecha;
	private String portal;
	private double total;
	private CoordenadaView destino;
	private OrdenDespachoView orden;
	private UsuarioView usuario;

	public List<ItemArticuloView> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<ItemArticuloView> articulos) {
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

	public CoordenadaView getDestino() {
		return destino;
	}

	public void setDestino(CoordenadaView destino) {
		this.destino = destino;
	}

	public OrdenDespachoView getOrden() {
		return orden;
	}

	public void setOrden(OrdenDespachoView orden) {
		this.orden = orden;
	}

	public UsuarioView getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioView usuario) {
		this.usuario = usuario;
	}

}
