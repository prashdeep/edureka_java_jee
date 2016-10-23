package com.edureka.java_jee_module7;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextExample extends HttpServlet {

	/*
	 * <servlet-mapping> <servlet-name>s1</servlet-name>
	 * <url-pattern>/servlet1</url-pattern> </servlet-mapping>
	 * 
	 * <servlet> <servlet-name>s2</servlet-name>
	 * <servlet-class>DemoServlet2</servlet-class> </servlet>
	 * 
	 * <servlet-mapping> <servlet-name>s2</servlet-name>
	 * <url-pattern>/servlet2</url-pattern> </servlet-mapping>
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {

			res.setContentType("text/html");
			PrintWriter out = res.getWriter();

			// 1.ServletContext context = getServletConfig().getServletContext();
			// 2. ServletContext context=req.getServletContext();
			ServletContext context = getServletConfig().getServletContext();
			context.setAttribute("username", "Pradeep");

			out.println("Welcome to first servlet");
			out.println("<a href='servlet2'>visit</a>");
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
