<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" session="true" isErrorPage = "true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>JSP Implicit Objects</p>

<%-- Printing output using session object --%>
<% String name = (String)session.getAttribute("user"); %>
<%="Hello " + name %>
<br><br>

<%-- Printing output using pagecontext object --%>
<% String name1 = (String)pageContext.getAttribute("user",pageContext.SESSION_SCOPE); %>
<%="Hello " + name1 %>
<br><br>

<%= new Date()%>

</body>
</html>