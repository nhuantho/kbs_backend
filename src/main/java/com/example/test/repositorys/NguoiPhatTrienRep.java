package com.example.test.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.models.NguoiPhatTrien;

public interface NguoiPhatTrienRep extends JpaRepository<NguoiPhatTrien, Integer>{
	@Query(value = "SELECT * FROM kbs.nguoiphattrien WHERE taikhoan = :taiKhoan", nativeQuery = true)
	public List<NguoiPhatTrien> getGiaTri(String taiKhoan);
}
