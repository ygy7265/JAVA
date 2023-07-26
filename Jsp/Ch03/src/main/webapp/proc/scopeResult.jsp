<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>scopeResult</title>
	</head>
	<body>
		<h3>library data</h3>
		<p>
		pageContext check = <%= pageContext.getAttribute("name") %><br>
		request check = <%= request.getAttribute("name") %><br>
		session check = <%= session.getAttribute("name") %><br>
		application check = <%= application.getAttribute("name") %><br>
		</p>
		
		<a href="./scopeResult.jsp">result</a>
	</body>
</html>