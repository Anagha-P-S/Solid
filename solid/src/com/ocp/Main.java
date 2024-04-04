package com.ocp;

import java.util.ArrayList;
import java.util.List;

public class Main {
	    public static void main(String[] args) {
	        List<Shape> shapes = new ArrayList<>();
	        shapes.add(new Rectangle(4, 5));
	        shapes.add(new Circle(3));

	        AreaCalculator calculator = new AreaCalculator();
	        double totalArea = calculator.calculateArea(shapes);
	        System.out.println("Total area: " + totalArea);
	    }
	}
	


