package bean;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@LocalBean
@Path("/articulos")
public class ArticulosWebService {

	@EJB
	private ArticulosBean articulos;

	public ArticulosWebService() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/bestSellers")
	public String getBestSellers() {
		return articulos.getBestSellers();
	}

}
