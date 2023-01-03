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
@Table(name = "kichbannguoikham")
public class KichBanNguoiKham {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "nguoikham", nullable = true)
	private String nguoiKham;
}
