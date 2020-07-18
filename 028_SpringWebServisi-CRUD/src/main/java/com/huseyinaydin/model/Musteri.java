package com.huseyinaydin.model;

public class Musteri {
	private long musteriId;
	private String musteriAdi;
	private String musteriSoyadi;
	private int yasi;
	private double maasi;
	public Musteri() {
		super();
		this.musteriId = 0;
		this.musteriAdi = "";
		this.musteriSoyadi = "";
		this.yasi = 0;
		this.maasi = 0;
	}
	
	public Musteri(long musteriId, String musteriAdi, String musteriSoyadi, int yasi, double maasi) {
		super();
		this.musteriId = musteriId;
		this.musteriAdi = musteriAdi;
		this.musteriSoyadi = musteriSoyadi;
		this.yasi = yasi;
		this.maasi = maasi;
	}

	public long getMusteriId() {
		return musteriId;
	}
	public void setMusteriId(long musteriId) {
		this.musteriId = musteriId;
	}
	public String getMusteriAdi() {
		return musteriAdi;
	}
	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}
	public String getMusteriSoyadi() {
		return musteriSoyadi;
	}
	public void setMusteriSoyadi(String musteriSoyadi) {
		this.musteriSoyadi = musteriSoyadi;
	}
	public int getYasi() {
		return yasi;
	}
	public void setYasi(int yasi) {
		this.yasi = yasi;
	}
	public double getMaasi() {
		return maasi;
	}
	public void setMaasi(double maasi) {
		this.maasi = maasi;
	}

	@Override
	public String toString() {
		return "Musteri [musteriId=" + musteriId + ", musteriAdi=" + musteriAdi + ", musteriSoyadi=" + musteriSoyadi
				+ ", yasi=" + yasi + ", maasi=" + maasi + "]";
	}
}
