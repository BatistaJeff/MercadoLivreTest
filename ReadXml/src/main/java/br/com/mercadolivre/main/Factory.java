package br.com.mercadolivre.main;

import java.util.Properties;

import br.com.mercadolivre.marshall.UnmarshallXml;
import br.com.mercadolivre.model.xml.Feed;
import br.com.mercadolivre.model.xml.Row;
import br.com.mercadolivre.util.Prop;

/**
 * Classe responsavel por realizar o processo de recebimento de um objeto complexo via unmarshall
 * 
 * @author Jefferson
 */
public class Factory {

	protected Properties prop = Prop.getProp();
	
	public boolean process() {
		
		System.out.println("==> Start process ");
		
		UnmarshallXml xml = new UnmarshallXml();
		
		Feed feed = xml.unMarshallObject();
	
		int i = 1;
		
		for(Row row : feed.getRow()) {
			System.out.println("Row : "+i);
			System.out.println("   tile ==> " + row.getTitle());
			System.out.println("   description ==> " + row.getDescription());
			i++;
		}
			
		return true;
	}
	
}
