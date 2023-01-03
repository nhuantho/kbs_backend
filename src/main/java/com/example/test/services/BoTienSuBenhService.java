package com.example.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.models.BoTienSuBenh;
import com.example.test.models.CauTraLoi;
import com.example.test.models.TienSuBenh;
import com.example.test.models.TienSuBenhVaCauTraLoi;
import com.example.test.repositorys.BoTienSuBenhRep;
import com.example.test.repositorys.CauTraLoiRep;
import com.example.test.repositorys.TienSuBenhRep;
import com.example.test.repositorys.TienSuBenhVaCauTraLoiRep;

@Service
public class BoTienSuBenhService {
	@Autowired
	private BoTienSuBenhRep boTienSuBenhRep;
	@Autowired
	private TienSuBenhRep tienSuBenhRep;
	@Autowired 
	private CauTraLoiRep cauTraLoiRep;
	@Autowired
	private TienSuBenhVaCauTraLoiRep tienSuBenhVaCauTraLoiRep;
	
	public List<BoTienSuBenh> getAllBTSB() {
		return boTienSuBenhRep.findAll();
	}
	
	public BoTienSuBenh saveBTSB(BoTienSuBenh boTienSuBenh) {
		return boTienSuBenhRep.save(boTienSuBenh);
	}
	
	public List<TienSuBenh> getAllTSB() {
		return tienSuBenhRep.findAll();
	}
	
	public TienSuBenh saveTSB(TienSuBenh tienSuBenh) {
		return tienSuBenhRep.save(tienSuBenh);
	}
	
	public List<CauTraLoi> getAllCTL() {
		return cauTraLoiRep.findAll();
	}
	
	public CauTraLoi saveCTL(CauTraLoi cauTraLoi) {
		return cauTraLoiRep.save(cauTraLoi);
	}
	
	public List<TienSuBenhVaCauTraLoi> getAllTSBVCTL() {
		return tienSuBenhVaCauTraLoiRep.findAll();
	}
	
	public TienSuBenhVaCauTraLoi saveTSBVCTL(TienSuBenhVaCauTraLoi tienSuBenhVaCauTraLoi) {
		return tienSuBenhVaCauTraLoiRep.save(tienSuBenhVaCauTraLoi);
	}
}
