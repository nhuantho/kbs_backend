package com.example.test.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.NguoiDungHT;

public interface NguoiDungHTRep extends JpaRepository<NguoiDungHT, String>{
	@Query(value = "SELECT * FROM kbs.nguoidunght WHERE id = :idnguoidunght", nativeQuery = true)
	public NguoiDungHT getNguoiDungHTByTK(String idnguoidunght);
}
