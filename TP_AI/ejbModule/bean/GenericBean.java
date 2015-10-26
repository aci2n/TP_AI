package bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import entity.PersistentObject;
import exception.NoExisteException;
import exception.PersistException;

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
	
	protected Integer save(PersistentObject obj) throws PersistException {
		try {
			em.persist((T) obj);
			em.flush();
		} catch (Exception e) {
			throw new PersistenceException("No se pudo persistir la entidad. Excepcion: " + e.getMessage());
		}
		
		Integer id = obj.getId();
		if (id == null) {
			throw new PersistException("No se pudo persistir la entidad");
		}
		return id;
	}

	protected List<T> getAll() {
		return (List<T>) em.createNamedQuery("from " + type.getName()).getResultList();
	}
	
	protected List<T> executeQuery(String query) {
		return (List<T>) em.createNamedQuery(query).getResultList();
	}
}
