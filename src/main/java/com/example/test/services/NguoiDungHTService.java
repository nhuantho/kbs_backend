package com.example.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.models.NguoiDungHT;
import com.example.test.repositorys.NguoiDungHTRep;

@Service
public class NguoiDungHTService {
	@Autowired
	private NguoiDungHTRep nguoiDungHTRep;
	
	public List<NguoiDungHT> getAllNDHT() {
		return nguoiDungHTRep.findAll();
	}
}
