package com;

import org.hibernate.validator.constraints.NotEmpty;

public class Login 
{
	private String username,password;

	@NotEmpty(message="username can not be empty")
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	@NotEmpty(message="password can not be empty")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
