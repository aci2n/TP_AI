package jms;

import java.lang.reflect.Type;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import bean.LogBean;
import entity.LogMail;

@MessageDriven(name = "RecepcionInformesEmailMDB", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/MailQueue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class RecepcionInformesEmailMDB implements MessageListener {

	@PersistenceContext(unitName = "CRM")
	private EntityManager em; 
	
	@EJB
	private LogBean logBean;
	
	public RecepcionInformesEmailMDB() {
		
	}

	public void onMessage(Message message) {

		TextMessage json = (TextMessage) message;
		try {
			// Convert JSON String to List
			Type type = new TypeToken<List<LogMail>>() {
			}.getType();
			List<LogMail> logs = new Gson().fromJson(json.getText(), type);
			Logger.getAnonymousLogger().info("Informes recibidos: " + logs.size());

			Integer cantLogsMonitor = logBean.getListLogsMonitor().size();
			Integer cantLogsMail = logBean.getListLogsMail().size();
			
			if(cantLogsMonitor > cantLogsMail){
			
				for(int i = cantLogsMail; i < logs.size(); i++){
					em.merge(logs.get(i));
					em.flush();
				}
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
