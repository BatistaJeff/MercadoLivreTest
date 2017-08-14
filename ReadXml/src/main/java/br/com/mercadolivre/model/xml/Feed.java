package br.com.mercadolivre.model.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="feed")
@XmlAccessorType(XmlAccessType.FIELD)
public class Feed {
	
	@XmlElement(name="row")
	private ArrayList<Row> row = new ArrayList<>();

	public List<Row> getRow() {
		return row;
	}

	public void setRow(ArrayList<Row> row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "Feed [row=" + row + "]";
	}

}
