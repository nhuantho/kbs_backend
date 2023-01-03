package com.example.test.repositorys;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.NguoiDung;

public interface NguoiDungRep extends JpaRepository<NguoiDung, Integer>{
	@Query(value = "SELECT * FROM kbs.nguoidung WHERE taikhoan = :taiKhoan AND matkhau = :matKhau", nativeQuery = true)
	public NguoiDung getNguoiDungByTK(String taiKhoan, String matKhau);
	
	@Query(value = "SELECT * FROM kbs.nguoidung WHERE taikhoan = :taiKhoan", nativeQuery = true)
	public NguoiDung checkTKNguoiDung(String taiKhoan);
	
	@Query(value = "SELECT nguoidung.id, hoten, gioitinh, namsinh, sdt, diachi, nghenghiep, ghichu, nguoidung.taikhoan, matkhau "
			+ "FROM kbs.nguoidung "
			+ "INNER JOIN thongtinnguoidunght ON thongtinnguoidunght.taikhoan = nguoidung.taikhoan "
			+ "WHERE thongtinnguoidunght.idnguoidunght = 'NNBN'", nativeQuery = true)
	public List<NguoiDung> danhSachND();
	
	@Modifying
	@Query(value = "INSERT INTO kbs.nguoidung(diachi, ghichu, gioitinh, hoten, matkhau, namsinh, nghenghiep, sdt, taiKhoan) VALUES(:diaChi, :ghiChu, :gioiTinh, :hoTen, :matKhau, :namSinh, :ngheNghiep, :sdt, :taiKhoan)", nativeQuery = true)
	@Transactional
	public void insertNguoiDung(String diaChi, String ghiChu, String gioiTinh, String hoTen, String matKhau, String namSinh, String ngheNghiep, String sdt, String taiKhoan);
}
