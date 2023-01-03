package com.example.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.models.Benh;
import com.example.test.models.BenhCuaBenhNhan;
import com.example.test.repositorys.BenhCuaBenhNhanRep;
import com.example.test.repositorys.BenhRep;

@Service
public class BenhCuaBenhNhanService {
	@Autowired
	private BenhCuaBenhNhanRep benhCuaBenhNhanRep;
	@Autowired
	private BenhRep benhRep;
	
	public List<Benh> benhCuaBenhNhan(String taiKhoan) {
		List<Benh> benhs = new ArrayList<Benh>();
		List<BenhCuaBenhNhan> benhCuaBenhNhans = benhCuaBenhNhanRep.getBCBNByTK(taiKhoan);
		for(BenhCuaBenhNhan benhCuaBenhNhan:benhCuaBenhNhans) {
			if(benhCuaBenhNhan.getTtNguoiNha().equalsIgnoreCase("Không") == false) {
				benhs.add(benhRep.getBenhById(benhCuaBenhNhan.getIdBenh()));
			}
			
		}
		return benhs;
	}
}
