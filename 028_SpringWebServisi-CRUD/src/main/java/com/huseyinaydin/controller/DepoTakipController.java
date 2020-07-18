package com.huseyinaydin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.huseyinaydin.model.Musteri;
import com.huseyinaydin.model.MusteriJson;
import com.huseyinaydin.model.MusteriXml;
import com.huseyinaydin.services.MusteriService;

@RestController
public class DepoTakipController {

	@Autowired
	@Qualifier("musteriService")
	private MusteriService musteriService;

	@RequestMapping(value = "/uretjson/{musteriAdi}", method = RequestMethod.GET)
	public MusteriJson kaynakJson(@PathVariable("musteriAdi") String musteriAdi) {
		MusteriJson musteriJson = new MusteriJson(musteriAdi, "123");
		return musteriJson;
	}

	@RequestMapping(value = "/uretxml/{musteriAdi}", method = RequestMethod.GET)
	public MusteriXml kaynakXml(@PathVariable("musteriAdi") String musteriAdi) {
		MusteriXml musteriXml = new MusteriXml(musteriAdi, "456");
		return musteriXml;
	}

	@RequestMapping(value = "/musteri/", method = RequestMethod.GET)
	public ResponseEntity<List<Musteri>> listAllMusteriler() {

		List<Musteri> musteriler = musteriService.findAllMusteri();

		if (musteriler.isEmpty()) {
			return new ResponseEntity<List<Musteri>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Musteri>>(musteriler, HttpStatus.OK);
	}

	@RequestMapping(value = "/musteri/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Musteri> getMusteri(@PathVariable("id") long id) {

		Musteri musteri = musteriService.findById(id);

		if (musteri == null) {
			return new ResponseEntity<Musteri>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Musteri>(musteri, HttpStatus.OK);
	}

	@RequestMapping(value = "/musteri/", method = RequestMethod.POST)
	public ResponseEntity<Void> createMusteri(@RequestBody Musteri musteri, UriComponentsBuilder uriComponentsBuilder) {

		if (musteriService.isMusteriExist(musteri)) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT); //conflict fikir ayrýlýðý, çatýþma
		}

		musteriService.saveMusteri(musteri);

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(uriComponentsBuilder.path("/musteri/{id}").buildAndExpand(musteri.getMusteriId()).toUri());
		return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/musteri/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Musteri> updateMusteri(@PathVariable("id") long id, @RequestBody Musteri musteri) {
		Musteri guncellenenMusteri = musteriService.findById(id);
		if (guncellenenMusteri == null) {
			return new ResponseEntity<Musteri>(HttpStatus.NOT_FOUND);
		}
		guncellenenMusteri.setMusteriAdi(musteri.getMusteriAdi());
		guncellenenMusteri.setMusteriSoyadi(musteri.getMusteriSoyadi());
		guncellenenMusteri.setYasi(musteri.getYasi());
		guncellenenMusteri.setMaasi(musteri.getMaasi());
		musteriService.updateMusteri(guncellenenMusteri);
		return new ResponseEntity<Musteri>(guncellenenMusteri, HttpStatus.OK);
	}

	@RequestMapping(value = "/musteri/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Musteri> deleteMusteri(@PathVariable("id") long id) {
		Musteri musteri = musteriService.findById(id);
		if (musteri == null) {
			return new ResponseEntity<Musteri>(HttpStatus.NOT_FOUND);
		}
		musteriService.deleteMusteriById(id);
		return new ResponseEntity<Musteri>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/musteri/", method = RequestMethod.DELETE)
	public ResponseEntity<Musteri> deleteAllMusteriler() {
		musteriService.deleteAllMusteriler();
		return new ResponseEntity<Musteri>(HttpStatus.NO_CONTENT);
	}
}
