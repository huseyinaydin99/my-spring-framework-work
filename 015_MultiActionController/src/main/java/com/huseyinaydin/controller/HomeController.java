package com.huseyinaydin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class HomeController extends MultiActionController {
	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Home controller ekle metodu çalýþtý!");
		return new ModelAndView("islem", "mesaj", "ekleme");
	}
	
	public ModelAndView sil(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Home controller sil metodu çalýþtý!");
		return new ModelAndView("islem", "mesaj", "silme");
	}
	
	public ModelAndView duzenle(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Home controller duzenle metodu çalýþtý!");
		return new ModelAndView("islem", "mesaj", "düzenleme");
	}
	
}
