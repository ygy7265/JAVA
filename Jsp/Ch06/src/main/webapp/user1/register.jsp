<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	Date : 2023/07/28
	name : Yoongyeongyeop
	content : JDBC
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1 :: register</title>
	</head>
	<body>
		<h3>User1 </h3>
		<a href="/Ch06/1_JDBC.jsp">index</a>
		<a href="/Ch06/user1/list.jsp">user1 list</a>
		<form action="/Ch06/user1/registerProc.jsp">
			<table border="1">
				<tr>
					<td>id</td>
					<td><input type="text" name="uid"></td>
				</tr>
				
				<tr>
					<td>name</td>
					<td><input type="text" name="name"></td>
				</tr>
				
				<tr>
					<td>hp</td>
					<td><input type="text" name="hp"></td>
				</tr>
				
				<tr>
					<td>age</td>
					<td><input type="number" name="age"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="add"></td>
				</tr>
			</table>
		</form>
	</body>
</html>