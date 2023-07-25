<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>4_application</title>
	</head>
	<body>
		<h3>4.application</h3>
		
		<h4>server info</h4>
		<%= application.getServerInfo() %>
		<h4>parameter info</h4>
		<% 
		String value1 = application.getInitParameter("PARAM1"); 
		String value2 = application.getInitParameter("PARAM2"); 
		%>
		<p>
		value1 = <%= value1 %><br>
		value2 = <%= value2 %><br>
		</p>
		<h4>log info</h4>
		<%
		application.log("log Record");
		%>
		<h4>resource info</h4>
		<%= application.getRealPath("./4_application.jsp") %>
	</body>
</html>