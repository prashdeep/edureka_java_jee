package com.edureka.java_jee_module7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigExample extends HttpServlet {

	/*
	 * <init-param> <param-name> driver_name </param-name> <param-value>
	 * com.mysql.jdbc.Driver </param-value> </init-param>
	 * 
	 * <init-param> <param-name> username </param-name> <param-value> root
	 * </param-value> </init-param>
	 * 
	 * <init-param> <param-name> password </param-name> <param-value> welcome
	 * </param-value> </init-param>
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		ServletConfig conf = getServletConfig();

		String driverName = conf.getInitParameter("driver_name");
		String username = conf.getInitParameter("username");
		String password = conf.getInitParameter("password");

		pw.println("driver Name is " + driverName + " and user name is " + username + " and password is " + password);

		pw.close();
	}
}
