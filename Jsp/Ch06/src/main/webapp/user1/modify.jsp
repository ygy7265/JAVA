<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="vo.UserVo"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	Date : 2023/08/01
	name : Yoongyeongyeop
	content : AJAX
 -->
<%
	request.setCharacterEncoding("UTF-8");
	String uid = request.getParameter("uid");
	UserVo vo = null;
	try{
		Context initCtx = new InitialContext();
		Context Ctx = (Context)initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) Ctx.lookup("jdbc/userdb");
		Connection conn = ds.getConnection();
		
		PreparedStatement psmt= conn.prepareStatement("select * from `user1` where `uid` = ?");
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
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::modify</title>
	</head>
	<body>
		<h3>User1 </h3>
		<a href="/Ch06/1_JDBC.jsp">index</a>
		<a href="/Ch06/user1/list.jsp">user6 list</a>
		<form action="#" method="post">
			<table border="1">
				<tr>
					<td>id</td>
					<td><input type="text" name="uid" readonly></td>
				</tr>
				
				<tr>
					<td>name</td>
					<td><input type="text" name="name" ></td>
				</tr>
				
				<tr>
					<td>hp</td>
					<td><input type="text" name="hp"></td>
				</tr>
				
				<tr>
					<td>age</td>
					<td><input type="number" name="age"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="update"></td>
				</tr>
			</table>
		</form>
	</body>
</html>