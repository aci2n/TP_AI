package bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import exception.NoExisteException;

@SuppressWarnings("unchecked")
public abstract class GenericBean<T> {
	
	@PersistenceContext(unitName = "CRM")
	protected EntityManager em;	
	private Class<T> type;

	protected GenericBean(Class<T> type) {
		this.type = type;
	}

	protected T get(Integer id) throws NoExisteException {
		T t = em.find(type, id);
		if (t == null) {
			throw new NoExisteException(String.format("No existe el objeto del tipo %s con el ID %s.", type.getName(), id));
		}
		return t;
	}

	protected List<T> getAll() {
		return (List<T>) em.createNamedQuery("from " + type.getName()).getResultList();
	}
	
	protected List<T> executeQuery(String query) {
		return (List<T>) em.createNamedQuery(query).getResultList();
	}
}
