package view;

public class ReporteView {

	private String portal;
	private double total;

	public ReporteView() {

	}

	public ReporteView(String portal, double total) {
		this.portal = portal;
		this.total = total;
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

}
