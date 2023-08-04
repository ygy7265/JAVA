<%@page import="dao.UserDao"%>
<%@page import="vo.UserVo"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String uid = request.getParameter("uid");
	String pass = request.getParameter("pass");
	

	UserVo vo = UserDao.getInstance().selectUsers(uid, pass);
	if(vo != null){
		session.setAttribute("sessUser", vo);
		response.sendRedirect("/Jboard/list.jsp");
	}else{
		response.sendRedirect("/Jboard/user/login.jsp?success=100");
	}
	out.print(vo);
	
%>