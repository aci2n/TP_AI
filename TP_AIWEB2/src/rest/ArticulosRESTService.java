package rest;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.ArticulosBean;

@Stateless
@Path("/articulos")
public class ArticulosRESTService {

	@EJB
	private ArticulosBean articulos;

	public ArticulosRESTService() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/bestsellers")
	public String getBestSellers() {
		return articulos.getBestSellers();
	}

}
