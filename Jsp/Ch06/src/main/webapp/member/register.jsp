<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Member Add</title>
	</head>
	<body>
		<h4>Member Add</h4>
		
		<a href="/Ch06/1_JDBC.jsp">index</a>
		<a href="/Ch06/member/list.jsp">Member list</a>
	<form action="/Ch06/member/useradd.jsp">
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
					<th>hp = </th>
					<th><input type="text" name="hp" placeholder="Hp add"></th>
				</tr>
				
				<tr>
					<th>positon = </th>
					<th>
					<select name="position">
						<option value="Employ">Employ</option>
						<option value="EGR">Exaggeration</option>
						<option value="CEO">CEO</option>
					</select>
					</th>
				</tr>
				<tr>
					<th>Depatment = </th>
					<th>
					<select name = "depatment">
						<option value="101">SalesPart1</option>
						<option value="102">SalesPart2</option>
						<option value="103">SalesPart3</option>
						<option value="201">HR</option>
						<option value="202">Support Department</option>
					</select>
					</th>
				</tr>
				
				
				<tr>
					<td colspan="2" align="right"><input type="submit" value="submit"></td>
				</tr>
			</table>
	</form>
	</body>
</html>