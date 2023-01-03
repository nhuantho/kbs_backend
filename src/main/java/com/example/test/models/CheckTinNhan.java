package com.example.test.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckTinNhan {
	private String idChat;
	private String taiKhoan;
	private String tinNhan;
}
