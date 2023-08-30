<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
	 <form action="#" method="post">
	 	<table border="1">
	 		<tr>
	 		<td>ID</td>
	 		<td><input type="text" name="uid"></td>
	 		</tr>
	 		<tr>
	 		<td>Name</td>
	 		<td><input type="text" name="name"></td>
	 		</tr>
	 		<tr>
	 		<td>Hp</td>
	 		<td><input type="text" name="hp"></td>
	 		</tr>
	 		<tr>
	 		<td>pos</td>
	 		<td>
	 			<select name="pos">
	 			<option>1</option>
	 			<option>2</option>
	 			<option>3</option>
	 			<option>4</option>
	 			</select>
	 		</td>
	 		</tr>
	 		<tr>
	 		<td>dep</td>
	 		<td>
	 			<select name="dep">
	 			<option value="101">1</option>
	 			<option value="102">2</option>
	 			<option value="103">3</option>
	 			<option value="104">4</option>
	 			</select>
	 		</td>
	 		</tr>
	 		<tr>
	 		<td colspan="2" align="right"><input type="submit" value="submit"></td>
	 		</tr>
	 	</table>
	 </form>
	</body>
</html>