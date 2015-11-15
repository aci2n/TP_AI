package portal_stub;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/articulo")
public class Articulo {

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void putStub(String json) {
		System.out.println(json);
	}
}
