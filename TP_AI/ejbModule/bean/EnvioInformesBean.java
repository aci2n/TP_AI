package bean;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

import com.google.gson.Gson;

import entity.Log;

/**
 * Session Bean implementation class EnvioInformesBean
 */
@Stateless
@LocalBean
public class EnvioInformesBean {

	public EnvioInformesBean() {

	}

	public void enviarInformes(List<Log> logs) {

		String DEFAULT_CONNECTION_FACTORY = "jms/RemoteConnectionFactory";
		String DEFAULT_DESTINATION = "java:/jms/queue/monitorQueue";
		String DEFAULT_USERNAME = "#";
		String DEFAULT_PASSWORD = "guest";
		String INITIAL_CONTEXT_FACTORY = "org.jboss.naming.remote.client.InitialContextFactory";
		String PROVIDER_URL = "http-remoting://localhost:8180";

		ConnectionFactory connectionFactory = null;
		Connection connection = null;
		Session session = null;
		MessageProducer producer = null;
		Destination destination = null;
		TextMessage message = null;
		Context context = null;

		try {
			// Set up the context for the JNDI lookup
			Properties env = new Properties();
			env.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			env.put(Context.PROVIDER_URL, System.getProperty(Context.PROVIDER_URL, PROVIDER_URL));
			env.put(Context.SECURITY_PRINCIPAL, System.getProperty("username", DEFAULT_USERNAME));
			env.put(Context.SECURITY_CREDENTIALS, System.getProperty("password", DEFAULT_PASSWORD));
			context = new InitialContext(env);

			// Perform the JNDI lookups
			String connectionFactoryString = System.getProperty("connection.factory", DEFAULT_CONNECTION_FACTORY);
			connectionFactory = (ConnectionFactory) context.lookup(connectionFactoryString);

			String destinationString = System.getProperty("destination", DEFAULT_DESTINATION);
			destination = (Destination) context.lookup(destinationString);

			// Create the JMS connection, session, producer, and consumer
			connection = connectionFactory.createConnection(System.getProperty("username", DEFAULT_USERNAME),
					System.getProperty("password", DEFAULT_PASSWORD));
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			producer = session.createProducer(destination);
			// consumer = session.createConsumer(destination);
			connection.start();

			String content = new Gson().toJson(logs);
			Logger.getAnonymousLogger().info(content);
			// String content = System.getProperty("message.content",
			// gson.toJson(logs));

			// Send the specified number of messages

			message = session.createTextMessage(content);
			producer.send(message);
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
