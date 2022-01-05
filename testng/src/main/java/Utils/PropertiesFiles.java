package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFiles 
{
	public String properties(String input) throws IOException 
	{
		//Giving inputs in the property file for drivers,website,browser,location and textbox value.
		Properties propertiesFile = new Properties();
		FileInputStream inputStream = new FileInputStream(".\\Test-input\\testData.properties");
		propertiesFile.load(inputStream);
		if(input.equalsIgnoreCase("getBrowser")) {
			return propertiesFile.getProperty("browser");
		}
		else if(input.equalsIgnoreCase("getInputValue")) {
			return propertiesFile.getProperty("TextboxValue");
		}
		else if(input.equalsIgnoreCase("getWebsiteURL")) {
			return propertiesFile.getProperty("url");
		}
		else if(input.equalsIgnoreCase("getInputLocation")) {
			return propertiesFile.getProperty("location");
		}
		else if(input.equalsIgnoreCase("getDriverSetup")) {
			return propertiesFile.getProperty("DriverSetup");
		}
		return null;
		
	}
}
