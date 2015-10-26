package util;

import entity.Articulo;
import entity.ItemArticulo;
import view.ArticuloView;
import view.ItemArticuloView;

public class ItemArticuloViewUtils implements ViewUtils<ItemArticulo, ItemArticuloView> {

	@Override
	public ItemArticulo fromView(ItemArticuloView view) {
		ItemArticulo ia = new ItemArticulo();
		ia.setCantidad(view.getCantidad());
		ArticuloView aView = view.getArticulo();
		if (aView != null) {
			ArticuloViewUtils utils = new ArticuloViewUtils();
			Articulo articulo = utils.fromView(aView);
			ia.setArticulo(articulo);
		}
		return ia;
	}

	
}
