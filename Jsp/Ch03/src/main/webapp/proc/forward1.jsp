<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1.forward1</title>
	</head>
	<body>
		<h3>forward1 page</h3>
		
		<%
			pageContext.forward("../1_request.jsp");
		%>
	</body>
</html>