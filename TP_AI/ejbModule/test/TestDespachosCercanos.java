package test;

import admin.ControladorPrincipal;
import dao.DespachoDAO;
import impl.Coordenada;
import impl.Despacho;
import util.Utilities;
import view.DespachoCercanoView;

public class TestDespachosCercanos {

	public static void main(String[] args) {
		try {
			Despacho d1 = new Despacho();
			Coordenada c1 = new Coordenada();
			c1.setLatitud(2);
			c1.setLongitud(2);
			d1.setCoordenada(c1);
			d1.setActivo(true);
			
			Despacho d2 = new Despacho();
			Coordenada c2 = new Coordenada();
			c2.setLatitud(2);
			c2.setLongitud(2);
			d2.setCoordenada(c2);
			d2.setActivo(true);
			
			Coordenada c3 = new Coordenada();
			c3.setLatitud(5);
			c3.setLongitud(5);
			
			DespachoDAO dDao = new DespachoDAO();
			dDao.insert(d1);
			dDao.insert(d2);
			
			Utilities.printList(ControladorPrincipal.getInstancia().obtenerDespachoMasCercano(c3), DespachoCercanoView.class);
			
			dDao.delete(d1);
			dDao.delete(d2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}

	}

}
