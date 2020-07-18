package com.huseyinaydin.model;

public class Kullanici {
	private String kullaniciAdi;
	private String sifre;
	private boolean secenek;
	private String cinsiyet;
	
	public boolean isSecenek() {
		return secenek;
	}
	public void setSecenek(boolean secenek) {
		this.secenek = secenek;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
}
