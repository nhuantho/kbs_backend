package com.example.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.models.IDChat;
import com.example.test.repositorys.IDChatRep;

@Service
public class IDChatService {
	@Autowired
	private IDChatRep idChatRep;
	
	public IDChat checkIDChat(String taiKhoan) {
		return idChatRep.checkIdChat(taiKhoan);
	}
	
	public String checkIDChatByID(IDChat chat) {
		IDChat idChat = idChatRep.findById(chat.getIdChat()).orElse(null);
		if(idChat != null) {
			return "Đã tồn tại";
		}else {
			idChatRep.insertIDChat(chat.getIdChat(), chat.getTaiKhoan(), chat.getGhiChu());
			return "Thành công";
		}
	}
}
