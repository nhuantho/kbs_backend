package com.example.test.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.KichBanNguoiKham;

public interface KichBanNguoiKhamRep extends JpaRepository<KichBanNguoiKham, String>{
	@Query(value = "SELECT * FROM kbs.kichbannguoikham WHERE nguoikham LIKE :nguoiKham", nativeQuery = true)
	public KichBanNguoiKham checkKBNK(String nguoiKham);
	
	@Query(value = "SELECT * FROM kbs.kichbannguoikham WHERE nguoikham = :nguoiKham", nativeQuery = true)
	public KichBanNguoiKham checkKB(String nguoiKham);
}
