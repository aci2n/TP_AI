package ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import bean.LogBean;
import entity.ExceptionLog;
import view.LogView;

@Stateless
@WebService
public class LogWebService {

	@EJB
	private LogBean logs;

	public LogWebService() {

	}

	@WebMethod
	public boolean registrarInforme(LogView log) {
		try {
			logs.log(log.getModulo(), log.getDescripcion(), log.getFecha());
			return true;
		} catch (Exception ex) {
			logs.logException(new ExceptionLog(ex));
			return false;
		}
	}

}
