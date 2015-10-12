package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@SuppressWarnings("unchecked")
public class GenericDAO<T> {
	protected static final SessionFactory sf = HibernateUtil.getSessionFactory();
	private final Class<T> type;

	public GenericDAO(Class<T> type) {
		this.type = type;
	}

	public T get(Integer id) {
		Session session = null;
		try {
			session = sf.openSession();
			return (T) session.get(type, id);
		} finally {
			if (session != null)
				session.close();
		}
	}

	public List<T> getAll() {
		Session session = null;
		try {
			session = sf.openSession();
			return (List<T>) session.createQuery(String.format("from %s", type.getName())).list();
		} finally {
			if (session != null)
				session.close();
		}
	}

	public Integer insert(T obj) {
		Session session = null;
		try {
			Integer id = null;
			session = sf.openSession();
			session.beginTransaction();
			id = (Integer) session.save(obj);
			session.getTransaction().commit();
			return id;
		} finally {
			if (session != null)
				session.close();
		}
	}

	public void update(T obj) {
		Session session = null;
		try {
			session = sf.openSession();
			session.beginTransaction();
			session.update(obj);
			session.getTransaction().commit();
		} finally {
			if (session != null)
				session.close();
		}
	};

	public void delete(T obj) {
		Session session = null;
		try {
			session = sf.openSession();
			session.beginTransaction();
			session.delete(obj);
			session.getTransaction().commit();
		} finally {
			if (session != null)
				session.close();
		}

	}
}
