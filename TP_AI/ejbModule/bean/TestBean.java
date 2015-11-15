package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.ejb.Stateless;

import entity.Articulo;
import entity.Coordenada;
import entity.Despacho;
import entity.Detalle;
import entity.PersistentObject;
import entity.Usuario;
import entity.Venta;
import exception.PersistException;

@Stateless
public class TestBean extends GenericBean<PersistentObject> {

	public TestBean() {
		super(PersistentObject.class);
	}

	public interface RandomGenerator<T> {
		public T generateRandom();
	}

	public <T> String generateRandomList(RandomGenerator<T> generator, int cantidad, boolean persist)
			throws PersistException {
		List<T> list = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			T o = generator.generateRandom();
			list.add(o);
			if (persist && o instanceof PersistentObject) {
				save((PersistentObject) o);
			}
		}
		return toJson(list);
	}

	public Articulo articulo() {
		return new Articulo(rs(), ri(), rs(), rs(), rd(), rs(), rs());
	}

	public Venta venta() {
		Venta v = new Venta();
		v.setCodigo(rs());
		v.setDestino(coordenada());
		v.setFecha(new Date());
		v.setPortal(rs());
		v.setTotal(rd());
		v.setUsuario(usuario());
		List<Articulo> articulos = getRandom(Articulo.class, ri(20));
		for (Articulo articulo : articulos) {
			try {
				v.agregarItemArticulo(articulo, ri());
			} catch (Exception e) {
				logException(e);
			}
		}
		return v;
	}

	public Detalle detalle() {
		return new Detalle(rs(), rs());
	}

	public Usuario usuario() {
		return new Usuario(rs(), coordenada(), rs(), rs());
	}

	public Despacho despacho() {
		return new Despacho(coordenada(), rs(), true);
	}

	public Coordenada coordenada() {
		return new Coordenada(rd(), rd());
	}

	private String rs() {
		return UUID.randomUUID().toString();
	}

	private int ri(int max) {
		return ThreadLocalRandom.current().nextInt(0, max + 1);
	}

	private int ri() {
		return ThreadLocalRandom.current().nextInt(100, 10000 + 1);
	}

	private double rd() {
		return ri() + Math.random();
	}

}
