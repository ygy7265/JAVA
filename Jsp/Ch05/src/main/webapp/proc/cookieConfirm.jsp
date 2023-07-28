<%@page import="java.util.Arrays"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 
	Date : 2023/07/27
	name : Yoongyeongyeop
	content : Cookie
 -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookieConfirm</title>
	</head>
	<body>
		<h3>Cookie Check</h3>
		<%
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){	
		%>	
				cookieName = <%= cookie.getName()%><br>
				cookieValue = <%= cookie.getValue()%><br>
		<%	
		}
		
		%>
			
	</body>
</html>