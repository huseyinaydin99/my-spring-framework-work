package com.huseyinaydin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class HomeController extends MultiActionController {
	
	@RequestMapping("/home/ekle.htm")
	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Home controller ekle metodu çalýþtý!");
		return new ModelAndView("islem", "mesaj", "ekleme");
	}
	
	@RequestMapping("/home/sil.htm")
	public ModelAndView sil(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Home controller sil metodu çalýþtý!");
		return new ModelAndView("islem", "mesaj", "silme");
	}
	
	@RequestMapping("/home/duzenle.htm")
	public ModelAndView duzenle(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Home controller duzenle metodu çalýþtý!");
		return new ModelAndView("islem", "mesaj", "düzenleme");
	}
	
}
