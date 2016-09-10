package com.edureka.java_jee_module_4.access_modifiers;

public class StaticDemo {
	
	private static int rollNo;
	
	private String name;
	
	private int age;
	
	
	public StaticDemo(String n, int i){
		name = n;
		age = i;		
		rollNo++;
	}
	
	public static int getRollNo() {
		return rollNo;
	}

	public static void setRollNo(int rollNo) {
		StaticDemo.rollNo = rollNo;
	}

	public String getName() {
		System.out.println(rollNo);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public static void main(String[] dsadsad) {
		StaticDemo student = new StaticDemo("Pradeep", 22);
		student.getAge();
		StaticDemo student2 = new StaticDemo("Naveen", 22);
		StaticDemo student3 = new StaticDemo("John", 28);
		
		System.out.println(rollNo);
		
	}

	

}
