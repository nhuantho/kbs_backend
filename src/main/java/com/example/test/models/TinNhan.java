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
@Table(name = "tinnhan")
public class TinNhan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "taikhoan", nullable = false)
	private String taiKhoan;
	@Column(name = "idchat", nullable = true)
	private String idChat;
	@Column(name = "nguoikham", nullable = true)
	private String nguoiKham;
	@Column(name = "bot", nullable = true)
	private String bot;
	@Column(name = "ctrlid", nullable = true)
	private String ctrlID;
	@Column(name = "thoigian", nullable = false)
	private String thoiGian;
}
