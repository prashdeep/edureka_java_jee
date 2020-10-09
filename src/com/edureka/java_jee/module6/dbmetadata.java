package com.edureka.java_jee.module6;

import java.sql.*;

public class dbmetadata {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");
		System.out.println("Connected to the database");

		DatabaseMetaData rsmd = con.getMetaData();

		System.out.println("database name=" + rsmd.getDatabaseProductName());
		System.out.println("database version=" + rsmd.getDatabaseProductVersion());
		System.out.println("Driver version=" + rsmd.getDriverVersion());
		System.out.println("Table name size=" + rsmd.getMaxTableNameLength());
		System.out.println("max no. of columns=" + rsmd.getMaxColumnsInTable());
		con.close();
	}

}
