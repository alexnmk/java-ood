package com.fdmgroup.inheritanceExercises;

public abstract class UserAccount {
	private String username;
	private String password;
	private String fullName;
	
	public UserAccount() {};
	public UserAccount(String username, String password, String fullName) {
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}
	public String getFullName() {
		return fullName;
	}
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return username;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean changePassword(String newPass, String confirmPass) {
		if (newPass==confirmPass) {
			this.password = newPass;
			return true;
		}
		else {
			return false;
		}
	}
	public abstract void accessWebsite();
}
