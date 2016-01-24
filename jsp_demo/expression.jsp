<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Expressions Example</title>
</head>
<body>
<!--  Example of Scripting elements -- Expression tag -->
<form>
Name <input type="text" name="text"/>
<input type="submit" value="submit"/>
</form>
<%String name= request.getParameter("text");%>
<%
if(name!=null)
{%>
<%=name %> 
<%}
%>

</body>
</html>