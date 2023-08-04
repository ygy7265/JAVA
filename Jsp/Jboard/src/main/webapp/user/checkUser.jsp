<%@page import="dao.UserDao"%>
<%@page import="com.google.gson.JsonObject"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="aplication/json;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	UserDao dao = UserDao.getInstance();
	request.setCharacterEncoding("UTF-8");
	String uid= request.getParameter("uid");
	String nick = request.getParameter("nick");
	String email = request.getParameter("email");
	String hp = request.getParameter("hp");
	
	JsonObject json = new JsonObject();
	
	if(uid != null){
		int uidcount = dao.selectCountUid(uid);
		json.addProperty("result", uidcount);
	}
	if(nick != null){
		int nickcount = dao.selectCountNick(nick);
		json.addProperty("result", nickcount);
	}
	if(email != null){
		int emailcount = dao.selectCountUid(email);
		json.addProperty("result", emailcount);
	}
	if(hp != null){
		int hpcount = dao.selectCountEmail(hp);
		json.addProperty("result", hpcount);
	}
		
	out.print(json.toString());

%>