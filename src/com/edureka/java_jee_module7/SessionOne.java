package com.edureka.java_jee_module7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionOne extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String firstName = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(20);

		PersonBean person = new PersonBean();
		person.setFirstName(firstName);
		person.setLastName(lastname);

		// to set the objects in aplication scope
		ServletContext context = req.getServletContext();
		context.setAttribute("person", person);
		session.setAttribute("person", person);
		PrintWriter out = res.getWriter();
		out.println("<h1>User is set to session scope<h1>");
	}

}
