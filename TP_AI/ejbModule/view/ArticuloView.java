package view;

import java.util.List;

import entity.Articulo;

public class ArticuloView implements View<Articulo> {
	private String nombre;
	private int codigo;
	private String descripcion;
	private String marca;
	private double precio;
	private String pathFoto;
	private String origen;
	private List<DetalleView> detalles;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPathFoto() {
		return pathFoto;
	}

	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public List<DetalleView> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleView> detalles) {
		this.detalles = detalles;
	}

}
