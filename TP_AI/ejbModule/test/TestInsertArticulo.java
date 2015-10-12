package test;

import dao.ArticuloDAO;
import impl.Articulo;
import util.Utilities;

public class TestInsertArticulo {

	public static void main(String[] args) {
		try {
			ArticuloDAO dao = new ArticuloDAO();
			Articulo art = new Articulo();
			art.setCodigo(1);
			art.setDescripcion("Esto es un articulo.");
			dao.insert(art);
			Utilities.printList(dao.getAll(), Articulo.class);
			dao.delete(art);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

}
