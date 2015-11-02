package view;

import java.util.ArrayList;
import java.util.List;

public class PortalView {
	private String nombre;
	private List<VentaView> ventas;
	private float total;

	public PortalView(String nombre) {
		this.nombre = nombre;
		ventas = new ArrayList<>();
	}

	public void agregarVenta(VentaView venta) {
		ventas.add(venta);
		total += venta.getTotal();
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<VentaView> getVentas() {
		return ventas;
	}

	public void setVentas(List<VentaView> ventas) {
		this.ventas = ventas;
	}
}
