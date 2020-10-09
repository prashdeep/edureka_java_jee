<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%

Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver loaded...");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS","root","welcome");
System.out.println("Connected to the database");

Statement st=con.createStatement();

/*     System.out.println("Before creating the table...");
st.execute("create table student(no varchar(10),name varchar(20))");
System.out.println("table created");
*/   

st.executeUpdate("insert into students values(42,'Pradeep')");
System.out.println("  row inserted");

// st.executeUpdate("update student set name='Pavas sisaudia' where name='Pavas'");
//  System.out.println("row updated");
 
con.close();
System.out.println("Connection closed...");


%>
</body>
</html>