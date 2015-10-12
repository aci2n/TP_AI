package impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import view.ItemArticuloView;
import view.ViewUtil;

@Entity
@Table(name = "ItemsArticulo")
public class ItemArticulo extends PersistentObject implements ViewGenerator<ItemArticuloView> {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_articulo")
	private Articulo articulo;
	@Column(name = "cantidad")
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

	public ItemArticuloView getView() {
		ItemArticuloView iav = new ItemArticuloView();
		iav.setArticulo(ViewUtil.getViewChecked(articulo));
		iav.setCantidad(cantidad);
		return iav;
	}
}
