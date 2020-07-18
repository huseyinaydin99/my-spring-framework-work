package com.huseyinaydin.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
public class DenetlemeController {
	
	@RequestMapping(value = "/form",method = RequestMethod.GET)
	public String denetlemeSayfasi(Map<String, Kullanici> model) {
		System.out.println("denetlemeSayfasi metodu çalýþtý");
		model.put("kullanici", new Kullanici());
		return "denetlemeform";
	}
	
	@RequestMapping(value="/sonuc", method = RequestMethod.POST)
	public String sonucSayfasi(@Valid Kullanici kullanici,BindingResult result,Map<String, Kullanici> model) {
		System.out.println("sonucSayfasi metodu çalýþtý");
		if(result.hasErrors()) {
			return "denetlemeform";
		}
		model.put("kullanici", kullanici);
		return "denetlemebasarili";
	}
}
