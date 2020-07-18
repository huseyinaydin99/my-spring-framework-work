package com.huseyinaydin;

import org.springframework.beans.factory.annotation.Required;

public class Adres {
	
	private String acikAdresBilgisi;

	public String getAcikAdresBilgisi() {
		return acikAdresBilgisi;
	}

	@Required//bu alana injection zorunlu
	public void setAcikAdresBilgisi(String acikAdresBilgisi) {
		this.acikAdresBilgisi = acikAdresBilgisi;
	}

	@Override
	public String toString() {
		return "Adres [acikAdresBilgisi=" + acikAdresBilgisi + "]";
	}
	
	
}
