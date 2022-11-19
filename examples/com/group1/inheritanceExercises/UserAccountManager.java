package com.fdmgroup.inheritanceExercises;

import java.util.ArrayList;

public class UserAccountManager {
	//aggregation
	private ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();
	
	public void addUser(UserAccount user) {
		userAccounts.add(user);
	}
	public boolean login(String username, String password) {
		for (UserAccount userAccount : userAccounts) {
			if (userAccount.getUsername() == username && userAccount.getPassword() == password) {
				return true;
			}	
		}
		return false;
	}
}
