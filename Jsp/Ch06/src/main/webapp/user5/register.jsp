<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>User5 Add</title>
	</head>
	<body>
		<h4>User5 ADD</h4>
		
		<a href="/Ch06/1_JDBC.jsp">index</a>
		<a href="/Ch06/user5/list.jsp">User5 List</a>
	<form action="/Ch06/user5/useradd.jsp">
			<table border="1">
				<tr>
					<th>id = </th>
					<th><input type="text" name="id" placeholder="id add"></th>
				</tr>
				
				<tr>
					<th>name = </th>
					<th><input type="text" name="name" placeholder="id add"></th>
				</tr>
				<tr>
					<th>Date = </th>
					<th><input type="date" name="date"></th>
				</tr>
			
				<tr>
					<th>age = </th>
					<th><input type="text" name="age" placeholder="age add"></th>
				</tr>
				<tr>
					<th>Addr = </th>
					<th><input type="text" name="addr" placeholder="addr add"></th>
				</tr>
				
				<tr>
					<th>hp = </th>
					<th><input type="text" name="hp" placeholder="Hp add"></th>
				</tr>
				
				<tr>
					<td colspan="2" align="right"><input type="submit" value="submit"></td>
				</tr>
			</table>
	</form>
	</body>
</html>