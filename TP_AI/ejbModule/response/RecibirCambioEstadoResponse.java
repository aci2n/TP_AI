package response;

public class RecibirCambioEstadoResponse {
	private String idOrden;
	private String mensaje;

	public RecibirCambioEstadoResponse(String idOrden, String mensaje) {
		this.idOrden = idOrden;
		this.mensaje = mensaje;
	}

	public String getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(String idOrden) {
		this.idOrden = idOrden;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
