package view;

import entity.ItemArticulo;

public class ItemArticuloView implements View<ItemArticulo> {
	private ArticuloView articulo;
	private int cantidad;

	public ArticuloView getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloView articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
