package br.com.mercadolivre.marshall;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamResult;

import br.com.mercadolivre.model.xml.Feed;

/**
 * Esta Classe � responsavel por gerar o XML com base em um objeto. 
 * @author Jefferson
 */
public class MarshallXml {

	//Metodo responsavel por gerar o XML 
	public void MarshallObject(Feed feed, String fileName) {
		
		System.out.println("==> Start process Marshall...");
		System.out.println("==> ...Wait Please");
		Writer writer;

		JAXBContext jaxbContext;

		try {

			jaxbContext = JAXBContext.newInstance(Feed.class);

			Marshaller marshaller = jaxbContext.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter stringWriter = new StringWriter();

			marshaller.marshal(feed, new StreamResult(stringWriter));

			writer = new FileWriter(fileName);

			marshaller.marshal(feed, writer);

		} catch (JAXBException | IOException e) {

			e.printStackTrace();
		}
		
		System.out.println("==> End process Marshall");
		
		System.out.println("==> Create file in : " +fileName);
		
	}
}
