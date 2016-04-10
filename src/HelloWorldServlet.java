import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		System.out.println("Servlet by the server .... ");
		PrintWriter out = res.getWriter();
		out.print("<h1>Priniting the response from the servlet</h1>");
	}

}
