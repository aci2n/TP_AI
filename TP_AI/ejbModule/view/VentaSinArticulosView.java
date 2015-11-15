package view;

import java.util.Date;

public class VentaSinArticulosView {
	private int id;
	private String codigo;
	private Date fecha;
	private String portal;
	private double total;
	private CoordenadaView destino;
	private OrdenDespachoView orden;
	private UsuarioView usuario;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
