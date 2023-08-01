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
		int result = 0;
		try{
			Context initctx = new InitialContext();
			Context ctx = (Context)initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) ctx.lookup("jdbc/userdb");
			Connection conn = ds.getConnection();
			
			
			PreparedStatement pst = conn.prepareStatement("delete from `user6` where `uid`=?");
			pst.setString(1, uid);
			result = pst.executeUpdate();
			
			pst.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		

		String jsonData = "{\"result\" :"+result + "}";
		out.print(jsonData);
%>
