package com.ty;

public class User {
	//SRP
	
	    private String username;
	    private String email;

	    public User(String username, String email) {
	        this.username = username;
	        this.email = email;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String newUsername) {
	        this.username = newUsername;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String newEmail) {
	        this.email = newEmail;
	    }
	}

	

	


