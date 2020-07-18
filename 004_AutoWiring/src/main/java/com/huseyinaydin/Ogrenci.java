package com.huseyinaydin;

public class Ogrenci {
	private String adi,soyadi;
	private Adres adres;
	
	public Ogrenci(Adres adres) {
		super();
		this.adres = adres;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", adres=" + adres + "]";
	}
	
	
}
