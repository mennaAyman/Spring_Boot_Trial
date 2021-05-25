package com.edafa.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edafa.spring.entity.User;
import com.edafa.spring.service.ChatServices;





@RestController
public class DemoController {
	
	@Autowired
	ChatServices chatServices;
	
	@GetMapping("/hello/onlineUsers")
	public List<User> onlineUsers(){
		chatServices.getOnlineUsers();
		return chatServices.getOnlineUsers();
	}
	
	/*
	 * @GetMapping("/hello") public List<String> hello(){ return List.of("Hello",
	 * "World"); }
	 */
		
		@RequestMapping("/hello/sendMessage")
		@GetMapping("/getBody")
		public String sendMessage(@RequestParam String sender,@RequestParam String recipent,@RequestParam String message) {
			//chatServices.sendMessage(sender, recipent, message);
			return chatServices.sendMessage(sender, recipent, message);
		}
		
	}


