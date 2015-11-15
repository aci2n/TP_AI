package rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.ArticulosBean;
import view.BestSellerView;

@Stateless
@Produces({MediaType.APPLICATION_JSON})
@Path("/articulos")
public class ArticulosRESTService {

	@EJB
	private ArticulosBean articulos;

	public ArticulosRESTService() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<BestSellerView> getBestSellers() {
		return articulos.getBestSellers();
	}

}
