<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 
	Date : 2023/07/28
	name : Yoongyeongyeop
	content : JDBC
 -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>user1 list</h3>
		<a href="/Ch10/user1/register.jsp">user1 add</a>
		
		<table border="1">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>hp</th>
				<th>age</th>
				<th>mag</th>
			</tr>
			<c:forEach var="user" items="${requestScope.users}">
			<tr>
				<td>${user.getUid()}</td>
				<td>${user.getName()}</td>
				<td>${user.getHp()}</td>
				<td>${user.getAge()}</td>
				<td>
					<a href="/Ch10/user1/modify.do?uid=${user.getUid()}">update</a>
					<a href="/Ch10/user1/delete.do?uid=${user.getUid()}">delete</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>