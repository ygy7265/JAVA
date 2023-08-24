<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 
	Date : 2023/08/24
	name : Yoongyeongyeop
	content : MVC
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1 :: modify</title>
	</head>
	<body>
		<h3>User1 modify</h3>
		<a href="/Ch10/">index</a>
		<a href="/Ch10/user1/list.jsp">user1 list</a>
		<form action="/Ch10/user1/modify.do" method="post">
			<table border="1">
				<tr>
					<td>id</td>
					<td><input type="text" name="uid" readonly value ="${user.uid}"></td>
				</tr>
				
				<tr>
					<td>name</td>
					<td><input type="text" name="name" value ="${user.name}"></td>
				</tr>
				
				<tr>
					<td>hp</td>
					<td><input type="text" name="hp" value ="${user.hp}"></td>
				</tr>
				
				<tr>
					<td>age</td>
					<td><input type="number" name="age" value ="${user.age}"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="add"></td>
				</tr>
			</table>
		</form>
	</body>
</html>