package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.NguoiDungHT;
import com.example.test.services.NguoiDungHTService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NguoiDungHTCon {
	@Autowired
	private NguoiDungHTService nguoiDungHTService;
	
	@GetMapping(path = "/getAllNDHT")
	public List<NguoiDungHT> getAllNDHT() {
		return nguoiDungHTService.getAllNDHT();
	}
}
