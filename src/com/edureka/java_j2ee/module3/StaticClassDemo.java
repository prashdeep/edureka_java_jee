package com.edureka.java_j2ee.module3;

public class StaticClassDemo {
	
	private static int noOfInstances;
	
	private String name;
	
	private int age;
	
	private String dob;
	
	public StaticClassDemo(){
		noOfInstances= noOfInstances+1;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getDob() {
		return dob;
	}

	void setDob(String dob) {
		this.dob = dob;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("1>> "+ noOfInstances);
		StaticClassDemo kiran = new StaticClassDemo();
		kiran.setAge(14);
		kiran.setName("kiran");
		System.out.println("2  >> "+ noOfInstances);
		
		StaticClassDemo ramesh = new StaticClassDemo();
		ramesh.setAge(16);
		ramesh.setName("ramesh");
		
		System.out.println(" 3 >> "+StaticClassDemo.noOfInstances);
		
		System.out.println(ramesh.getAge());
		System.out.println(kiran.getAge());
		System.out.println("4 >> "+ noOfInstances);
		System.out.println("5 >> "+ noOfInstances);
		
		StaticClassDemo obj = new StaticClassDemo();
		
		System.out.println("6 >> "+ noOfInstances);
		System.out.println("7 >> "+ noOfInstances);
		
	}

}
