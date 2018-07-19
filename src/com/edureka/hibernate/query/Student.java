package com.edureka.hibernate.query;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hibernate_student")
public class Student {

	public Student() {
		super();
	}

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="name")
	private String name;

	@Column(name="dob")
	private Date dob;
	
	@Column(name="grade")
	private int grade;
	
	public Student(int id, String name, Date date, int grade) {
		this.id = id;
		this.name = name;
		this.dob = date;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", grade=" + grade + "]";
	}

}
