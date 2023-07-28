<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("uid");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		if(pass.equals("1234")){
			response.sendRedirect("./loginsuc.jsp");
		}
		else{
			response.sendRedirect("./login.jsp");
		}
		%>
		
		
	</body>
</html>