package com.huseyinaydin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeControllerImpl extends AbstractController {

	public boolean sayiDenetimi(String str) {
		for (char chr : str.toCharArray()) {
			if (!Character.isDigit(chr))
				return false;
		}
		return true;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("Çalýþtý!");
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("duyuru", "Elmalarda %30 indirim var");
		return modelAndView;
	}
}
