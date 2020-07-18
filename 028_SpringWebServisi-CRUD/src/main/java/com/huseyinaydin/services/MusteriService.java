package com.huseyinaydin.services;

import java.util.List;

import com.huseyinaydin.model.Musteri;

public interface MusteriService {
	public Musteri findById(long musteriId);
	public Musteri findByAdi(String musteriAdi);
	public List<Musteri> findAllMusteri();
	public boolean isMusteriExist(Musteri musteri);
	public boolean saveMusteri(Musteri musteri);
	public Musteri updateMusteri(Musteri musteri);
	public boolean deleteMusteriById(long musteriId);
	public boolean deleteAllMusteriler();
}
