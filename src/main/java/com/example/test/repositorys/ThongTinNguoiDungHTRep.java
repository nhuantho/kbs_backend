package com.example.test.repositorys;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.ThongTinNguoiDungHT;

public interface ThongTinNguoiDungHTRep extends JpaRepository<ThongTinNguoiDungHT, Integer>{
	@Query(value = "SELECT * FROM kbs.thongtinnguoidunght WHERE taikhoan = :taiKhoan", nativeQuery = true)
	public ThongTinNguoiDungHT getTTNguoiDungByTK(String taiKhoan);
	
	@Modifying
	@Query(value = "INSERT INTO kbs.thongtinnguoidunght(idnguoidunght, taikhoan) VALUES(:idNguoiDungHT, :taiKhoan)", nativeQuery = true)
	@Transactional
	public void insertTTNDHT(String idNguoiDungHT, String taiKhoan);
}
