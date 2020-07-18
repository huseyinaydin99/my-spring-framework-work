package com.huseyinaydin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hüseyin Aydýn
 * @since 22.06.2020
 * @verison 1.0
 **/

@Entity
@Table(name = "Musteri")
public class Musteri implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long musteriId;
	
	@Column(name = "musteriAdi")
	private String musteriAdi;
	
	@Column(name = "musteriSoyadi")
	private String musteriSoyadi;
	
	@Column(name = "musteriNo")
	private int musteriNo;

	public Musteri() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Musteri(String musteriAdi, String musteriSoyadi, int musteriNo) {
		super();
		this.musteriAdi = musteriAdi;
		this.musteriSoyadi = musteriSoyadi;
		this.musteriNo = musteriNo;
	}

	public long getMusteriId() {
		return musteriId;
	}

	public void setMusteriId(long musteriId) {
		this.musteriId = musteriId;
	}

	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	public String getMusteriSoyadi() {
		return musteriSoyadi;
	}

	public void setMusteriSoyadi(String musteriSoyadi) {
		this.musteriSoyadi = musteriSoyadi;
	}

	public int getMusteriNo() {
		return musteriNo;
	}

	public void setMusteriNo(int musteriNo) {
		this.musteriNo = musteriNo;
	}
	
}
