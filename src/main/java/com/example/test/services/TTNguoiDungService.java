package com.example.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.models.NguoiDung;
import com.example.test.models.NguoiDungHT;
import com.example.test.models.TTNguoiDung;
import com.example.test.models.ThongTinNguoiDungHT;
import com.example.test.repositorys.NguoiDungHTRep;
import com.example.test.repositorys.NguoiDungRep;
import com.example.test.repositorys.ThongTinNguoiDungHTRep;

@Service
public class TTNguoiDungService {
	@Autowired
	private NguoiDungRep nguoiDungRep;
	@Autowired
	private NguoiDungHTRep nguoiDungHTRep;
	@Autowired
	private ThongTinNguoiDungHTRep thongTinNguoiDungHTRep;
	
	public TTNguoiDung checkTTNguoiDungByTK(String taiKhoan, String matKhau) {
		NguoiDung nguoiDung = nguoiDungRep.getNguoiDungByTK(taiKhoan, matKhau);
		TTNguoiDung ttNguoiDung;
		if (nguoiDung != null) {
			ThongTinNguoiDungHT thongTinNguoiDungHT = thongTinNguoiDungHTRep.getTTNguoiDungByTK(nguoiDung.getTaiKhoan());
			if (thongTinNguoiDungHT != null) {
				NguoiDungHT nguoiDungHT = nguoiDungHTRep.getNguoiDungHTByTK(thongTinNguoiDungHT.getIdNguoiDungHT());
				ttNguoiDung = new TTNguoiDung(nguoiDung.getId(), nguoiDung.getDiaChi(), nguoiDung.getGhiChu(), nguoiDung.getGioiTinh(), nguoiDung.getHoTen(), nguoiDung.getNamSinh(), nguoiDung.getMatKhau(), nguoiDung.getNgheNghiep(), nguoiDung.getSdt(), nguoiDung.getTaiKhoan(), thongTinNguoiDungHT.getIdNguoiDungHT(), nguoiDungHT.getLoaiNguoiDung());
			}else {
				ttNguoiDung = new TTNguoiDung();
			}
			
		}
		else {
			ttNguoiDung = new TTNguoiDung();
		}
		return ttNguoiDung;
	}
	
	public String luuNguoiDung(TTNguoiDung ttNguoiDung) {
		NguoiDung nguoiDung = nguoiDungRep.checkTKNguoiDung(ttNguoiDung.getTaikhoan());
		if(nguoiDung != null) {
			return "Đã tồn tại";
		}else {
			nguoiDungRep.insertNguoiDung(ttNguoiDung.getDiachi(), ttNguoiDung.getGhichu(), ttNguoiDung.getGioitinh(), ttNguoiDung.getHoten(), ttNguoiDung.getMatkhau(), ttNguoiDung.getNamsinh(), ttNguoiDung.getNghenghiep(), ttNguoiDung.getSdt(), ttNguoiDung.getTaikhoan());
			thongTinNguoiDungHTRep.insertTTNDHT(ttNguoiDung.getIdnguoidunght(), ttNguoiDung.getTaikhoan());
			return "Thành công";
		}
	}
	
	public List<NguoiDung> nguoiDungs(){
		return nguoiDungRep.danhSachND();
	}
}
