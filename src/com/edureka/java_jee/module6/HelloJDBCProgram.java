package com.edureka.java_jee.module6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloJDBCProgram {
	public static void main(String[] args) {

		try (	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "welcome");
				Statement statement = connection.createStatement()){
			
			
			//statement.execute("insert into student(id, name,age ) values (3,'Kiran', 34)");

			ResultSet rs = statement.executeQuery("select * from student left join address on student.id=address.student_id");

			while (rs.next()) {
				System.out.println("----------------------------");
				System.out.println("Id is " + rs.getInt(1));
				System.out.println("name is " + rs.getString(2));
				System.out.println("age is " + rs.getInt(3));
				System.out.println("----------------------------");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
