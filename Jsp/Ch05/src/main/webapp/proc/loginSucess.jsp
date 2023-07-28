<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	Date : 2023/07/27
	name : Yoongyeongyeop
	content : Session
 -->
<%
	String sessid = (String)session.getAttribute("sessid");
	if(sessid == null){
		response.sendRedirect("./loginForm.jsp");
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>loginSuccess</title>
	</head>
	<body>
		<h3>login success</h3>
		<p>
		
			<%= sessid %> WellCome<br>
			<a href="./logout.jsp">logout</a>
		</p>
	</body>
</html>