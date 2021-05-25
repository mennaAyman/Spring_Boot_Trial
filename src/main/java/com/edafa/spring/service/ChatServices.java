package com.edafa.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edafa.spring.entity.ChatMessage;
import com.edafa.spring.entity.User;
import com.edafa.spring.repository.UserRepository;

import java.util.List;

@Service
public class ChatServices {

	@Autowired
	UserRepository userRepository;

//	@Autowired
//	User user;
	
	
	ChatMessage chatMessage = new ChatMessage();

	public List<User> getOnlineUsers () {
		List<User> users =  userRepository.findByStatus("online");
		for(int i = 0; i<users.size(); i ++) {
			System.out.println(users.get(i).getUserName());
		}
		return users;
	}
	
	public String sendMessage(String sender, String recipent, String message) {
		User messageRecipent = userRepository.findByUserName(recipent);
		if (messageRecipent != null) {
			chatMessage.setMessage(message);
			if ((messageRecipent.getStatus()).equals("online")) {
				chatMessage.setMessageStatus("sent");
				return "sent";
			} else {
				chatMessage.setMessageStatus("not sent");
				return "not sent";
			}
		} else {
			System.out.println("user not found, username is incorrect");
			return "user not found, username is incorrect";
		}
	}
	
}

