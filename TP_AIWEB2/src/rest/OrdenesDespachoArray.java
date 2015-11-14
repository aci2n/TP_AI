package rest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenesDespachoArray {
	private List<OrdenDespachoJson> ordenes;

	public List<OrdenDespachoJson> getOrdenes() {
		return ordenes;
	}

	@JsonProperty("OrdenDeDespacho")
	public void setOrdenes(List<OrdenDespachoJson> ordenes) {
		this.ordenes = ordenes;
	}

}
