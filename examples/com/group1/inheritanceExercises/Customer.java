package com.fdmgroup.inheritanceExercises;

public class Customer extends UserAccount {
	public Customer() {
		super();
	}
	public void accessWebsite() {
		System.out.println("accessing website as customer");
	}
}
