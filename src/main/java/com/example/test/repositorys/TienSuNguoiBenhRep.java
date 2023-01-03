package com.example.test.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.TienSuNguoiBenh;

public interface TienSuNguoiBenhRep extends JpaRepository<TienSuNguoiBenh, Integer>{
	@Query(value = "SELECT * FROM kbs.tiensunguoibenh WHERE taikhoan = :taiKhoan LIMIT 1", nativeQuery = true)
	public TienSuNguoiBenh checkCauTraLoi(String taiKhoan);
	
	@Query(value = "SELECT * FROM kbs.tiensunguoibenh WHERE taikhoan = :taiKhoan", nativeQuery = true)
	public List<TienSuNguoiBenh> tienSuNguoiBenhBytk(String taiKhoan);
}
