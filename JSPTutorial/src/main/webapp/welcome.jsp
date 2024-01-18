<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="next.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- Printing output using scriptlet tag --%>
<%
   String name = request.getParameter("userName");
   out.println(name);
%>
<br><br>
   
 <%-- Printing output using expression tag --%>
<%= "Welcome" +" "+request.getParameter("userName")%>

<%-- Setting attribute using JSP session object --%>
<% session.setAttribute("user", name); %>

<%-- Setting attribute using JSP pagecontext object --%>
<% pageContext.setAttribute("user", name, pageContext.SESSION_SCOPE); %>


<% response.sendRedirect("next.jsp");%>

</body>
</html>