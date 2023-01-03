package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.NguoiPhatTrien;
import com.example.test.services.NguoiPhatTrienService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NguoiPhatTrienCon {
	@Autowired
	private NguoiPhatTrienService nguoiPhatTrienService;
	
	@PostMapping(path = "/luuKetQua")
	public NguoiPhatTrien luuKetQua(@RequestBody NguoiPhatTrien nguoiPhatTrien) {
		return nguoiPhatTrienService.luuKetQua(nguoiPhatTrien);
	}
	
	@GetMapping(path = "/getGiaTri/{taiKhoan}")
	public List<NguoiPhatTrien> getGiaTri(@PathVariable String taiKhoan){
		return nguoiPhatTrienService.getGiaTri(taiKhoan);
	}
}
