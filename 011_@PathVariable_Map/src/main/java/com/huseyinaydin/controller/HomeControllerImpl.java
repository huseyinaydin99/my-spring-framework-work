package com.huseyinaydin.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/market")
public class HomeControllerImpl implements HomeController {

	@RequestMapping(value = "/gida/{indirimorani}", method = RequestMethod.GET)
	@Override
	public ModelAndView home(@PathVariable("indirimorani") String oran) {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("duyuru", "Elmalarda %" + oran + " indirim var");
		return modelAndView;
	}

	@RequestMapping(value = "/gida/{tur}/{indirimorani}", method = RequestMethod.GET)
	@Override
	public ModelAndView home(@PathVariable Map<String, String> pathVars) {
		String turu = pathVars.get("tur");
		String oran = pathVars.get("indirimorani");
		ModelAndView modelAndView = new ModelAndView("home");
		if (!sayiDenetimi(oran)) {
			System.out.println("if");
			System.out.println("oran " + oran);
			oran = "0";
			System.out.println("oran " + oran);
		}
		System.out.println("selam oran " + oran);
		modelAndView.addObject("duyuru", turu + " %" + oran + " indirim var");
		return modelAndView;
	}

	public boolean sayiDenetimi(String str) {
		for (char chr : str.toCharArray()) {
			if (!Character.isDigit(chr))
				return false;
		}
		return true;
	}
}
