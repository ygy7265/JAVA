<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1.forward2</title>
	</head>
	<body>
		<h3>forward2 page</h3>
		
		<%
			pageContext.forward("https://naver.com");
		%>
	</body>
</html>