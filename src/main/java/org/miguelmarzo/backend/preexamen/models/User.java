package org.miguelmarzo.backend.preexamen.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User class.
 */
public class User {

	private long id;
	private String username;
	private String password;
	private String email;
	private List<ChatGroup> chats = new ArrayList<ChatGroup>();

	public User() {

	}

	public User(long id, String username, String password, String email, ArrayList<ChatGroup> chats) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.chats = chats;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ChatGroup> getChats() {
		return chats;
	}

	public void setChats(List<ChatGroup> chats) {
		this.chats = chats;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}

	
}
