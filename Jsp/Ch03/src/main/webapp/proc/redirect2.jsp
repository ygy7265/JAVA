<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ridirect2</title>
	</head>
	<body>
		<h3>redirect2 page</h3>
		<%
			response.sendRedirect("https://naver.com");
		%>
	</body>
</html>