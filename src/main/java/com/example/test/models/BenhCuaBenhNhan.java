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
@Table(name = "benhcuabenhnhan")
public class BenhCuaBenhNhan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "taikhoan", nullable = false)
	private String taiKhoan;
	@Column(name = "idchat", nullable = true)
	private String idChat;
	@Column(name = "idbenh", nullable = false)
	private String idBenh;
	@Column(name = "nguoinha", nullable = true)
	private String nguoiNha;
	@Column(name = "ttnguoinha", nullable = true)
	private String ttNguoiNha;
	@Column(name = "thoigian", nullable = false)
	private String thoiGian;
}
