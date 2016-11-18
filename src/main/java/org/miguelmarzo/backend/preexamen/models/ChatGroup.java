package org.miguelmarzo.backend.preexamen.models;

import java.util.ArrayList;
import java.util.List;

public class ChatGroup {

	private long id;
	private String name;
	private String description;
	private List<User> users = new ArrayList<User>();
	private List<Message> messages = new ArrayList<Message>();

	public ChatGroup() {

	}

	public ChatGroup(long id, String name, String description, List<User> users, List<Message> messages) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
		this.messages = messages;
	}

		
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "ChatGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	
	

}
