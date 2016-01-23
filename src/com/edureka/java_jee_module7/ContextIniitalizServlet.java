package com.edureka.java_jee_module7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextIniitalizServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		ServletContext context = request.getServletContext();
		PrintWriter out = response.getWriter();
		out.println("The value of connection is "+context.getAttribute("connection"));
		out.println("The value of Username is "+context.getAttribute("username"));
	}

}
