package rest;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.ArticulosBean;
import bean.ModulosBean;
import entity.Modulos;
import response.BestSellersResponse;
import util.Utilities;
import view.BestSellerView;

@Stateless
@Path("/articulos")
public class ArticulosRESTService {

	@EJB
	private ArticulosBean articulos;
	@EJB
	private ModulosBean modulos;

	public ArticulosRESTService() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<BestSellerView> getBestSellers() {
		return articulos.getBestSellers();
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response enviarBestSellers(@FormParam("id") int id) {
		try {
			String urlString = Utilities.normalizarUrl(modulos.getUrlModulo(id, Modulos.Portal)) + "PortalWEB/rest/articulo";

			URL url = new URL(urlString);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("PUT");
			connection.setRequestProperty(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
			connection.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);

			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
			out.write(articulos.toJson(new BestSellersResponse(articulos.getBestSellers())));
			out.flush();
			out.close();
			connection.getInputStream();

			return Response.status(200).entity(String.format("Ranking de articulos enviados correctamente a %s", urlString)).build();
		} catch (Exception e) {
			return Response.status(400).entity(Utilities.generarMensajeError(e)).build();
		}
	}

}
