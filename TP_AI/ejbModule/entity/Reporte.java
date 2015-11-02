package entity;

import java.util.ArrayList;
import java.util.List;

import view.PortalView;

public class Reporte {
	private List<PortalView> portales;

	public Reporte() {
		portales = new ArrayList<>();
	}

	public PortalView getPortal(String nombre) {
		for (PortalView p : portales) {
			if (p.getNombre().equals(nombre)) {
				return p;
			}
		}
		return null;
	}

	public void agregarVenta(Venta venta) {
		PortalView portal = getPortal(venta.getPortal());
		if (portal == null) {
			portales.add(portal = new PortalView(venta.getPortal()));
		}
		portal.agregarVenta(venta.getView());
	}

	public void ordenar() {
		portales.sort((a, b) -> (int) Math.ceil(b.getTotal() - a.getTotal()));
	}

	public List<PortalView> getPortales() {
		return portales;
	}

	public void setPortales(List<PortalView> portales) {
		this.portales = portales;
	}

}
