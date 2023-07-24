<%@page import="sub1.Account"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>4_Class</title>
	</head>
	<body>
		<h3>4.Class</h3>
		
		<%
			Account kb = new Account("kb","101-1111-1234","kimyousin",10000);
			kb.deposit(30000);
			kb.withdraw(5000);
			kb.show(out);
			
			Account wr = new Account("wr","101-2222-1234","jangbogo",20000);
			wr.deposit(30000);
			wr.withdraw(5000);
			wr.show(out);
		%>
	</body>
</html>