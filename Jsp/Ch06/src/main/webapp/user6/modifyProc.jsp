<%@page import="com.google.gson.Gson"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="application/json;charset=UTF-8" pageEncoding="UTF-8"%>

<%		
/* 
Date : 2023/08/01
name : Yoongyeongyeop
content : AJAX
*/
		request.setCharacterEncoding("UTF-8");
		String uid = request.getParameter("uid");
		String name = request.getParameter("name");
		String hp = request.getParameter("hp");
		String age = request.getParameter("age");
		int result = 0;
		try{
			Context initctx = new InitialContext();
			Context ctx = (Context)initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) ctx.lookup("jdbc/userdb");
			Connection conn = ds.getConnection();
			
			
			PreparedStatement pst = conn.prepareStatement("update `user6` set `name`=?,`hp`=?,`age`=? where `uid`=?");
			pst.setString(1, name);
			pst.setString(2, hp);
			pst.setString(3, age);
			pst.setString(4, uid);
			result = pst.executeUpdate();
			
			pst.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		

		String jsonData = "{\"result\" :"+result + "}";
		out.print(jsonData);
%>
