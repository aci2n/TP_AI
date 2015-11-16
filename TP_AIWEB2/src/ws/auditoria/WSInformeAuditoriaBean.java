package ws.auditoria;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import bean.LogBean;
import util.Utilities;

@WebService(targetNamespace = "http://webService.monitor.com/", name = "WSInformeAuditoriaBean")
public class WSInformeAuditoriaBean {
	@EJB
	private LogBean logBean;

	@WebMethod
	@RequestWrapper(localName = "agregarInforme", targetNamespace = "http://webService.monitor.com/", className = "ws.auditoria.AgregarInforme")
	@ResponseWrapper(localName = "agregarInformeResponse", targetNamespace = "http://webService.monitor.com/", className = "ws.auditoria.AgregarInformeResponse")
	@WebResult(name = "return", targetNamespace = "")
	public boolean agregarInforme(@WebParam(name = "arg0", targetNamespace = "") LogDTO log) {
		try {
			logBean.log(log.getIdModulo(), log.getMensaje(),
					Utilities.stringToDate(log.getFecha(), "dd-MM-yyyy hh:mm:ss", "yyyy-MM-dd'T'hh:mm:ss.SSSZ"));
			return true;
		} catch (Exception e) {
			logBean.logException(e);
			return false;
		}
	}
}
