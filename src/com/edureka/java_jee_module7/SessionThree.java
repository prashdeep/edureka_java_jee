package com.edureka.java_jee_module7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionThree extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession session = req.getSession();
		PersonBean person = (PersonBean) session.getAttribute("person");
		if (person.getFirstName().equalsIgnoreCase("pradeep")) {
			session.invalidate();
		}
		PrintWriter out = res.getWriter();
		if (session != null) {
			out.println("<h1>User fetched from sessioin" + (PersonBean) session.getAttribute("person") + "<h1>");
		}
	}

}
