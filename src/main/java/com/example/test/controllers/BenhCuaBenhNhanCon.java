package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.Benh;
import com.example.test.services.BenhCuaBenhNhanService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BenhCuaBenhNhanCon {
	@Autowired
	private BenhCuaBenhNhanService benhCuaBenhNhanService;
	
	@GetMapping(path = "/benhCuaBenhNhan/{taiKhoan}")
	public List<Benh> benhCuaBenhNhan(@PathVariable String taiKhoan){
		return benhCuaBenhNhanService.benhCuaBenhNhan(taiKhoan);
	}
}
