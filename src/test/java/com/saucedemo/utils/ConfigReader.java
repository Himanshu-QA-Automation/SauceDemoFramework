package com.saucedemo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	    public String getDataFromConfigReader(String key) {

	        try {
	            FileInputStream fis =
	                    new FileInputStream("./Config.Properties/PropertyText.properties");

	            Properties prop = new Properties();
	            prop.load(fis);

	            return prop.getProperty(key);

	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	}

