package com.example.test.repositorys;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.BenhCuaBenhNhan;

public interface BenhCuaBenhNhanRep extends JpaRepository<BenhCuaBenhNhan, Integer>{
	@Query(value = "SELECT * FROM kbs.benhcuabenhnhan WHERE taikhoan = :taiKhoan", nativeQuery = true)
	public List<BenhCuaBenhNhan> getBCBNByTK(String taiKhoan);
	
	@Modifying
	@Query(value = "UPDATE kbs.benhcuabenhnhan SET ttnguoinha = :ttNguoiNha WHERE taikhoan = :taiKhoan ORDER BY thoigian DESC  LIMIT 1", nativeQuery = true)
	@Transactional
	public void updateTTNH(String taiKhoan, String ttNguoiNha);
	
	@Modifying
	@Query(value = "INSERT INTO kbs.benhcuabenhnhan(idbenh, taikhoan, idchat, nguoinha, ttnguoinha, thoigian) VALUES(:idBenh, :taiKhoan, :idChat, :nguoiNha, :ttNguoiNha, CURRENT_TIMESTAMP())", nativeQuery = true)
	@Transactional
	public void insertBCBN(String idBenh, String taiKhoan, String idChat, String nguoiNha, String ttNguoiNha);
}
