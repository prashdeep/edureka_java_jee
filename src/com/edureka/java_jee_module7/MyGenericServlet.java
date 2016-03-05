package com.edureka.java_jee_module7;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyGenericServlet extends GenericServlet {

	private String message;

	private static final long serialVersionUID = -5238165301867510265L;

	@Override
	public void init() {
		System.out.println("This is printed when the servlet is instantiated.");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		writer.write("<h1>This is my first statement getting printed by the Generic Servlet</h1>");
	}
}
