<%@page import="sub1.UserVo"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!-- 
	DATA : 2023/07/26
	NAME : Yoongyeongyeop
	content : session
 -->
	<head>
		<meta charset="UTF-8">
		<title>5_session </title>
	</head>
	<body>
		<h3>5.session</h3>
		<h4>session id check</h4>
		<%= session.getId() %>
		
		<h4>session setting</h4>
		<%
			UserVo user = new UserVo("a101","kimyousin","010-111-1122",26);
			//session table에 user컬럼명으로 user객체저장
			session.setAttribute("userColumn", user);
			
			//session table에 저장된 user
			UserVo userVo = (UserVo)session.getAttribute("userColumn");
			
		%>
		
		<p>
			id =  <%= userVo.getUid() %><br>
			name =  <%= userVo.getName() %><br>
			phone =  <%= userVo.getHp() %><br>
			age =  <%= userVo.getAge() %><br>
		</p>
		
	</body>
</html>