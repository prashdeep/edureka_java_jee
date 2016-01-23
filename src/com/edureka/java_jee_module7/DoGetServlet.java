package com.edureka.java_jee_module7;

//Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class DoGetServlet extends HttpServlet {

	//http://localhost:8080/HelloForm?first_name=Pradeep&last_name=Kumar
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Demonstrating the Go Get method in Servlet";
		
		out.println("<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n" + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
				+ "  <li><b>First Name</b>: " + request.getParameter("first_name") + "\n" + "  <li><b>Last Name</b>: "
				+ request.getParameter("last_name") + "\n" + "</ul>\n" + "</body></html>");
	}
}
