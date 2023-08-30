<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" session="false"%>

<%
	String success = request.getParameter("success");
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>3_Listener</title>
	</head>
	<body>
		<h3>3.Listener</h3>

		<form action="/Ch09/hello.do" method="post">
			<input type = "text" name="uid"/><br>
			<input type = "password" name="pass"/><br>
			<input type = "submit" name="login"/><br>
		</form>
		
	</body>
</html>