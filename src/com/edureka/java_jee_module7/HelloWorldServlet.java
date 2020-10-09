package com.edureka.java_jee_module7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	@Override
	public void init() {
		System.out.println("Called from the init method....");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1><span style='padding:10px; background-color:orange; border: 1px solid red;'>Hi There</span></h1>"); 
		
		out.close();
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Called from the destroy method ....");
	}

}
