package com.edureka.java_jee.module6;

//package database;
import java.sql.*;

public class createtable {
	public static void main(String args[]) throws Exception {

		// Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");
		System.out.println("Connected to the database");

		Statement st = con.createStatement();

		// System.out.println("Before creating the table...");
		// st.execute("create table student(number varchar(10),name
		// varchar(20))");
		// System.out.println("table created");

		st.executeUpdate("insert into student values('109', 'Tenzin')");
		System.out.println("  row inserted");

		// st.executeUpdate("update student set name='kevin mathew' where
		// name='kevin'");
		System.out.println("row updated");

		con.close();
		System.out.println("Connection closed...");

	}
}
