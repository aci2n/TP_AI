package exceptionlogger;

public class ExceptionLogger {
	private static final ExceptionLogDAO dao = new ExceptionLogDAO();

	public static void log(Exception e) {
		ExceptionLog log = new ExceptionLog(e);
		dao.insert(log);
		System.out.println(String.format("Excepcion del tipo %s loggeada: %s", log.getTipo(), log.getMensaje()));
	}
}
