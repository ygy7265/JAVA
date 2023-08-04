<%@page import="vo.UserVo"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// login state Check
	UserVo sessUser = (UserVo)session.getAttribute("sessUser");

	if(sessUser == null){
		pageContext.forward("./user/login.jsp");
	}else{
		pageContext.forward("./list.jsp");
	}
%>
