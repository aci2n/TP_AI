package response;

import java.util.List;

import view.OrdenDespachoActivaView;

public class EnviarOrdenesResponse {
	private List<OrdenDespachoActivaView> ordenes;
	private String mensaje;

	public EnviarOrdenesResponse(List<OrdenDespachoActivaView> ordenes, String mensaje) {
		this.ordenes = ordenes;
		this.mensaje = mensaje;
	}

	public List<OrdenDespachoActivaView> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<OrdenDespachoActivaView> ordenes) {
		this.ordenes = ordenes;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
