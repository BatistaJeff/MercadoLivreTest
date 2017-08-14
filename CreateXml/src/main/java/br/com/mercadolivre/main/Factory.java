package br.com.mercadolivre.main;

import java.util.Properties;

import br.com.mercadolivre.marshall.MarshallXml;
import br.com.mercadolivre.mockup.MockupObjectFeed;
import br.com.mercadolivre.model.xml.Feed;
import br.com.mercadolivre.util.Prop;

/**
 * Classe responsavel por realizar o processo de recebimento de um objeto via mockup para criação do marshall
 * 
 * @author Jefferson
 */
public class Factory {

	protected Properties prop = Prop.getProp();
	
	public boolean process() {
		
		System.out.println("==> Start process ");
		
		String path = prop.getProperty("name.file.root");
		
		MockupObjectFeed mockupObjectFeed = new MockupObjectFeed();

		MarshallXml xml = new MarshallXml();
		
		Feed feed = mockupObjectFeed.returnObjectMockup();
		
		xml.MarshallObject(feed, path);
			
		return true;
	}
	
}
