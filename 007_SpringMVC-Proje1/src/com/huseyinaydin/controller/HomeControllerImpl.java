package com.huseyinaydin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HomeControllerImpl extends AbstractController implements HomeController {

	@RequestMapping(path = "/",method = RequestMethod.GET)
	@Override
	public ModelAndView home()  {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("message", "Selamlar");
		return modelAndView;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
