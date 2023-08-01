<%@page import="vo.DBConnection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vo.UserVo"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	try{
		DBConnection conn = new DBConnection();
		conn.Insert("user2", 2, "yousin", "3", 3);
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("/Ch06/user2/list.jsp");
%>
