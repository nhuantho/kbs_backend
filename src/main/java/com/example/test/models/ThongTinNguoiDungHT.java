package com.example.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "thongtinnguoidunght")
public class ThongTinNguoiDungHT {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "taikhoan", nullable = false)
	private String taiKhoan;
	@Column(name = "idnguoidunght", nullable = false)
	private String idNguoiDungHT;
}
