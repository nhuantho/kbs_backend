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
@Table(name = "idchat")
public class IDChat {
	@Id
	@Column(name = "idchat", nullable = false)
	private String idChat;
	@Column(name = "taikhoan", nullable = false)
	private String taiKhoan;
	@Column(name = "ghichu", nullable = true)
	private String ghiChu;
}
