package admin;

import java.util.List;

import exception.DespachoException;
import exception.VentaException;
import impl.Coordenada;
import impl.Despacho;
import view.DistanciaADespachoView;
import view.VentaView;

public class ControladorPrincipal {
	private static ControladorPrincipal instancia;
	private VentaAdministrador ventaAdmin;
	private DespachoAdministrador despachoAdmin;

	private ControladorPrincipal() {
		ventaAdmin = new VentaAdministrador();
		despachoAdmin = new DespachoAdministrador();
	}

	public static synchronized ControladorPrincipal getInstancia() {
		if (instancia == null)
			instancia = new ControladorPrincipal();
		return instancia;
	}

	public List<VentaView> obtenerVentasSinOrdenDespacho() {
		return ventaAdmin.obtenerVentasSinOrdenDespacho();
	}

	public List<DistanciaADespachoView> obtenerDistanciasADespacho(Coordenada coordenada) throws DespachoException {
		return despachoAdmin.obtenerDistanciasADespacho(coordenada);
	}

	public void asignarDespachoAVenta(Integer idDespacho, Integer idVenta) throws DespachoException, VentaException {
		Despacho despacho = despachoAdmin.get(idDespacho);
		ventaAdmin.asignarDespachoAVenta(idVenta, despacho);
		// notificar despachos
	}
}
