<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>User4 Add</title>
	</head>
	<body>
		<h4>User4 ADD</h4>
		
		<a href="/Ch06/1_JDBC.jsp">index</a>
		<a href="/Ch06/user4/list.jsp">User4 List</a>
	<form action="/Ch06/user4/useradd.jsp">
			<table border="1">
				<tr>
					<th>num = </th>
					<th><input type="number" name="num" placeholder="num add"></th>
				</tr>
				<tr>
					<th>id = </th>
					<th><input type="text" name="id" placeholder="id add"></th>
				</tr>
				
				<tr>
					<th>gender = </th>
					<th>
					<label><input type="radio" name="gender" value="1">man</label>
					<label><input type="radio" name="gender" value="2">woman</label>
					</th>
				</tr>
				<tr>
					<th>age = </th>
					<th><input type="number" name="age" placeholder="age add"></th>
				</tr>
				<tr>
					<th>Addr = </th>
					<th><input type="text" name="addr" placeholder="addr add"></th>
				</tr>
				
				<tr>
					<td colspan="2" align="right"><input type="submit" value="submit"></td>
				</tr>
			</table>
	</form>
	</body>
</html>