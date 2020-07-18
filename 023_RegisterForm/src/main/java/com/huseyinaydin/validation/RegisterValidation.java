package com.huseyinaydin.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.huseyinaydin.model.Kullanici;

public class RegisterValidation {
	public boolean denetle(Class<?> durum) {
		return Kullanici.class.isAssignableFrom(durum);
	}
	
	public void validate(Object hedef, Errors hatalar) {
		Kullanici kullanici = (Kullanici) hedef;
		ValidationUtils.rejectIfEmptyOrWhitespace(hatalar, "kullaniciAdi", "Kullanýcý adý boþ geçilemez!");
		
		String kullaniciAdi = kullanici.getKullaniciAdi();
		if(kullaniciAdi.length()<1)
			hatalar.rejectValue("kullaniciAdi", "Daha çok bilgi gir!");
	}
}
