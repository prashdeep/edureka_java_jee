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
	
		preparedstatement.setInt(1, 24);
		preparedstatement.setString(2, "Naveen");
		preparedstatement.setString(3, "Kumar");
		preparedstatement.setInt(4, 300);
		preparedstatement.setInt(5, 30);
		preparedstatement.addBatch();
		
		
		preparedstatement.setInt(1,26);
		preparedstatement.setString(2, "Kevin");
		preparedstatement.setString(3, "Bolt");
		preparedstatement.setInt(4, 4000);
		preparedstatement.setInt(5, 28);
		preparedstatement.addBatch();
		
		preparedstatement.setInt(1,55);
		preparedstatement.setString(2, "Kevin");
		preparedstatement.setString(3, "Bolt");
		preparedstatement.setInt(4, 4000);
		preparedstatement.setInt(5, 28);
		preparedstatement.addBatch();
		
	
		
		
		int[] flag = preparedstatement.executeBatch();
		
		System.out.println("Is the data inserted into the table. "+flag);
	}

}
