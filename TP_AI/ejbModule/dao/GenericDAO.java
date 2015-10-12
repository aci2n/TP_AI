package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GenericDAO<T> {
	protected static final SessionFactory sf = HibernateUtil.getSessionFactory();
	private final Class<T> type;

	public GenericDAO(Class<T> type) {
		this.type = type;
	}

	public T get(Integer id) {
		Session session = sf.openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		T obj = (T) session.get(type, id);
		session.close();
		return obj;
	}

	public Integer insert(T obj) {
		Integer id = null;
		Session session = sf.openSession();
		session.beginTransaction();
		id = (Integer) session.save(obj);
		session.getTransaction().commit();
		session.close();
		return id;
	}

	public void update(T obj) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(obj);
		session.getTransaction().commit();
		session.close();
	};

	public void delete(T obj) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(obj);
		session.getTransaction().commit();
		session.close();
	}
}
