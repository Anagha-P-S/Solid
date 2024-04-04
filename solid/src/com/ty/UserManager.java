package com.ty;

import java.util.ArrayList;
import java.util.List;

public class UserManager {                                    //SRP
	
	    private List<User> users = new ArrayList<>();

	    public void addUser(User user) {
	        users.add(user);
	    }

	    public void removeUser(User user) {
	        users.remove(user);
	    }

	    public void displayUsers() {
	        for (User user : users) {
	            System.out.println("Username: " + user.getUsername() + ", Email: " + user.getEmail());
	        }
	    }
	}

