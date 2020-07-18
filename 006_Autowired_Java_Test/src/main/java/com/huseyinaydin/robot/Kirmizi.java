package com.huseyinaydin.robot;

import org.springframework.stereotype.Component;

@Component("kirmiziBas")
public class Kirmizi implements Bas {

	public void olustur() {
		System.out.println("Kırmızı baş eklendi");
	}

}
