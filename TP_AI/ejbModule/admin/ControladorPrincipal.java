package admin;

import java.util.List;

import exception.DespachoException;
import exception.VentaException;
import impl.Coordenada;
import impl.Despacho;
import impl.Venta;
import view.DespachoCercanoView;

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

	public List<DespachoCercanoView> obtenerDespachoMasCercano(Coordenada coordenada) throws DespachoException {
		return despachoAdmin.obtenerDespachosCercanos(coordenada);
	}

	public void asignarDespachoAVenta(Integer idDespacho, Integer idVenta) throws DespachoException, VentaException {
		Despacho d = despachoAdmin.get(idDespacho);
		Venta v = ventaAdmin.get(idVenta);
		// ordenDespachoAdmin.asignarDespachoAVenta(d, v);
	}
}
