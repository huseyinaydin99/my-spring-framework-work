package com.huseyinaydin.controller;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

public interface HomeController {
	public ModelAndView home(String oran);
	public ModelAndView home(Map<String, String> pathVars);
}
