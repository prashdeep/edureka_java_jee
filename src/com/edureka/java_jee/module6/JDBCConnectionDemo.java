package com.edureka.java_jee.module6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
		
		String insertStudents = "insert into Students(name, grade) values (? , ?)";

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "welcome");
				Statement statement = connection.createStatement(); PreparedStatement ps = connection.prepareStatement(insertStudents)) {
			
			connection.setAutoCommit(false);
			
			
			//String createTable = "create table Students (id int auto_increment primary key, name varchar(20), grade int not null);";
			//String insertStudents = "insert into Students(name, grade) values ('Sam' , 22)";
			
			// String updateStudents = "update Students set grade = 2";
			// String deleteStudents = "delete from Students where name='Pradeep'";
			//String selectStudents = "select * from Students";
			ps.setString(1, "Dustin");
			ps.setInt(2, 6);
			ps.addBatch();
			ps.setString(1, "Frank");
			ps.setInt(2, 8);
			ps.addBatch();
			ps.setString(1, "Nathan");
			ps.setInt(2, 6);
			ps.addBatch();
			ps.setString(1, "Jamy");
			ps.setInt(2, 2);
			ps.addBatch();
			ps.setString(1, "Rajesh");
			ps.setInt(2, 9);
			ps.addBatch();
			
			ps.executeBatch();
			try {
			connection.commit();
			}catch (Exception e) {
				connection.rollback();
			}
			
			/*try (ResultSet rs = statement.executeQuery(selectStudents)) {
				while (rs.next()) {
					System.out.print(" ID >> " + rs.getInt(1));
					System.out.print(" , Name >> " + rs.getString(2));
					System.out.print(" , Grade >> " + rs.getInt(3));
					System.out.println();
				}
			}*/
			// int rowsAffected = statement.executeUpdate(deleteStudents);
			// System.out.println("The number of rows update is "+rowsAffected);
			// statement.execute("drop table Students;");
		} catch (SQLException | NullPointerException e) {
			// exception handling
		}
	}

}
