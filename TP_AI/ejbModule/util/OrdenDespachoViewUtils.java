package util;

import entity.Despacho;
import entity.OrdenDespacho;
import view.DespachoView;
import view.OrdenDespachoView;


public class OrdenDespachoViewUtils implements ViewUtils<OrdenDespacho, OrdenDespachoView> {

	@Override
	public OrdenDespacho fromView(OrdenDespachoView view) {
		OrdenDespacho o = new OrdenDespacho();
		o.setEstado(view.getEstado());
		DespachoView dView = view.getDespacho();
		if (dView != null) {
			DespachoViewUtils utils = new DespachoViewUtils();
			Despacho despacho = utils.fromView(dView);
			o.setDespacho(despacho);
		}
		return o;
	}

}
