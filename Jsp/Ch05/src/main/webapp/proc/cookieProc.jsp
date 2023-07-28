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
		<title>cookieProc</title>
	</head>
	<body>
		<h3>cookie create</h3>
		<%	
		
			request.setCharacterEncoding("UTF-8");
			//submit date recive
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			//cookie create
			Cookie c1 = new Cookie("cid",id);
			Cookie c2 = new Cookie("cpw",pw);
			
			//cookie submit
			response.addCookie(c1);
			response.addCookie(c2);
		%>
		
			<a href="./cookieConfirm.jsp">cookieCheck</a>
		
	</body> 
</html>