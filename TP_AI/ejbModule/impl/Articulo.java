package impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Articulos")
public class Articulo extends PersistentObject {
	private static final long serialVersionUID = 1L;

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "marca")
	private String marca;
	@Column(name = "precio")
	private double precio;
	@Column(name = "pathFoto")
	private String pathFoto;
	@Column(name = "origen")
	private String origen;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_articulo")
	private List<Detalle> detalles;

	public Articulo() {
	}

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

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

}
