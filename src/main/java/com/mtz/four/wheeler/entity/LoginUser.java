package com.mtz.four.wheeler.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginUser {
	
	@Id
	private String name;
	private String password;
	public LoginUser() {
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginUser [name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	

}
