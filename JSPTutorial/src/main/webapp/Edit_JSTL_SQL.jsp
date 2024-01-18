<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var = "id" value="${param.id}"/>
<sql:setDataSource var ="db" driver="com.mysql.cj.jdbc.Driver" 
	url = "jdbc:mysql://localhost/pcsglobal" user="root" password="root" />
	
<sql:query dataSource="${db}" var="rs">
select * from employee where id = ?
<sql:param value="${id}"/>
</sql:query>

<c:forEach var="data" items="${rs.rows}">
<form action="Update_JSTL_SQL.jsp">
Edit Details<br><br>
<input type="hidden" name="id" value= <c:out value="${data.id}"/>>
First Name : <input type="text" name="first_name" value= <c:out value="${data.first_name}"/>>
Last Name : <input type="text" name="last_name" value= <c:out value="${data.last_name}"/>>
Username : <input type="text" name="username" value= <c:out value="${data.username}"/>>
Password: <input type="text" name="password" value= <c:out value="${data.password}"/>>
Address : <input type="text" name="address" value= <c:out value="${data.address}"/>><br>
Contact : <input type="int" name="contact" value= <c:out value="${data.contact}"/>><br><br>
<input type="submit" value="submit">
</form>

</c:forEach>

</body>
</html>