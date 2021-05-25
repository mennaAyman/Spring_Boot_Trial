package com.edafa.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "chat_message")
public class ChatMessage {

	@Id
	@NonNull
	@Column(name = "chat_id")
	private String chatId;

	@Column(name = "recipent")
	private String recipent;

	@Column(name = "sender")
	private String sender;

	@Column(name = "message")
	private String message;

	@Column(name = "message_status")
	private String messageStatus;

	public String getRecipent() {
		return recipent;
	}

	public void setRecipent(String recipent) {
		this.recipent = recipent;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

}
