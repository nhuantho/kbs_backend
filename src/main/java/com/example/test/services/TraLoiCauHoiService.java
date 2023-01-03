package com.example.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.models.BoTienSuBenh;
import com.example.test.models.TienSuNguoiBenh;
import com.example.test.repositorys.BoTienSuBenhRep;
import com.example.test.repositorys.TienSuNguoiBenhRep;

@Service
public class TraLoiCauHoiService {
	@Autowired
	private BoTienSuBenhRep boTienSuBenhRep;
	@Autowired
	private TienSuNguoiBenhRep tienSuNguoiBenhRep; 
	
	public List<BoTienSuBenh> getCauHoi(int tuoi){
		return boTienSuBenhRep.getBoTienSuBenh(tuoi);
	}
	
	public List<TienSuNguoiBenh> luuCauTraLoi(List<TienSuNguoiBenh> tiSuNguoiBenhs){
		return tienSuNguoiBenhRep.saveAll(tiSuNguoiBenhs);
	}
	
	public String checkCauTraLoi(String taiKhoan) {
		TienSuNguoiBenh tienSuNguoiBenh = tienSuNguoiBenhRep.checkCauTraLoi(taiKhoan);
		if(tienSuNguoiBenh != null) {
			return "Đã trả lời câu hỏi";
		}
		return "Chưa trả lời câu hỏi";
	}
}
