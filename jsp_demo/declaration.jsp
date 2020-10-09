<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Declaration Example</title>
</head>
<body>
<%! int i=5; 
String str= "Hi";
public String getString()
{
return "Hi from Pradeep..";
}
%>
<table border= "1">
<tr><td>Value of Integer</td>
<td><% out.println(i);%></td>
</tr>
<tr>
<td>Value of String</td>
<td><% out.println(str); %></td>
</tr>
<tr>
<td>Value of method getString()</td>
<td><% out.println(getString()); %></td>
</tr>
</table>
</body>
</html>