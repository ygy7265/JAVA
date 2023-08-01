
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String num = request.getParameter("num");
	String id = request.getParameter("id");
	String gender = request.getParameter("gender");
	String age = request.getParameter("age");
	String addr = request.getParameter("addr");
	
	String host = "jdbc:mysql://127.0.0.1:3306/userdb";
	String user= "root";
	String pass = "root";
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection(host,user,pass);
	PreparedStatement st = conn.prepareStatement("insert into `user4` values(?,?,?,?,?)");
	
	st.setString(1, num);
	st.setString(2, id);
	st.setString(3, gender);
	st.setString(4, age);
	st.setString(5, addr);
	st.executeUpdate();
	
	
	}catch(Exception e){
		e.printStackTrace();
	}
	response.sendRedirect("/Ch06/user4/register.jsp");
%>
