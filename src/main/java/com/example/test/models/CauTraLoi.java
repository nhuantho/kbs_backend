package com.example.test.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cautraloi")
public class CauTraLoi {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "noidung", nullable = false)
	private String noiDung;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cauTraLoi", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<TienSuBenhVaCauTraLoi> tienSuBenhVaCauTraLois = new ArrayList<>();
}
