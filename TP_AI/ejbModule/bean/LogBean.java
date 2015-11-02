package bean;

import java.util.Date;

import javax.ejb.Stateless;

import entity.Log;
import exception.PersistException;

@Stateless
public class LogBean extends GenericBean<Log> {

	public LogBean() {
		super(Log.class);
	}
	
	
	public void log(String modulo, String descripcion, Date fecha) throws PersistException {
		Log log = new Log();
		log.setModulo(modulo);
		log.setDescripcion(descripcion);
		log.setFecha(fecha);
		save(log);
	}
	
	public void log(String modulo, String descripcion) throws PersistException {
		log(modulo, descripcion, new Date());
	}

}
