package com.example.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.models.NguoiPhatTrien;
import com.example.test.repositorys.NguoiPhatTrienRep;

@Service
public class NguoiPhatTrienService {
	@Autowired
	private NguoiPhatTrienRep nguoiPhatTrienRep;
	
	public NguoiPhatTrien luuKetQua(NguoiPhatTrien nguoiPhatTrien) {
		return nguoiPhatTrienRep.save(nguoiPhatTrien);
	}
	
	public List<NguoiPhatTrien> getGiaTri(String taiKhoan) {
		return nguoiPhatTrienRep.getGiaTri(taiKhoan);
	}
}
