package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.ThongKeNguoiBenh;
import com.example.test.models.ThongKeTinNhan;
import com.example.test.services.ThongKeService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ThongKeCon {
	@Autowired 
	private ThongKeService thongKeService;
	
	@GetMapping(path = "/thongKeTinNhan")
	public List<ThongKeTinNhan> thongKeTinNhan() { 
		return thongKeService.thongKeTinNhan();
	}
	
	@GetMapping(path = "/thongKeNguoiBenh")
	public List<ThongKeNguoiBenh> thongKeNguoiBenh(){
		return thongKeService.thongKeNguoiBenh();
	}
}
