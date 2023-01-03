package com.example.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.IDChat;
import com.example.test.services.IDChatService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class IDChatCon {
	@Autowired
	private IDChatService idChatService;
	
	@GetMapping(path = "/checkIDChat/{taiKhoan}")
	public IDChat checkIDChat(@PathVariable String taiKhoan) {
		return idChatService.checkIDChat(taiKhoan);
	}
	
	@PostMapping(path = "/checkIDChatByID")
	public String checkIDChatByID(@RequestBody IDChat idChat) {
		return idChatService.checkIDChatByID(idChat);
	}
}
