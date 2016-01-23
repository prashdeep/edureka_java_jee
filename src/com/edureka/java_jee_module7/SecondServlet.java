package com.edureka.java_jee_module7;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
		public void doGet(HttpServletRequest req, HttpServletResponse res) {
			try {

				res.setContentType("text/html");
				PrintWriter out = res.getWriter();
				ServletContext context = getServletConfig().getServletContext();
				out.println("Welcome to Second servlet "+ context.getAttribute("username"));
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
