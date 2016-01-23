package com.edureka.java_jee.module6;

import java.sql.*;

public class UpdateExample {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");
		System.out.println("Connected to the database");
		
		Statement stmt = con.createStatement();
		stmt.execute("update student set name='John' where name='Praveen'");
        stmt.close();
		con.close();
	}

}
