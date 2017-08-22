package com.edureka.java_j2ee.module3;

public class ShapeClient {

	public static void main(String[] args) {
		Shape square = new Square(200);
	//	System.out.println(square.area());
		
		Shape rectangle = new Rectangle(40,50);
		//System.out.println(rectangle.area());
		
		//Shape shape = new Shape();
		//System.out.println(shape.area());
		
		Shape circle = new Circle(5);
		System.out.println(circle.area());
	}

}
