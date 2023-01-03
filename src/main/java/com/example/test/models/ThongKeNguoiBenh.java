package com.example.test.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThongKeNguoiBenh {
	private String taiKhoan;
	private String hoTen;
	private String tenBenh;
	private String tiLe;
	private String thoiGian;
	private String ttNguoiNha;
}
