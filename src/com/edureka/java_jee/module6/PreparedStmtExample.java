package com.edureka.java_jee.module6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class PreparedStmtExample {

	public static void main(String[] args) throws ClassNotFoundException {

		Connection con = null;
		PreparedStatement ps = null;
		String query = "insert into students (number, name) values (?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");

			con = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");
			System.out.println("Connected to the database");

			ps = con.prepareStatement(query);

		
			String name1 = "Praveen";
			String name2 = "Chandan";
			String name3 = "Ramesh";

			ps.setString(1, "32");
			ps.setString(2, "Kiran");
		
			//ps.addBatch();

		//	ps.setString(2, name2);
		//	ps.setString(1, "12");
		//	ps.addBatch();

			//ps.setString(2, name3);
			///ps.setString(1, "13");
			//ps.addBatch();

			//int[] results = ps.executeBatch();
			boolean result = ps.execute();
			
			System.out.println(result);

			//System.out.println(Arrays.toString(results));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}