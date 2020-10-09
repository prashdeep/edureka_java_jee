package com.edureka.java_jee.module6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createtable {
	static String path,  username,  password;
	
	public createtable(){
		//Load the properties file 
		path  = "";
		username = "";
		password = "";
		
	}
	public static void main(String args[]) throws Exception {

		// Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
        //"jdbc:oracle:thin:@myhost:1521:orcl", "scott", "tiger"
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
		System.out.println("Connected to the database");

		Statement st = con.createStatement();

		// System.out.println("Before creating the table...");
		// st.execute("create table students(number varchar(10),name varchar(20))");
		// System.out.println("table created");

		st.executeUpdate("insert into students values(3, 'Pradeep')");
		st.executeUpdate("insert into students values(4, 'Praveen')");
		st.executeUpdate("insert into students values(5, 'Navneesh')");
		st.executeUpdate("insert into students values(6, 'Pranay')");
		st.executeUpdate("insert into students values(7, 'Jyoti')");
		System.out.println("  row inserted");

		// st.executeUpdate("update students set name='kevin mathew' where name='Pradeep'");
		System.out.println("row updated");

		st.close();
		con.close();
		System.out.println("Connection closed...");

	}
}
