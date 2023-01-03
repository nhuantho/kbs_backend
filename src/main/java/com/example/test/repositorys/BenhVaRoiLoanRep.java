package com.example.test.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.BenhVaRoiLoan;

public interface BenhVaRoiLoanRep extends JpaRepository<BenhVaRoiLoan, Integer>{
	@Query(value = "SELECT * FROM kbs.benhvaroiloan WHERE ctrlid = :id", nativeQuery = true)
	public List<BenhVaRoiLoan> getBVRLById(String id);
}
