<%@page import="vo.DBConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@page import="vo.UserVo"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	List<UserVo> listvo = new ArrayList<>();
	UserVo vo = null;
	try{
		DBConnection conn = new DBConnection();
		ResultSet rs = conn.select("user2");
		
		while(rs.next()){
			vo = new UserVo();
			vo.setUid(rs.getString(1));
			vo.setName(rs.getString(2));
			vo.setHp(rs.getString(3));
			vo.setAge(rs.getInt(4));
			listvo.add(vo);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>list</title>
	</head>
	<body>
	<h3>User Add</h3>
		
		
		<table border="1">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>hp</th>
				<th>age</th>
			</tr>
			
			<%for(UserVo vo1 : listvo) {%>
				<tr>
					<th><%= vo1.getUid() %></th>
					<th><%= vo1.getName() %></th>
					<th><%= vo1.getHp() %></th>
					<th><%= vo1.getAge() %></th>
				</tr>
			<%} %>
			
			
		</table>
		
			<a href="/Ch06/user2/register.jsp">add</a>
			<a href="/Ch06/1_JDBC.jsp">index</a>
	</body>
</html>