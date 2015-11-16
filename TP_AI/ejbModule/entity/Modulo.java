package entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "Modulos")
public class Modulo extends PersistentObject {
	private static final long serialVersionUID = 2005073305585910024L;

	@Enumerated(EnumType.STRING)
	private Modulos modulo;
	private String ip;
	private String port;
	private String cola;
	private boolean activo;
	private Integer codigo;

	public Modulo() {

	}

	public Modulo(Modulos modulo, String ip, String port, String cola, Integer codigo) {

		this.modulo = modulo;
		this.ip = ip;
		this.port = port;
		this.cola = cola;
		this.activo = true;
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Modulos getmodulo() {
		return modulo;
	}

	public void setmodulo(Modulos modulo) {
		this.modulo = modulo;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getCola() {
		return cola;
	}

	public void setCola(String cola) {
		this.cola = cola;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Modulos getModulo() {
		return modulo;
	}

	public void setModulo(Modulos modulo) {
		this.modulo = modulo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
