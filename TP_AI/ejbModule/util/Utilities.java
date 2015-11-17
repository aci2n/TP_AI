package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Utilities {

	public static Date stringToDate(String date, String... formats) throws ParseException {
		for (String format : formats) {
			try {
				return new SimpleDateFormat(format).parse(date);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		throw new ParseException(String.format("No se pudo parsear la fecha: %s", date), 0);
	}

	public static String generarMensajeError(Exception e) {
		return String.format("Error: %s", e.getMessage());
	}

	public static String trimString(String str, int max, String trail) {
		return str.length() > max ? str.substring(0, max - trail.length()) + trail : str;
	}

	public static XMLGregorianCalendar dateToXmlGregorianCalendar(Date date) throws DatatypeConfigurationException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(year, month, day, hour, minute, second));
	}

	public static String normalizarUrl(String url) {
		return url.charAt(url.length() - 1) != '/' ? url += '/' : url;
	}

	public static synchronized void guardarATexto(String texto, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			bw.write(texto);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String dateToString(Date fecha) {
		return new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(fecha);
	}

}
