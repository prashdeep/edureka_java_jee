package com.edureka.java_jee.module6;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");
		Date date = new Date(System.currentTimeMillis());
		String sqlQuery = "insert into employee (id, first_name, last_name, salary, age) values(?,?,?,?,? )";
		PreparedStatement preparedstatement = connection.prepareStatement(sqlQuery);
	
		preparedstatement.setInt(1, 22);
		preparedstatement.setString(2, "Naveen");
		preparedstatement.setString(3, "Kumar");
		preparedstatement.setInt(4, 30000);
		preparedstatement.setInt(5, 30);
		
		
		
		preparedstatement.setInt(1,24);
		preparedstatement.setString(2, "Kevin");
		preparedstatement.setString(3, "Bolt");
		preparedstatement.setInt(4, 40000);
		preparedstatement.setInt(5, 28);
		
		
		preparedstatement.setInt(1,25);
		preparedstatement.setString(2, "Kevin");
		preparedstatement.setString(3, "Bolt");
		preparedstatement.setInt(4, 40000);
		preparedstatement.setInt(5, 28);
		preparedstatement.addBatch(sqlQuery);
		
	
		
		
		int[] flag = preparedstatement.executeBatch();
		
		System.out.println("Is the data inserted into the table. "+flag);
	}

}
