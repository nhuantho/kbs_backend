package com.example.test.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "botiensubenh")
public class BoTienSuBenh {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "noidung", nullable = false)
	private String noiDung;
	@Column(name = "trongso", nullable = false)
	private int trongSo;
	@Column(name = "tuoi", nullable = false)
	private int tuoi;
	
	@OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true)
	@JoinColumn(name = "idbotiensubenh")
	private List<TienSuBenh> tienSuBenhs = new ArrayList<>();
}
