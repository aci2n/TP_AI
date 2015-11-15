package bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.PersistenceException;

import entity.Modulo;
import exception.NoExisteException;
import exception.PersistException;

@Stateless
@LocalBean
@SuppressWarnings("unchecked")
public class ModulosBean extends GenericBean<Modulo> {

	public ModulosBean() {
		super(Modulo.class);
	}

	public List<Modulo> getMiConfiguracion() {

		List<Modulo> modulos = null;
		try {
			modulos = (List<Modulo>) em.createQuery("select m from Modulo m").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modulos;
	}

	public void deleteMiConfiguracion(String ip) {

		Modulo m = (Modulo) em.createQuery("select m from Modulo m where m.ip = ?").setParameter(1, ip)
				.getSingleResult();
		em.remove(m);
	}

	public Integer save(Modulo modulo) throws PersistException {
		try {
			em.persist(modulo);
			em.flush();
		} catch (Exception e) {
			throw new PersistenceException("No se pudo persistir la entidad. Excepcion: " + e.getMessage());
		}

		Integer id = modulo.getId();
		if (id == null) {
			throw new PersistException("No se pudo persistir la entidad");
		}
		return id;
	}

	public String getUrlPortal(int id) throws NoExisteException {
		List<Object> results = em.createQuery("select ip from Modulo where modulo = entity.Modulos.Portal and id = :id")
				.setParameter("id", id).getResultList();
		if (results.size() > 0) {
			return (String) results.get(0);
		} else {
			throw new NoExisteException(String.format("No se encontro la url del portal %d.", id));
		}
	}

	public void setMiConfiguracion(Modulo m) {
		// TODO Auto-generated method stub

	}

}