package exception;

public class PersistException extends Exception {
	private static final long serialVersionUID = 1L;

	public PersistException(String mensaje) {
		super(mensaje);
	}
}
