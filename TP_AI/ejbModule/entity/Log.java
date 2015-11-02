package entity;

import java.util.Date;

import javax.persistence.Column;

import view.LogView;

public class Log extends PersistentObject implements ViewGenerator<LogView> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4075787279248040309L;

	@Column(name = "modulo")
	private String modulo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "fecha")
	private Date fecha;
	
	
	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public LogView getView() {
		LogView view = new LogView();
		view.setDescripcion(descripcion);
		view.setModulo(modulo);
		view.setFecha(fecha);
		return view;
	}

}
