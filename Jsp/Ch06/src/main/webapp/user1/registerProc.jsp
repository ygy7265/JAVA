<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	Date : 2023/07/28
	name : Yoongyeongyeop
	content : JDBC
 -->
<%
	request.setCharacterEncoding("UTF-8");
	
	String id = request.getParameter("uid");
	String name = request.getParameter("name");
	String hp = request.getParameter("hp");
	String age = request.getParameter("age");
	
	String host = "jdbc:mysql://127.0.0.1:3306/userdb";
	String user = "root";
	String pass = "root";
	
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection(host,user,pass);
	PreparedStatement pst = conn.prepareStatement("insert into `user1` values(?,?,?,?)");
	
	pst.setString(1, id);
	pst.setString(2, name);
	pst.setString(3, hp);
	pst.setString(4, age);
	
	pst.executeUpdate();
	pst.close();
	conn.close();
	}catch(Exception e ){
		e.printStackTrace();
	}
	response.sendRedirect("/Ch06/user1/list.jsp");
%>