package view;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DespachoCercanoView {
	private int id;
	private String nombre;
	private double distancia;

	public DespachoCercanoView() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

}
