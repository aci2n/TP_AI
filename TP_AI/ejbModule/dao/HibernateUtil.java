package dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import impl.Articulo;
import impl.Coordenada;
import impl.Despacho;
import impl.Detalle;
import impl.ItemArticulo;
import impl.OrdenDespacho;
import impl.Usuario;
import impl.Venta;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;

	static {
		try {
			Configuration config = new Configuration()
				.addAnnotatedClass(Articulo.class)
				.addAnnotatedClass(Coordenada.class)
				.addAnnotatedClass(Despacho.class)
				.addAnnotatedClass(Detalle.class)
				.addAnnotatedClass(ItemArticulo.class)
				.addAnnotatedClass(OrdenDespacho.class)
				.addAnnotatedClass(Usuario.class)
				.addAnnotatedClass(Venta.class);
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionFactory = config.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}