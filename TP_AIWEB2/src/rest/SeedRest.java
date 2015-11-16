package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.ArticulosBean;
import bean.DespachosBean;
import entity.Articulo;
import entity.Coordenada;
import entity.Despacho;
import exception.PersistException;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Path("/Seed")
public class SeedRest {
	private static boolean seeded = false;

	@EJB
	private DespachosBean despachosBean;

	@EJB
	private ArticulosBean articulosBean;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String seed() throws PersistException {
		if (!seeded) {
			seeded = true;
			generarDespachos();
			generarArticulos();
			return "Listo!";
		} else {
			return "Ya se ejecuto el seed!";
		}
	}

	private void generarDespachos() throws PersistException {
		Coordenada c1 = new Coordenada(-34.6166938, -58.3815892);
		Coordenada c2 = new Coordenada(-38.9550088, -68.0633561);
		Coordenada c3 = new Coordenada(-31.4029447, -64.1726701);
		Coordenada c4 = new Coordenada(-32.953529, -60.6715342);

		Despacho d1 = new Despacho(c1, "Despacho 1", true);

		Despacho d2 = new Despacho(c2, "Despacho 2", true);

		Despacho d3 = new Despacho(c3, "Despacho 3", true);

		Despacho d4 = new Despacho(c4, "Despacho 4", true);

		despachosBean.save(d1);
		despachosBean.save(d2);
		despachosBean.save(d3);
		despachosBean.save(d4);
	}

