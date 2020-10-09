package com.edureka.java_j2ee.module3;

public class Circle extends Shape{
	public int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	
	public  double area(){
		return 3.142*radius*radius;
	}

}
