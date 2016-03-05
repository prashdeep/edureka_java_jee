package com.edureka.java_jee_module7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * <context-param>  
    <param-name>dname</param-name>  
    <param-value>com.mysql.jdbc.Driver</param-value>  
   </context-param> 
   
   <context-param>  
     <param-name>username</param-name>  
     <param-value>root</param-value>  
   </context-param>  
  
   <context-param>  
     <param-name>password</param-name>  
     <param-value>welcome</param-value>  
   </context-param> 
 */
public class ServletContextServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		// creating ServletContext object
		ServletContext context = getServletContext();

		// Getting the value of the initialization parameter and printing it
		String driverName = context.getInitParameter("dname");
		pw.println("driver name is=" + driverName);

		pw.close();

	}
}
