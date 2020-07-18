package com.huseyinaydin.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "musteri")
public class MusteriXml {
	private String adi,bilgi;

	public MusteriXml() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MusteriXml(String adi, String bilgi) {
		super();
		this.adi = adi;
		this.bilgi = bilgi;
	}

	@XmlElement
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@XmlElement
	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}
	
	
}
