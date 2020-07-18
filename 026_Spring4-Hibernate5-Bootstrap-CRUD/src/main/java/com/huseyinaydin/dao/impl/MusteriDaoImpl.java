package com.huseyinaydin.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.huseyinaydin.dao.MusteriDao;
import com.huseyinaydin.model.Musteri;

@Repository
public class MusteriDaoImpl implements MusteriDao {

	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	@Override
	public List<Musteri> findAllMusteri() {
		this.session = this.sessionFactory.getCurrentSession();
		Query query = this.session.createQuery("FROM Musteri");
		return query.list();
	}

	@Override
	public List<Musteri> findMusteriler(String musteriAdi) {
		this.session = this.sessionFactory.getCurrentSession();
		String sql = "SELECT m.musteriId,m.musteriAdi,m.musteriSoyadi,m.musteriNo FROM Musteri m WHERE m.musteriAdi LIKE '" + musteriAdi + "%'";
		//String sql = "SELECT m.* FROM Musteri m WHERE m.musteriAdi LIKE '" + musteriAdi + "%'";
		List<Object[]> list = this.session.createQuery(sql).list();
		List<Musteri> musteris = new ArrayList<Musteri>();
		for (Object[] objects : list) {
			Musteri musteri = new Musteri();
			musteri.setMusteriId((Long) (objects[0]));
			musteri.setMusteriAdi((String) objects[1]);
			musteri.setMusteriSoyadi((String) objects[2]);
			musteri.setMusteriNo((Integer) objects[3]);
			musteris.add(musteri);
		}
		return musteris;
	}

	@Override
	public Musteri findMusteri(long musteriId) {
		this.session = this.sessionFactory.getCurrentSession();
		return null;
	}

	@Override
	public long createMusteri(Musteri musteri) {
		this.session = this.sessionFactory.getCurrentSession();
		this.session.save(musteri);
		return 1;
	}

	@Override
	public Musteri updateMusteri(Musteri musteri) {
		this.session = this.sessionFactory.getCurrentSession();
		this.session.update(musteri);
		return musteri;
	}

	@Override
	public boolean deleteMusteri(long musteriId) {
		this.session = this.sessionFactory.getCurrentSession();
		Musteri musteri = new Musteri();
		musteri.setMusteriId(musteriId);
		this.session.delete(musteri);
		return true;
	}

}
