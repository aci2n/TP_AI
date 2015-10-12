package test;

import dao.DespachoDAO;
import impl.Despacho;
import util.Utilities;

public class TestDespachosActivos {

	public static void main(String[] args) {
		try {
			Utilities.printList(new DespachoDAO().getDespachosActivos(), Despacho.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

}
