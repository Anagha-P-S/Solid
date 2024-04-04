package com.ty;

public class Main {
	
	                                                      //SRP
	
	    public static void main(String[] args) {
	        User user1 = new User("anagha", "anagha@gmail.com");
	        User user2 = new User("nayana", "nayana@gmail.com");

	        UserManager userManager = new UserManager();
	        userManager.addUser(user1);
	        userManager.addUser(user2);

	        userManager.displayUsers();
	    }
	}
	
	




