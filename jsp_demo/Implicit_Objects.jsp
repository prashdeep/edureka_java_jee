<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
Name <input type="text" name="text"/>
<input type="submit" value="submit"/>
</form>
  
   <% 
     String name = request.getParameter("text");
     if (name != null)
       out.print ("Entered name is : "+name);
     
     session.setAttribute ("name", name);
    
   %>
   <br>
   <a href=second.jsp>Second JSP page</a>
     
   
</body>
</html>