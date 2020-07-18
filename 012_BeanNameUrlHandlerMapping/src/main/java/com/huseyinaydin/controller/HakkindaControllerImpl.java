package com.huseyinaydin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HakkindaControllerImpl  extends AbstractController implements HakkindaController {

	@RequestMapping("/hakkinda")
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("sayfa", "Hakkýnda");
		return modelAndView;
	}

}
