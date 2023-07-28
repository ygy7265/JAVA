<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String id =  request.getParameter("uid");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login success</title>
	</head>
	<body>
		<%
		%>
			<p>
				<%=id %>wellCome;
			</p>
			<a href="./login.jsp">logout</a>
		<%
			
		
		 %>
	
	</body>
</html>