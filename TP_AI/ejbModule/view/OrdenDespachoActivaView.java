package view;

public class OrdenDespachoActivaView {
	private Integer id;
	private String codigoVenta;
	private String nombreDespacho;

	public OrdenDespachoActivaView(Integer id, String codigoVenta, String nombreDespacho) {
		this.id = id;
		this.codigoVenta = codigoVenta;
		this.nombreDespacho = nombreDespacho;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(String codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public String getNombreDespacho() {
		return nombreDespacho;
	}

	public void setNombreDespacho(String nombreDespacho) {
		this.nombreDespacho = nombreDespacho;
	}

}
