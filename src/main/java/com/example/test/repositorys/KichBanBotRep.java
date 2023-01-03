package com.example.test.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.KichBanBot;

public interface KichBanBotRep extends JpaRepository<KichBanBot, String>{
	@Query(value = "SELECT * FROM kbs.kichbanbot WHERE idkichbannguoikham = :idKichBanNguoiKham", nativeQuery = true)
	public KichBanBot checkKBB(String idKichBanNguoiKham);
	
	@Query(value = "SELECT * FROM kbs.kichbanbot WHERE WHERE id = :id AND bot LIKE '%người thân%'", nativeQuery = true)
	public KichBanBot checkKBBById(String id);
}
