package bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entity.Modulo;

@Stateless
@LocalBean
public class ModuloBean extends GenericBean<Modulo> {

	public ModuloBean() {
		super(Modulo.class);
	}

	public Modulo setMiConfiguracion(Modulo modulo) {
		em.persist(modulo);
		em.flush();
		return modulo;
	}

	public Modulo updateMiConfiguracion(Modulo modulo) {

		Modulo email = em.find(Modulo.class, modulo.getId());
		if (email == null) {
			em.persist(modulo);
		} else {
			email = modulo;
			em.merge(email);
			em.flush();
		}
		return email;
	}

	public Modulo getMiConfiguracion() {

		Modulo m = null;
		try {
			Long count = (Long) em.createQuery("select count(m) from Modulo m").getSingleResult();
			if (count > 0)
				m = (Modulo) em.createQuery("select m from Modulo m where m.modulo = 'Email'").getSingleResult();
		} catch (Exception e) {
			logException(e);
		}
		return m;
	}

	public void deleteMiConfiguracion(String ip) {

		Modulo m = (Modulo) em.createQuery("select m from Modulo m where m.ip = ?").setParameter(1, ip)
				.getSingleResult();
		em.remove(m);
	}

}
