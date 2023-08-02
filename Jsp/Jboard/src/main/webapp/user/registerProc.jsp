<%@page import="com.google.gson.Gson"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%	
	
	request.setCharacterEncoding("UTF-8");
	String uid = request.getParameter("uid");
	String pass = request.getParameter("pass1");
	String name =request.getParameter("name");
	String nick = request.getParameter("nick");
	String email = request.getParameter("email");
	String hp = request.getParameter("hp");
	String regip = request.getRemoteAddr();
	
	
	int result = 0;
	try{
	Context initCtx = new InitialContext();
	Context Ctx = (Context) initCtx.lookup("java:comp/env");
	DataSource ds = (DataSource) Ctx.lookup("jdbc/jboard");
	Connection conn = ds.getConnection();
	
	
	PreparedStatement pst = conn.prepareStatement("insert into `user` values(?,?,?,?,?,?,null,null,null,null,?,NOW(),null)");
	pst.setString(1, uid);
	pst.setString(2, pass);
	pst.setString(3, name);
	pst.setString(4, nick);
	pst.setString(5, email);
	pst.setString(6, hp);
	pst.setString(7, regip);
	result = pst.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}
	Gson gson = new Gson();
	String data = gson.toJson(result);
	out.print(data);
	
%>