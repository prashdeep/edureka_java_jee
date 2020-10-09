package com.edureka.java_jee.module6;

import java.sql.*;

public class RollBackExample {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/NEWSTUDENTS", "root", "welcome");
		System.out.println("Connected to the database");

		Statement stmt = con.createStatement();
		con.setAutoCommit(false);
		stmt.addBatch("update student set name='Pradeep KUMAR #' where name='Pradeep'");
		stmt.addBatch("insert into student values(6,'Asha','Kochi', 'Kerala' ,'dfsdfsdfsdf')");
		try {
			stmt.executeBatch();
			System.out.println("batch executed");
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
				System.out.println("batch cancelled");
				e.printStackTrace();
			} catch (Exception e1) {
				System.out.println(e1);
			}
			con.close();
		}
	}

}
