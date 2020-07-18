package com.huseyinaydin.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author Hüseyin Aydýn
 * @since 22.06.2020
 * @verison 1.0
 **/
public class MusteriJson {
	private String adi,bilgi;

	public MusteriJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MusteriJson(String adi, String bilgi) {
		super();
		this.adi = adi;
		this.bilgi = bilgi;
	}
	
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}
}
