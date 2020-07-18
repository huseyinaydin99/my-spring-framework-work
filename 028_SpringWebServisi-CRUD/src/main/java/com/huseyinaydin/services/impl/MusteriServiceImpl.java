package com.huseyinaydin.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinaydin.model.Musteri;
import com.huseyinaydin.services.MusteriService;

@Service("musteriService")
@Transactional
public class MusteriServiceImpl implements MusteriService {
	
	private static final AtomicLong ATOMIC_LONG = new AtomicLong();
	private static List<Musteri> musteriler;
	
	static {
		musteriler = musterileriGetir();
	}
	
	@Override
	public Musteri findById(long musteriId) {
		for (Musteri musteri : musteriler) {
			if(musteri.getMusteriId() == musteriId) {
				return musteri;
			}
		}
		return null;
	}

	private static List<Musteri> musterileriGetir() {
		List<Musteri> musteris = new ArrayList<Musteri>();
		musteris.add(new Musteri(ATOMIC_LONG.incrementAndGet(), "Hüseyin", "Aydýn", 26, 2500));
		musteris.add(new Musteri(ATOMIC_LONG.incrementAndGet(), "Rümeysa", "Aydýn", 21, 1500));
		musteris.add(new Musteri(ATOMIC_LONG.incrementAndGet(), "Yasin", "Aydýn", 20, 2200));
		musteris.add(new Musteri(ATOMIC_LONG.incrementAndGet(), "Ömer Faruk", "Aydýn", 9, 100));
		return musteris;
	}

	@Override
	public Musteri findByAdi(String musteriAdi) {
		for (Musteri musteri : musteriler) {
			if(musteri.getMusteriAdi().equals(musteriAdi))
				return musteri;
		}
		return null;
	}

	@Override
	public List<Musteri> findAllMusteri() {
		// TODO Auto-generated method stub
		return musteriler;
	}

	@Override
	public boolean isMusteriExist(Musteri musteri) {
		// TODO Auto-generated method stub
		return this.findByAdi(musteri.getMusteriAdi())!=null;
	}

	@Override
	public boolean saveMusteri(Musteri musteri) {
		musteri.setMusteriId(ATOMIC_LONG.incrementAndGet());
		musteriler.add(musteri);
		return true;
	}

	@Override
	public Musteri updateMusteri(Musteri musteri) {
		int listedekiKonumu = musteriler.indexOf(musteri);
		musteriler.set(listedekiKonumu, musteri);
		return musteri;
	}

	@Override
	public boolean deleteMusteriById(long musteriId) {
		for(Iterator iterator = musteriler.iterator(); iterator.hasNext();) {
			Musteri musteri = (Musteri) iterator.next();
			if(musteri.getMusteriId() == musteriId)
				iterator.remove();
		}
		return true;
	}

	@Override
	public boolean deleteAllMusteriler() {
		musteriler.clear();
		return false;
	}

}
