<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String uid = request.getParameter("uid");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	String birth = request.getParameter("birth");
	String gender = request.getParameter("gender");
	String addr = request.getParameter("addr");
	String[] hobby = request.getParameterValues("hobby");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>registerProc</title>
	</head>
	<body>
		<h3>User Data</h3>
		
		<p>
		 id = <%= uid %><br>
		 pass = <%= pass %><br>
		 name = <%= name %><br>
		 birth = <%= birth %><br>
		 gender = <%=
		 			gender
		 		
		 			 %><br>
		 addr = <%= addr %><br>
		 hobby = <%
		 		for(String hobbys : hobby){
		 			out.print(hobbys + ",");
		 		}%><br>
		</p>
		
		<a href="../1_request.jsp">Back</a>
	</body>
</html>