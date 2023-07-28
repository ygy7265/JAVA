<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//autologin check
	Cookie[] cookies = request.getCookies();

	for(Cookie cookie : cookies){
		if(cookie.getName().equals("cid")){
			String id = cookie.getValue();
			session.setAttribute("sessid", id);
		}
	}
	
	String sessid = (String)session.getAttribute("sessid");
	if(sessid != null){
		response.sendRedirect("./loginSucess.jsp");
		return;
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<form action="./loginProc.jsp" method="post">
			<input type="text"name="id" placeholder="id add"><br>
			<input type="password"name="pw" placeholder="pass add"><br>
			<label><input type="checkbox" name="auto" value="1">auto login</label><br>
			<input type="submit" value="login"><br>
		</form>
	</body>
</html>