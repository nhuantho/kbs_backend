package com.example.test.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraLoiCauHoi {
	private String idBTSB;
	private String noiDungBTSB;
	private int trongSo;
	private String idTSB;
	private String noiDungTSB;
	private String idCTL;
	private String noiDungCTL;
	private int idTSBVCTL;
	private int diem;
	private int tuoi;
}
