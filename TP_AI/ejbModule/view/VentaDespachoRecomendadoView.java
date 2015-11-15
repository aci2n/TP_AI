package view;

public class VentaDespachoRecomendadoView {
	private VentaView venta;
	private DespachoView despacho;

	public VentaDespachoRecomendadoView(VentaView venta, DespachoView despacho) {
		this.venta = venta;
		this.despacho = despacho;
	}

	public VentaView getVenta() {
		return venta;
	}

	public void setVenta(VentaView venta) {
		this.venta = venta;
	}

	public DespachoView getDespacho() {
		return despacho;
	}

	public void setDespacho(DespachoView despacho) {
		this.despacho = despacho;
	}

}
