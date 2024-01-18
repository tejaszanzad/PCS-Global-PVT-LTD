<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="login.html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tutorial</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
<p>Welcome To JSP</p>

<p>JSP Scripting Elements<p>

<%-- JSP Comment --%>


<%-- Scriptlet Tag --%>
<% out.println(" JSP Scriplet Tag"); %>
<br><br>

<%-- Expression Tag --%>
<%= java.util.Calendar.getInstance().getTime()%>
<br><br>

<%-- Declaration Tag --%>
<%! int a=100; %>
<%= "Value of a is "+a %>
<br><br>

<%!
   int sum(int num1, int num2){
	return num1+num2;
}
%>

<%= "Sum is " + sum(2,3)%>
<br><br>

</body>
</html>