package com.ocp;

import java.util.List;

public class AreaCalculator {
	    double calculateArea(List<Shape> shapes) {
	        double totalArea = 0;
	        for (Shape shape : shapes) {
	            totalArea += shape.area();
	        }
	        return totalArea;
	    }
	}
	


