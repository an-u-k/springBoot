package com.demo.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	public JwtRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwtRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "JwtRequest [username=" + username + ", password=" + password + "]";
	}
	

}
