
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="aplication/json;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	
	String id = request.getParameter("uid");
	String name = request.getParameter("name");
	String hp = request.getParameter("hp");
	String age = request.getParameter("age");
	int result = 0;
	
	String host = "jdbc:mysql://127.0.0.1:3306/userdb";
	String user= "root";
	String pass = "root";
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection(host,user,pass);
	PreparedStatement st = conn.prepareStatement("insert into `user6` values(?,?,?,?)");
	
	st.setString(1, id);
	st.setString(2, name);
	st.setString(3, hp);
	st.setString(4, age);
	result = st.executeUpdate();
	
	
	}catch(Exception e){
		e.printStackTrace();
	}
	
	String jsonData = "{\"result\":"+result+"}";
	out.print(jsonData);
%>
