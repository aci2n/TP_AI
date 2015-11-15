package view;

public class VentaDespachoRecomendadoView {
	private VentaSinArticulosView venta;
	private DespachoView despacho;

	public VentaDespachoRecomendadoView(VentaSinArticulosView venta, DespachoView despacho) {
		this.venta = venta;
		this.despacho = despacho;
	}

	public VentaSinArticulosView getVenta() {
		return venta;
	}

	public void setVenta(VentaSinArticulosView venta) {
		this.venta = venta;
	}

	public DespachoView getDespacho() {
		return despacho;
	}

	public void setDespacho(DespachoView despacho) {
		this.despacho = despacho;
	}

}
