package com.huseyinaydin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/market")
public class HomeControllerImpl implements HomeController {
	
	@RequestMapping(value = "/gida",method = RequestMethod.GET)
	@Override
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("duyuru", "Elmalarda %30 indirim var");
		return modelAndView;
	}
}
