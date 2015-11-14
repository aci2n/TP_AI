package ws.auditoria;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import bean.LogBean;
import util.Utilities;

@WebService
public class WSInformeAuditoriaBean {
	@EJB
	private LogBean logBean;

	@WebMethod
	public boolean agregarInforme(LogDTO log) {
		try {
			logBean.log(log.getIdModulo(), log.getMensaje(), Utilities.stringToDate(log.getFecha(), "dd-MM-yyyy hh:mm:ss"));
			return true;
		} catch (Exception e) {
			logBean.logException(e);
			return false;
			// throw new RemoteException(Utilities.generarMensajeError(e));
		}
	}
}
