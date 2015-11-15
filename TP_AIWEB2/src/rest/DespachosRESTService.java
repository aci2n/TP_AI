package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.DespachosBean;

@Stateless
@Path("/despachos")
public class DespachosRESTService {

	@EJB
	private DespachosBean despachos;

	public DespachosRESTService() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getBestSellers() {
		return despachos.toJson(despachos.getAllViews());
	}

}
