package com.edureka.java_jee.module6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyFirstJDBCProgram {
	public static void main(String[] args) throws ClassNotFoundException {
		java.sql.PreparedStatement ps = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/NEWSTUDENTS", "root", "welcome");
			ps = conn.prepareStatement("insert into Student values(?,?,?,?)");
			// stmt.execute("create table Student ( ID INT, NAME VARCHAR (20),
			// CITY VARCHAR (20), STATE VARCHAR(20))");
			ps.setInt(1, 3);
			ps.setString(2, "Naveen");
			ps.setString(3, "Chennai");
			ps.setString(4, "MP");
			ps.execute();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
