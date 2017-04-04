package com.main.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="user_info")
public class User {
	@Column( name="username")
	private String username;
	@Column(name ="email")
	private String email;
	@Column (name="passcode")
	private String password;
	@Column (name="salt")
	private byte[] salt;
	
	public User(String username, String email, String password, byte[] salt) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.salt = salt;
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(){}

	@Id
	@Column (name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	public byte[] getSalt() {
		return salt;
	}

	public void setSalt(byte[] salt) {
		this.salt = salt;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
