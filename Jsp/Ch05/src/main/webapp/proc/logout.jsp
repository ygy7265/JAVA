<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	Date : 2023/07/27
	name : Yoongyeongyeop
	content : Session
 -->
<%
	//Session Clear
	session.invalidate();

	//cookie Clear
	Cookie cookie = new Cookie("cid",null);
	cookie.setMaxAge(0);
	response.addCookie(cookie);
	response.sendRedirect("./loginForm.jsp");
%>