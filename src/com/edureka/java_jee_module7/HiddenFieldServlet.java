package com.edureka.java_jee_module7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * <form method="post" action="validate">
     Name:<input type="text" name="user" /><br/>
     Password:<input type="text" name="pass" ><br/>
     <input type="submit" value="submit">
   </form>
 */
public class HiddenFieldServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// getting value submitted in form from HTML file
		String user = request.getParameter("user");

		// creating a new hidden form field
		out.println("<form action='Second'>");
		out.println("<input type='hidden' name='user' value='" + user + "'>");
		out.println("<input type='submit' value='submit' >");
		out.println("</form>");
	}
}
