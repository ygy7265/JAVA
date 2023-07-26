<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 
	Date : 2023/07/26
	name : Yoongyeongyeop
	content : forward actionTag
 -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>3_useBean</title>
	</head>
	<body>
	<h4>User add</h4>
		<form action="./proc/userProc.jsp" method = "get">
			<input type="text"name='uid'placeholder="id add"/><br>
			<input type="text"name='name'placeholder="name add"/><br>
			<input type="text"name='hp'placeholder="hp add"/><br>
			<input type="text"name='age'placeholder="age add"/><br>
			<input type="submit" value="submit"/><br>
		</form>
	</body>
</html>