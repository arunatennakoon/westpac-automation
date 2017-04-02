package nz.co.westpac.automation.famework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	private static Properties config = null;

	private Configuration() { 

	}

	/**
	 * This method returns the configuration instance
	 * @return Configuration 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */ 
	public static Properties getInstance( ) throws FileNotFoundException, IOException {
		if(config == null){
			config = new Properties();
			config.load(new FileInputStream("config.cfg"));
		}
		return config;
	}
}
