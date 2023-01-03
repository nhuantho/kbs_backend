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
@Table(name = "nguoidung")
public class NguoiDung {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "hoten", nullable = false)
	private String hoTen;
	@Column(name = "gioitinh", nullable = false)
	private String gioiTinh;
	@Column(name = "namsinh", nullable = false)
	private String namSinh;
	@Column(name = "sdt", nullable = false)
	private String sdt;
	@Column(name = "diachi", nullable = false)
	private String diaChi;
	@Column(name = "nghenghiep", nullable = false)
	private String ngheNghiep;
	@Column(name = "ghichu", nullable = true)
	private String ghiChu;
	@Column(name = "taikhoan", nullable = false, unique = true)
	private String taiKhoan;
	@Column(name = "matkhau", nullable = false)
	private String matKhau;
}
