<html>
<head><title>Hello World</title></head>
<body>
<h1>Hello World!</h1>
 <br/>
 <!--html comment -->

<%-- This comment will not be visible in the page source --%> 
<%
  out.println("Your IP address is " + request.getRemoteAddr());
%>  
</body>
</html>