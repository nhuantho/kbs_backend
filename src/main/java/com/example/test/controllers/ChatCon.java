package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.CheckTinNhan;
import com.example.test.models.TinNhan;
import com.example.test.services.ChatService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ChatCon {
	@Autowired
	private ChatService chatService;
	
	@PostMapping(path = "/luuTinNhan")
	public String luuTinNhan(@RequestBody CheckTinNhan checkTinNhan) {
		return chatService.luuTinNhan(checkTinNhan);
	}
	
	@PostMapping(path = "/getTinNhanByTK")
	public List<TinNhan> getTinNhanByTK(@RequestBody CheckTinNhan checkTinNhan) {
		return chatService.getTinNhanByTK(checkTinNhan);
	}
	
	@GetMapping(path = "/getTinNhanByND/{taiKhoan}")
	public List<TinNhan> getTinNhanByND(@PathVariable String taiKhoan) {
		return chatService.getTinNhanByND(taiKhoan);
	}
}
