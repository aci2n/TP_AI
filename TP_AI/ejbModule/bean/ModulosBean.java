package bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entity.Modulo;
import entity.Modulos;
import exception.NoExisteException;

@Stateless
@LocalBean
@SuppressWarnings("unchecked")
public class ModulosBean extends GenericBean<Modulo> {

	public ModulosBean() {
		super(Modulo.class);
	}

	public void deleteMiConfiguracion(String ip) {

		Modulo m = (Modulo) em.createQuery("select m from Modulo m where m.ip = ?").setParameter(1, ip)
				.getSingleResult();
		em.remove(m);
	}

	public String getUrlModulo(String codigo, Modulos modulo) throws NoExisteException {
		List<Object> results = em.createQuery("select ip from Modulo where modulo = :modulo and codigo = :codigo")
				.setParameter("codigo", codigo).setParameter("modulo", modulo).getResultList();
		if (!results.isEmpty()) {
			return (String) results.get(0);
		} else {
			throw new NoExisteException(
					String.format("No se encontro la url del modulo del tipo %s con el codigo %s.", modulo.toString(), codigo));
		}
	}

	public void setMiConfiguracion(Modulo m) {
		// TODO Auto-generated method stub

	}

}
