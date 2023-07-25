<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page info = "cogyright parasite" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>5.Directive</h3>
		
		<h4>Page</h4>	
		<p>
			page copyright = <%= getServletInfo() %>
		</p>
		
		<h4>include</h4>	
		<%@ include file="./inc/_header.html" %>
		<%@ include file="./inc/_footer.html" %>
	</body>
</html>