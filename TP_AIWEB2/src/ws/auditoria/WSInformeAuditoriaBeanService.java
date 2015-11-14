package ws.auditoria;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@WebService
public class WSInformeAuditoriaBeanService {

	@WebMethod
	public boolean agregarInforme(LogDTO log) {
		throw new NotImplementedException();
	}

}
