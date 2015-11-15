package jms;

import java.util.Date;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.ExceptionLog;
import entity.Log;

/**
 * Message-Driven Bean implementation class for: RecepcionInformesMonitorMDB
 */
@MessageDriven(name = "RecepcionInformesMonitorMDB", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/MonitorQueue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class RecepcionInformesMonitorMDB implements MessageListener {

	@PersistenceContext(unitName = "CRM")
	private EntityManager em;

	public RecepcionInformesMonitorMDB() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see MessageListener#onMessage(Message)
	 */
	public void onMessage(Message message) {

		TextMessage msg = (TextMessage) message;
		String mensaje = null;
		try {

			mensaje = msg.getText();
			String[] mensajes = mensaje.split("_");
			String idModulo = mensajes[0];
			String descripcion = mensajes[1];
			Log l = new Log(idModulo, descripcion, new Date());
			em.persist(l);

		} catch (Exception e) {
			em.persist(new ExceptionLog(e));
		}

	}

}
