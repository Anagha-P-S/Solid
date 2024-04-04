package com.isp;


	public class Mainn {
	    public static void main(String[] args) {
	        Workable human = new Humann();
	        Workable robot = new Robott();

	        human.work();
	        ((Feedable) human).eat(); // Human can eat

	        robot.work(); // Robot can work
	    }
	}
	




