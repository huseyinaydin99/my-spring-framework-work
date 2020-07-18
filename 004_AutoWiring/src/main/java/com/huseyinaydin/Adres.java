package com.huseyinaydin;

public class Adres {
	private String acikAdresBilgisi;

	public String getAcikAdresBilgisi() {
		return acikAdresBilgisi;
	}

	public void setAcikAdresBilgisi(String acikAdresBilgisi) {
		this.acikAdresBilgisi = acikAdresBilgisi;
	}

	@Override
	public String toString() {
		return "Adres [acikAdresBilgisi=" + acikAdresBilgisi + "]";
	}
	
	
}
