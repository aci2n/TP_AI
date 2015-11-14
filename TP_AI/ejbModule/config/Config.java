package config;

import java.io.IOException;
import java.util.Properties;

public final class Config {

	private static final Properties properties;

	static {
		try {
			properties = new Properties();
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static String getSetting(String key) {
		return properties.getProperty(key);
	}

	public static Integer getSettingAsInt(String key) {
		return Integer.parseInt(getSetting(key));
	}

	public static void setSetting(String key, String value) {
		properties.setProperty(key, value);
	}

	public static String tryGetSetting(String key) {
		try {
			return getSetting(key);
		} catch (Exception e) {
			return null;
		}
	}
}