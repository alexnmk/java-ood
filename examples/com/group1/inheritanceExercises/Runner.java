package com.fdmgroup.inheritanceExercises;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminUser admin1 = new AdminUser();
		AdminUser admin2 = new AdminUser();
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		admin1.setFullName("Alex Ng");
		admin1.setUsername("alexng");
		admin2.setFullName("Ben Chu");
		admin2.setUsername("benchu");
		customer1.setFullName("Chloe Wong");
		customer1.setUsername("chloewong");
		customer2.setFullName("Joe Chan");
		customer2.setUsername("joechan");
		admin1.changePassword("abc", "abc");
		admin2.changePassword("abc", "abd");
		admin1.accessWebsite();
		customer1.accessWebsite();
		
		UserAccountManager userAccountManager = new UserAccountManager();
		userAccountManager.addUser(admin1);
		userAccountManager.addUser(admin2);
		userAccountManager.addUser(customer1);
		userAccountManager.addUser(customer2);
		
		System.out.println(userAccountManager.login("alexng", "abc"));
	}

}
