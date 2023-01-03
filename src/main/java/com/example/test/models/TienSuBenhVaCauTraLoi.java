package com.example.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tiensubenhvacautraloi")
public class TienSuBenhVaCauTraLoi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "idtiensubenh", nullable = false)
	private String idTienSuBenh;
	@Column(name = "idcautraloi", nullable = false)
	private String idCauTraLoi;
	@Column(name = "diem", nullable = false)
	private int diem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcautraloi", foreignKey = @ForeignKey(name = "FK_tiensubenh_tiensubenhvacautraloi"), insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer"})
	private CauTraLoi cauTraLoi;
}
