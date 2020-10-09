package com.edureka.java_jee.module6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class DatabaseSelectExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");
		String sqlQuery = "select * from employee";
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sqlQuery);
		
		while(result.next()){
			int id = result.getInt(1);
			String firstName = result.getString(2);
			String lastName = result.getString(3);
			int salary = result.getInt(4);
			int age = result.getInt(5);
			Date doj = result.getDate(6);
			
			System.out.println("--------------------------------");
			System.out.println("id > "+id);
			System.out.println("firstname > "+firstName);
			System.out.println("lastName > "+lastName);
			System.out.println("salary > "+salary);
			System.out.println("age > "+age);
			System.out.println("doj > "+doj);
			System.out.println("--------------------------------");
		}
		statement.close();
		connection.close();
	}
}
