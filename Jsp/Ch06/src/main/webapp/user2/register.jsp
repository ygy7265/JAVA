<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user2</title>
	</head>
	<body>
		
		<a href="/Ch06/1_JDBC.jsp">index</a>
		<a href="/Ch06/user2/list.jsp">user2 list</a>
		<form action="/Ch06/user2/useradd.jsp">
			<table border="1">
				<tr>
					<th>id = </th>
					<th><input type="text" name="id" placeholder="id add"></th>
				</tr>
				
				<tr>
					<th>name = </th>
					<th><input type="text" name="name" placeholder="name add"></th>
				</tr>
				<tr>
					<th>hp = </th>
					<th><input type="text" name="hp" placeholder="hp add"></th>
				</tr>
				<tr>
					<th>age = </th>
					<th><input type="text" name="age" placeholder="age add"></th>
				</tr>
				
				<tr>
					<td colspan="2" align="right"><input type="submit" value="submit"></td>
				</tr>
			</table>
		
		</form>
	</body>
</html>