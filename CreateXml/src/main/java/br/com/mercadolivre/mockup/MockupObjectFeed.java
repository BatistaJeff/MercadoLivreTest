package br.com.mercadolivre.mockup;

import java.util.ArrayList;
import br.com.mercadolivre.model.xml.Feed;
import br.com.mercadolivre.model.xml.Row;

/**
 * Essa classe é resonsavel por mockar, criar dados falsos
 * @author Jefferson
 */
public class MockupObjectFeed {

	private ArrayList<Row> rows = new ArrayList<Row>();
	
	private Feed feed = new Feed();;

	public Feed returnObjectMockup() {

		System.out.println("==> Generate fake");
		System.out.println("==> Start process... ");
		System.out.println("==> ...Wait Please");
		
		returnListRow();
		
		System.out.println("==> End process dada fake ");
		
		feed.setRow(rows);
		
		return feed;
	}
	
	//Metodo responsavel pela gera��o de dados fake
	public void returnListRow() {
	
		Row row;
		
		for (int x = 0; x < 50 ; x ++) {
			
			for (int i = 0; i < 10000; i++) {
				row = new Row();
				row.setTitle("Title " + i);
				row.setDescription("Description " + i);
				rows.add(row);
			}
			for (int y = 0; y < 10000; y++) {
				row = new Row();
				row.setTitle("Title " + y);
				row.setDescription("Description " + y);
				rows.add(row);
			}
			for (int w = 0; w < 10000; w++) {
				row = new Row();
				row.setTitle("Title " + w);
				row.setDescription("Description " + w);
				rows.add(row);
			}
			for (int z = 0; z < 10000; z++) {
				row = new Row();
				row.setTitle("Title " + z);
				row.setDescription("Description " + z);
				rows.add(row);
			}
			for (int e = 0; e < 10000; e++) {
				row = new Row();
				row.setTitle("Title " + e);
				row.setDescription("Description " + e);
				rows.add(row);
			}
		}
		
		System.out.println("==> Datas fake: number " + rows.size());
			
		System.gc();
		
	}
}
