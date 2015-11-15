package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

	public static Date stringToDate(String date, String format) throws ParseException {
		return new SimpleDateFormat(format).parse(date);
	}

	public static String generarMensajeError(Exception e) {
		return String.format("Error: %s", e.getMessage());
	}

	public static String trimString(String str, int max, String trail) {
		return str.length() > max ? str.substring(0, max - trail.length()) + trail : str;
	}

}
