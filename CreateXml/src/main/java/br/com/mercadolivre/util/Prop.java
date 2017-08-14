package br.com.mercadolivre.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {

	
	public static Properties getProp() {
		
		Properties prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream("src/main/resources/text.properties");
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
}
