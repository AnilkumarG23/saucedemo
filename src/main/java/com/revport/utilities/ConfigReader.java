package com.revport.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private static String userDir = System.getProperty("user.dir");

	public static Properties loadProperties(String fileName) {
		File file = new File(userDir + "\\src\\test\\resources\\properties\\" +fileName+ ".properties");
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
		} catch (Exception e) {

		}

		return properties;

	}

	public static String getValue(String fileName, String key) {
		Properties properties = loadProperties(fileName);
		return properties.getProperty(key);
	}
}
