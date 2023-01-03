package com.example.test.repositorys;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.IDChat;

public interface IDChatRep extends JpaRepository<IDChat, String>{
	@Query(value = "SELECT * FROM kbs.idchat WHERE taikhoan = :taiKhoan", nativeQuery = true)
	public IDChat checkIdChat(String taiKhoan);
	
	@Modifying
	@Query(value = "INSERT INTO kbs.idchat(idchat, taikhoan, ghichu) VALUES(:idChat, :taiKhoan, :ghiChu)", nativeQuery = true)
	@Transactional
	public void insertIDChat(String idChat, String taiKhoan, String ghiChu);
}
