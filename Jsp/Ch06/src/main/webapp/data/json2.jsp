<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vo.UserVo"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="application/json;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	List<UserVo> users = new ArrayList<>();
	try{
		Context initCtx = new InitialContext();
		Context ctx = (Context)initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)ctx.lookup("jdbc/userdb");
		Connection conn = ds.getConnection();
		
		Statement st= conn.createStatement(); 
		ResultSet rs = st.executeQuery("select * from `user2`");
		
		while(rs.next()){
			UserVo user = new UserVo();
			user.setUid(rs.getString(1));
			user.setName(rs.getString(2));
			user.setHp(rs.getString(3));
			user.setAge(rs.getInt(4));
			
			users.add(user);
		}
		
		rs.close();
		st.close();
		conn.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	
	//json Output
	Gson gson = new Gson();
	String jsonData = gson.toJson(users);
	
	out.print(jsonData);
%>