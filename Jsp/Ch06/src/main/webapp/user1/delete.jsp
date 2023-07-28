<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!-- 
	Date : 2023/07/28
	name : Yoongyeongyeop
	content : JDBC
 -->
<%
String uid = request.getParameter("uid");
String host = "jdbc:mysql://127.0.0.1:3306/userdb";
String user = "root";
String pass = "root";

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection(host,user,pass);
	PreparedStatement pst = conn.prepareStatement("delete from `user1` where `uid`=?");
	pst.setString(1,uid);
	pst.executeUpdate();
	
	pst.close();
	conn.close();
}catch(Exception e){
	e.printStackTrace();
}
response.sendRedirect("/Ch06/user1/list.jsp");
%>