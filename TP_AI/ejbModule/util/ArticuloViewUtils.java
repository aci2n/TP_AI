package util;

import entity.Articulo;
import view.ArticuloView;

public class ArticuloViewUtils implements ViewUtils<Articulo, ArticuloView> {

	@Override
	public Articulo fromView(ArticuloView view) {
		Articulo articulo = new Articulo();
		articulo.setCodigo(view.getCodigo());
		articulo.setDescripcion(view.getDescripcion());
		articulo.setMarca(view.getMarca());
		articulo.setNombre(view.getNombre());
		articulo.setOrigen(view.getOrigen());
		articulo.setPathFoto(view.getPathFoto());
		articulo.setPrecio(view.getPrecio());
		return articulo;
	}

	
}
