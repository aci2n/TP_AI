package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.LogBean;

@Stateless
@Path("/logsMonitor")
public class InformesAuditoriaRESTService {

	@EJB
	private LogBean logBean;

	public InformesAuditoriaRESTService() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/all")
	public String getLogs() {
		
		return logBean.getLogsMonitor();
	}
	
}
