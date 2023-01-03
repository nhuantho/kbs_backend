package com.example.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chitietroiloan")
public class ChiTietRoiLoan {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "clrlid", nullable = false)
	private String clrlID;
	@Column(name = "tenroiloan", nullable = false)
	private String tenRoiLoan;
	@Column(name = "noidung", nullable = true)
	private String noiDung;
	@Column(name = "vidu", nullable = true)
	private String viDu;
}
