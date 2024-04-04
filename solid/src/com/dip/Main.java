package com.dip;


	public class Main {
	    public static void main(String[] args) {
	        Manager manager = new Manager();
	        Worker human = new Human();
	        Worker robot = new Robot();

	        manager.setWorker(human);
	        manager.manage(); // Human is working.

	        manager.setWorker(robot);
	        manager.manage(); // Robot is working.
	    }
	
	

}



