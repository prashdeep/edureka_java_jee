<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<% 

String name=request.getParameter("uname");
out.print("Welcome "+name);

session.setAttribute("user",name);
%>
</br>
<a href="session_ImplicitObject_Second.jsp">second jsp page</a>


</body>
</html>