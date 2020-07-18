package com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Ogrenci ogrenci = applicationContext.getBean("ogrenci", Ogrenci.class);
		System.out.println(ogrenci);
	}

}
