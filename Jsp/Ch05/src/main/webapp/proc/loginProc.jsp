<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	Date : 2023/07/27
	name : Yoongyeongyeop
	content : Session
 -->
<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String auto = request.getParameter("auto");
	
	if(pw.equals("1234")){
		
		//autologinlogic
		if(auto != null){
			Cookie autoCookie = new Cookie("cid", id);
			autoCookie.setMaxAge(60*3);
			response.addCookie(autoCookie);
		}
		session.setAttribute("sessid", id);
		response.sendRedirect("./loginSucess.jsp");
	}else{
		response.sendRedirect("./loginForm.jsp");
	}
	
%>