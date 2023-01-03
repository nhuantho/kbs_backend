package com.example.test.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.Benh;

public interface BenhRep extends JpaRepository<Benh, String>{
	@Query(value = "SELECT * FROM kbs.benh WHERE id = :id", nativeQuery = true)
	public Benh getBenhById(String id);
}
