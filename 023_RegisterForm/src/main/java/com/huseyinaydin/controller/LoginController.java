package com.huseyinaydin.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.huseyinaydin.model.Kullanici;
import com.huseyinaydin.validation.RegisterValidation;
/*
 CREATE - POST
 READ - GET
 UPDATE - PUT
 DELETE - DELELTE
 */
@Controller
@RequestMapping("/loginform.html")
public class LoginController {
	
	/*@Autowired
	@Qualifier("registerValidation")*/
	private RegisterValidation registerValidation;
	
	@RequestMapping(method = RequestMethod.GET)
	public String gosterLoginForm(Map<String, Kullanici> model) {
		Kullanici kullanici = new Kullanici();
		model.put("kullanici", kullanici);
		return "loginform";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView denetleLoginForm(@Valid Kullanici kullanici,BindingResult bindingResult) {
		registerValidation = new RegisterValidation();
		ModelAndView modelAndView = new ModelAndView("basarili");
		ModelAndView modelAndView2 = new ModelAndView("loginform");
		System.out.println("denetle çalýþtý");
		System.out.println(kullanici);
		String kullaniciAdi = "user";
		String sifre = "8";
		registerValidation.validate(kullanici, bindingResult);
		if(bindingResult.hasErrors())
			return modelAndView2;
		//kullanici = model.get("kullanici");
		System.out.println("---");
		System.out.println(kullanici);
		if(!kullanici.getKullaniciAdi().equals(kullaniciAdi) || !kullanici.getSifre().equals(sifre)) {
			System.out.println("kullanýcý adý veya þifre hatalý");
			return modelAndView2;
		}
		else
			System.out.println("Giriþ baþarýlý");
		modelAndView.addObject("kullanici",kullanici);
		return modelAndView;
	}

	/*public RegisterValidation getRegisterValidation() {
		return registerValidation;
	}

	public void setRegisterValidation(RegisterValidation registerValidation) {
		this.registerValidation = registerValidation;
	}*/
}
