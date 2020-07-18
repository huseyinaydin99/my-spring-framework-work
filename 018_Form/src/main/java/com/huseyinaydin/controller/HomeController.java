package com.huseyinaydin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
 CREATE - POST
 READ - GET
 UPDATE - PUT
 DELETE - DELELTE
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView selamAcilis() {
		String str = "Selamlar Spring MVC";
		return new ModelAndView("home","mesaj",str);
	}
}
