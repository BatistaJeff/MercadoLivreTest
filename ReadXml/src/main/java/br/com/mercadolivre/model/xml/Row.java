package br.com.mercadolivre.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="row")
@XmlAccessorType(XmlAccessType.FIELD)
public class Row {

	@XmlElement(name="title")
	private String title;
	
	@XmlElement(name="description")
	private String description;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Row [Title=" + title + ", description=" + description + "]";
	}
	
}
