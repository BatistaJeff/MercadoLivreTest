package br.com.mercadolivre.unmarshall;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.junit.Test;

import br.com.mercadolivre.main.Factory;
import br.com.mercadolivre.util.Prop;

public class GenerationTest {

	@Test
	public void GenerateFullXmlTest() {
		
		Factory factory = new Factory();
//		factory.process();
		
		String valueOne = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
		
		String valueTwo = captureValue();
		
		assertEquals(valueOne, valueTwo);
	}

	private String captureValue()  {
		
		Properties prop = Prop.getProp();
		String path = prop.getProperty("name.file.root");
		File file = new File(path);
		String linha = null;
		InputStream inputStream;
		try {
			
			inputStream = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			linha = bufferedReader.readLine();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return linha;
	}
	
}
