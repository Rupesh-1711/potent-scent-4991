package com.masai.bean;

public class Administrator {

	private String userName;
	private String password;
	@Override
	public String toString() {
		return "Administrator [userName=" + userName + ", password=" + password + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Administrator(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
}
