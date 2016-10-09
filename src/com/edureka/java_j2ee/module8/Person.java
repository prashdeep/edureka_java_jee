package com.edureka.java_j2ee.module8;

import javax.persistence.*;
import static javax.persistence.GenerationType.*;

@Entity // Required annotation
@Table(name = "PERSON_TABLE") // can be omitted if table name is exactly same as
								// Class
// name
public class Person {
	

	@Id // Required annotation
	@Column(name = "ID") // can be omitted if column name is same as field-name
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "SALARY")
	private int salary;

	public Person() {
	}

	public Person(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}

	// Getter - Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_name) {
		this.lastName = last_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
}