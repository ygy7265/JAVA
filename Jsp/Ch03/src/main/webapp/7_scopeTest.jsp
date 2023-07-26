<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>7_scopeTest</title>
	</head>
	<body>
		<h3>7.library area</h3>
		
		<%
			pageContext.setAttribute("name", "kimyousin");
			request.setAttribute("name", "kimchunchu");
			session.setAttribute("name", "jangbogo");
			application.setAttribute("name", "kanggamchan");
		%>
		<h4>library data</h4>
		<p>
			pageContext check = <%= pageContext.getAttribute("name") %><br>
			request check = <%= request.getAttribute("name") %><br>
			session check = <%= session.getAttribute("name") %><br>
			application check = <%= application.getAttribute("name") %><br>
		</p>
		<%
			pageContext.forward("./proc/scopeResult.jsp");
		%>
		
		
	</body>
</html>