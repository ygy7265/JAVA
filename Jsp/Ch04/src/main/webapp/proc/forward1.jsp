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
		<title>forward1</title>
	</head>
	<body>
		<h3>forward page</h3>
		<%
			pageContext.forward("./target.jsp");
		%>
	</body>
</html>