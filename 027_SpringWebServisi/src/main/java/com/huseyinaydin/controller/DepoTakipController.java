package com.huseyinaydin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huseyinaydin.model.MusteriJson;
import com.huseyinaydin.model.MusteriXml;

@RestController
public class DepoTakipController {
	
	@RequestMapping(value = "/uretjson/{musteriAdi}",method = RequestMethod.GET)
	public MusteriJson kaynakJson(@PathVariable("musteriAdi") String musteriAdi) {
		MusteriJson musteriJson = new MusteriJson(musteriAdi,"123");
		return musteriJson;
	}
	
	@RequestMapping(value = "/uretxml/{musteriAdi}",method = RequestMethod.GET)
	public MusteriXml kaynakXml(@PathVariable("musteriAdi") String musteriAdi) {
		MusteriXml musteriXml = new MusteriXml(musteriAdi,"456");
		return musteriXml;
	}
}
