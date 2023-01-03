package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.BoTienSuBenh;
import com.example.test.models.CauTraLoi;
import com.example.test.models.TienSuBenh;
import com.example.test.models.TienSuBenhVaCauTraLoi;
import com.example.test.services.BoTienSuBenhService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BoTienSuBenhCon {
	@Autowired
	private BoTienSuBenhService boTienSuBenhService;
	
	@GetMapping(path = "/getAllBTSB")
	public List<BoTienSuBenh> getAllBTSB() {
		return boTienSuBenhService.getAllBTSB();
	}
	
	@PostMapping(path = "/saveBTSB")
	public BoTienSuBenh saveBTSB(@RequestBody BoTienSuBenh boTienSuBenh) {
		return boTienSuBenhService.saveBTSB(boTienSuBenh);
	}
	
	@GetMapping(path = "/getAllTSB")
	public List<TienSuBenh> getAllTSB() {
		return boTienSuBenhService.getAllTSB();
	}
	
	@PostMapping(path = "/saveTSB")
	public TienSuBenh saveTSB(@RequestBody TienSuBenh tienSuBenh) {
		return boTienSuBenhService.saveTSB(tienSuBenh);
	}
	
	@GetMapping(path = "/getAllCTL")
	public List<CauTraLoi> getAllCTL() {
		return boTienSuBenhService.getAllCTL();
	}
	
	@PostMapping(path = "/saveCTL")
	public CauTraLoi saveCTL(@RequestBody CauTraLoi cauTraLoi) {
		return boTienSuBenhService.saveCTL(cauTraLoi);
	}
	
	@GetMapping(path = "/getAllTSBVCTL")
	public List<TienSuBenhVaCauTraLoi> getAllTSBVCTL() {
		return boTienSuBenhService.getAllTSBVCTL();
	}
	
	@PostMapping(path = "/saveTSBVCTL")
	public TienSuBenhVaCauTraLoi saveTSBVCTL(@RequestBody TienSuBenhVaCauTraLoi tienSuBenhVaCauTraLoi) {
		return boTienSuBenhService.saveTSBVCTL(tienSuBenhVaCauTraLoi);
	}
}
