<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String uid = request.getParameter("uid");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>userProc</title>
	</head>
	<body>
		<h3>user data</h3>
		<p>
			id = <%= uid %><br>
			name = <%= name %><br>
			age = <%= age %><br>
		</p>
		<a href="../1_request.jsp">back</a>
	</body>
</html>