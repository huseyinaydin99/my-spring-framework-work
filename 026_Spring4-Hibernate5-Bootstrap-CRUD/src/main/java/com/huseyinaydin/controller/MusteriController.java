package com.huseyinaydin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.huseyinaydin.model.Musteri;
import com.huseyinaydin.services.MusteriService;

@Controller
public class MusteriController {
	
	@Autowired
	@Qualifier("musteriService")
	private MusteriService musteriService;
	
	@RequestMapping(value = "/createmusteri", method = RequestMethod.GET)
	public ModelAndView createMusteri(@ModelAttribute Musteri musteri) {
		return new ModelAndView("musteriForm");
	}
	
	@RequestMapping(value = "/editmusteri",method = RequestMethod.GET)
	public ModelAndView updateMusteri(@RequestParam long musteriId, @ModelAttribute Musteri musteri) {
		this.musteriService.updateMusteri(musteri);
		musteri = this.musteriService.findMusteri(musteriId);
		return new ModelAndView("musteriForm","musteriObject",musteri);
	}
	
	@RequestMapping(value = "/savemusteri", method = RequestMethod.POST)
	public ModelAndView saveMusteri(@ModelAttribute Musteri musteri) {
		System.out.println("save çalýþtý");
		if(musteri.getMusteriId() == 0) {
			this.musteriService.createMusteri(musteri);
		}
		else {
			this.musteriService.updateMusteri(musteri);
		}
		return new ModelAndView("redirect:getfindallmusteri");
	}
	
	@RequestMapping(value = {"getfindallmusteri","/findallmusteri"},method = RequestMethod.GET)
	public ModelAndView findAllMusteri() {
		System.out.println("findAllMusteri metod çalýþtý");
		List<Musteri> musteriListesi = this.musteriService.findAllMusteri();
		return new ModelAndView("musteriList", "musteriListesi",musteriListesi);
	}
	
	@RequestMapping(value = "/deletemusteri",method = RequestMethod.GET)
	public ModelAndView deleteMusteri(@RequestParam long musteriId) {
		this.musteriService.deleteMusteri(musteriId);
		return new ModelAndView("redirect:/findallmusteri");
	}
	
	@RequestMapping(value = "/searchmusteri",method = RequestMethod.POST)
	public ModelAndView searchMusteri(@RequestParam("searchAdi") String searchAdi) {
		System.out.println("searchMusteri metodu çalýþtý");
		List<Musteri> musteriList = this.musteriService.findMusteriler(searchAdi);
		return new ModelAndView("musteriList","musteriListesi",musteriList);
	}
	
	
}
