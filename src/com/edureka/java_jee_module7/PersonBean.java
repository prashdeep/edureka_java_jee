package com.edureka.java_jee_module7;

import java.io.Serializable;

public class PersonBean implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String firstName = null;
	private String lastName = null;
	private int age = 0;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PersonBean [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
