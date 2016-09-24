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
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");
		System.out.println("Connected to the database");

		Statement st = con.createStatement();

		// System.out.println("Before creating the table...");
		// st.execute("create table students(number varchar(10),name varchar(20))");
		// System.out.println("table created");

		st.executeUpdate("insert into student values(3, 'Pradeep', 32)");
		st.executeUpdate("insert into student values(4, 'Praveen', 33)");
		st.executeUpdate("insert into student values(5, 'Navneesh', 44)");
		st.executeUpdate("insert into student values(6, 'Pranay', 33)");
		st.executeUpdate("insert into student values(7, 'Jyoti', 56)");
		System.out.println("  row inserted");

		// st.executeUpdate("update students set name='kevin mathew' where name='Pradeep'");
		//System.out.println("row updated");

		st.close();
		con.close();
		System.out.println("Connection closed...");

	}
}
