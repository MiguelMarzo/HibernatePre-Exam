package org.miguelmarzo.backend.preexamen.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Message {

	private long id;
	private String content;
	private Date messageDate;
	private User user;
	private ChatGroup chatGroup;

	public Message() {

	}

	public Message(long id, String content, Date messageDate, User user, ChatGroup chatGroup) {
		this.id = id;
		this.content = content;
		this.messageDate = messageDate;
		this.user = user;
		this.chatGroup = chatGroup;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ChatGroup getChatGroup() {
		return chatGroup;
	}

	public void setChatGroup(ChatGroup chatGroup) {
		this.chatGroup = chatGroup;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", messageDate=" + messageDate + "]";
	}



}
