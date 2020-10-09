package com.edureka.java_jee_module7;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestScopeAServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String firstName = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		
		PersonBean person = new PersonBean();
		person.setFirstName(firstName);
		person.setLastName(lastname);
		
		req.setAttribute("person", person);
		
		req.getRequestDispatcher("/requestScopeB").forward(req, res);
	}

}
