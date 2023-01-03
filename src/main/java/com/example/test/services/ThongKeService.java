package com.example.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.models.Benh;
import com.example.test.models.BenhCuaBenhNhan;
import com.example.test.models.BoTienSuBenh;
import com.example.test.models.NguoiDung;
import com.example.test.models.ThongKeNguoiBenh;
import com.example.test.models.ThongKeTinNhan;
import com.example.test.models.TienSuBenh;
import com.example.test.models.TienSuBenhVaCauTraLoi;
import com.example.test.models.TienSuNguoiBenh;
import com.example.test.models.TinNhan;
import com.example.test.repositorys.BenhCuaBenhNhanRep;
import com.example.test.repositorys.BenhRep;
import com.example.test.repositorys.BoTienSuBenhRep;
import com.example.test.repositorys.NguoiDungRep;
import com.example.test.repositorys.TienSuBenhRep;
import com.example.test.repositorys.TienSuBenhVaCauTraLoiRep;
import com.example.test.repositorys.TienSuNguoiBenhRep;
import com.example.test.repositorys.TinNhanRep;

@Service
public class ThongKeService {
	@Autowired
	private NguoiDungRep nguoiDungRep;
	@Autowired
	private TinNhanRep tinNhanRep;
	@Autowired
	private TienSuBenhVaCauTraLoiRep tienSuBenhVaCauTraLoiRep;
	@Autowired 
	private TienSuBenhRep tienSuBenhRep;
	@Autowired
	private TienSuNguoiBenhRep tienSuNguoiBenhRep;
	@Autowired 
	private BoTienSuBenhRep boTienSuBenhRep;
	@Autowired
	private BenhCuaBenhNhanRep benhCuaBenhNhanRep;
	@Autowired
	private BenhRep benhRep;
	
	public int tiLeChinhXac(String taiKhoan) {
		int tiLe = 0;
		List<TienSuNguoiBenh> tienSuNguoiBenhs = tienSuNguoiBenhRep.tienSuNguoiBenhBytk(taiKhoan);
		List<String> idBoTienSuBenhs = new ArrayList<String>();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		List<String> idTienSuBenhs1 = new ArrayList<String>();
		List<String> idTienSuBenhs2 = new ArrayList<String>();
		List<String> idTienSuBenhs3 = new ArrayList<String>();
		List<String> idTienSuBenhs4 = new ArrayList<String>();
		List<String> idTienSuBenhs5 = new ArrayList<String>();
		for(TienSuNguoiBenh tienSuNguoiBenh: tienSuNguoiBenhs) {
			TienSuBenhVaCauTraLoi tienSuBenhVaCauTraLoi = tienSuBenhVaCauTraLoiRep.findById(tienSuNguoiBenh.getIdTienSuBenhVaCauTraLoi()).orElse(null);
			TienSuBenh tienSuBenh = tienSuBenhRep.findById(tienSuBenhVaCauTraLoi.getIdTienSuBenh()).orElse(null);
			BoTienSuBenh boTienSuBenh = boTienSuBenhRep.findById(tienSuBenh.getIdBoTienSuBenh()).orElse(null);
			if(idBoTienSuBenhs.indexOf(boTienSuBenh.getId()) == -1) {
				idBoTienSuBenhs.add(boTienSuBenh.getId());
			}
			if(boTienSuBenh.getTrongSo() == 1) {
				if(idTienSuBenhs1.indexOf(tienSuBenh.getId()) == -1) {
					idTienSuBenhs1.add(tienSuBenh.getId());
				}
				sum1 += (boTienSuBenh.getTrongSo() * tienSuBenhVaCauTraLoi.getDiem());
			}
			
			if(boTienSuBenh.getTrongSo() == 2) {
				if(idTienSuBenhs2.indexOf(tienSuBenh.getId()) == -1) {
					idTienSuBenhs2.add(tienSuBenh.getId());
				}
				sum2 += (boTienSuBenh.getTrongSo() * tienSuBenhVaCauTraLoi.getDiem());
			}
			
			if(boTienSuBenh.getTrongSo() == 3) {
				if(idTienSuBenhs3.indexOf(tienSuBenh.getId()) == -1) {
					idTienSuBenhs3.add(tienSuBenh.getId());
				}
				sum3 += (boTienSuBenh.getTrongSo() * tienSuBenhVaCauTraLoi.getDiem());
			}
			
			if(boTienSuBenh.getTrongSo() == 4) {
				if(idTienSuBenhs4.indexOf(tienSuBenh.getId()) == -1) {
					idTienSuBenhs4.add(tienSuBenh.getId());
				}
				sum4 += (boTienSuBenh.getTrongSo() * tienSuBenhVaCauTraLoi.getDiem());
			}
			
			if(boTienSuBenh.getTrongSo() == 5) {
				if(idTienSuBenhs5.indexOf(tienSuBenh.getId()) == -1) {
					idTienSuBenhs5.add(tienSuBenh.getId());
				}
				sum5 += (boTienSuBenh.getTrongSo() * tienSuBenhVaCauTraLoi.getDiem());
			}
		}
		int setSize1 = idTienSuBenhs1.size();
		int setSize2 = idTienSuBenhs2.size();
		int setSize3 = idTienSuBenhs3.size();
		int setSize4 = idTienSuBenhs4.size();
		int setSize5 = idTienSuBenhs5.size();
		if(setSize1 == 0 ) setSize1 = 1;
		if(setSize2 == 0 ) setSize2 = 1;
		if(setSize3 == 0 ) setSize3 = 1;
		if(setSize4 == 0 ) setSize4 = 1;
		if(setSize5 == 0 ) setSize5 = 1;
		tiLe = ((sum1/setSize1) + (sum2/setSize2) + (sum3/setSize3) + (sum4/setSize4) + (sum5/setSize5))/idBoTienSuBenhs.size();
		
		return tiLe * 10 / idBoTienSuBenhs.size();
	}
	
