package test;

import dao.ArticuloDAO;
import impl.Articulo;

public class TestGenericDAO {

	public static void main(String[] args) {
		try {
			ArticuloDAO dao = new ArticuloDAO();
			Articulo a1 = new Articulo();
			a1.setCodigo(1);
			a1.setDescripcion("Esto es un articulo.");
			dao.insert(a1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

}
