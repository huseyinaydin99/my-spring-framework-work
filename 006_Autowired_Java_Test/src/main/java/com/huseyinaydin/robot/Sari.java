package com.huseyinaydin.robot;

import org.springframework.stereotype.Component;

@Component("sariBas")
public class Sari implements Bas {

	public void olustur() {
		System.out.println("Sarı baş eklendi");
	}

	

}
