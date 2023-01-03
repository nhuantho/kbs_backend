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
@Table(name = "kichbanbot")
public class KichBanBot {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "bot", nullable = true)
	private String bot;
	@Column(name = "idkichbannguoikham", nullable = false)
	private String idKichBanNguoiKham;
	@Column(name = "ctrlid", nullable = true)
	private String ctrlID;
}
