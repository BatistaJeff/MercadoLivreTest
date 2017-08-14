package br.com.mercadolivre.marshall;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Properties;

import org.junit.Test;

import br.com.mercadolivre.main.Factory;
import br.com.mercadolivre.util.Prop;

public class GenerationTest {

	@Test
	public void GenerateFullXmlTest() {
		Properties prop = Prop.getProp();
		String path = prop.getProperty("name.file.root");
		File file = new File(path);
		Factory factory = new Factory();
		factory.process();
		
		assertEquals(Boolean.TRUE, file.exists());
		
	}
	
}
