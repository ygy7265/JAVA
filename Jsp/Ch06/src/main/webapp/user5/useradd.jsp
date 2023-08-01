<%@page import="java.util.ArrayList"%>
<%@page import="vo.UserVo"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String date = request.getParameter("Date");
	String hp = request.getParameter("hp");
	String age = request.getParameter("age");
	String addr = request.getParameter("addr");
	String host = "jdbc:mysql://127.0.0.1:3306/userdb";
	String user = "root";
	String pass = "root";
	UserVo vo = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(host,user,pass);
		PreparedStatement pst = conn.prepareStatement("insert into `user5` values(?,?,?,?,?,?)");

		pst.setString(1, id);
		pst.setString(2, name);
		pst.setString(3, date);
		pst.setString(4, hp);
		pst.setString(5, age);
		pst.setString(6, addr);
		
		pst.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("/Ch06/user5/list.jsp");
%>
