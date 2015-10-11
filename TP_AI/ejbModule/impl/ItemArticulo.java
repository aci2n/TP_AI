package impl;

public class ItemArticulo extends PersistentObject {
	private static final long serialVersionUID = 1L;

	private Articulo articulo;
	private int cantidad;

	private ItemArticulo() {

	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
