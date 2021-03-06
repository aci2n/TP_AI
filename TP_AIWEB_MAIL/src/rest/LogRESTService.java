package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.LogBean;



@Stateless
@Path("/logEmail")
public class LogRESTService {

	@EJB
	private LogBean logBean;

	public LogRESTService() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/all")
	public String getLogs() {
		
		return logBean.getLogsMail();
	}
	
}
