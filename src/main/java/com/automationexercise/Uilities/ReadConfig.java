package com.automationexercise.Uilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	String path = "C:\\Users\\GLB-BLR-031\\Music\\Automation\\config.properties";

	public void config() {
		try {
		prop = new Properties();

		FileInputStream file = new FileInputStream(path);
			
			prop.load(file);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String getApplicationurl(String url) {
		return url = prop.getProperty("url");

	}

	public String getBrowser(String browser) {
		return browser = prop.getProperty("browser");

	}
}
