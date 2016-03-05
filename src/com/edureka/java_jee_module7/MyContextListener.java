package com.edureka.java_jee_module7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * <listener>
 *   <listener-class></listener-class>
 * </listener>
 */
public class MyContextListener implements ServletContextListener {
	ServletContext ctx;
	Connection con;
	Statement s;
	PreparedStatement ps;
	ResultSet rs;
	int count;

	public void contextInitialized(ServletContextEvent sce) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "welcome");

			ctx = sce.getServletContext();
			ctx.setAttribute("connection", con);
			ctx.setAttribute("username", "Pradeep");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void contextDestroyed(ServletContextEvent sce) {

		// removing the attribute from the context scope..
		sce.getServletContext().removeAttribute("connection");
	}
}