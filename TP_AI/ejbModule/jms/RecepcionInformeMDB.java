package jms;

import java.lang.reflect.Type;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.google.gson.reflect.TypeToken;

import bean.GenericBean;
import entity.Log;

@MessageDriven(name = "RecepcionDeInformesMDB", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/MailQueue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class RecepcionInformeMDB extends GenericBean<Log> implements MessageListener {

	public RecepcionInformeMDB() {
		super(Log.class);
	}

	public void onMessage(Message message) {

		TextMessage json = (TextMessage) message;
		try {
			// Convert JSON String to List
			Type type = new TypeToken<List<Log>>() {
			}.getType();
			List<Log> logs = gson.fromJson(json.getText(), type);
			Logger.getAnonymousLogger().info("Informes recibidos: " + logs.size());

			for (Log l : logs) {
				save(l);
			}
		} catch (Exception e) {
			logException(e);
		}

	}

}
