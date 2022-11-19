package com.fdmgroup.inheritanceExercises;

public class AdminUser extends UserAccount {
	public AdminUser() {
		super();
	}
	public void accessWebsite() {
		System.out.println("accessing website with admin rights");
	}
}
