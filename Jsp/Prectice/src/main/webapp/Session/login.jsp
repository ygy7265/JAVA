<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String seid = (String)session.getAttribute("seTest");
	if(seid != null){
		response.sendRedirect("./loginsuc.jsp");
		return;
	}
	
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		<h3>LoginForm</h3>
		<form action="./loginlogic.jsp">
			<input type="text" name="uid" placeholder="ID ADD"><br>
			<input type="password" name="pass" placeholder="PASS ADD"><br>
			<input type="text" name="name" placeholder="NAME ADD"><br>
			<input type="checkbox" name="auto" value="1"><br>
			<input type="submit" value="login2">
		</form>
	</body>
</html>