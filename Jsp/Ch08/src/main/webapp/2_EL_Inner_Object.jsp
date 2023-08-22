<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>2.ELinnerObject</title>
	</head>
	<body>
		<h3>2.ELinnerObject</h3>
		<%
			pageContext.setAttribute("neme", "kim");
			request.setAttribute("name", "chun");
			session.setAttribute("name", "jang");
			application.setAttribute("name", "gang");
		%>
		
		<p>
			pageScope name = ${name};<br>
			requestScope name = ${requestScope.name};<br>
			sessionScope name = ${sessionScope.name};<br>
			applicationScope name = ${applicationScope.name};<br>
		</p>
	</body>
</html>