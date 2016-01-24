<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
	<title>JSP useBean Action Example</title>
</head>
<body>

  <jsp:useBean id="person" 
                    class="com.edureka.java_jee_module7.PersonBean"> 
   <jsp:setProperty name="person" property="firstName"
                    value="Zara"/>
   <jsp:setProperty name="person" property="lastName" 
                    value="Ali"/>
   <jsp:setProperty name="person" property="age" 
                    value="10"/>
</jsp:useBean>

<p>Student First Name: 
   <jsp:getProperty name="person" property="firstName"/>
</p>
<p>Student Last Name: 
   <jsp:getProperty name="person" property="lastName"/>
</p>
<p>Student Age: 
   <jsp:getProperty name="person" property="age"/>
</p>
</body>
</html>

 <%--
  PersonBean person =(PersonBean)request.getAttribute("person");
    if(person=null)
    {
       person = new PersonBean();
       request.setAttribute("person",person);
    }
 --%>