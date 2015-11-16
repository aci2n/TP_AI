package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import entity.Coordenada;
import entity.Despacho;
import entity.Venta;
import view.DespachoView;
import view.VentaDespachoRecomendadoView;

@Stateless
public class DespachosBean extends GenericBean<Despacho> {

	public DespachosBean() {
		super(Despacho.class);
	}

	public List<VentaDespachoRecomendadoView> getVentasDespachoRecomendado(List<Venta> ventas) {
		List<VentaDespachoRecomendadoView> ventasDespachoRecomendado = new ArrayList<>();
		List<Despacho> despachos = executeQuery("from Despacho where coordenada is not null");

		if (!despachos.isEmpty()) {
			for (Venta venta : ventas) {
				Coordenada destino = venta.getDestino();
				Despacho cercano = null;

				for (Despacho despacho : despachos) {
					if (cercano == null || despacho.obtenerDistanciaACoordenada(destino) < cercano.obtenerDistanciaACoordenada(destino)) {
						cercano = despacho;
					}
				}

				ventasDespachoRecomendado.add(new VentaDespachoRecomendadoView(venta.getVentaSinArticulosView(), cercano.getView()));
			}
		}

		return ventasDespachoRecomendado;
	}

	public List<DespachoView> getAllViews() {
		List<Despacho> despachos = getAll();
		List<DespachoView> despachosView = new ArrayList<>();
		for (Despacho d : despachos) {
			despachosView.add(d.getView());
		}
		return despachosView;
	}

}
