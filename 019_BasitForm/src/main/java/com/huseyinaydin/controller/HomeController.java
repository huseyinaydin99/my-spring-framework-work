package com.huseyinaydin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.huseyinaydin.model.Kullanici;
/*
 CREATE - POST
 READ - GET
 UPDATE - PUT
 DELETE - DELELTE
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public void basitForm(Model model) {
		System.out.println("basitForm metodu çalýþtý");
		model.addAttribute(new Kullanici());
	}
	
	@RequestMapping(value = "/sonuc.html", method = RequestMethod.POST)
	public void sonuc(@ModelAttribute Kullanici kullanici,Model model) {
		System.out.println("sonuc metodu çalýþtý");
		model.addAttribute("kullanici",kullanici);
	}
}
