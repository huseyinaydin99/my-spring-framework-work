package com.huseyinaydin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinaydin.dao.MusteriDao;
import com.huseyinaydin.model.Musteri;
import com.huseyinaydin.services.MusteriService;

@Service
public class MusteriServiceImpl implements MusteriService {
	
	@Autowired
	@Qualifier("musteriDao")
	private MusteriDao musteriDao;
	
	@Transactional
	@Override
	public List<Musteri> findAllMusteri() {
		return this.musteriDao.findAllMusteri();
	}

	@Transactional
	@Override
	public List<Musteri> findMusteriler(String musteriAdi) {
		return this.musteriDao.findMusteriler(musteriAdi);
	}

	@Transactional
	@Override
	public Musteri findMusteri(long musteriId) {
		return this.musteriDao.findMusteri(musteriId);
	}

	@Transactional
	@Override
	public long createMusteri(Musteri musteri) {
		return this.musteriDao.createMusteri(musteri);
	}

	@Transactional
	@Override
	public Musteri updateMusteri(Musteri musteri) {
		return this.musteriDao.updateMusteri(musteri);
	}

	@Transactional
	@Override
	public boolean deleteMusteri(long musteriId) {
		return this.musteriDao.deleteMusteri(musteriId);
	}

}
