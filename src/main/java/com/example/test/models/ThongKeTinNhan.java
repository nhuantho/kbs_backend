package com.example.test.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThongKeTinNhan {
	private String taiKhoan;
	private String hoTen;
	private int soLuong;
}
