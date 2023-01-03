package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.NguoiDung;
import com.example.test.models.TTNguoiDung;
import com.example.test.models.TTTKNguoiDung;
import com.example.test.services.TTNguoiDungService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TTNguoiDungCon {
	@Autowired
	private TTNguoiDungService ttNguoiDungService;
	
	@PostMapping(path = "/checkTTNguoiDungByTK")
	public TTNguoiDung checkTTNguoiDungByTK(@RequestBody TTTKNguoiDung tttkNguoiDung) {
		return ttNguoiDungService.checkTTNguoiDungByTK(tttkNguoiDung.getTaiKhoan(), tttkNguoiDung.getMatKhau());
	}
	
	@PostMapping(path = "/luuNguoiDung")
	public String luuNguoiDung(@RequestBody TTNguoiDung ttNguoiDung) {
		return ttNguoiDungService.luuNguoiDung(ttNguoiDung);
	}
	
	@GetMapping(path = "/nguoiDungs")
	public List<NguoiDung> nguoiDungs(){
		return ttNguoiDungService.nguoiDungs();
	}
}
