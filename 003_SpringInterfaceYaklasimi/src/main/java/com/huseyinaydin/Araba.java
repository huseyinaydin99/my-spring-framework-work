package com.huseyinaydin;

public class Araba {
	private Yakit yakit;
	
	public Araba(Yakit yakit) {
		super();
		this.yakit = yakit;
	}

	public void calistir() {
		yakit.depo();
		System.out.println("Araba çalıştı");
	}
}
