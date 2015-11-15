package rest;

public class EnviarOrdenesResponse {
	private String ordenes;
	private String mensaje;

	public EnviarOrdenesResponse(String ordenes, String mensaje) {
		this.ordenes = ordenes;
		this.mensaje = mensaje;
	}

	public String getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(String ordenes) {
		this.ordenes = ordenes;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
