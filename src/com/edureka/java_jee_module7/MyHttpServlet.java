package com.edureka.java_jee_module7;

//Import required java libraries
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Extend HttpServlet class
public class MyHttpServlet extends HttpServlet {

	private static final long serialVersionUID = -7639740861354332842L;

	Connection con;
	PreparedStatement ps;

	public void init() throws ServletException {
		// Do required initialization
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");

			con = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");
			ps = con.prepareStatement("insert into student (number, name) values (?,?)");
			System.out.println("Connected to the database");
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		try {
    		String name1 = "Avaneesh";
			String name2 = "Chetan";
			String name3 = "Rakshit";

			ps.setString(2, name1);
			ps.setString(1, "15");
			ps.addBatch();

			ps.setString(2, name2);
			ps.setString(1, "16");
			ps.addBatch();

			ps.setString(2, name3);
			ps.setString(1, "17");
			ps.addBatch();

			int[] results = ps.executeBatch();
			
			System.out.println(Arrays.toString(results));
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void destroy() {
		System.out.println("Calling the destory functioin for closing the connection....");
		
	}
}
