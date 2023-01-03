package com.example.test.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.TienSuBenh;

public interface TienSuBenhRep extends JpaRepository<TienSuBenh, String>{
	@Query(value = "SELECT tiensubenh.id, tiensubenh.idbotiensubenh, tiensubenh.noidung FROM kbs.tiensubenh"
			+ "INNER JOIN kbs.botiensubenh ON botiensubenh.id = tiensubenh.idbotiensubenh"
			+ "WHERE tuoi < :tuoi AND tiensubenh.id = :id", nativeQuery = true)
	public List<TienSuBenh> getTienSuBenh(int tuoi, String id);
}
