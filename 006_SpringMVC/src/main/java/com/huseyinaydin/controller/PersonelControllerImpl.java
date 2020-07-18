package com.huseyinaydin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huseyinaydin.model.Personel;

@Controller
public class PersonelControllerImpl implements PersonelController {

	private List<Personel> personels = new ArrayList<Personel>();

	@RequestMapping(value="/personel",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public List<Personel> getPersonel() {
		System.out.println("get personel");
		for(int i = 0; i < 10; i++) {
			personels.add(new Personel(i, "personel " + i));
		}
		return personels;
	}

}
