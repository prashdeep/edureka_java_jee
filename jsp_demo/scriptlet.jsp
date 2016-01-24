<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Scriptlet Example</title>
</head>
<body>
<form>
Enter the last number till you want to print :
<input type="text" name="text" />
<input type="submit" value="submit" />
</form>
<%! int num = 0; %>
<%
  if (request.getParameter("text") != null)
  {
    num = Integer.parseInt(request.getParameter("text"));
  }
%>
<table>
<tr><td>Number</td></tr>
<%
  for (int i = 0; i < num+1; i++)
  {
  %>
    <tr>
      <td align="right"><%= i%></td>
    </tr>
  <%
  }
  %>

</table>
</body>
</html>