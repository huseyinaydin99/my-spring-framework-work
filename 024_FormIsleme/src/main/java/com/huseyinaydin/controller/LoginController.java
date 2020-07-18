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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 CREATE - POST
 READ - GET
 UPDATE - PUT
 DELETE - DELELTE
 */
@Controller
public class LoginController {

	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public String gosterLoginForm() {
		return "loginform";
	}

	@RequestMapping(value = "/sonuc", method = RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam(value = "kullaniciAdi", defaultValue = "selam") String kullaniciAdi,
			@RequestParam(value = "sifre", defaultValue = "8") String sifre) {
		ModelAndView modelAndView = new ModelAndView("basarili");
		modelAndView.addObject("kullanici", kullaniciAdi);
		return modelAndView;
	}

}
