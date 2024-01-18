<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>JSP Action Tags<p>

<jsp:useBean id="emp" class="bean.Employee" scope="request">

<%-- 
<jsp:setProperty property="id" name="emp" value="1"/>
<jsp:setProperty property="firstName" name="emp" value="Tejas"/>
--%>

<jsp:setProperty property="*" name="emp" />

</jsp:useBean>


<p>Employee Details</p>

<p>Emp Id: <jsp:getProperty property="id" name="emp"/><br>
First Name: <jsp:getProperty property="firstName" name="emp"/><br>
Last Name: <jsp:getProperty property="lastName" name="emp"/><br>
User Name: <jsp:getProperty property="userName" name="emp"/><br>
Password: <jsp:getProperty property="password" name="emp"/><br>
Address: <jsp:getProperty property="address" name="emp"/><br>
Contact: <jsp:getProperty property="contact" name="emp"/><br>


<%--
<jsp:forward page="index.jsp" /> 
<jsp:include page="index.jsp" />
--%>

</p>

</body>
</html>