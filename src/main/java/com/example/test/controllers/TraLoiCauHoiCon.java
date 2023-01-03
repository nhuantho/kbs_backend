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

import com.example.test.models.BoTienSuBenh;
import com.example.test.models.TienSuNguoiBenh;
import com.example.test.services.TraLoiCauHoiService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TraLoiCauHoiCon {
	@Autowired
	private TraLoiCauHoiService traLoiCauHoiService;
	
	@GetMapping(path = "/getTraLoiCauHoi/{tuoi}")
	public List<BoTienSuBenh> getTraLoiCauHoi(@PathVariable int tuoi) {
		return traLoiCauHoiService.getCauHoi(tuoi);
	}
	
	@PostMapping(path = "/luuCauTraLoi")
	public List<TienSuNguoiBenh> luuCauTraLoi(@RequestBody List<TienSuNguoiBenh> tienNguoiBenhs){
		return traLoiCauHoiService.luuCauTraLoi(tienNguoiBenhs);
	}
	
	@GetMapping(path = "/checkCauTraLoi/{taiKhoan}")
	public String checkCauTraLoi(@PathVariable String taiKhoan) {
		return traLoiCauHoiService.checkCauTraLoi(taiKhoan);
	}
}
