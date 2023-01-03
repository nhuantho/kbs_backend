package com.example.test.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.BoTienSuBenh;

public interface BoTienSuBenhRep extends JpaRepository<BoTienSuBenh, String>{
	@Query(value = "SELECT * FROM kbs.botiensubenh WHERE tuoi < :tuoi", nativeQuery = true)
	public List<BoTienSuBenh> getBoTienSuBenh(int tuoi);
}
