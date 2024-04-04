package com.isp;


	public class Main {
	    public static void main(String[] args) {
	        Worker human = new Human();
	        Worker robot = new Robot();

	        human.work();
	        human.eat();

	        robot.work();
	        // This will throw an exception since Robot doesn't support eat()
	        robot.eat();
	    }
	}




