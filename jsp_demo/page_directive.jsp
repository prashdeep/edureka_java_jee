<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp page Directive Example</title>
</head>
<body>
<%
Date date = new Date();
%>
<%
   String name = request.getParameter("name");
   out.write("Hi "+name);
%>
<table>
<tr>
<td>Current date :</td>
<td> <%=new SimpleDateFormat("dd-MMM-yyyy").format(date) %> </td>
</tr>
</table>
</body>
</html>