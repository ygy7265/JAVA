<%@page import="vo.Member2Vo"%>
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

	String host = "jdbc:mysql://127.0.0.1:3306/userdb";
	String user = "root";
	String pass = "root";
	List<Member2Vo> listvo = new ArrayList<>();
	Member2Vo vo2 = null;
	try{
		
		Connection conn = DriverManager.getConnection(host,user,pass);
		PreparedStatement setpst = conn.prepareStatement("select * from `member`");
		ResultSet rs = setpst.executeQuery();
		
		while(rs.next()){
			vo2 = new Member2Vo();
			vo2.setId(rs.getString(1));
			vo2.setName(rs.getString(2));
			vo2.setHp(rs.getString(3));
			vo2.setPos(rs.getString(4));
			vo2.setDep(rs.getString(5));
			vo2.setRdate(rs.getString(6));
			listvo.add(vo2);
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
	<h3>member Add</h3>
		
		
		<table border="1">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>hp</th>
				<th>pos</th>
				<th>dep</th>
				<th>date</th>
			</tr>
			
			<%for(Member2Vo vo1 : listvo) {%>
				<tr>
					<th><%= vo1.getId() %></th>
					<th><%= vo1.getName() %></th>
					<th><%= vo1.getHp() %></th>
					<th><%= vo1.getPos() %></th>
					<th><%= vo1.getDep() %></th>
					<th><%= vo1.getRdate() %></th>
				</tr>
			<%} %>
			
			
		</table>
		
			<a href="/Ch06/member/register.jsp">add</a><br>
			<a href="/Ch06/1_JDBC.jsp">index</a>
	</body>
</html>