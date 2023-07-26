<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>3_pageContext</title>
	</head>
	<body>
		<h3>3.pageContext</h3>
		
		<h4>include</h4>
		<%
			pageContext.include("./inc/_header.html");
			pageContext.include("./inc/_footer.html");
		%>
		<h4>forward</h4>
		<a href="./proc/forward1.jsp">forward page request1</a>
		<a href="./proc/forward2.jsp">forward page request2</a>
	</body>
</html>