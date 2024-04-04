package com.isp;


	public	class Robot implements Worker {
	    public void work() {
	        System.out.println("Robot is working.");
	    }

	    public void eat() {
	        // Robots don't eat, violating the ISP
	        throw new UnsupportedOperationException("Robots don't eat.");
	    }
	}

