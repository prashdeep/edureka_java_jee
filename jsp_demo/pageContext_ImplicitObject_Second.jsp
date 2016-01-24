<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h1>In the Second page....</h1>
<% 

String name=(String)pageContext.getAttribute("user",PageContext.REQUEST_SCOPE );
out.print("Hello "+name);
%> 

</body>
</html>

