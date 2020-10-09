<%@ page import="java.util.List"%>
<%@ page import="java.util.Arrays"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Welcome to JSTL foreach tag Example in JSP</title>
    </head>

    <body>
        <h2>JSTL foreach tag example in JSP</h2>

        <jsp:scriptlet>
            String[] os = new String[]{"Windows", "Linux", "Mac", "Ubuntu"};
            pageContext.setAttribute("os", os);
        </jsp:scriptlet>

        <%-- JSTL foreach tag example to loop an array in jsp --%>
        <c:forEach var="index" items="${pageScope.os}"> 
            <c:out value="${index}"/> 
        </c:forEach>
    </body>
</html>
