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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "password");

			s = con.createStatement();

			// fetching pageviews value from table counter
			rs = s.executeQuery("select pageview from counter");
			while (rs.next()) {
				count = rs.getInt(1);
			}

			ctx = sce.getServletContext();
			ctx.setAttribute("pcount", count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void contextDestroyed(ServletContextEvent sce) {

		try {
			ctx = sce.getServletContext();
			count = (Integer) ctx.getAttribute("pcount");
			ps = con.prepareStatement("update counter set pcount='" + count + "'");
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}