	private void generarArticulos() throws PersistException {
		Articulo a1 = new Articulo("Aire Acondicionado Split WBC 12B-13B 2645 F/C", 1351953,
				"4 modos de operación diferentes: Frío, deshumidificación, ventilación y calor", "Whirlpool", 4633,
				null, "Argentina");
		Articulo a2 = new Articulo("Freezer Horizontal Eternity M210", 1739701, "Capacidad: 202 Lt", "Gafa", 2855, null,
				"Argentina");
		Articulo a3 = new Articulo("Centrifugador QV 5.5", 1755725, "Capacidad maxima: 5.5 kg", "Drean", 749, null,
				"Argentina");
		Articulo a4 = new Articulo("Afeitadora PQ222/17", 1754721,
				"CloseCut, Cabezales flotantes independientes, Hojas autoafilables, Sistema ", "Philips", 199, null,
				"Argentina");
		Articulo a5 = new Articulo("Mini Masajeador Glow X4 MM-100F", 1648970,
				"Masajeador individual que proporciona un suave masaje vibratorio", "Gama", 75, null, "Argentina");
		Articulo a6 = new Articulo("Musculosa Pale", 3122, "Musculosa Basement con Breteles. Celeste. M.", "Basement",
				79, null, "Brasil");
		Articulo a7 = new Articulo("Cartera FIO2003", 1721678,
				"Cartera Combinada con Detalle de Tacha en la Tapa. Negro. Ancho: 26 cm, Alto: 16cm.", "Basement", 99,
				null, "Argentina");
		Articulo a8 = new Articulo("Reloj Negro Hombre", 1741046, "Modelo: MZ-24. Negro. Largo del reloj: 22 cm.",
				"Montreal", 345, null, "Argentina");
		Articulo a9 = new Articulo("Joggin Deportivo", 1456328, "Deporte. Negro. L.", "Nike", 349, null, "Argentina");
		Articulo a10 = new Articulo("Zapatos", 1672839, "Zapato de vestir. Negro", "Harris & Frank", 799, null,
				"Argentina");
		Articulo a11 = new Articulo("Mesa para TV 21'' wengue", 1857363, "Mesa para Tv. MDF.", "Mica", 409, null,
				"Argentina");
		Articulo a12 = new Articulo("Sillon Nahuel 1 Cuerpo Roble Negro", 1660104,
				"Detalles en Almohadónes con botones. Pino clear.", "Mica", 1639, null, "Argentina");
		Articulo a13 = new Articulo("Mesa de PC Básica Mini Wengue 82 x 60 x 39 cm", 1849382,
				"Corredera metálica para bandeja porta teclado. Placa folio 15mm.", "Mica", 369, null, "Argentina");
		Articulo a14 = new Articulo("Juego de Jardín Humbert Chocolate", 1607594, "2 Sofa 1 Cuerpo. Rattan de pvc.",
				"Mica", 329, null, "Argentina");
		Articulo a15 = new Articulo("Banqueta Baja Thonet -c/NG-770", 1802975, "5 Banqueta Baja Thonet. Caño.",
				"Ambienta", 259, null, "Argentina");
		Articulo a16 = new Articulo("Coche Paraguas Gris", 1858018, "Coche Paraguas. 9 meses a 3 años.", "Love", 529,
				null, "China");
		Articulo a17 = new Articulo("Skateboard PRO", 1750150, "Madera con lija. 8 a 14 años.", "Falabella", 399, null,
				"Argentina");
		Articulo a18 = new Articulo("Peluche Smoove Move", 1703083, "Personaje de la película Turbo. 0 a 4 años.",
				"Turbo", 49.9, null, "Argentina");
		Articulo a19 = new Articulo("Cuna de viaje borde roja", 1858031,
				"vibrador, caja de música y luz de noche. 0 a 1 año.", "Love", 1359, null, "Argentina");
		Articulo a20 = new Articulo("Outdoor Pileta Easy Set-up Pool 244 x 66 cm", 1860516,
				"Con paredes laterales adicionales de resistencia, tres capas separadas. 1 a 10 años.", "Falabella",
				999, null, "Argentina");
		Articulo a21 = new Articulo("Pantuflas", 1732244, "Pantuflas Perro Bulldog. 1 a 3 años.", "Yamp", 59, null,
				"Argentina");

		articulosBean.save(a1);
		articulosBean.save(a2);
		articulosBean.save(a3);
		articulosBean.save(a4);
		articulosBean.save(a5);
		articulosBean.save(a6);
		articulosBean.save(a7);
		articulosBean.save(a8);
		articulosBean.save(a9);
		articulosBean.save(a10);
		articulosBean.save(a11);
		articulosBean.save(a12);
		articulosBean.save(a13);
		articulosBean.save(a14);
		articulosBean.save(a15);
		articulosBean.save(a16);
		articulosBean.save(a17);
		articulosBean.save(a18);
		articulosBean.save(a19);
		articulosBean.save(a20);
		articulosBean.save(a21);
	}

	/*
	 * private void generarUsuarios() { Coordenada c1 = new
	 * Coordenada(-34.6179003, -58.3874423); Coordenada c2 = new
	 * Coordenada(-34.6197558, -58.3829695); Coordenada c3 = new
	 * Coordenada(-38.9460399, -68.1277469); Coordenada c4 = new
	 * Coordenada(-38.9472650, -68.1269502); Coordenada c5 = new
	 * Coordenada(-31.4027010, -64.1644477); Coordenada c6 = new
	 * Coordenada(-31.4095871, -64.1653490); Coordenada c7 = new
	 * Coordenada(-32.9585220, -60.6677055); Coordenada c8 = new
	 * Coordenada(-32.9584500, -60.6812667);
	 * 
	 * Usuario u1 = new Usuario("1", c1, "Usuario", "1"); Usuario u2 = new
	 * Usuario("2", c2, "Usuario", "2"); Usuario u3 = new Usuario("3", c3,
	 * "Usuario", "3"); Usuario u4 = new Usuario("4", c4, "Usuario", "4");
	 * Usuario u5 = new Usuario("5", c5, "Usuario", "5"); Usuario u6 = new
	 * Usuario("6", c6, "Usuario", "6"); Usuario u7 = new Usuario("7", c7,
	 * "Usuario", "7"); Usuario u8 = new Usuario("8", c8, "Usuario", "8");
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}
