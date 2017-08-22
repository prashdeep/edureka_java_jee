package com.edureka.java_jee.module6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloJDBCProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "welcome");
		String insertQuery = "insert into student (id, name, age)  values (?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(insertQuery);
		statement.setInt(1, 5);
		statement.setString(2, "Ganesh");
		statement.setInt(3, 30);

		statement.execute();
		/*
		 * ResultSet rs = statement.executeQuery("select * from student");
		 * 
		 * while(rs.next()){ System.out.println("Id is "+rs.getInt(1));
		 * System.out.println("name is "+rs.getString(2)); System.out.println(
		 * "age is "+rs.getInt(3)); }
		 */

		statement.close();
		connection.close();
	}

}
