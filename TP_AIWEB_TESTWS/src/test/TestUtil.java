package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import com.monitor.webService.Cliente;
import com.monitor.webService.LogDTO;
import com.monitor.webService.VoVenta;

public class TestUtil {
	public static VoVenta venta() {
		VoVenta venta = new VoVenta();
		venta.setCodigoVenta(ri());
		venta.setEstado("ACTIVO");
		venta.setCliente(cliente());
		venta.setIdPortal(ri());
		venta.setFecha(fecha());
		return venta;
	}

	public static Cliente cliente() {
		Cliente cliente = new Cliente();
		cliente.setApelido(rs());
		cliente.setCoordenada(coordenada());
		cliente.setDni(ri());
		cliente.setIdCliente(ri());
		cliente.setNombre(rs());
		return cliente;
	}

	public static LogDTO log() {
		LogDTO log = new LogDTO();
		log.setFecha(fechaString());
		log.setIdModulo(rs());
		log.setMensaje(rs());
		return log;
	}

	public static Calendar fecha() {
		return Calendar.getInstance();
	}

	public static String fechaString() {
		return new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
	}

	public static String coordenada() {
		return String.format("%f,%f", rd(), rd());
	}

	private static String rs() {
		return UUID.randomUUID().toString();
	}

	private static int ri() {
		return ThreadLocalRandom.current().nextInt(100, 10000 + 1);
	}

	private static double rd() {
		return ri() + Math.random();
	}
}