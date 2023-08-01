<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
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


try{
	Context initCtx = new InitialContext();
	Context ctx = (Context)initCtx.lookup("java:comp/env");
	DataSource ds = (DataSource) ctx.lookup("jdbc/userdb");
	Connection conn = ds.getConnection();
	
	
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