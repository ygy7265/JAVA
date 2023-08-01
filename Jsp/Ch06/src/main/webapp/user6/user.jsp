<%@page import="com.google.gson.Gson"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="vo.UserVo"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="application/json;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String uid = request.getParameter("uid");
	UserVo vo = null;
	try{
		Context initCtx = new InitialContext();
		Context Ctx = (Context)initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) Ctx.lookup("jdbc/userdb");
		Connection conn = ds.getConnection();
		
		PreparedStatement psmt= conn.prepareStatement("select * from `user3` where `uid` = ?");
		psmt.setString(1, uid);
		ResultSet rs = psmt.executeQuery();
		
		
		while(rs.next()){
		vo =  new UserVo();
		vo.setUid(rs.getString(1));
		vo.setName(rs.getString(2));
		vo.setHp(rs.getString(3));
		vo.setAge(rs.getInt(4));
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	Gson gson = new Gson();
	String jsonData = gson.toJson(vo);
	out.print(jsonData);
%>
