package br.com.mercadolivre.marshall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.crypto.Data;
import javax.xml.transform.stream.StreamResult;

import br.com.mercadolivre.model.xml.Feed;
import br.com.mercadolivre.util.Prop;

/**
 * Esta Classe é responsavel por gerar o XML com base em um objeto. 
 * @author Jefferson
 */
public class UnmarshallXml {

	//Metodo responsavel por gerar o XML 
	public Feed unMarshallObject()  {
		
		System.out.println("==> Start process Marshall...");
		System.out.println("==> ...Wait Please");
		
		Properties prop = Prop.getProp();
		
		String path = prop.getProperty("name.file.root");
		
		JAXBContext jaxbContext;
		
		Feed feed = new Feed();
		
		try {
			
			jaxbContext = JAXBContext.newInstance(Feed.class);
		
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	
			feed = (Feed) unmarshaller.unmarshal(new FileInputStream(path));
			
			System.out.println("==> End process Marshall");
			
			System.out.println("==> Create file in : " +path);
			
		} catch (FileNotFoundException | JAXBException e) {
			e.printStackTrace();
		}
		
		return feed;
	}
}