	public List<ThongKeTinNhan> thongKeTinNhan() {
		List<ThongKeTinNhan> thongKeTinNhans = new ArrayList<ThongKeTinNhan>();
		List<NguoiDung> nguoiDungs = nguoiDungRep.danhSachND();
		for(NguoiDung nguoiDung:nguoiDungs) {
			List<TinNhan> tinNhans = tinNhanRep.getTinNhanBYND(nguoiDung.getTaiKhoan());
			thongKeTinNhans.add(new ThongKeTinNhan(nguoiDung.getTaiKhoan(), nguoiDung.getHoTen(), tinNhans.size()));
		}
		return thongKeTinNhans;
	}
	
	public List<ThongKeNguoiBenh> thongKeNguoiBenh(){
		List<ThongKeNguoiBenh> thongKeNguoiBenhs = new ArrayList<ThongKeNguoiBenh>();
		List<NguoiDung> nguoiDungs = nguoiDungRep.danhSachND();
		for(NguoiDung nguoiDung:nguoiDungs) {
			List<BenhCuaBenhNhan> benhCuaBenhNhans = benhCuaBenhNhanRep.getBCBNByTK(nguoiDung.getTaiKhoan());
			for(BenhCuaBenhNhan benhCuaBenhNhan:benhCuaBenhNhans) {
				Benh benh = benhRep.getBenhById(benhCuaBenhNhan.getIdBenh());
				thongKeNguoiBenhs.add(new ThongKeNguoiBenh(nguoiDung.getTaiKhoan(), nguoiDung.getHoTen(), benh.getTenBenh(), String.valueOf(tiLeChinhXac(nguoiDung.getTaiKhoan())) + "%", benhCuaBenhNhan.getThoiGian(), benhCuaBenhNhan.getTtNguoiNha()));
			}
		}
		return thongKeNguoiBenhs;
	}
}
