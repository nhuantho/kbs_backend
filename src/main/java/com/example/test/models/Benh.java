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
@Table(name = "benh")
public class Benh {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "tenbenh", nullable = false)
	private String tenBenh;
	@Column(name = "loikhuyen", nullable = true)
	private String loiKhuyen;
}
