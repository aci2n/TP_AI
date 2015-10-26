package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import view.VentaView;

@Entity
@Table(name = "Ventas")
@XmlRootElement
public class Venta extends PersistentObject implements ViewGenerator<VentaView> {
	private static final long serialVersionUID = 1L;

	@OneToMany
	@JoinColumn(name = "id_articulo")
	private List<ItemArticulo> articulos;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "portal")
	private String portal;
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "total")
	private double total;
	@Embedded
	private Coordenada destino;
	@Embedded
	private OrdenDespacho orden;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Venta() {
		
	}
	
	public Venta(VentaView view) {
		this(
			view.getCodigo(),
			view.getFecha(),
			view.getPortal(),
			view.getTotal(),
			view.getDestino() != null ? new Coordenada(view.getDestino()) : null,
			view.getUsuario() != null ? new Usuario(view.getUsuario()) : null,
			view.getOrden() != null ? new OrdenDespacho(view.getOrden()) : null
		);
	}

	public Venta(String codigo, Date fecha, String portal, double total, Coordenada destino, Usuario usuario, OrdenDespacho orden) {
		this.fecha = fecha;
		this.portal = portal;
		this.total = total;
		this.destino = destino;
		this.usuario = usuario;
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
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void asignarDespacho(Despacho despacho) {
		this.orden = new OrdenDespacho(despacho, Estado.ACTIVO);
	}

	public VentaView getView() {
		VentaView vv = new VentaView();
		vv.setArticulos(new ArrayList<>());
		for (ItemArticulo a : articulos) {
			vv.getArticulos().add(ViewUtil.getViewChecked(a));
		}
		vv.setDestino(ViewUtil.getViewChecked(destino));
		vv.setFecha(fecha);
		vv.setOrden(ViewUtil.getViewChecked(orden));
		vv.setPortal(portal);
		vv.setTotal(total);
		vv.setUsuario(ViewUtil.getViewChecked(usuario));
		return vv;
	}

}
