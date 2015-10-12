package dao;

import java.util.List;

import impl.Despacho;

public class DespachoDAO extends GenericDAO<Despacho> {

	public DespachoDAO() {
		super(Despacho.class);
	}

	public List<Despacho> getDespachosActivos() {
		return executeQuery("from Despacho where activo = true");
	}
}
