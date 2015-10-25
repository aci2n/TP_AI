package exception;

public class NoExisteException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoExisteException(String mensaje) {
		super(mensaje);
	}
}
