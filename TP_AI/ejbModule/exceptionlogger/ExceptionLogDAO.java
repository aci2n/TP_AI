package exceptionlogger;

import dao.GenericDAO;

public class ExceptionLogDAO extends GenericDAO<ExceptionLog> {
	
	public ExceptionLogDAO() {
		super(ExceptionLog.class);
	}
}
