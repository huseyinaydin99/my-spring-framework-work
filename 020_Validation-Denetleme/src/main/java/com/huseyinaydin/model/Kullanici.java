package com.huseyinaydin.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Kullanici {
	@NotNull
	@Size(min = 1,max = 10,message = "Minumum bir karakter maximum 10 karakter girebilirsiniz!")
	private String kullaniciAdi;
	@NotEmpty(message = "Bu alan boþ geçilemez!")
	@NumberFormat(style = Style.NUMBER)
	@Min(1)
	@Max(10)
	private String sifre;
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
	
}
