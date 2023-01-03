package com.example.test.repositorys;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.TinNhan;

public interface TinNhanRep extends JpaRepository<TinNhan, Integer>{
	@Query(value = "SELECT * FROM kbs.tinnhan WHERE taikhoan = :taiKhoan AND idchat = :idChat ORDER BY thoigian", nativeQuery = true)
	public List<TinNhan> getTinNhanByTK(String taiKhoan, String idChat);
	
	@Query(value = "SELECT * FROM kbs.tinnhan WHERE taikhoan = :taiKhoan ORDER BY thoigian", nativeQuery = true)
	public List<TinNhan> getTinNhanBYND(String taiKhoan);
	
	@Query(value = "SELECT * FROM kbs.tinnhan WHERE taikhoan = :taiKhoan AND DATE(thoigian) = CURDATE() AND ctrlid != '' ORDER BY thoigian DESC LIMIT 1", nativeQuery = true)
	public TinNhan getTinNhan(String taiKhoan);
	
	@Modifying
	@Query(value = "INSERT INTO kbs.tinnhan(idchat, nguoikham, bot, taikhoan, ctrlid, thoigian) VALUES(:idChat, :nguoiKham, :bot, :taiKhoan, :ctrlID, CURRENT_TIMESTAMP())", nativeQuery = true)
	@Transactional
	public void insertTinNhan(String idChat, String nguoiKham, String bot, String ctrlID, String taiKhoan);
}
